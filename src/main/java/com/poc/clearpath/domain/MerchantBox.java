/**
 * MerchantBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class MerchantBox  implements java.io.Serializable {
    private java.math.BigDecimal height;

    private java.math.BigDecimal length;

    private java.math.BigDecimal maximumNoOfItems;

    private java.math.BigDecimal maximumWeight;

    private java.math.BigDecimal minimumWeight;

    private java.math.BigDecimal width;

    public MerchantBox() {
    }

    public MerchantBox(
           java.math.BigDecimal height,
           java.math.BigDecimal length,
           java.math.BigDecimal maximumNoOfItems,
           java.math.BigDecimal maximumWeight,
           java.math.BigDecimal minimumWeight,
           java.math.BigDecimal width) {
           this.height = height;
           this.length = length;
           this.maximumNoOfItems = maximumNoOfItems;
           this.maximumWeight = maximumWeight;
           this.minimumWeight = minimumWeight;
           this.width = width;
    }


    /**
     * Gets the height value for this MerchantBox.
     * 
     * @return height
     */
    public java.math.BigDecimal getHeight() {
        return height;
    }


    /**
     * Sets the height value for this MerchantBox.
     * 
     * @param height
     */
    public void setHeight(java.math.BigDecimal height) {
        this.height = height;
    }


    /**
     * Gets the length value for this MerchantBox.
     * 
     * @return length
     */
    public java.math.BigDecimal getLength() {
        return length;
    }


    /**
     * Sets the length value for this MerchantBox.
     * 
     * @param length
     */
    public void setLength(java.math.BigDecimal length) {
        this.length = length;
    }


    /**
     * Gets the maximumNoOfItems value for this MerchantBox.
     * 
     * @return maximumNoOfItems
     */
    public java.math.BigDecimal getMaximumNoOfItems() {
        return maximumNoOfItems;
    }


    /**
     * Sets the maximumNoOfItems value for this MerchantBox.
     * 
     * @param maximumNoOfItems
     */
    public void setMaximumNoOfItems(java.math.BigDecimal maximumNoOfItems) {
        this.maximumNoOfItems = maximumNoOfItems;
    }


    /**
     * Gets the maximumWeight value for this MerchantBox.
     * 
     * @return maximumWeight
     */
    public java.math.BigDecimal getMaximumWeight() {
        return maximumWeight;
    }


    /**
     * Sets the maximumWeight value for this MerchantBox.
     * 
     * @param maximumWeight
     */
    public void setMaximumWeight(java.math.BigDecimal maximumWeight) {
        this.maximumWeight = maximumWeight;
    }


    /**
     * Gets the minimumWeight value for this MerchantBox.
     * 
     * @return minimumWeight
     */
    public java.math.BigDecimal getMinimumWeight() {
        return minimumWeight;
    }


    /**
     * Sets the minimumWeight value for this MerchantBox.
     * 
     * @param minimumWeight
     */
    public void setMinimumWeight(java.math.BigDecimal minimumWeight) {
        this.minimumWeight = minimumWeight;
    }


    /**
     * Gets the width value for this MerchantBox.
     * 
     * @return width
     */
    public java.math.BigDecimal getWidth() {
        return width;
    }


    /**
     * Sets the width value for this MerchantBox.
     * 
     * @param width
     */
    public void setWidth(java.math.BigDecimal width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantBox)) return false;
        MerchantBox other = (MerchantBox) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.maximumNoOfItems==null && other.getMaximumNoOfItems()==null) || 
             (this.maximumNoOfItems!=null &&
              this.maximumNoOfItems.equals(other.getMaximumNoOfItems()))) &&
            ((this.maximumWeight==null && other.getMaximumWeight()==null) || 
             (this.maximumWeight!=null &&
              this.maximumWeight.equals(other.getMaximumWeight()))) &&
            ((this.minimumWeight==null && other.getMinimumWeight()==null) || 
             (this.minimumWeight!=null &&
              this.minimumWeight.equals(other.getMinimumWeight()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMaximumNoOfItems() != null) {
            _hashCode += getMaximumNoOfItems().hashCode();
        }
        if (getMaximumWeight() != null) {
            _hashCode += getMaximumWeight().hashCode();
        }
        if (getMinimumWeight() != null) {
            _hashCode += getMinimumWeight().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantBox.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantBox"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumNoOfItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumNoOfItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width"));
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
