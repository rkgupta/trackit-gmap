/**
 * ShippingMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ShippingMethod  implements java.io.Serializable {
    private java.lang.String carrier;

    private boolean domestic;

    private int maxDays;

    private int minDays;

    private java.lang.String name;

    private com.poc.clearpath.domain.ShippingOption[] options;

    private java.math.BigDecimal price;

    private java.lang.String shippingMethodId;

    public ShippingMethod() {
    }

    public ShippingMethod(
           java.lang.String carrier,
           boolean domestic,
           int maxDays,
           int minDays,
           java.lang.String name,
           com.poc.clearpath.domain.ShippingOption[] options,
           java.math.BigDecimal price,
           java.lang.String shippingMethodId) {
           this.carrier = carrier;
           this.domestic = domestic;
           this.maxDays = maxDays;
           this.minDays = minDays;
           this.name = name;
           this.options = options;
           this.price = price;
           this.shippingMethodId = shippingMethodId;
    }


    /**
     * Gets the carrier value for this ShippingMethod.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this ShippingMethod.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the domestic value for this ShippingMethod.
     * 
     * @return domestic
     */
    public boolean isDomestic() {
        return domestic;
    }


    /**
     * Sets the domestic value for this ShippingMethod.
     * 
     * @param domestic
     */
    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }


    /**
     * Gets the maxDays value for this ShippingMethod.
     * 
     * @return maxDays
     */
    public int getMaxDays() {
        return maxDays;
    }


    /**
     * Sets the maxDays value for this ShippingMethod.
     * 
     * @param maxDays
     */
    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }


    /**
     * Gets the minDays value for this ShippingMethod.
     * 
     * @return minDays
     */
    public int getMinDays() {
        return minDays;
    }


    /**
     * Sets the minDays value for this ShippingMethod.
     * 
     * @param minDays
     */
    public void setMinDays(int minDays) {
        this.minDays = minDays;
    }


    /**
     * Gets the name value for this ShippingMethod.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ShippingMethod.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the options value for this ShippingMethod.
     * 
     * @return options
     */
    public com.poc.clearpath.domain.ShippingOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ShippingMethod.
     * 
     * @param options
     */
    public void setOptions(com.poc.clearpath.domain.ShippingOption[] options) {
        this.options = options;
    }


    /**
     * Gets the price value for this ShippingMethod.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ShippingMethod.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the shippingMethodId value for this ShippingMethod.
     * 
     * @return shippingMethodId
     */
    public java.lang.String getShippingMethodId() {
        return shippingMethodId;
    }


    /**
     * Sets the shippingMethodId value for this ShippingMethod.
     * 
     * @param shippingMethodId
     */
    public void setShippingMethodId(java.lang.String shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingMethod)) return false;
        ShippingMethod other = (ShippingMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            this.domestic == other.isDomestic() &&
            this.maxDays == other.getMaxDays() &&
            this.minDays == other.getMinDays() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.shippingMethodId==null && other.getShippingMethodId()==null) || 
             (this.shippingMethodId!=null &&
              this.shippingMethodId.equals(other.getShippingMethodId())));
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
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        _hashCode += (isDomestic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMaxDays();
        _hashCode += getMinDays();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getShippingMethodId() != null) {
            _hashCode += getShippingMethodId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingOption"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingMethodId"));
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
