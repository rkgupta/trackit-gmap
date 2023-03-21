/**
 * TrackingEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class TrackingEvent  implements java.io.Serializable {
    private com.poc.clearpath.domain.Address address;

    private java.lang.String authorizedAgent;

    private java.lang.String carrier;

    private java.lang.String eventDate;

    private java.lang.String eventType;

    private java.lang.String trackingMode;

    private java.lang.String trackingNumber;

    private java.lang.String trackingSummary;

    private java.lang.String url;

    public TrackingEvent() {
    }

    public TrackingEvent(
           com.poc.clearpath.domain.Address address,
           java.lang.String authorizedAgent,
           java.lang.String carrier,
           java.lang.String eventDate,
           java.lang.String eventType,
           java.lang.String trackingMode,
           java.lang.String trackingNumber,
           java.lang.String trackingSummary,
           java.lang.String url) {
           this.address = address;
           this.authorizedAgent = authorizedAgent;
           this.carrier = carrier;
           this.eventDate = eventDate;
           this.eventType = eventType;
           this.trackingMode = trackingMode;
           this.trackingNumber = trackingNumber;
           this.trackingSummary = trackingSummary;
           this.url = url;
    }


    /**
     * Gets the address value for this TrackingEvent.
     * 
     * @return address
     */
    public com.poc.clearpath.domain.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TrackingEvent.
     * 
     * @param address
     */
    public void setAddress(com.poc.clearpath.domain.Address address) {
        this.address = address;
    }


    /**
     * Gets the authorizedAgent value for this TrackingEvent.
     * 
     * @return authorizedAgent
     */
    public java.lang.String getAuthorizedAgent() {
        return authorizedAgent;
    }


    /**
     * Sets the authorizedAgent value for this TrackingEvent.
     * 
     * @param authorizedAgent
     */
    public void setAuthorizedAgent(java.lang.String authorizedAgent) {
        this.authorizedAgent = authorizedAgent;
    }


    /**
     * Gets the carrier value for this TrackingEvent.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this TrackingEvent.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the eventDate value for this TrackingEvent.
     * 
     * @return eventDate
     */
    public java.lang.String getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this TrackingEvent.
     * 
     * @param eventDate
     */
    public void setEventDate(java.lang.String eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the eventType value for this TrackingEvent.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this TrackingEvent.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the trackingMode value for this TrackingEvent.
     * 
     * @return trackingMode
     */
    public java.lang.String getTrackingMode() {
        return trackingMode;
    }


    /**
     * Sets the trackingMode value for this TrackingEvent.
     * 
     * @param trackingMode
     */
    public void setTrackingMode(java.lang.String trackingMode) {
        this.trackingMode = trackingMode;
    }


    /**
     * Gets the trackingNumber value for this TrackingEvent.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this TrackingEvent.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the trackingSummary value for this TrackingEvent.
     * 
     * @return trackingSummary
     */
    public java.lang.String getTrackingSummary() {
        return trackingSummary;
    }


    /**
     * Sets the trackingSummary value for this TrackingEvent.
     * 
     * @param trackingSummary
     */
    public void setTrackingSummary(java.lang.String trackingSummary) {
        this.trackingSummary = trackingSummary;
    }


    /**
     * Gets the url value for this TrackingEvent.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this TrackingEvent.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingEvent)) return false;
        TrackingEvent other = (TrackingEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.authorizedAgent==null && other.getAuthorizedAgent()==null) || 
             (this.authorizedAgent!=null &&
              this.authorizedAgent.equals(other.getAuthorizedAgent()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.trackingMode==null && other.getTrackingMode()==null) || 
             (this.trackingMode!=null &&
              this.trackingMode.equals(other.getTrackingMode()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.trackingSummary==null && other.getTrackingSummary()==null) || 
             (this.trackingSummary!=null &&
              this.trackingSummary.equals(other.getTrackingSummary()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAuthorizedAgent() != null) {
            _hashCode += getAuthorizedAgent().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getTrackingMode() != null) {
            _hashCode += getTrackingMode().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getTrackingSummary() != null) {
            _hashCode += getTrackingSummary().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackingEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizedAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
