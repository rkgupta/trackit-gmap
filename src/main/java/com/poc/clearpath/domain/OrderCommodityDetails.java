/**
 * OrderCommodityDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class OrderCommodityDetails  implements java.io.Serializable {
    private java.lang.String HSCode;

    private java.lang.String HSCodeSource;

    private java.lang.String SKU;

    private java.lang.String UPC;

    private java.lang.String URL;

    private java.lang.String categoryCode;

    private java.lang.String categoryPath;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String countryOfOrigin;

    private java.lang.String name;

    private java.math.BigDecimal orderLineId;

    private java.math.BigDecimal quantity;

    private java.lang.Integer restrictionStatus;

    private java.lang.String shortDescripton;

    private com.poc.clearpath.domain.Size size;

    public OrderCommodityDetails() {
    }

    public OrderCommodityDetails(
           java.lang.String HSCode,
           java.lang.String HSCodeSource,
           java.lang.String SKU,
           java.lang.String UPC,
           java.lang.String URL,
           java.lang.String categoryCode,
           java.lang.String categoryPath,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String countryOfOrigin,
           java.lang.String name,
           java.math.BigDecimal orderLineId,
           java.math.BigDecimal quantity,
           java.lang.Integer restrictionStatus,
           java.lang.String shortDescripton,
           com.poc.clearpath.domain.Size size) {
           this.HSCode = HSCode;
           this.HSCodeSource = HSCodeSource;
           this.SKU = SKU;
           this.UPC = UPC;
           this.URL = URL;
           this.categoryCode = categoryCode;
           this.categoryPath = categoryPath;
           this.costComponents = costComponents;
           this.countryOfOrigin = countryOfOrigin;
           this.name = name;
           this.orderLineId = orderLineId;
           this.quantity = quantity;
           this.restrictionStatus = restrictionStatus;
           this.shortDescripton = shortDescripton;
           this.size = size;
    }


    /**
     * Gets the HSCode value for this OrderCommodityDetails.
     * 
     * @return HSCode
     */
    public java.lang.String getHSCode() {
        return HSCode;
    }


    /**
     * Sets the HSCode value for this OrderCommodityDetails.
     * 
     * @param HSCode
     */
    public void setHSCode(java.lang.String HSCode) {
        this.HSCode = HSCode;
    }


    /**
     * Gets the HSCodeSource value for this OrderCommodityDetails.
     * 
     * @return HSCodeSource
     */
    public java.lang.String getHSCodeSource() {
        return HSCodeSource;
    }


    /**
     * Sets the HSCodeSource value for this OrderCommodityDetails.
     * 
     * @param HSCodeSource
     */
    public void setHSCodeSource(java.lang.String HSCodeSource) {
        this.HSCodeSource = HSCodeSource;
    }


    /**
     * Gets the SKU value for this OrderCommodityDetails.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this OrderCommodityDetails.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the UPC value for this OrderCommodityDetails.
     * 
     * @return UPC
     */
    public java.lang.String getUPC() {
        return UPC;
    }


    /**
     * Sets the UPC value for this OrderCommodityDetails.
     * 
     * @param UPC
     */
    public void setUPC(java.lang.String UPC) {
        this.UPC = UPC;
    }


    /**
     * Gets the URL value for this OrderCommodityDetails.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this OrderCommodityDetails.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the categoryCode value for this OrderCommodityDetails.
     * 
     * @return categoryCode
     */
    public java.lang.String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this OrderCommodityDetails.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(java.lang.String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the categoryPath value for this OrderCommodityDetails.
     * 
     * @return categoryPath
     */
    public java.lang.String getCategoryPath() {
        return categoryPath;
    }


    /**
     * Sets the categoryPath value for this OrderCommodityDetails.
     * 
     * @param categoryPath
     */
    public void setCategoryPath(java.lang.String categoryPath) {
        this.categoryPath = categoryPath;
    }


    /**
     * Gets the costComponents value for this OrderCommodityDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this OrderCommodityDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the countryOfOrigin value for this OrderCommodityDetails.
     * 
     * @return countryOfOrigin
     */
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this OrderCommodityDetails.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the name value for this OrderCommodityDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OrderCommodityDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the orderLineId value for this OrderCommodityDetails.
     * 
     * @return orderLineId
     */
    public java.math.BigDecimal getOrderLineId() {
        return orderLineId;
    }


    /**
     * Sets the orderLineId value for this OrderCommodityDetails.
     * 
     * @param orderLineId
     */
    public void setOrderLineId(java.math.BigDecimal orderLineId) {
        this.orderLineId = orderLineId;
    }


    /**
     * Gets the quantity value for this OrderCommodityDetails.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OrderCommodityDetails.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the restrictionStatus value for this OrderCommodityDetails.
     * 
     * @return restrictionStatus
     */
    public java.lang.Integer getRestrictionStatus() {
        return restrictionStatus;
    }


    /**
     * Sets the restrictionStatus value for this OrderCommodityDetails.
     * 
     * @param restrictionStatus
     */
    public void setRestrictionStatus(java.lang.Integer restrictionStatus) {
        this.restrictionStatus = restrictionStatus;
    }


    /**
     * Gets the shortDescripton value for this OrderCommodityDetails.
     * 
     * @return shortDescripton
     */
    public java.lang.String getShortDescripton() {
        return shortDescripton;
    }


    /**
     * Sets the shortDescripton value for this OrderCommodityDetails.
     * 
     * @param shortDescripton
     */
    public void setShortDescripton(java.lang.String shortDescripton) {
        this.shortDescripton = shortDescripton;
    }


    /**
     * Gets the size value for this OrderCommodityDetails.
     * 
     * @return size
     */
    public com.poc.clearpath.domain.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this OrderCommodityDetails.
     * 
     * @param size
     */
    public void setSize(com.poc.clearpath.domain.Size size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderCommodityDetails)) return false;
        OrderCommodityDetails other = (OrderCommodityDetails) obj;
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
            ((this.HSCodeSource==null && other.getHSCodeSource()==null) || 
             (this.HSCodeSource!=null &&
              this.HSCodeSource.equals(other.getHSCodeSource()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.UPC==null && other.getUPC()==null) || 
             (this.UPC!=null &&
              this.UPC.equals(other.getUPC()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
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
            ((this.orderLineId==null && other.getOrderLineId()==null) || 
             (this.orderLineId!=null &&
              this.orderLineId.equals(other.getOrderLineId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.restrictionStatus==null && other.getRestrictionStatus()==null) || 
             (this.restrictionStatus!=null &&
              this.restrictionStatus.equals(other.getRestrictionStatus()))) &&
            ((this.shortDescripton==null && other.getShortDescripton()==null) || 
             (this.shortDescripton!=null &&
              this.shortDescripton.equals(other.getShortDescripton()))) &&
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
        if (getHSCode() != null) {
            _hashCode += getHSCode().hashCode();
        }
        if (getHSCodeSource() != null) {
            _hashCode += getHSCodeSource().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getUPC() != null) {
            _hashCode += getUPC().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
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
        if (getOrderLineId() != null) {
            _hashCode += getOrderLineId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRestrictionStatus() != null) {
            _hashCode += getRestrictionStatus().hashCode();
        }
        if (getShortDescripton() != null) {
            _hashCode += getShortDescripton().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderCommodityDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderCommodityDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("categoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCode"));
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
        elemField.setFieldName("orderLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderLineId"));
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
        elemField.setFieldName("restrictionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDescripton");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortDescripton"));
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
