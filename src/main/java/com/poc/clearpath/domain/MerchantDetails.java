/**
 * MerchantDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class MerchantDetails  extends com.poc.clearpath.domain.Merchant  implements java.io.Serializable {
    private java.lang.String activationDate;

    private int status;

    public MerchantDetails() {
    }

    public MerchantDetails(
           com.poc.clearpath.domain.Address address,
           java.lang.String exporter,
           java.lang.String merchantCode,
           java.lang.String name,
           java.lang.String taxId,
           java.lang.String type,
           java.lang.String activationDate,
           int status) {
        super(
            address,
            exporter,
            merchantCode,
            name,
            taxId,
            type);
        this.activationDate = activationDate;
        this.status = status;
    }


    /**
     * Gets the activationDate value for this MerchantDetails.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this MerchantDetails.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the status value for this MerchantDetails.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MerchantDetails.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantDetails)) return false;
        MerchantDetails other = (MerchantDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            this.status == other.getStatus();
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
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
