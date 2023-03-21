/**
 * BasketCommodity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class BasketCommodity  implements java.io.Serializable {
    private java.lang.String SKU;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String countryOfOrigin;

    private java.math.BigDecimal quantity;

    public BasketCommodity() {
    }

    public BasketCommodity(
           java.lang.String SKU,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String countryOfOrigin,
           java.math.BigDecimal quantity) {
           this.SKU = SKU;
           this.costComponents = costComponents;
           this.countryOfOrigin = countryOfOrigin;
           this.quantity = quantity;
    }


    /**
     * Gets the SKU value for this BasketCommodity.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this BasketCommodity.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the costComponents value for this BasketCommodity.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this BasketCommodity.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the countryOfOrigin value for this BasketCommodity.
     * 
     * @return countryOfOrigin
     */
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this BasketCommodity.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the quantity value for this BasketCommodity.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BasketCommodity.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BasketCommodity)) return false;
        BasketCommodity other = (BasketCommodity) obj;
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
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.countryOfOrigin==null && other.getCountryOfOrigin()==null) || 
             (this.countryOfOrigin!=null &&
              this.countryOfOrigin.equals(other.getCountryOfOrigin()))) &&
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
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BasketCommodity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BasketCommodity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SKU"));
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
