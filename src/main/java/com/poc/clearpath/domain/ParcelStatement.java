/**
 * ParcelStatement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ParcelStatement  implements java.io.Serializable {
    private com.poc.clearpath.domain.CommodityStatement[] commodityStatement;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String country;

    private java.lang.String orderNumber;

    private java.lang.String referenceNumber;

    private java.lang.String type;

    public ParcelStatement() {
    }

    public ParcelStatement(
           com.poc.clearpath.domain.CommodityStatement[] commodityStatement,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String country,
           java.lang.String orderNumber,
           java.lang.String referenceNumber,
           java.lang.String type) {
           this.commodityStatement = commodityStatement;
           this.costComponents = costComponents;
           this.country = country;
           this.orderNumber = orderNumber;
           this.referenceNumber = referenceNumber;
           this.type = type;
    }


    /**
     * Gets the commodityStatement value for this ParcelStatement.
     * 
     * @return commodityStatement
     */
    public com.poc.clearpath.domain.CommodityStatement[] getCommodityStatement() {
        return commodityStatement;
    }


    /**
     * Sets the commodityStatement value for this ParcelStatement.
     * 
     * @param commodityStatement
     */
    public void setCommodityStatement(com.poc.clearpath.domain.CommodityStatement[] commodityStatement) {
        this.commodityStatement = commodityStatement;
    }


    /**
     * Gets the costComponents value for this ParcelStatement.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this ParcelStatement.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the country value for this ParcelStatement.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ParcelStatement.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the orderNumber value for this ParcelStatement.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this ParcelStatement.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the referenceNumber value for this ParcelStatement.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ParcelStatement.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the type value for this ParcelStatement.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ParcelStatement.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelStatement)) return false;
        ParcelStatement other = (ParcelStatement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commodityStatement==null && other.getCommodityStatement()==null) || 
             (this.commodityStatement!=null &&
              java.util.Arrays.equals(this.commodityStatement, other.getCommodityStatement()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getCommodityStatement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodityStatement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodityStatement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelStatement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelStatement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodityStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CommodityStatement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
