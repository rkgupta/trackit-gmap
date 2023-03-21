/**
 * QuoteNoShCommodityDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class QuoteNoShCommodityDetails  extends com.poc.clearpath.domain.QuoteCommodityDetails  implements java.io.Serializable {
    private int hsCodePriority;

    public QuoteNoShCommodityDetails() {
    }

    public QuoteNoShCommodityDetails(
           java.lang.String SKU,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String name,
           java.math.BigDecimal quantity,
           int hsCodePriority) {
        super(
            SKU,
            costComponents,
            name,
            quantity);
        this.hsCodePriority = hsCodePriority;
    }


    /**
     * Gets the hsCodePriority value for this QuoteNoShCommodityDetails.
     * 
     * @return hsCodePriority
     */
    public int getHsCodePriority() {
        return hsCodePriority;
    }


    /**
     * Sets the hsCodePriority value for this QuoteNoShCommodityDetails.
     * 
     * @param hsCodePriority
     */
    public void setHsCodePriority(int hsCodePriority) {
        this.hsCodePriority = hsCodePriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuoteNoShCommodityDetails)) return false;
        QuoteNoShCommodityDetails other = (QuoteNoShCommodityDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.hsCodePriority == other.getHsCodePriority();
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
        _hashCode += getHsCodePriority();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuoteNoShCommodityDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteNoShCommodityDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hsCodePriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hsCodePriority"));
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
