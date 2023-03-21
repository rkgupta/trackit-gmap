
package com.poc.pts.domain;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "TrackingAppException", targetNamespace = "http://v1_0.endpoint.service.pts.pb.com/")
public class TrackingAppException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TrackingAppException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public TrackingAppException_Exception(String message, TrackingAppException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public TrackingAppException_Exception(String message, TrackingAppException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.pb.pts.domain.TrackingAppException
     */
    public TrackingAppException getFaultInfo() {
        return faultInfo;
    }

}
