/**
 * QuoteDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class QuoteDetails  implements java.io.Serializable {
    private com.poc.clearpath.domain.QuoteCommodityDetails[] commodities;

    private com.poc.clearpath.domain.Consignee consignee;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String merchantCode;

    private com.poc.clearpath.domain.ShippingMethod shippingMethod;

    public QuoteDetails() {
    }

    public QuoteDetails(
           com.poc.clearpath.domain.QuoteCommodityDetails[] commodities,
           com.poc.clearpath.domain.Consignee consignee,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String merchantCode,
           com.poc.clearpath.domain.ShippingMethod shippingMethod) {
           this.commodities = commodities;
           this.consignee = consignee;
           this.costComponents = costComponents;
           this.merchantCode = merchantCode;
           this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the commodities value for this QuoteDetails.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.QuoteCommodityDetails[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this QuoteDetails.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.QuoteCommodityDetails[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the consignee value for this QuoteDetails.
     * 
     * @return consignee
     */
    public com.poc.clearpath.domain.Consignee getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this QuoteDetails.
     * 
     * @param consignee
     */
    public void setConsignee(com.poc.clearpath.domain.Consignee consignee) {
        this.consignee = consignee;
    }


    /**
     * Gets the costComponents value for this QuoteDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this QuoteDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the merchantCode value for this QuoteDetails.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this QuoteDetails.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the shippingMethod value for this QuoteDetails.
     * 
     * @return shippingMethod
     */
    public com.poc.clearpath.domain.ShippingMethod getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this QuoteDetails.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(com.poc.clearpath.domain.ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuoteDetails)) return false;
        QuoteDetails other = (QuoteDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod())));
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
        if (getCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsignee() != null) {
            _hashCode += getConsignee().hashCode();
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
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuoteDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteCommodityDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Consignee"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingMethod"));
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
