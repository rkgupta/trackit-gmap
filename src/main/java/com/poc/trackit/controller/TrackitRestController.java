package com.poc.trackit.controller;

import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axis.AxisFault;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.poc.clearpath.domain.CPAppException;
import com.poc.clearpath.domain.OrderDetails;
import com.poc.clearpath.webservice.ClearPathAPI_v9_0BeanService;
import com.poc.clearpath.webservice.ClearPathAPI_v9_0BeanServiceLocator;
import com.poc.clearpath.webservice.CpAPI_v9_0SoapBindingStub;
import com.poc.pts.domain.CurrentStatus;
import com.poc.pts.domain.ParcelTrackingData;
import com.poc.pts.domain.ParcelTrackingRequestData;
import com.poc.pts.domain.ParcelTrackingServiceEndpointV10;
import com.poc.pts.domain.ScanDetail;
import com.poc.pts.domain.ScanHistory;
import com.poc.pts.domain.TrackingAppException_Exception;
import com.poc.pts.domain.TrackingserviceV10;
import com.poc.trackit.domain.TrackingDetailsBean;
import com.poc.trackit.util.TrackingUtil;
/**
 * The controller class that handles REST calls for tracking.
 * @author RA013GU
 *
 */
@Controller
@RequestMapping("/api")
public class TrackitRestController {
	
	private Logger logger = Logger.getLogger(TrackitRestController.class);
	private static final String URL = "http://maps.googleapis.com/maps/api/geocode/json";
	private final String WHITESPACE = " ";
	
	@RequestMapping(value = "/upid/{upid}", method = RequestMethod.GET)
	@ResponseBody
	public String getParcelTrackingDetails(@PathVariable("upid") String upid){
		logger.info("Fetching details for parcel with tracking no: "+upid);
		TrackingUtil.loadProperties();
		TrackingDetailsBean trackingDetails = getTrackingDetails(upid);
		Gson gson = new Gson();
		String trackingDetailsResponse = gson.toJson(trackingDetails);
		return trackingDetailsResponse;
	}
	
	@RequestMapping(value = "/orderId/{orderId}", method = RequestMethod.GET)
	@ResponseBody
	public String getOrderDetails(@PathVariable("orderId") String orderId) {
		logger.info("Fetching order details for order Id: " + orderId);
		TrackingUtil.loadProperties();
		
		OrderDetails orderDetails = getOrderDetailsFromClearpath(orderId);
		
		Gson gson = new Gson();
		String orderDetailsResponse = gson.toJson(orderDetails);
		return orderDetailsResponse;
	}

	/**
	 * @param orderId
	 * @return
	 */
	private OrderDetails getOrderDetailsFromClearpath(String orderId) {
		OrderDetails orderDetails = null;
		// Construct clearpath stub.
		CpAPI_v9_0SoapBindingStub stub = null;
		try {
			ClearPathAPI_v9_0BeanService serviceLocator = new ClearPathAPI_v9_0BeanServiceLocator();
			stub = new CpAPI_v9_0SoapBindingStub(new URL(TrackingUtil.getProperties().getProperty("clearpath.api.endpoint")), serviceLocator);
			stub._setProperty("javax.xml.rpc.security.auth.username",  TrackingUtil.getProperties().getProperty("clearpath.api.auth.username"));
			stub._setProperty("javax.xml.rpc.security.auth.password",  TrackingUtil.getProperties().getProperty("clearpath.api.auth.password"));
		} catch (MalformedURLException e) {
			logger.error("The url "	+  TrackingUtil.getProperties().getProperty("clearpath.api.endpoint") + " is malformed. "+ e.getMessage());
			//throw new SchedulerAppException(e.getMessage(), false);
		} catch (AxisFault e) {
			logger.error("Axis fault while accessing endpoint: "+  TrackingUtil.getProperties().getProperty("clearpath.api.endpoint") + ". "+ e.getMessage());
			//throw new SchedulerAppException(e.getMessage(), false);
		}
		
		try {
			orderDetails = stub.getOrderDetails(orderId);
		} catch (CPAppException e) {
			logger.error("CPAppException while fetching order details for order Id: "+orderId);
		} catch (RemoteException e) {
			logger.error("RemoteException while fetching order details for order Id: "+orderId);
		}
		return orderDetails;
	}
	
	@RequestMapping(value = "/geocode/{city}/{country}", method = RequestMethod.GET)
	@ResponseBody
	public String geocode(@PathVariable("city") String city, @PathVariable("country") String country) throws Exception {
		logger.info("Fetching latitude and longitude details for city: "+city+" and country: "+country);
		String gCity = city.replaceAll(WHITESPACE, "+");
		String gCountry = country.replaceAll(WHITESPACE,"+");
	    URL url = new URL(URL+ "?&address="+gCity+","+gCountry+"&sensor=false");
	    URLConnection conn = url.openConnection();
	    ByteArrayOutputStream output = new ByteArrayOutputStream(1024);
	    IOUtils.copy(conn.getInputStream(), output);
	    output.close();
	    
	    String json = output.toString();
	    json = json.replaceAll("\\\\", "");
	    json = json.replaceAll("\\s+", "");

	    return json;
	}    
	
	@RequestMapping(value = "/geocode/{location}", method = RequestMethod.GET)
	@ResponseBody
	public String geocode(@PathVariable("location") String location) throws Exception {
		logger.info("Fetching latitude and longitude details for "+location);
	    URL url = new URL(URL+ "?&address="+location.replaceAll(WHITESPACE, "+")+"&sensor=false");
	    URLConnection conn = url.openConnection();
	    ByteArrayOutputStream output = new ByteArrayOutputStream(1024);
	    IOUtils.copy(conn.getInputStream(), output);
	    output.close();
	    
	    String json = output.toString();
	    json = json.replaceAll("\\\\", "");
	    json = json.replaceAll("\\s+", "");

	    return json;
	} 
	
	private TrackingDetailsBean getTrackingDetails(String referenceId){
		TrackingDetailsBean trackingDetailsBean = null;
		try {
			ParcelTrackingRequestData ptsRequestData = new ParcelTrackingRequestData();
			ptsRequestData.setRefNum(referenceId); // pass UPID
			ptsRequestData.setRefType("UPID");
			
			String ptsWsdlURL = TrackingUtil.getProperties().getProperty("pts.wsdl.url");
			String ptsNamespaceURI = TrackingUtil.getProperties().getProperty("pts.wsdl.namespaceURI");
			String ptsLocalPart = TrackingUtil.getProperties().getProperty("pts.wsdl.localpart");
			
			logger.info("Fetching parcel tracking details from pts at endpoint: "+ptsWsdlURL);
			TrackingserviceV10 service = new TrackingserviceV10(new URL(ptsWsdlURL), new QName(ptsNamespaceURI, ptsLocalPart));
			ParcelTrackingServiceEndpointV10 ptsServiceEndpointV10 = service.getParcelTrackingServiceEndpointV10Port();
			ParcelTrackingData trackingData = ptsServiceEndpointV10.getParcelTrackingDetails(ptsRequestData);
			
			trackingDetailsBean = new TrackingDetailsBean();
			
			trackingDetailsBean.setTrackingNumber(trackingData.getRefNum());
			trackingDetailsBean.setOrderId(trackingData.getOrderId());
			trackingDetailsBean.setCarrierName(trackingData.getCarrierName());
			trackingDetailsBean.setEstimatedDeliveryDateTime(trackingData.getEstimatedDeliveryDateTime());
			trackingDetailsBean.setWeight(trackingData.getWeight());
			trackingDetailsBean.setWeightUom(trackingData.getWeightUom());
			trackingDetailsBean.setSendersAddress(trackingData.getSendersAddress());
			trackingDetailsBean.setDestinationAddress(trackingData.getDestinationAddress());
			
			CurrentStatus currentStatus = trackingData.getCurrentStatus();
			ScanHistory scanHistory = trackingData.getScanHistory();
			
			/*
			 *Add event from the current status.
			 */
			trackingDetailsBean.addEvent(currentStatus);
			
			List<ScanDetail> scanDetails = scanHistory.getScanDetails();
			
			/*
			 * Add events from scan history
			 */
			for(ScanDetail scanDetail : scanDetails){
				trackingDetailsBean.addEvent(scanDetail);
			}
			
		} catch (MalformedURLException e1) {
			logger.error("MalformedURLException while fetching tracking details.");
		} catch (TrackingAppException_Exception e) {
			logger.error("TrackingAppException_Exception while fetching tracking details.");
		} 
		return trackingDetailsBean;
	}
}
