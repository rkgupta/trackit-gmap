/**
 * DeliveryPromise.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class DeliveryPromise  implements java.io.Serializable {
    private java.lang.Integer maxDays;

    private java.lang.Integer minDays;

    public DeliveryPromise() {
    }

    public DeliveryPromise(
           java.lang.Integer maxDays,
           java.lang.Integer minDays) {
           this.maxDays = maxDays;
           this.minDays = minDays;
    }


    /**
     * Gets the maxDays value for this DeliveryPromise.
     * 
     * @return maxDays
     */
    public java.lang.Integer getMaxDays() {
        return maxDays;
    }


    /**
     * Sets the maxDays value for this DeliveryPromise.
     * 
     * @param maxDays
     */
    public void setMaxDays(java.lang.Integer maxDays) {
        this.maxDays = maxDays;
    }


    /**
     * Gets the minDays value for this DeliveryPromise.
     * 
     * @return minDays
     */
    public java.lang.Integer getMinDays() {
        return minDays;
    }


    /**
     * Sets the minDays value for this DeliveryPromise.
     * 
     * @param minDays
     */
    public void setMinDays(java.lang.Integer minDays) {
        this.minDays = minDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryPromise)) return false;
        DeliveryPromise other = (DeliveryPromise) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxDays==null && other.getMaxDays()==null) || 
             (this.maxDays!=null &&
              this.maxDays.equals(other.getMaxDays()))) &&
            ((this.minDays==null && other.getMinDays()==null) || 
             (this.minDays!=null &&
              this.minDays.equals(other.getMinDays())));
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
        if (getMaxDays() != null) {
            _hashCode += getMaxDays().hashCode();
        }
        if (getMinDays() != null) {
            _hashCode += getMinDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryPromise.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryPromise"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
