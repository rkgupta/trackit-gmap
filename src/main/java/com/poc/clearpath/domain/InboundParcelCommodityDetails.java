/**
 * InboundParcelCommodityDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class InboundParcelCommodityDetails  implements java.io.Serializable {
    private java.lang.String SKU;

    private java.lang.String categoryPath;

    private java.lang.String countryOfOrigin;

    private java.lang.String name;

    private java.math.BigDecimal parcelLineId;

    private java.math.BigDecimal quantity;

    private java.lang.String url;

    public InboundParcelCommodityDetails() {
    }

    public InboundParcelCommodityDetails(
           java.lang.String SKU,
           java.lang.String categoryPath,
           java.lang.String countryOfOrigin,
           java.lang.String name,
           java.math.BigDecimal parcelLineId,
           java.math.BigDecimal quantity,
           java.lang.String url) {
           this.SKU = SKU;
           this.categoryPath = categoryPath;
           this.countryOfOrigin = countryOfOrigin;
           this.name = name;
           this.parcelLineId = parcelLineId;
           this.quantity = quantity;
           this.url = url;
    }


    /**
     * Gets the SKU value for this InboundParcelCommodityDetails.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this InboundParcelCommodityDetails.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the categoryPath value for this InboundParcelCommodityDetails.
     * 
     * @return categoryPath
     */
    public java.lang.String getCategoryPath() {
        return categoryPath;
    }


    /**
     * Sets the categoryPath value for this InboundParcelCommodityDetails.
     * 
     * @param categoryPath
     */
    public void setCategoryPath(java.lang.String categoryPath) {
        this.categoryPath = categoryPath;
    }


    /**
     * Gets the countryOfOrigin value for this InboundParcelCommodityDetails.
     * 
     * @return countryOfOrigin
     */
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this InboundParcelCommodityDetails.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the name value for this InboundParcelCommodityDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InboundParcelCommodityDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parcelLineId value for this InboundParcelCommodityDetails.
     * 
     * @return parcelLineId
     */
    public java.math.BigDecimal getParcelLineId() {
        return parcelLineId;
    }


    /**
     * Sets the parcelLineId value for this InboundParcelCommodityDetails.
     * 
     * @param parcelLineId
     */
    public void setParcelLineId(java.math.BigDecimal parcelLineId) {
        this.parcelLineId = parcelLineId;
    }


    /**
     * Gets the quantity value for this InboundParcelCommodityDetails.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this InboundParcelCommodityDetails.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the url value for this InboundParcelCommodityDetails.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this InboundParcelCommodityDetails.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundParcelCommodityDetails)) return false;
        InboundParcelCommodityDetails other = (InboundParcelCommodityDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.categoryPath==null && other.getCategoryPath()==null) || 
             (this.categoryPath!=null &&
              this.categoryPath.equals(other.getCategoryPath()))) &&
            ((this.countryOfOrigin==null && other.getCountryOfOrigin()==null) || 
             (this.countryOfOrigin!=null &&
              this.countryOfOrigin.equals(other.getCountryOfOrigin()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parcelLineId==null && other.getParcelLineId()==null) || 
             (this.parcelLineId!=null &&
              this.parcelLineId.equals(other.getParcelLineId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getCategoryPath() != null) {
            _hashCode += getCategoryPath().hashCode();
        }
        if (getCountryOfOrigin() != null) {
            _hashCode += getCountryOfOrigin().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParcelLineId() != null) {
            _hashCode += getParcelLineId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundParcelCommodityDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodityDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryOfOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
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
