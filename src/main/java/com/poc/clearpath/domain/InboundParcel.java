/**
 * InboundParcel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class InboundParcel  implements java.io.Serializable {
    private com.poc.clearpath.domain.InboundParcelCommodity[] commodities;

    private java.lang.String inboundCarrierID;

    private java.lang.String inboundShippingMethodID;

    private java.lang.String inboundTrackingNumber;

    private java.lang.String orderNumber;

    private java.lang.String parcelIdentificationNo;

    private java.lang.String parcelReference;

    private java.lang.String placedDate;

    private com.poc.clearpath.domain.InboundParcelReturnAddress returnAddress;

    private com.poc.clearpath.domain.Size size;

    public InboundParcel() {
    }

    public InboundParcel(
           com.poc.clearpath.domain.InboundParcelCommodity[] commodities,
           java.lang.String inboundCarrierID,
           java.lang.String inboundShippingMethodID,
           java.lang.String inboundTrackingNumber,
           java.lang.String orderNumber,
           java.lang.String parcelIdentificationNo,
           java.lang.String parcelReference,
           java.lang.String placedDate,
           com.poc.clearpath.domain.InboundParcelReturnAddress returnAddress,
           com.poc.clearpath.domain.Size size) {
           this.commodities = commodities;
           this.inboundCarrierID = inboundCarrierID;
           this.inboundShippingMethodID = inboundShippingMethodID;
           this.inboundTrackingNumber = inboundTrackingNumber;
           this.orderNumber = orderNumber;
           this.parcelIdentificationNo = parcelIdentificationNo;
           this.parcelReference = parcelReference;
           this.placedDate = placedDate;
           this.returnAddress = returnAddress;
           this.size = size;
    }


    /**
     * Gets the commodities value for this InboundParcel.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.InboundParcelCommodity[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this InboundParcel.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.InboundParcelCommodity[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the inboundCarrierID value for this InboundParcel.
     * 
     * @return inboundCarrierID
     */
    public java.lang.String getInboundCarrierID() {
        return inboundCarrierID;
    }


    /**
     * Sets the inboundCarrierID value for this InboundParcel.
     * 
     * @param inboundCarrierID
     */
    public void setInboundCarrierID(java.lang.String inboundCarrierID) {
        this.inboundCarrierID = inboundCarrierID;
    }


    /**
     * Gets the inboundShippingMethodID value for this InboundParcel.
     * 
     * @return inboundShippingMethodID
     */
    public java.lang.String getInboundShippingMethodID() {
        return inboundShippingMethodID;
    }


    /**
     * Sets the inboundShippingMethodID value for this InboundParcel.
     * 
     * @param inboundShippingMethodID
     */
    public void setInboundShippingMethodID(java.lang.String inboundShippingMethodID) {
        this.inboundShippingMethodID = inboundShippingMethodID;
    }


    /**
     * Gets the inboundTrackingNumber value for this InboundParcel.
     * 
     * @return inboundTrackingNumber
     */
    public java.lang.String getInboundTrackingNumber() {
        return inboundTrackingNumber;
    }


    /**
     * Sets the inboundTrackingNumber value for this InboundParcel.
     * 
     * @param inboundTrackingNumber
     */
    public void setInboundTrackingNumber(java.lang.String inboundTrackingNumber) {
        this.inboundTrackingNumber = inboundTrackingNumber;
    }


    /**
     * Gets the orderNumber value for this InboundParcel.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this InboundParcel.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the parcelIdentificationNo value for this InboundParcel.
     * 
     * @return parcelIdentificationNo
     */
    public java.lang.String getParcelIdentificationNo() {
        return parcelIdentificationNo;
    }


    /**
     * Sets the parcelIdentificationNo value for this InboundParcel.
     * 
     * @param parcelIdentificationNo
     */
    public void setParcelIdentificationNo(java.lang.String parcelIdentificationNo) {
        this.parcelIdentificationNo = parcelIdentificationNo;
    }


    /**
     * Gets the parcelReference value for this InboundParcel.
     * 
     * @return parcelReference
     */
    public java.lang.String getParcelReference() {
        return parcelReference;
    }


    /**
     * Sets the parcelReference value for this InboundParcel.
     * 
     * @param parcelReference
     */
    public void setParcelReference(java.lang.String parcelReference) {
        this.parcelReference = parcelReference;
    }


    /**
     * Gets the placedDate value for this InboundParcel.
     * 
     * @return placedDate
     */
    public java.lang.String getPlacedDate() {
        return placedDate;
    }


    /**
     * Sets the placedDate value for this InboundParcel.
     * 
     * @param placedDate
     */
    public void setPlacedDate(java.lang.String placedDate) {
        this.placedDate = placedDate;
    }


    /**
     * Gets the returnAddress value for this InboundParcel.
     * 
     * @return returnAddress
     */
    public com.poc.clearpath.domain.InboundParcelReturnAddress getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this InboundParcel.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.poc.clearpath.domain.InboundParcelReturnAddress returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the size value for this InboundParcel.
     * 
     * @return size
     */
    public com.poc.clearpath.domain.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this InboundParcel.
     * 
     * @param size
     */
    public void setSize(com.poc.clearpath.domain.Size size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundParcel)) return false;
        InboundParcel other = (InboundParcel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.inboundCarrierID==null && other.getInboundCarrierID()==null) || 
             (this.inboundCarrierID!=null &&
              this.inboundCarrierID.equals(other.getInboundCarrierID()))) &&
            ((this.inboundShippingMethodID==null && other.getInboundShippingMethodID()==null) || 
             (this.inboundShippingMethodID!=null &&
              this.inboundShippingMethodID.equals(other.getInboundShippingMethodID()))) &&
            ((this.inboundTrackingNumber==null && other.getInboundTrackingNumber()==null) || 
             (this.inboundTrackingNumber!=null &&
              this.inboundTrackingNumber.equals(other.getInboundTrackingNumber()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.parcelIdentificationNo==null && other.getParcelIdentificationNo()==null) || 
             (this.parcelIdentificationNo!=null &&
              this.parcelIdentificationNo.equals(other.getParcelIdentificationNo()))) &&
            ((this.parcelReference==null && other.getParcelReference()==null) || 
             (this.parcelReference!=null &&
              this.parcelReference.equals(other.getParcelReference()))) &&
            ((this.placedDate==null && other.getPlacedDate()==null) || 
             (this.placedDate!=null &&
              this.placedDate.equals(other.getPlacedDate()))) &&
            ((this.returnAddress==null && other.getReturnAddress()==null) || 
             (this.returnAddress!=null &&
              this.returnAddress.equals(other.getReturnAddress()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        if (getCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInboundCarrierID() != null) {
            _hashCode += getInboundCarrierID().hashCode();
        }
        if (getInboundShippingMethodID() != null) {
            _hashCode += getInboundShippingMethodID().hashCode();
        }
        if (getInboundTrackingNumber() != null) {
            _hashCode += getInboundTrackingNumber().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getParcelIdentificationNo() != null) {
            _hashCode += getParcelIdentificationNo().hashCode();
        }
        if (getParcelReference() != null) {
            _hashCode += getParcelReference().hashCode();
        }
        if (getPlacedDate() != null) {
            _hashCode += getPlacedDate().hashCode();
        }
        if (getReturnAddress() != null) {
            _hashCode += getReturnAddress().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundParcel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodity"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundCarrierID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundCarrierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundShippingMethodID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundShippingMethodID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelIdentificationNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelIdentificationNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelReturnAddress"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"));
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
