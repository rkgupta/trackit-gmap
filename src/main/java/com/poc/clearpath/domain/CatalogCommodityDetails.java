/**
 * CatalogCommodityDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class CatalogCommodityDetails  extends com.poc.clearpath.domain.CatalogCommodity  implements java.io.Serializable {
    private java.math.BigDecimal commodityId;

    public CatalogCommodityDetails() {
    }

    public CatalogCommodityDetails(
           java.lang.String SKU,
           java.lang.String UPC,
           java.lang.String URL,
           java.lang.String[] categoryCodes,
           java.lang.String countryOfOrigin,
           java.lang.String description,
           java.lang.String identificationType,
           java.lang.String merchantCode,
           java.lang.String name,
           com.poc.clearpath.domain.Size size,
           java.math.BigDecimal commodityId) {
        super(
            SKU,
            UPC,
            URL,
            categoryCodes,
            countryOfOrigin,
            description,
            identificationType,
            merchantCode,
            name,
            size);
        this.commodityId = commodityId;
    }


    /**
     * Gets the commodityId value for this CatalogCommodityDetails.
     * 
     * @return commodityId
     */
    public java.math.BigDecimal getCommodityId() {
        return commodityId;
    }


    /**
     * Sets the commodityId value for this CatalogCommodityDetails.
     * 
     * @param commodityId
     */
    public void setCommodityId(java.math.BigDecimal commodityId) {
        this.commodityId = commodityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogCommodityDetails)) return false;
        CatalogCommodityDetails other = (CatalogCommodityDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commodityId==null && other.getCommodityId()==null) || 
             (this.commodityId!=null &&
              this.commodityId.equals(other.getCommodityId())));
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
        if (getCommodityId() != null) {
            _hashCode += getCommodityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogCommodityDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodityDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
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
