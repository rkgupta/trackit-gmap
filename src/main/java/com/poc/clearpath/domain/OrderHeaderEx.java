/**
 * OrderHeaderEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class OrderHeaderEx  extends com.poc.clearpath.domain.OrderHeader  implements java.io.Serializable {
    private java.lang.String orderStatus;

    private java.lang.String partnerName;

    private java.lang.String placedDate;

    public OrderHeaderEx() {
    }

    public OrderHeaderEx(
           java.lang.String confirmedDate,
           java.lang.String countryName,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String merchantName,
           java.lang.String orderNumber,
           java.lang.String orderStatus,
           java.lang.String partnerName,
           java.lang.String placedDate) {
        super(
            confirmedDate,
            countryName,
            firstName,
            lastName,
            merchantName,
            orderNumber);
        this.orderStatus = orderStatus;
        this.partnerName = partnerName;
        this.placedDate = placedDate;
    }


    /**
     * Gets the orderStatus value for this OrderHeaderEx.
     * 
     * @return orderStatus
     */
    public java.lang.String getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this OrderHeaderEx.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(java.lang.String orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the partnerName value for this OrderHeaderEx.
     * 
     * @return partnerName
     */
    public java.lang.String getPartnerName() {
        return partnerName;
    }


    /**
     * Sets the partnerName value for this OrderHeaderEx.
     * 
     * @param partnerName
     */
    public void setPartnerName(java.lang.String partnerName) {
        this.partnerName = partnerName;
    }


    /**
     * Gets the placedDate value for this OrderHeaderEx.
     * 
     * @return placedDate
     */
    public java.lang.String getPlacedDate() {
        return placedDate;
    }


    /**
     * Sets the placedDate value for this OrderHeaderEx.
     * 
     * @param placedDate
     */
    public void setPlacedDate(java.lang.String placedDate) {
        this.placedDate = placedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderHeaderEx)) return false;
        OrderHeaderEx other = (OrderHeaderEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.partnerName==null && other.getPartnerName()==null) || 
             (this.partnerName!=null &&
              this.partnerName.equals(other.getPartnerName()))) &&
            ((this.placedDate==null && other.getPlacedDate()==null) || 
             (this.placedDate!=null &&
              this.placedDate.equals(other.getPlacedDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getPartnerName() != null) {
            _hashCode += getPartnerName().hashCode();
        }
        if (getPlacedDate() != null) {
            _hashCode += getPlacedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderHeaderEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderHeaderEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDate"));
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
