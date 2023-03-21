/**
 * InboundParcelDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class InboundParcelDetails  implements java.io.Serializable {
    private com.poc.clearpath.domain.InboundParcelCommodityDetails[] commodities;

    private java.lang.String inboundParcelNumber;

    private java.lang.String merchantCode;

    private java.lang.String orderNumber;

    private java.lang.String parcelIdentificationNo;

    private java.lang.String status;

    public InboundParcelDetails() {
    }

    public InboundParcelDetails(
           com.poc.clearpath.domain.InboundParcelCommodityDetails[] commodities,
           java.lang.String inboundParcelNumber,
           java.lang.String merchantCode,
           java.lang.String orderNumber,
           java.lang.String parcelIdentificationNo,
           java.lang.String status) {
           this.commodities = commodities;
           this.inboundParcelNumber = inboundParcelNumber;
           this.merchantCode = merchantCode;
           this.orderNumber = orderNumber;
           this.parcelIdentificationNo = parcelIdentificationNo;
           this.status = status;
    }


    /**
     * Gets the commodities value for this InboundParcelDetails.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.InboundParcelCommodityDetails[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this InboundParcelDetails.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.InboundParcelCommodityDetails[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the inboundParcelNumber value for this InboundParcelDetails.
     * 
     * @return inboundParcelNumber
     */
    public java.lang.String getInboundParcelNumber() {
        return inboundParcelNumber;
    }


    /**
     * Sets the inboundParcelNumber value for this InboundParcelDetails.
     * 
     * @param inboundParcelNumber
     */
    public void setInboundParcelNumber(java.lang.String inboundParcelNumber) {
        this.inboundParcelNumber = inboundParcelNumber;
    }


    /**
     * Gets the merchantCode value for this InboundParcelDetails.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this InboundParcelDetails.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the orderNumber value for this InboundParcelDetails.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this InboundParcelDetails.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the parcelIdentificationNo value for this InboundParcelDetails.
     * 
     * @return parcelIdentificationNo
     */
    public java.lang.String getParcelIdentificationNo() {
        return parcelIdentificationNo;
    }


    /**
     * Sets the parcelIdentificationNo value for this InboundParcelDetails.
     * 
     * @param parcelIdentificationNo
     */
    public void setParcelIdentificationNo(java.lang.String parcelIdentificationNo) {
        this.parcelIdentificationNo = parcelIdentificationNo;
    }


    /**
     * Gets the status value for this InboundParcelDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InboundParcelDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundParcelDetails)) return false;
        InboundParcelDetails other = (InboundParcelDetails) obj;
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
            ((this.inboundParcelNumber==null && other.getInboundParcelNumber()==null) || 
             (this.inboundParcelNumber!=null &&
              this.inboundParcelNumber.equals(other.getInboundParcelNumber()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.parcelIdentificationNo==null && other.getParcelIdentificationNo()==null) || 
             (this.parcelIdentificationNo!=null &&
              this.parcelIdentificationNo.equals(other.getParcelIdentificationNo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getInboundParcelNumber() != null) {
            _hashCode += getInboundParcelNumber().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getParcelIdentificationNo() != null) {
            _hashCode += getParcelIdentificationNo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundParcelDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodityDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundParcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundParcelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantCode"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
