/**
 * OrderDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class OrderDetails  implements java.io.Serializable {
    private java.lang.String cancelDate;

    private com.poc.clearpath.domain.OrderCommodityDetails[] commodities;

    private java.lang.String confirmDate;

    private com.poc.clearpath.domain.Consignee consignee;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String expiryDate;

    private java.lang.String hubId;

    private java.lang.String merchantCode;

    private java.lang.String orderDate;

    private java.lang.String orderNumber;

    private java.lang.String orderReference;

    private java.lang.String quotedParcelType;

    private com.poc.clearpath.domain.ShippingMethod shippingMethod;

    private java.lang.String status;

    public OrderDetails() {
    }

    public OrderDetails(
           java.lang.String cancelDate,
           com.poc.clearpath.domain.OrderCommodityDetails[] commodities,
           java.lang.String confirmDate,
           com.poc.clearpath.domain.Consignee consignee,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String expiryDate,
           java.lang.String hubId,
           java.lang.String merchantCode,
           java.lang.String orderDate,
           java.lang.String orderNumber,
           java.lang.String orderReference,
           java.lang.String quotedParcelType,
           com.poc.clearpath.domain.ShippingMethod shippingMethod,
           java.lang.String status) {
           this.cancelDate = cancelDate;
           this.commodities = commodities;
           this.confirmDate = confirmDate;
           this.consignee = consignee;
           this.costComponents = costComponents;
           this.expiryDate = expiryDate;
           this.hubId = hubId;
           this.merchantCode = merchantCode;
           this.orderDate = orderDate;
           this.orderNumber = orderNumber;
           this.orderReference = orderReference;
           this.quotedParcelType = quotedParcelType;
           this.shippingMethod = shippingMethod;
           this.status = status;
    }


    /**
     * Gets the cancelDate value for this OrderDetails.
     * 
     * @return cancelDate
     */
    public java.lang.String getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this OrderDetails.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.lang.String cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the commodities value for this OrderDetails.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.OrderCommodityDetails[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this OrderDetails.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.OrderCommodityDetails[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the confirmDate value for this OrderDetails.
     * 
     * @return confirmDate
     */
    public java.lang.String getConfirmDate() {
        return confirmDate;
    }


    /**
     * Sets the confirmDate value for this OrderDetails.
     * 
     * @param confirmDate
     */
    public void setConfirmDate(java.lang.String confirmDate) {
        this.confirmDate = confirmDate;
    }


    /**
     * Gets the consignee value for this OrderDetails.
     * 
     * @return consignee
     */
    public com.poc.clearpath.domain.Consignee getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this OrderDetails.
     * 
     * @param consignee
     */
    public void setConsignee(com.poc.clearpath.domain.Consignee consignee) {
        this.consignee = consignee;
    }


    /**
     * Gets the costComponents value for this OrderDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this OrderDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the expiryDate value for this OrderDetails.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this OrderDetails.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the hubId value for this OrderDetails.
     * 
     * @return hubId
     */
    public java.lang.String getHubId() {
        return hubId;
    }


    /**
     * Sets the hubId value for this OrderDetails.
     * 
     * @param hubId
     */
    public void setHubId(java.lang.String hubId) {
        this.hubId = hubId;
    }


    /**
     * Gets the merchantCode value for this OrderDetails.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this OrderDetails.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the orderDate value for this OrderDetails.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this OrderDetails.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderNumber value for this OrderDetails.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this OrderDetails.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderReference value for this OrderDetails.
     * 
     * @return orderReference
     */
    public java.lang.String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this OrderDetails.
     * 
     * @param orderReference
     */
    public void setOrderReference(java.lang.String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the quotedParcelType value for this OrderDetails.
     * 
     * @return quotedParcelType
     */
    public java.lang.String getQuotedParcelType() {
        return quotedParcelType;
    }


    /**
     * Sets the quotedParcelType value for this OrderDetails.
     * 
     * @param quotedParcelType
     */
    public void setQuotedParcelType(java.lang.String quotedParcelType) {
        this.quotedParcelType = quotedParcelType;
    }


    /**
     * Gets the shippingMethod value for this OrderDetails.
     * 
     * @return shippingMethod
     */
    public com.poc.clearpath.domain.ShippingMethod getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this OrderDetails.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(com.poc.clearpath.domain.ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the status value for this OrderDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDetails)) return false;
        OrderDetails other = (OrderDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.confirmDate==null && other.getConfirmDate()==null) || 
             (this.confirmDate!=null &&
              this.confirmDate.equals(other.getConfirmDate()))) &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.hubId==null && other.getHubId()==null) || 
             (this.hubId!=null &&
              this.hubId.equals(other.getHubId()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.quotedParcelType==null && other.getQuotedParcelType()==null) || 
             (this.quotedParcelType!=null &&
              this.quotedParcelType.equals(other.getQuotedParcelType()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
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
        if (getConfirmDate() != null) {
            _hashCode += getConfirmDate().hashCode();
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
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getHubId() != null) {
            _hashCode += getHubId().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getQuotedParcelType() != null) {
            _hashCode += getQuotedParcelType().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderCommodityDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hubId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
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
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotedParcelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotedParcelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingMethod"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
