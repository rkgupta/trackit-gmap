/**
 * Consignee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class Consignee  implements java.io.Serializable {
    private com.poc.clearpath.domain.Address address;

    private java.lang.String consigneeNumber;

    public Consignee() {
    }

    public Consignee(
           com.poc.clearpath.domain.Address address,
           java.lang.String consigneeNumber) {
           this.address = address;
           this.consigneeNumber = consigneeNumber;
    }


    /**
     * Gets the address value for this Consignee.
     * 
     * @return address
     */
    public com.poc.clearpath.domain.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Consignee.
     * 
     * @param address
     */
    public void setAddress(com.poc.clearpath.domain.Address address) {
        this.address = address;
    }


    /**
     * Gets the consigneeNumber value for this Consignee.
     * 
     * @return consigneeNumber
     */
    public java.lang.String getConsigneeNumber() {
        return consigneeNumber;
    }


    /**
     * Sets the consigneeNumber value for this Consignee.
     * 
     * @param consigneeNumber
     */
    public void setConsigneeNumber(java.lang.String consigneeNumber) {
        this.consigneeNumber = consigneeNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consignee)) return false;
        Consignee other = (Consignee) obj;
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
            ((this.consigneeNumber==null && other.getConsigneeNumber()==null) || 
             (this.consigneeNumber!=null &&
              this.consigneeNumber.equals(other.getConsigneeNumber())));
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
        if (getConsigneeNumber() != null) {
            _hashCode += getConsigneeNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consignee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Consignee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consigneeNumber"));
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
