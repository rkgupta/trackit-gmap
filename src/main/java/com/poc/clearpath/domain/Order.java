/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class Order  implements java.io.Serializable {
    private com.poc.clearpath.domain.BasketCommodity[] commodities;

    private java.lang.String confirmDate;

    private com.poc.clearpath.domain.Consignee consignee;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String dataVersion;

    private com.poc.clearpath.domain.DeliveryPromise domesticDeliveryPromise;

    private com.poc.clearpath.domain.EstimatedParcel[] estimatedParcel;

    private java.lang.String hubId;

    private com.poc.clearpath.domain.DeliveryPromise internationalDeliveryPromise;

    private java.lang.String merchantCode;

    private java.lang.String orderDate;

    private java.lang.String orderNumber;

    private java.lang.String orderReference;

    private java.lang.String quotedParcelType;

    private java.lang.String shippingMethodId;

    private java.lang.String status;

    public Order() {
    }

    public Order(
           com.poc.clearpath.domain.BasketCommodity[] commodities,
           java.lang.String confirmDate,
           com.poc.clearpath.domain.Consignee consignee,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String dataVersion,
           com.poc.clearpath.domain.DeliveryPromise domesticDeliveryPromise,
           com.poc.clearpath.domain.EstimatedParcel[] estimatedParcel,
           java.lang.String hubId,
           com.poc.clearpath.domain.DeliveryPromise internationalDeliveryPromise,
           java.lang.String merchantCode,
           java.lang.String orderDate,
           java.lang.String orderNumber,
           java.lang.String orderReference,
           java.lang.String quotedParcelType,
           java.lang.String shippingMethodId,
           java.lang.String status) {
           this.commodities = commodities;
           this.confirmDate = confirmDate;
           this.consignee = consignee;
           this.costComponents = costComponents;
           this.dataVersion = dataVersion;
           this.domesticDeliveryPromise = domesticDeliveryPromise;
           this.estimatedParcel = estimatedParcel;
           this.hubId = hubId;
           this.internationalDeliveryPromise = internationalDeliveryPromise;
           this.merchantCode = merchantCode;
           this.orderDate = orderDate;
           this.orderNumber = orderNumber;
           this.orderReference = orderReference;
           this.quotedParcelType = quotedParcelType;
           this.shippingMethodId = shippingMethodId;
           this.status = status;
    }


    /**
     * Gets the commodities value for this Order.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.BasketCommodity[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this Order.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.BasketCommodity[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the confirmDate value for this Order.
     * 
     * @return confirmDate
     */
    public java.lang.String getConfirmDate() {
        return confirmDate;
    }


    /**
     * Sets the confirmDate value for this Order.
     * 
     * @param confirmDate
     */
    public void setConfirmDate(java.lang.String confirmDate) {
        this.confirmDate = confirmDate;
    }


    /**
     * Gets the consignee value for this Order.
     * 
     * @return consignee
     */
    public com.poc.clearpath.domain.Consignee getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this Order.
     * 
     * @param consignee
     */
    public void setConsignee(com.poc.clearpath.domain.Consignee consignee) {
        this.consignee = consignee;
    }


    /**
     * Gets the costComponents value for this Order.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this Order.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the dataVersion value for this Order.
     * 
     * @return dataVersion
     */
    public java.lang.String getDataVersion() {
        return dataVersion;
    }


    /**
     * Sets the dataVersion value for this Order.
     * 
     * @param dataVersion
     */
    public void setDataVersion(java.lang.String dataVersion) {
        this.dataVersion = dataVersion;
    }


    /**
     * Gets the domesticDeliveryPromise value for this Order.
     * 
     * @return domesticDeliveryPromise
     */
    public com.poc.clearpath.domain.DeliveryPromise getDomesticDeliveryPromise() {
        return domesticDeliveryPromise;
    }


    /**
     * Sets the domesticDeliveryPromise value for this Order.
     * 
     * @param domesticDeliveryPromise
     */
    public void setDomesticDeliveryPromise(com.poc.clearpath.domain.DeliveryPromise domesticDeliveryPromise) {
        this.domesticDeliveryPromise = domesticDeliveryPromise;
    }


    /**
     * Gets the estimatedParcel value for this Order.
     * 
     * @return estimatedParcel
     */
    public com.poc.clearpath.domain.EstimatedParcel[] getEstimatedParcel() {
        return estimatedParcel;
    }


    /**
     * Sets the estimatedParcel value for this Order.
     * 
     * @param estimatedParcel
     */
    public void setEstimatedParcel(com.poc.clearpath.domain.EstimatedParcel[] estimatedParcel) {
        this.estimatedParcel = estimatedParcel;
    }


    /**
     * Gets the hubId value for this Order.
     * 
     * @return hubId
     */
    public java.lang.String getHubId() {
        return hubId;
    }


    /**
     * Sets the hubId value for this Order.
     * 
     * @param hubId
     */
    public void setHubId(java.lang.String hubId) {
        this.hubId = hubId;
    }


    /**
     * Gets the internationalDeliveryPromise value for this Order.
     * 
     * @return internationalDeliveryPromise
     */
    public com.poc.clearpath.domain.DeliveryPromise getInternationalDeliveryPromise() {
        return internationalDeliveryPromise;
    }


    /**
     * Sets the internationalDeliveryPromise value for this Order.
     * 
     * @param internationalDeliveryPromise
     */
    public void setInternationalDeliveryPromise(com.poc.clearpath.domain.DeliveryPromise internationalDeliveryPromise) {
        this.internationalDeliveryPromise = internationalDeliveryPromise;
    }


    /**
     * Gets the merchantCode value for this Order.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this Order.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the orderDate value for this Order.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this Order.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderNumber value for this Order.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Order.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderReference value for this Order.
     * 
     * @return orderReference
     */
    public java.lang.String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this Order.
     * 
     * @param orderReference
     */
    public void setOrderReference(java.lang.String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the quotedParcelType value for this Order.
     * 
     * @return quotedParcelType
     */
    public java.lang.String getQuotedParcelType() {
        return quotedParcelType;
    }


    /**
     * Sets the quotedParcelType value for this Order.
     * 
     * @param quotedParcelType
     */
    public void setQuotedParcelType(java.lang.String quotedParcelType) {
        this.quotedParcelType = quotedParcelType;
    }


    /**
     * Gets the shippingMethodId value for this Order.
     * 
     * @return shippingMethodId
     */
    public java.lang.String getShippingMethodId() {
        return shippingMethodId;
    }


    /**
     * Sets the shippingMethodId value for this Order.
     * 
     * @param shippingMethodId
     */
    public void setShippingMethodId(java.lang.String shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }


    /**
     * Gets the status value for this Order.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Order.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
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
            ((this.confirmDate==null && other.getConfirmDate()==null) || 
             (this.confirmDate!=null &&
              this.confirmDate.equals(other.getConfirmDate()))) &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.dataVersion==null && other.getDataVersion()==null) || 
             (this.dataVersion!=null &&
              this.dataVersion.equals(other.getDataVersion()))) &&
            ((this.domesticDeliveryPromise==null && other.getDomesticDeliveryPromise()==null) || 
             (this.domesticDeliveryPromise!=null &&
              this.domesticDeliveryPromise.equals(other.getDomesticDeliveryPromise()))) &&
            ((this.estimatedParcel==null && other.getEstimatedParcel()==null) || 
             (this.estimatedParcel!=null &&
              java.util.Arrays.equals(this.estimatedParcel, other.getEstimatedParcel()))) &&
            ((this.hubId==null && other.getHubId()==null) || 
             (this.hubId!=null &&
              this.hubId.equals(other.getHubId()))) &&
            ((this.internationalDeliveryPromise==null && other.getInternationalDeliveryPromise()==null) || 
             (this.internationalDeliveryPromise!=null &&
              this.internationalDeliveryPromise.equals(other.getInternationalDeliveryPromise()))) &&
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
            ((this.shippingMethodId==null && other.getShippingMethodId()==null) || 
             (this.shippingMethodId!=null &&
              this.shippingMethodId.equals(other.getShippingMethodId()))) &&
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
        if (getDataVersion() != null) {
            _hashCode += getDataVersion().hashCode();
        }
        if (getDomesticDeliveryPromise() != null) {
            _hashCode += getDomesticDeliveryPromise().hashCode();
        }
        if (getEstimatedParcel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedParcel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedParcel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHubId() != null) {
            _hashCode += getHubId().hashCode();
        }
        if (getInternationalDeliveryPromise() != null) {
            _hashCode += getInternationalDeliveryPromise().hashCode();
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
        if (getShippingMethodId() != null) {
            _hashCode += getShippingMethodId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BasketCommodity"));
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
        elemField.setFieldName("dataVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticDeliveryPromise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domesticDeliveryPromise"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryPromise"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedParcel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedParcel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "EstimatedParcel"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hubId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalDeliveryPromise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internationalDeliveryPromise"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryPromise"));
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
        elemField.setFieldName("shippingMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
