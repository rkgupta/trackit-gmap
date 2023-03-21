/**
 * ParcelDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ParcelDetails  implements java.io.Serializable {
    private com.poc.clearpath.domain.ParcelCommodityDetails[] commodities;

    private com.poc.clearpath.domain.ParcelConsignee consignee;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String deliveredDate;

    private com.poc.clearpath.domain.Exporter exporter;

    private com.poc.clearpath.domain.Address fromAddress;

    private java.lang.String inboundParcelNumber;

    private java.lang.String merchantCode;

    private java.lang.String orderNumber;

    private java.lang.String parcelNumber;

    private com.poc.clearpath.domain.ShippingMethod shippingMethod;

    private com.poc.clearpath.domain.Size size;

    private java.lang.String type;

    public ParcelDetails() {
    }

    public ParcelDetails(
           com.poc.clearpath.domain.ParcelCommodityDetails[] commodities,
           com.poc.clearpath.domain.ParcelConsignee consignee,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String deliveredDate,
           com.poc.clearpath.domain.Exporter exporter,
           com.poc.clearpath.domain.Address fromAddress,
           java.lang.String inboundParcelNumber,
           java.lang.String merchantCode,
           java.lang.String orderNumber,
           java.lang.String parcelNumber,
           com.poc.clearpath.domain.ShippingMethod shippingMethod,
           com.poc.clearpath.domain.Size size,
           java.lang.String type) {
           this.commodities = commodities;
           this.consignee = consignee;
           this.costComponents = costComponents;
           this.deliveredDate = deliveredDate;
           this.exporter = exporter;
           this.fromAddress = fromAddress;
           this.inboundParcelNumber = inboundParcelNumber;
           this.merchantCode = merchantCode;
           this.orderNumber = orderNumber;
           this.parcelNumber = parcelNumber;
           this.shippingMethod = shippingMethod;
           this.size = size;
           this.type = type;
    }


    /**
     * Gets the commodities value for this ParcelDetails.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.ParcelCommodityDetails[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this ParcelDetails.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.ParcelCommodityDetails[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the consignee value for this ParcelDetails.
     * 
     * @return consignee
     */
    public com.poc.clearpath.domain.ParcelConsignee getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this ParcelDetails.
     * 
     * @param consignee
     */
    public void setConsignee(com.poc.clearpath.domain.ParcelConsignee consignee) {
        this.consignee = consignee;
    }


    /**
     * Gets the costComponents value for this ParcelDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this ParcelDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the deliveredDate value for this ParcelDetails.
     * 
     * @return deliveredDate
     */
    public java.lang.String getDeliveredDate() {
        return deliveredDate;
    }


    /**
     * Sets the deliveredDate value for this ParcelDetails.
     * 
     * @param deliveredDate
     */
    public void setDeliveredDate(java.lang.String deliveredDate) {
        this.deliveredDate = deliveredDate;
    }


    /**
     * Gets the exporter value for this ParcelDetails.
     * 
     * @return exporter
     */
    public com.poc.clearpath.domain.Exporter getExporter() {
        return exporter;
    }


    /**
     * Sets the exporter value for this ParcelDetails.
     * 
     * @param exporter
     */
    public void setExporter(com.poc.clearpath.domain.Exporter exporter) {
        this.exporter = exporter;
    }


    /**
     * Gets the fromAddress value for this ParcelDetails.
     * 
     * @return fromAddress
     */
    public com.poc.clearpath.domain.Address getFromAddress() {
        return fromAddress;
    }


    /**
     * Sets the fromAddress value for this ParcelDetails.
     * 
     * @param fromAddress
     */
    public void setFromAddress(com.poc.clearpath.domain.Address fromAddress) {
        this.fromAddress = fromAddress;
    }


    /**
     * Gets the inboundParcelNumber value for this ParcelDetails.
     * 
     * @return inboundParcelNumber
     */
    public java.lang.String getInboundParcelNumber() {
        return inboundParcelNumber;
    }


    /**
     * Sets the inboundParcelNumber value for this ParcelDetails.
     * 
     * @param inboundParcelNumber
     */
    public void setInboundParcelNumber(java.lang.String inboundParcelNumber) {
        this.inboundParcelNumber = inboundParcelNumber;
    }


    /**
     * Gets the merchantCode value for this ParcelDetails.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this ParcelDetails.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the orderNumber value for this ParcelDetails.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this ParcelDetails.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the parcelNumber value for this ParcelDetails.
     * 
     * @return parcelNumber
     */
    public java.lang.String getParcelNumber() {
        return parcelNumber;
    }


    /**
     * Sets the parcelNumber value for this ParcelDetails.
     * 
     * @param parcelNumber
     */
    public void setParcelNumber(java.lang.String parcelNumber) {
        this.parcelNumber = parcelNumber;
    }


    /**
     * Gets the shippingMethod value for this ParcelDetails.
     * 
     * @return shippingMethod
     */
    public com.poc.clearpath.domain.ShippingMethod getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this ParcelDetails.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(com.poc.clearpath.domain.ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the size value for this ParcelDetails.
     * 
     * @return size
     */
    public com.poc.clearpath.domain.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this ParcelDetails.
     * 
     * @param size
     */
    public void setSize(com.poc.clearpath.domain.Size size) {
        this.size = size;
    }


    /**
     * Gets the type value for this ParcelDetails.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ParcelDetails.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelDetails)) return false;
        ParcelDetails other = (ParcelDetails) obj;
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
            ((this.deliveredDate==null && other.getDeliveredDate()==null) || 
             (this.deliveredDate!=null &&
              this.deliveredDate.equals(other.getDeliveredDate()))) &&
            ((this.exporter==null && other.getExporter()==null) || 
             (this.exporter!=null &&
              this.exporter.equals(other.getExporter()))) &&
            ((this.fromAddress==null && other.getFromAddress()==null) || 
             (this.fromAddress!=null &&
              this.fromAddress.equals(other.getFromAddress()))) &&
            ((this.inboundParcelNumber==null && other.getInboundParcelNumber()==null) || 
             (this.inboundParcelNumber!=null &&
              this.inboundParcelNumber.equals(other.getInboundParcelNumber()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.parcelNumber==null && other.getParcelNumber()==null) || 
             (this.parcelNumber!=null &&
              this.parcelNumber.equals(other.getParcelNumber()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
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
        if (getDeliveredDate() != null) {
            _hashCode += getDeliveredDate().hashCode();
        }
        if (getExporter() != null) {
            _hashCode += getExporter().hashCode();
        }
        if (getFromAddress() != null) {
            _hashCode += getFromAddress().hashCode();
        }
        if (getInboundParcelNumber() != null) {
            _hashCode += getInboundParcelNumber().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getParcelNumber() != null) {
            _hashCode += getParcelNumber().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelCommodityDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelConsignee"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exporter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exporter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Exporter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundParcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundParcelNumber"));
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
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelNumber"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"));
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
