/**
 * ECCN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ECCN  implements java.io.Serializable {
    private java.lang.String ECCN;

    private java.lang.String ECCNDate;

    private java.lang.String ECCNSource;

    public ECCN() {
    }

    public ECCN(
           java.lang.String ECCN,
           java.lang.String ECCNDate,
           java.lang.String ECCNSource) {
           this.ECCN = ECCN;
           this.ECCNDate = ECCNDate;
           this.ECCNSource = ECCNSource;
    }


    /**
     * Gets the ECCN value for this ECCN.
     * 
     * @return ECCN
     */
    public java.lang.String getECCN() {
        return ECCN;
    }


    /**
     * Sets the ECCN value for this ECCN.
     * 
     * @param ECCN
     */
    public void setECCN(java.lang.String ECCN) {
        this.ECCN = ECCN;
    }


    /**
     * Gets the ECCNDate value for this ECCN.
     * 
     * @return ECCNDate
     */
    public java.lang.String getECCNDate() {
        return ECCNDate;
    }


    /**
     * Sets the ECCNDate value for this ECCN.
     * 
     * @param ECCNDate
     */
    public void setECCNDate(java.lang.String ECCNDate) {
        this.ECCNDate = ECCNDate;
    }


    /**
     * Gets the ECCNSource value for this ECCN.
     * 
     * @return ECCNSource
     */
    public java.lang.String getECCNSource() {
        return ECCNSource;
    }


    /**
     * Sets the ECCNSource value for this ECCN.
     * 
     * @param ECCNSource
     */
    public void setECCNSource(java.lang.String ECCNSource) {
        this.ECCNSource = ECCNSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ECCN)) return false;
        ECCN other = (ECCN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ECCN==null && other.getECCN()==null) || 
             (this.ECCN!=null &&
              this.ECCN.equals(other.getECCN()))) &&
            ((this.ECCNDate==null && other.getECCNDate()==null) || 
             (this.ECCNDate!=null &&
              this.ECCNDate.equals(other.getECCNDate()))) &&
            ((this.ECCNSource==null && other.getECCNSource()==null) || 
             (this.ECCNSource!=null &&
              this.ECCNSource.equals(other.getECCNSource())));
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
        if (getECCN() != null) {
            _hashCode += getECCN().hashCode();
        }
        if (getECCNDate() != null) {
            _hashCode += getECCNDate().hashCode();
        }
        if (getECCNSource() != null) {
            _hashCode += getECCNSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ECCN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ECCN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ECCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECCNDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ECCNDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECCNSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ECCNSource"));
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
