
package com.poc.pts.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pb.pts.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetParcelTrackingDetails_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "getParcelTrackingDetails");
    private final static QName _CreateParcelDetailsResponse_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "createParcelDetailsResponse");
    private final static QName _GetParcelTrackingDetailsResponse_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "getParcelTrackingDetailsResponse");
    private final static QName _TrackingAppException_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "TrackingAppException");
    private final static QName _UpdateParcelDetailsResponse_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "updateParcelDetailsResponse");
    private final static QName _SubmitEventResponse_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "submitEventResponse");
    private final static QName _SubmitEvent_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "submitEvent");
    private final static QName _CreateParcelDetails_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "createParcelDetails");
    private final static QName _UpdateParcelDetails_QNAME = new QName("http://v1_0.endpoint.service.pts.pb.com/", "updateParcelDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pb.pts.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetParcelTrackingDetailsResponse }
     * 
     */
    public GetParcelTrackingDetailsResponse createGetParcelTrackingDetailsResponse() {
        return new GetParcelTrackingDetailsResponse();
    }

    /**
     * Create an instance of {@link SubmitEvent }
     * 
     */
    public SubmitEvent createSubmitEvent() {
        return new SubmitEvent();
    }

    /**
     * Create an instance of {@link ParcelDetails }
     * 
     */
    public ParcelDetails createParcelDetails() {
        return new ParcelDetails();
    }

    /**
     * Create an instance of {@link CurrentStatus }
     * 
     */
    public CurrentStatus createCurrentStatus() {
        return new CurrentStatus();
    }

    /**
     * Create an instance of {@link EventResponse }
     * 
     */
    public EventResponse createEventResponse() {
        return new EventResponse();
    }

    /**
     * Create an instance of {@link UpdateParcelDetails }
     * 
     */
    public UpdateParcelDetails createUpdateParcelDetails() {
        return new UpdateParcelDetails();
    }

    /**
     * Create an instance of {@link ScanHistory }
     * 
     */
    public ScanHistory createScanHistory() {
        return new ScanHistory();
    }

    /**
     * Create an instance of {@link CreateParcelDetails }
     * 
     */
    public CreateParcelDetails createCreateParcelDetails() {
        return new CreateParcelDetails();
    }

    /**
     * Create an instance of {@link TrackingAppException }
     * 
     */
    public TrackingAppException createTrackingAppException() {
        return new TrackingAppException();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link EventData }
     * 
     */
    public EventData createEventData() {
        return new EventData();
    }

    /**
     * Create an instance of {@link ParcelTrackingRequestData }
     * 
     */
    public ParcelTrackingRequestData createParcelTrackingRequestData() {
        return new ParcelTrackingRequestData();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link CreateParcelDetailsResponse }
     * 
     */
    public CreateParcelDetailsResponse createCreateParcelDetailsResponse() {
        return new CreateParcelDetailsResponse();
    }

    /**
     * Create an instance of {@link TrackingException }
     * 
     */
    public TrackingException createTrackingException() {
        return new TrackingException();
    }

    /**
     * Create an instance of {@link ParcelTrackingData }
     * 
     */
    public ParcelTrackingData createParcelTrackingData() {
        return new ParcelTrackingData();
    }

    /**
     * Create an instance of {@link ParcelUpdateDetails }
     * 
     */
    public ParcelUpdateDetails createParcelUpdateDetails() {
        return new ParcelUpdateDetails();
    }

    /**
     * Create an instance of {@link GetParcelTrackingDetails }
     * 
     */
    public GetParcelTrackingDetails createGetParcelTrackingDetails() {
        return new GetParcelTrackingDetails();
    }

    /**
     * Create an instance of {@link ScanDetail }
     * 
     */
    public ScanDetail createScanDetail() {
        return new ScanDetail();
    }

    /**
     * Create an instance of {@link UpdateParcelDetailsResponse }
     * 
     */
    public UpdateParcelDetailsResponse createUpdateParcelDetailsResponse() {
        return new UpdateParcelDetailsResponse();
    }

    /**
     * Create an instance of {@link SubmitEventResponse }
     * 
     */
    public SubmitEventResponse createSubmitEventResponse() {
        return new SubmitEventResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParcelTrackingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "getParcelTrackingDetails")
    public JAXBElement<GetParcelTrackingDetails> createGetParcelTrackingDetails(GetParcelTrackingDetails value) {
        return new JAXBElement<GetParcelTrackingDetails>(_GetParcelTrackingDetails_QNAME, GetParcelTrackingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParcelDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "createParcelDetailsResponse")
    public JAXBElement<CreateParcelDetailsResponse> createCreateParcelDetailsResponse(CreateParcelDetailsResponse value) {
        return new JAXBElement<CreateParcelDetailsResponse>(_CreateParcelDetailsResponse_QNAME, CreateParcelDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParcelTrackingDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "getParcelTrackingDetailsResponse")
    public JAXBElement<GetParcelTrackingDetailsResponse> createGetParcelTrackingDetailsResponse(GetParcelTrackingDetailsResponse value) {
        return new JAXBElement<GetParcelTrackingDetailsResponse>(_GetParcelTrackingDetailsResponse_QNAME, GetParcelTrackingDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackingAppException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "TrackingAppException")
    public JAXBElement<TrackingAppException> createTrackingAppException(TrackingAppException value) {
        return new JAXBElement<TrackingAppException>(_TrackingAppException_QNAME, TrackingAppException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParcelDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "updateParcelDetailsResponse")
    public JAXBElement<UpdateParcelDetailsResponse> createUpdateParcelDetailsResponse(UpdateParcelDetailsResponse value) {
        return new JAXBElement<UpdateParcelDetailsResponse>(_UpdateParcelDetailsResponse_QNAME, UpdateParcelDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "submitEventResponse")
    public JAXBElement<SubmitEventResponse> createSubmitEventResponse(SubmitEventResponse value) {
        return new JAXBElement<SubmitEventResponse>(_SubmitEventResponse_QNAME, SubmitEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "submitEvent")
    public JAXBElement<SubmitEvent> createSubmitEvent(SubmitEvent value) {
        return new JAXBElement<SubmitEvent>(_SubmitEvent_QNAME, SubmitEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParcelDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "createParcelDetails")
    public JAXBElement<CreateParcelDetails> createCreateParcelDetails(CreateParcelDetails value) {
        return new JAXBElement<CreateParcelDetails>(_CreateParcelDetails_QNAME, CreateParcelDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParcelDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1_0.endpoint.service.pts.pb.com/", name = "updateParcelDetails")
    public JAXBElement<UpdateParcelDetails> createUpdateParcelDetails(UpdateParcelDetails value) {
        return new JAXBElement<UpdateParcelDetails>(_UpdateParcelDetails_QNAME, UpdateParcelDetails.class, null, value);
    }

}
