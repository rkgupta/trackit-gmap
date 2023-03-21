/**
 * OrderPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class OrderPage  implements java.io.Serializable {
    private java.lang.Integer numberOfOrders;

    private java.lang.Integer numberOfPages;

    private com.poc.clearpath.domain.OrderHeader[] orders;

    public OrderPage() {
    }

    public OrderPage(
           java.lang.Integer numberOfOrders,
           java.lang.Integer numberOfPages,
           com.poc.clearpath.domain.OrderHeader[] orders) {
           this.numberOfOrders = numberOfOrders;
           this.numberOfPages = numberOfPages;
           this.orders = orders;
    }


    /**
     * Gets the numberOfOrders value for this OrderPage.
     * 
     * @return numberOfOrders
     */
    public java.lang.Integer getNumberOfOrders() {
        return numberOfOrders;
    }


    /**
     * Sets the numberOfOrders value for this OrderPage.
     * 
     * @param numberOfOrders
     */
    public void setNumberOfOrders(java.lang.Integer numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }


    /**
     * Gets the numberOfPages value for this OrderPage.
     * 
     * @return numberOfPages
     */
    public java.lang.Integer getNumberOfPages() {
        return numberOfPages;
    }


    /**
     * Sets the numberOfPages value for this OrderPage.
     * 
     * @param numberOfPages
     */
    public void setNumberOfPages(java.lang.Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    /**
     * Gets the orders value for this OrderPage.
     * 
     * @return orders
     */
    public com.poc.clearpath.domain.OrderHeader[] getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this OrderPage.
     * 
     * @param orders
     */
    public void setOrders(com.poc.clearpath.domain.OrderHeader[] orders) {
        this.orders = orders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderPage)) return false;
        OrderPage other = (OrderPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberOfOrders==null && other.getNumberOfOrders()==null) || 
             (this.numberOfOrders!=null &&
              this.numberOfOrders.equals(other.getNumberOfOrders()))) &&
            ((this.numberOfPages==null && other.getNumberOfPages()==null) || 
             (this.numberOfPages!=null &&
              this.numberOfPages.equals(other.getNumberOfPages()))) &&
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              java.util.Arrays.equals(this.orders, other.getOrders())));
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
        if (getNumberOfOrders() != null) {
            _hashCode += getNumberOfOrders().hashCode();
        }
        if (getNumberOfPages() != null) {
            _hashCode += getNumberOfPages().hashCode();
        }
        if (getOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrders(), i);
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
        new org.apache.axis.description.TypeDesc(OrderPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderHeader"));
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
