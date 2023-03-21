/**
 * InvoiceDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class InvoiceDetails  implements java.io.Serializable {
    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private com.poc.clearpath.domain.Invoice header;

    private com.poc.clearpath.domain.MerchantStatement[] merchantStatements;

    public InvoiceDetails() {
    }

    public InvoiceDetails(
           com.poc.clearpath.domain.CostComponent[] costComponents,
           com.poc.clearpath.domain.Invoice header,
           com.poc.clearpath.domain.MerchantStatement[] merchantStatements) {
           this.costComponents = costComponents;
           this.header = header;
           this.merchantStatements = merchantStatements;
    }


    /**
     * Gets the costComponents value for this InvoiceDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this InvoiceDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the header value for this InvoiceDetails.
     * 
     * @return header
     */
    public com.poc.clearpath.domain.Invoice getHeader() {
        return header;
    }


    /**
     * Sets the header value for this InvoiceDetails.
     * 
     * @param header
     */
    public void setHeader(com.poc.clearpath.domain.Invoice header) {
        this.header = header;
    }


    /**
     * Gets the merchantStatements value for this InvoiceDetails.
     * 
     * @return merchantStatements
     */
    public com.poc.clearpath.domain.MerchantStatement[] getMerchantStatements() {
        return merchantStatements;
    }


    /**
     * Sets the merchantStatements value for this InvoiceDetails.
     * 
     * @param merchantStatements
     */
    public void setMerchantStatements(com.poc.clearpath.domain.MerchantStatement[] merchantStatements) {
        this.merchantStatements = merchantStatements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceDetails)) return false;
        InvoiceDetails other = (InvoiceDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.merchantStatements==null && other.getMerchantStatements()==null) || 
             (this.merchantStatements!=null &&
              java.util.Arrays.equals(this.merchantStatements, other.getMerchantStatements())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getMerchantStatements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantStatements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantStatements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InvoiceDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Invoice"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantStatement"));
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
