/**
 * ParcelCommodityDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ParcelCommodityDetails  implements java.io.Serializable {
    private java.lang.String ECCN;

    private java.lang.String ECCNSource;

    private java.lang.String HSCode;

    private java.lang.String HSCodeSource;

    private java.lang.String HSCodeType;

    private java.lang.String SKU;

    private java.lang.String URL;

    private java.lang.String categoryPath;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String countryOfOrigin;

    private java.lang.String name;

    private java.math.BigDecimal parcelLineId;

    private java.math.BigDecimal quantity;

    public ParcelCommodityDetails() {
    }

    public ParcelCommodityDetails(
           java.lang.String ECCN,
           java.lang.String ECCNSource,
           java.lang.String HSCode,
           java.lang.String HSCodeSource,
           java.lang.String HSCodeType,
           java.lang.String SKU,
           java.lang.String URL,
           java.lang.String categoryPath,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String countryOfOrigin,
           java.lang.String name,
           java.math.BigDecimal parcelLineId,
           java.math.BigDecimal quantity) {
           this.ECCN = ECCN;
           this.ECCNSource = ECCNSource;
           this.HSCode = HSCode;
           this.HSCodeSource = HSCodeSource;
           this.HSCodeType = HSCodeType;
           this.SKU = SKU;
           this.URL = URL;
           this.categoryPath = categoryPath;
           this.costComponents = costComponents;
           this.countryOfOrigin = countryOfOrigin;
           this.name = name;
           this.parcelLineId = parcelLineId;
           this.quantity = quantity;
    }


    /**
     * Gets the ECCN value for this ParcelCommodityDetails.
     * 
     * @return ECCN
     */
    public java.lang.String getECCN() {
        return ECCN;
    }


    /**
     * Sets the ECCN value for this ParcelCommodityDetails.
     * 
     * @param ECCN
     */
    public void setECCN(java.lang.String ECCN) {
        this.ECCN = ECCN;
    }


    /**
     * Gets the ECCNSource value for this ParcelCommodityDetails.
     * 
     * @return ECCNSource
     */
    public java.lang.String getECCNSource() {
        return ECCNSource;
    }


    /**
     * Sets the ECCNSource value for this ParcelCommodityDetails.
     * 
     * @param ECCNSource
     */
    public void setECCNSource(java.lang.String ECCNSource) {
        this.ECCNSource = ECCNSource;
    }


    /**
     * Gets the HSCode value for this ParcelCommodityDetails.
     * 
     * @return HSCode
     */
    public java.lang.String getHSCode() {
        return HSCode;
    }


    /**
     * Sets the HSCode value for this ParcelCommodityDetails.
     * 
     * @param HSCode
     */
    public void setHSCode(java.lang.String HSCode) {
        this.HSCode = HSCode;
    }


    /**
     * Gets the HSCodeSource value for this ParcelCommodityDetails.
     * 
     * @return HSCodeSource
     */
    public java.lang.String getHSCodeSource() {
        return HSCodeSource;
    }


    /**
     * Sets the HSCodeSource value for this ParcelCommodityDetails.
     * 
     * @param HSCodeSource
     */
    public void setHSCodeSource(java.lang.String HSCodeSource) {
        this.HSCodeSource = HSCodeSource;
    }


    /**
     * Gets the HSCodeType value for this ParcelCommodityDetails.
     * 
     * @return HSCodeType
     */
    public java.lang.String getHSCodeType() {
        return HSCodeType;
    }


    /**
     * Sets the HSCodeType value for this ParcelCommodityDetails.
     * 
     * @param HSCodeType
     */
    public void setHSCodeType(java.lang.String HSCodeType) {
        this.HSCodeType = HSCodeType;
    }


    /**
     * Gets the SKU value for this ParcelCommodityDetails.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this ParcelCommodityDetails.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the URL value for this ParcelCommodityDetails.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this ParcelCommodityDetails.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the categoryPath value for this ParcelCommodityDetails.
     * 
     * @return categoryPath
     */
    public java.lang.String getCategoryPath() {
        return categoryPath;
    }


    /**
     * Sets the categoryPath value for this ParcelCommodityDetails.
     * 
     * @param categoryPath
     */
    public void setCategoryPath(java.lang.String categoryPath) {
        this.categoryPath = categoryPath;
    }


    /**
     * Gets the costComponents value for this ParcelCommodityDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this ParcelCommodityDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the countryOfOrigin value for this ParcelCommodityDetails.
     * 
     * @return countryOfOrigin
     */
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this ParcelCommodityDetails.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the name value for this ParcelCommodityDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ParcelCommodityDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parcelLineId value for this ParcelCommodityDetails.
     * 
     * @return parcelLineId
     */
    public java.math.BigDecimal getParcelLineId() {
        return parcelLineId;
    }


    /**
     * Sets the parcelLineId value for this ParcelCommodityDetails.
     * 
     * @param parcelLineId
     */
    public void setParcelLineId(java.math.BigDecimal parcelLineId) {
        this.parcelLineId = parcelLineId;
    }


    /**
     * Gets the quantity value for this ParcelCommodityDetails.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ParcelCommodityDetails.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelCommodityDetails)) return false;
        ParcelCommodityDetails other = (ParcelCommodityDetails) obj;
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
            ((this.ECCNSource==null && other.getECCNSource()==null) || 
             (this.ECCNSource!=null &&
              this.ECCNSource.equals(other.getECCNSource()))) &&
            ((this.HSCode==null && other.getHSCode()==null) || 
             (this.HSCode!=null &&
              this.HSCode.equals(other.getHSCode()))) &&
            ((this.HSCodeSource==null && other.getHSCodeSource()==null) || 
             (this.HSCodeSource!=null &&
              this.HSCodeSource.equals(other.getHSCodeSource()))) &&
            ((this.HSCodeType==null && other.getHSCodeType()==null) || 
             (this.HSCodeType!=null &&
              this.HSCodeType.equals(other.getHSCodeType()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.categoryPath==null && other.getCategoryPath()==null) || 
             (this.categoryPath!=null &&
              this.categoryPath.equals(other.getCategoryPath()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
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
              this.quantity.equals(other.getQuantity())));
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
        if (getECCNSource() != null) {
            _hashCode += getECCNSource().hashCode();
        }
        if (getHSCode() != null) {
            _hashCode += getHSCode().hashCode();
        }
        if (getHSCodeSource() != null) {
            _hashCode += getHSCodeSource().hashCode();
        }
        if (getHSCodeType() != null) {
            _hashCode += getHSCodeType().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getCategoryPath() != null) {
            _hashCode += getCategoryPath().hashCode();
        }
        if (getCostComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelCommodityDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelCommodityDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ECCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECCNSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ECCNSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HSCodeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HSCodeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HSCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HSCodeType"));
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
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
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
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
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
