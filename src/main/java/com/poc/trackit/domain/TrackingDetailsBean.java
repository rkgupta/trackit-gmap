package com.poc.trackit.domain;

import java.util.ArrayList;
import java.util.List;

import com.poc.pts.domain.Address;
import com.poc.pts.domain.EventResponse;

/**
 * POJO class that represents the tracking details that are sent as JSON response.
 * @author RA013GU
 *
 */
public class TrackingDetailsBean{
	
	private String trackingNumber;
	private String transportParcelId;
	private String orderId;
	private String carrierName;
	private String estimatedDeliveryDateTime;
	private Float weight;
	private String weightUom;
	private Address sendersAddress;
	private Address destinationAddress;	
	private List<EventResponse> events = new ArrayList<EventResponse>();
	/**
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}
	/**
	 * @param trackingNumber the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * @return the transportParcelId
	 */
	public String getTransportParcelId() {
		return transportParcelId;
	}
	/**
	 * @param transportParcelId the transportParcelId to set
	 */
	public void setTransportParcelId(String transportParcelId) {
		this.transportParcelId = transportParcelId;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the carrierName
	 */
	public String getCarrierName() {
		return carrierName;
	}
	/**
	 * @param carrierName the carrierName to set
	 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	/**
	 * @return the estimatedDeliveryDateTime
	 */
	public String getEstimatedDeliveryDateTime() {
		return estimatedDeliveryDateTime;
	}
	/**
	 * @param estimatedDeliveryDateTime the estimatedDeliveryDateTime to set
	 */
	public void setEstimatedDeliveryDateTime(String estimatedDeliveryDateTime) {
		this.estimatedDeliveryDateTime = estimatedDeliveryDateTime;
	}
	/**
	 * @return the weight
	 */
	public Float getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	/**
	 * @return the weightUom
	 */
	public String getWeightUom() {
		return weightUom;
	}
	/**
	 * @param weightUom the weightUom to set
	 */
	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}
	/**
	 * @return the sendersAddress
	 */
	public Address getSendersAddress() {
		return sendersAddress;
	}
	/**
	 * @param sendersAddress the sendersAddress to set
	 */
	public void setSendersAddress(Address sendersAddress) {
		this.sendersAddress = sendersAddress;
	}
	/**
	 * @return the destinationAddress
	 */
	public Address getDestinationAddress() {
		return destinationAddress;
	}
	/**
	 * @param destinationAddress the destinationAddress to set
	 */
	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	/**
	 * @return the events
	 */
	public List<EventResponse> getEvents() {
		return events;
	}
	/**
	 * Adds an event to the event list.
	 * @param event
	 */
	public void addEvent(EventResponse event){
		events.add(event);
	}
    
	   
}
