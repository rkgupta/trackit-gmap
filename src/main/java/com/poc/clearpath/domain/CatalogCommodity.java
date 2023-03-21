/**
 * CatalogCommodity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class CatalogCommodity  implements java.io.Serializable {
    private java.lang.String SKU;

    private java.lang.String UPC;

    private java.lang.String URL;

    private java.lang.String[] categoryCodes;

    private java.lang.String countryOfOrigin;

    private java.lang.String description;

    private java.lang.String identificationType;

    private java.lang.String merchantCode;

    private java.lang.String name;

    private com.poc.clearpath.domain.Size size;

    public CatalogCommodity() {
    }

    public CatalogCommodity(
           java.lang.String SKU,
           java.lang.String UPC,
           java.lang.String URL,
           java.lang.String[] categoryCodes,
           java.lang.String countryOfOrigin,
           java.lang.String description,
           java.lang.String identificationType,
           java.lang.String merchantCode,
           java.lang.String name,
           com.poc.clearpath.domain.Size size) {
           this.SKU = SKU;
           this.UPC = UPC;
           this.URL = URL;
           this.categoryCodes = categoryCodes;
           this.countryOfOrigin = countryOfOrigin;
           this.description = description;
           this.identificationType = identificationType;
           this.merchantCode = merchantCode;
           this.name = name;
           this.size = size;
    }


    /**
     * Gets the SKU value for this CatalogCommodity.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this CatalogCommodity.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the UPC value for this CatalogCommodity.
     * 
     * @return UPC
     */
    public java.lang.String getUPC() {
        return UPC;
    }


    /**
     * Sets the UPC value for this CatalogCommodity.
     * 
     * @param UPC
     */
    public void setUPC(java.lang.String UPC) {
        this.UPC = UPC;
    }


    /**
     * Gets the URL value for this CatalogCommodity.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this CatalogCommodity.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the categoryCodes value for this CatalogCommodity.
     * 
     * @return categoryCodes
     */
    public java.lang.String[] getCategoryCodes() {
        return categoryCodes;
    }


    /**
     * Sets the categoryCodes value for this CatalogCommodity.
     * 
     * @param categoryCodes
     */
    public void setCategoryCodes(java.lang.String[] categoryCodes) {
        this.categoryCodes = categoryCodes;
    }


    /**
     * Gets the countryOfOrigin value for this CatalogCommodity.
     * 
     * @return countryOfOrigin
     */
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this CatalogCommodity.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the description value for this CatalogCommodity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CatalogCommodity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the identificationType value for this CatalogCommodity.
     * 
     * @return identificationType
     */
    public java.lang.String getIdentificationType() {
        return identificationType;
    }


    /**
     * Sets the identificationType value for this CatalogCommodity.
     * 
     * @param identificationType
     */
    public void setIdentificationType(java.lang.String identificationType) {
        this.identificationType = identificationType;
    }


    /**
     * Gets the merchantCode value for this CatalogCommodity.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this CatalogCommodity.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the name value for this CatalogCommodity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CatalogCommodity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this CatalogCommodity.
     * 
     * @return size
     */
    public com.poc.clearpath.domain.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this CatalogCommodity.
     * 
     * @param size
     */
    public void setSize(com.poc.clearpath.domain.Size size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogCommodity)) return false;
        CatalogCommodity other = (CatalogCommodity) obj;
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
            ((this.UPC==null && other.getUPC()==null) || 
             (this.UPC!=null &&
              this.UPC.equals(other.getUPC()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.categoryCodes==null && other.getCategoryCodes()==null) || 
             (this.categoryCodes!=null &&
              java.util.Arrays.equals(this.categoryCodes, other.getCategoryCodes()))) &&
            ((this.countryOfOrigin==null && other.getCountryOfOrigin()==null) || 
             (this.countryOfOrigin!=null &&
              this.countryOfOrigin.equals(other.getCountryOfOrigin()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.identificationType==null && other.getIdentificationType()==null) || 
             (this.identificationType!=null &&
              this.identificationType.equals(other.getIdentificationType()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        if (getUPC() != null) {
            _hashCode += getUPC().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getCategoryCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryOfOrigin() != null) {
            _hashCode += getCountryOfOrigin().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIdentificationType() != null) {
            _hashCode += getIdentificationType().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogCommodity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCodes"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificationType"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"));
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
