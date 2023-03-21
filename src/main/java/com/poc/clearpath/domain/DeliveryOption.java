/**
 * DeliveryOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class DeliveryOption  implements java.io.Serializable {
    private java.lang.String shippingMethodId;

    private java.lang.String[] shippingOptionIds;

    public DeliveryOption() {
    }

    public DeliveryOption(
           java.lang.String shippingMethodId,
           java.lang.String[] shippingOptionIds) {
           this.shippingMethodId = shippingMethodId;
           this.shippingOptionIds = shippingOptionIds;
    }


    /**
     * Gets the shippingMethodId value for this DeliveryOption.
     * 
     * @return shippingMethodId
     */
    public java.lang.String getShippingMethodId() {
        return shippingMethodId;
    }


    /**
     * Sets the shippingMethodId value for this DeliveryOption.
     * 
     * @param shippingMethodId
     */
    public void setShippingMethodId(java.lang.String shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }


    /**
     * Gets the shippingOptionIds value for this DeliveryOption.
     * 
     * @return shippingOptionIds
     */
    public java.lang.String[] getShippingOptionIds() {
        return shippingOptionIds;
    }


    /**
     * Sets the shippingOptionIds value for this DeliveryOption.
     * 
     * @param shippingOptionIds
     */
    public void setShippingOptionIds(java.lang.String[] shippingOptionIds) {
        this.shippingOptionIds = shippingOptionIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryOption)) return false;
        DeliveryOption other = (DeliveryOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingMethodId==null && other.getShippingMethodId()==null) || 
             (this.shippingMethodId!=null &&
              this.shippingMethodId.equals(other.getShippingMethodId()))) &&
            ((this.shippingOptionIds==null && other.getShippingOptionIds()==null) || 
             (this.shippingOptionIds!=null &&
              java.util.Arrays.equals(this.shippingOptionIds, other.getShippingOptionIds())));
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
        if (getShippingMethodId() != null) {
            _hashCode += getShippingMethodId().hashCode();
        }
        if (getShippingOptionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingOptionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingOptionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOptionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingOptionIds"));
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
