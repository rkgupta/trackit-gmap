/**
 * Exporter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class Exporter  implements java.io.Serializable {
    private com.poc.clearpath.domain.Address address;

    private java.lang.String referenceCode;

    private java.lang.String taxId;

    public Exporter() {
    }

    public Exporter(
           com.poc.clearpath.domain.Address address,
           java.lang.String referenceCode,
           java.lang.String taxId) {
           this.address = address;
           this.referenceCode = referenceCode;
           this.taxId = taxId;
    }


    /**
     * Gets the address value for this Exporter.
     * 
     * @return address
     */
    public com.poc.clearpath.domain.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Exporter.
     * 
     * @param address
     */
    public void setAddress(com.poc.clearpath.domain.Address address) {
        this.address = address;
    }


    /**
     * Gets the referenceCode value for this Exporter.
     * 
     * @return referenceCode
     */
    public java.lang.String getReferenceCode() {
        return referenceCode;
    }


    /**
     * Sets the referenceCode value for this Exporter.
     * 
     * @param referenceCode
     */
    public void setReferenceCode(java.lang.String referenceCode) {
        this.referenceCode = referenceCode;
    }


    /**
     * Gets the taxId value for this Exporter.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this Exporter.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Exporter)) return false;
        Exporter other = (Exporter) obj;
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
            ((this.referenceCode==null && other.getReferenceCode()==null) || 
             (this.referenceCode!=null &&
              this.referenceCode.equals(other.getReferenceCode()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId())));
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
        if (getReferenceCode() != null) {
            _hashCode += getReferenceCode().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Exporter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Exporter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxId"));
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
