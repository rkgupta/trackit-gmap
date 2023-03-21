/**
 * OrderFilterEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class OrderFilterEx  extends com.poc.clearpath.domain.OrderFilter  implements java.io.Serializable {
    private java.lang.String RMA;

    private java.lang.String exceptionParcelNumber;

    private java.lang.String inboundParcelIdentification;

    private java.lang.String inboundParcelNumber;

    private java.lang.String orderReference;

    private java.lang.String orderStatus;

    private java.lang.String parcelNumber;

    private java.lang.String partnerCode;

    public OrderFilterEx() {
    }

    public OrderFilterEx(
           java.lang.String SKU,
           java.lang.String city,
           java.lang.String country,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String fromDate,
           java.lang.String lastName,
           java.lang.String merchantCode,
           java.lang.String orderNumber,
           java.lang.String phone,
           java.lang.String postalCode,
           java.lang.String region,
           java.lang.String street,
           java.lang.String toDate,
           java.lang.String RMA,
           java.lang.String exceptionParcelNumber,
           java.lang.String inboundParcelIdentification,
           java.lang.String inboundParcelNumber,
           java.lang.String orderReference,
           java.lang.String orderStatus,
           java.lang.String parcelNumber,
           java.lang.String partnerCode) {
        super(
            SKU,
            city,
            country,
            email,
            firstName,
            fromDate,
            lastName,
            merchantCode,
            orderNumber,
            phone,
            postalCode,
            region,
            street,
            toDate);
        this.RMA = RMA;
        this.exceptionParcelNumber = exceptionParcelNumber;
        this.inboundParcelIdentification = inboundParcelIdentification;
        this.inboundParcelNumber = inboundParcelNumber;
        this.orderReference = orderReference;
        this.orderStatus = orderStatus;
        this.parcelNumber = parcelNumber;
        this.partnerCode = partnerCode;
    }


    /**
     * Gets the RMA value for this OrderFilterEx.
     * 
     * @return RMA
     */
    public java.lang.String getRMA() {
        return RMA;
    }


    /**
     * Sets the RMA value for this OrderFilterEx.
     * 
     * @param RMA
     */
    public void setRMA(java.lang.String RMA) {
        this.RMA = RMA;
    }


    /**
     * Gets the exceptionParcelNumber value for this OrderFilterEx.
     * 
     * @return exceptionParcelNumber
     */
    public java.lang.String getExceptionParcelNumber() {
        return exceptionParcelNumber;
    }


    /**
     * Sets the exceptionParcelNumber value for this OrderFilterEx.
     * 
     * @param exceptionParcelNumber
     */
    public void setExceptionParcelNumber(java.lang.String exceptionParcelNumber) {
        this.exceptionParcelNumber = exceptionParcelNumber;
    }


    /**
     * Gets the inboundParcelIdentification value for this OrderFilterEx.
     * 
     * @return inboundParcelIdentification
     */
    public java.lang.String getInboundParcelIdentification() {
        return inboundParcelIdentification;
    }


    /**
     * Sets the inboundParcelIdentification value for this OrderFilterEx.
     * 
     * @param inboundParcelIdentification
     */
    public void setInboundParcelIdentification(java.lang.String inboundParcelIdentification) {
        this.inboundParcelIdentification = inboundParcelIdentification;
    }


    /**
     * Gets the inboundParcelNumber value for this OrderFilterEx.
     * 
     * @return inboundParcelNumber
     */
    public java.lang.String getInboundParcelNumber() {
        return inboundParcelNumber;
    }


    /**
     * Sets the inboundParcelNumber value for this OrderFilterEx.
     * 
     * @param inboundParcelNumber
     */
    public void setInboundParcelNumber(java.lang.String inboundParcelNumber) {
        this.inboundParcelNumber = inboundParcelNumber;
    }


    /**
     * Gets the orderReference value for this OrderFilterEx.
     * 
     * @return orderReference
     */
    public java.lang.String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this OrderFilterEx.
     * 
     * @param orderReference
     */
    public void setOrderReference(java.lang.String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the orderStatus value for this OrderFilterEx.
     * 
     * @return orderStatus
     */
    public java.lang.String getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this OrderFilterEx.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(java.lang.String orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the parcelNumber value for this OrderFilterEx.
     * 
     * @return parcelNumber
     */
    public java.lang.String getParcelNumber() {
        return parcelNumber;
    }


    /**
     * Sets the parcelNumber value for this OrderFilterEx.
     * 
     * @param parcelNumber
     */
    public void setParcelNumber(java.lang.String parcelNumber) {
        this.parcelNumber = parcelNumber;
    }


    /**
     * Gets the partnerCode value for this OrderFilterEx.
     * 
     * @return partnerCode
     */
    public java.lang.String getPartnerCode() {
        return partnerCode;
    }


    /**
     * Sets the partnerCode value for this OrderFilterEx.
     * 
     * @param partnerCode
     */
    public void setPartnerCode(java.lang.String partnerCode) {
        this.partnerCode = partnerCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderFilterEx)) return false;
        OrderFilterEx other = (OrderFilterEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.RMA==null && other.getRMA()==null) || 
             (this.RMA!=null &&
              this.RMA.equals(other.getRMA()))) &&
            ((this.exceptionParcelNumber==null && other.getExceptionParcelNumber()==null) || 
             (this.exceptionParcelNumber!=null &&
              this.exceptionParcelNumber.equals(other.getExceptionParcelNumber()))) &&
            ((this.inboundParcelIdentification==null && other.getInboundParcelIdentification()==null) || 
             (this.inboundParcelIdentification!=null &&
              this.inboundParcelIdentification.equals(other.getInboundParcelIdentification()))) &&
            ((this.inboundParcelNumber==null && other.getInboundParcelNumber()==null) || 
             (this.inboundParcelNumber!=null &&
              this.inboundParcelNumber.equals(other.getInboundParcelNumber()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.parcelNumber==null && other.getParcelNumber()==null) || 
             (this.parcelNumber!=null &&
              this.parcelNumber.equals(other.getParcelNumber()))) &&
            ((this.partnerCode==null && other.getPartnerCode()==null) || 
             (this.partnerCode!=null &&
              this.partnerCode.equals(other.getPartnerCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRMA() != null) {
            _hashCode += getRMA().hashCode();
        }
        if (getExceptionParcelNumber() != null) {
            _hashCode += getExceptionParcelNumber().hashCode();
        }
        if (getInboundParcelIdentification() != null) {
            _hashCode += getInboundParcelIdentification().hashCode();
        }
        if (getInboundParcelNumber() != null) {
            _hashCode += getInboundParcelNumber().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getParcelNumber() != null) {
            _hashCode += getParcelNumber().hashCode();
        }
        if (getPartnerCode() != null) {
            _hashCode += getPartnerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderFilterEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderFilterEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionParcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionParcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundParcelIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundParcelIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundParcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundParcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerCode"));
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
