/**
 * CommodityClassification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class CommodityClassification  implements java.io.Serializable {
    private java.lang.String HSCode;

    private java.lang.String SKU;

    private java.math.BigDecimal catalogCommodityID;

    private java.lang.String date;

    private java.lang.String defaultExportHSCode;

    private java.lang.String defaultImportHSCode;

    private java.lang.String merchantCode;

    private java.lang.String name;

    private java.lang.String source;

    private java.lang.String url;

    public CommodityClassification() {
    }

    public CommodityClassification(
           java.lang.String HSCode,
           java.lang.String SKU,
           java.math.BigDecimal catalogCommodityID,
           java.lang.String date,
           java.lang.String defaultExportHSCode,
           java.lang.String defaultImportHSCode,
           java.lang.String merchantCode,
           java.lang.String name,
           java.lang.String source,
           java.lang.String url) {
           this.HSCode = HSCode;
           this.SKU = SKU;
           this.catalogCommodityID = catalogCommodityID;
           this.date = date;
           this.defaultExportHSCode = defaultExportHSCode;
           this.defaultImportHSCode = defaultImportHSCode;
           this.merchantCode = merchantCode;
           this.name = name;
           this.source = source;
           this.url = url;
    }


    /**
     * Gets the HSCode value for this CommodityClassification.
     * 
     * @return HSCode
     */
    public java.lang.String getHSCode() {
        return HSCode;
    }


    /**
     * Sets the HSCode value for this CommodityClassification.
     * 
     * @param HSCode
     */
    public void setHSCode(java.lang.String HSCode) {
        this.HSCode = HSCode;
    }


    /**
     * Gets the SKU value for this CommodityClassification.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this CommodityClassification.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the catalogCommodityID value for this CommodityClassification.
     * 
     * @return catalogCommodityID
     */
    public java.math.BigDecimal getCatalogCommodityID() {
        return catalogCommodityID;
    }


    /**
     * Sets the catalogCommodityID value for this CommodityClassification.
     * 
     * @param catalogCommodityID
     */
    public void setCatalogCommodityID(java.math.BigDecimal catalogCommodityID) {
        this.catalogCommodityID = catalogCommodityID;
    }


    /**
     * Gets the date value for this CommodityClassification.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this CommodityClassification.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the defaultExportHSCode value for this CommodityClassification.
     * 
     * @return defaultExportHSCode
     */
    public java.lang.String getDefaultExportHSCode() {
        return defaultExportHSCode;
    }


    /**
     * Sets the defaultExportHSCode value for this CommodityClassification.
     * 
     * @param defaultExportHSCode
     */
    public void setDefaultExportHSCode(java.lang.String defaultExportHSCode) {
        this.defaultExportHSCode = defaultExportHSCode;
    }


    /**
     * Gets the defaultImportHSCode value for this CommodityClassification.
     * 
     * @return defaultImportHSCode
     */
    public java.lang.String getDefaultImportHSCode() {
        return defaultImportHSCode;
    }


    /**
     * Sets the defaultImportHSCode value for this CommodityClassification.
     * 
     * @param defaultImportHSCode
     */
    public void setDefaultImportHSCode(java.lang.String defaultImportHSCode) {
        this.defaultImportHSCode = defaultImportHSCode;
    }


    /**
     * Gets the merchantCode value for this CommodityClassification.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this CommodityClassification.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the name value for this CommodityClassification.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CommodityClassification.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the source value for this CommodityClassification.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CommodityClassification.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the url value for this CommodityClassification.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this CommodityClassification.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommodityClassification)) return false;
        CommodityClassification other = (CommodityClassification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HSCode==null && other.getHSCode()==null) || 
             (this.HSCode!=null &&
              this.HSCode.equals(other.getHSCode()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.catalogCommodityID==null && other.getCatalogCommodityID()==null) || 
             (this.catalogCommodityID!=null &&
              this.catalogCommodityID.equals(other.getCatalogCommodityID()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.defaultExportHSCode==null && other.getDefaultExportHSCode()==null) || 
             (this.defaultExportHSCode!=null &&
              this.defaultExportHSCode.equals(other.getDefaultExportHSCode()))) &&
            ((this.defaultImportHSCode==null && other.getDefaultImportHSCode()==null) || 
             (this.defaultImportHSCode!=null &&
              this.defaultImportHSCode.equals(other.getDefaultImportHSCode()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
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
        if (getHSCode() != null) {
            _hashCode += getHSCode().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getCatalogCommodityID() != null) {
            _hashCode += getCatalogCommodityID().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDefaultExportHSCode() != null) {
            _hashCode += getDefaultExportHSCode().hashCode();
        }
        if (getDefaultImportHSCode() != null) {
            _hashCode += getDefaultImportHSCode().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommodityClassification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CommodityClassification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogCommodityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "catalogCommodityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultExportHSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultExportHSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultImportHSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultImportHSCode"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
