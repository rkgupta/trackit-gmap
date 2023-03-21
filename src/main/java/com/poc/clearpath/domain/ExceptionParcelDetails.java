/**
 * ExceptionParcelDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ExceptionParcelDetails  implements java.io.Serializable {
    private java.lang.String closedDate;

    private com.poc.clearpath.domain.ExceptionParcelCommodityDetails[] commodities;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private java.lang.String createdDate;

    private java.lang.String deliveredDate;

    private java.lang.String exceptionParcelNumber;

    private java.lang.String merchantCode;

    private com.poc.clearpath.domain.ShippingMethod shippingMethod;

    private com.poc.clearpath.domain.Size size;

    private java.lang.String status;

    private com.poc.clearpath.domain.Address toAddress;

    public ExceptionParcelDetails() {
    }

    public ExceptionParcelDetails(
           java.lang.String closedDate,
           com.poc.clearpath.domain.ExceptionParcelCommodityDetails[] commodities,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           java.lang.String createdDate,
           java.lang.String deliveredDate,
           java.lang.String exceptionParcelNumber,
           java.lang.String merchantCode,
           com.poc.clearpath.domain.ShippingMethod shippingMethod,
           com.poc.clearpath.domain.Size size,
           java.lang.String status,
           com.poc.clearpath.domain.Address toAddress) {
           this.closedDate = closedDate;
           this.commodities = commodities;
           this.costComponents = costComponents;
           this.createdDate = createdDate;
           this.deliveredDate = deliveredDate;
           this.exceptionParcelNumber = exceptionParcelNumber;
           this.merchantCode = merchantCode;
           this.shippingMethod = shippingMethod;
           this.size = size;
           this.status = status;
           this.toAddress = toAddress;
    }


    /**
     * Gets the closedDate value for this ExceptionParcelDetails.
     * 
     * @return closedDate
     */
    public java.lang.String getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this ExceptionParcelDetails.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.lang.String closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the commodities value for this ExceptionParcelDetails.
     * 
     * @return commodities
     */
    public com.poc.clearpath.domain.ExceptionParcelCommodityDetails[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this ExceptionParcelDetails.
     * 
     * @param commodities
     */
    public void setCommodities(com.poc.clearpath.domain.ExceptionParcelCommodityDetails[] commodities) {
        this.commodities = commodities;
    }


    /**
     * Gets the costComponents value for this ExceptionParcelDetails.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this ExceptionParcelDetails.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the createdDate value for this ExceptionParcelDetails.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ExceptionParcelDetails.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the deliveredDate value for this ExceptionParcelDetails.
     * 
     * @return deliveredDate
     */
    public java.lang.String getDeliveredDate() {
        return deliveredDate;
    }


    /**
     * Sets the deliveredDate value for this ExceptionParcelDetails.
     * 
     * @param deliveredDate
     */
    public void setDeliveredDate(java.lang.String deliveredDate) {
        this.deliveredDate = deliveredDate;
    }


    /**
     * Gets the exceptionParcelNumber value for this ExceptionParcelDetails.
     * 
     * @return exceptionParcelNumber
     */
    public java.lang.String getExceptionParcelNumber() {
        return exceptionParcelNumber;
    }


    /**
     * Sets the exceptionParcelNumber value for this ExceptionParcelDetails.
     * 
     * @param exceptionParcelNumber
     */
    public void setExceptionParcelNumber(java.lang.String exceptionParcelNumber) {
        this.exceptionParcelNumber = exceptionParcelNumber;
    }


    /**
     * Gets the merchantCode value for this ExceptionParcelDetails.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this ExceptionParcelDetails.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the shippingMethod value for this ExceptionParcelDetails.
     * 
     * @return shippingMethod
     */
    public com.poc.clearpath.domain.ShippingMethod getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this ExceptionParcelDetails.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(com.poc.clearpath.domain.ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the size value for this ExceptionParcelDetails.
     * 
     * @return size
     */
    public com.poc.clearpath.domain.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this ExceptionParcelDetails.
     * 
     * @param size
     */
    public void setSize(com.poc.clearpath.domain.Size size) {
        this.size = size;
    }


    /**
     * Gets the status value for this ExceptionParcelDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExceptionParcelDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the toAddress value for this ExceptionParcelDetails.
     * 
     * @return toAddress
     */
    public com.poc.clearpath.domain.Address getToAddress() {
        return toAddress;
    }


    /**
     * Sets the toAddress value for this ExceptionParcelDetails.
     * 
     * @param toAddress
     */
    public void setToAddress(com.poc.clearpath.domain.Address toAddress) {
        this.toAddress = toAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExceptionParcelDetails)) return false;
        ExceptionParcelDetails other = (ExceptionParcelDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.deliveredDate==null && other.getDeliveredDate()==null) || 
             (this.deliveredDate!=null &&
              this.deliveredDate.equals(other.getDeliveredDate()))) &&
            ((this.exceptionParcelNumber==null && other.getExceptionParcelNumber()==null) || 
             (this.exceptionParcelNumber!=null &&
              this.exceptionParcelNumber.equals(other.getExceptionParcelNumber()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.toAddress==null && other.getToAddress()==null) || 
             (this.toAddress!=null &&
              this.toAddress.equals(other.getToAddress())));
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
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDeliveredDate() != null) {
            _hashCode += getDeliveredDate().hashCode();
        }
        if (getExceptionParcelNumber() != null) {
            _hashCode += getExceptionParcelNumber().hashCode();
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getToAddress() != null) {
            _hashCode += getToAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExceptionParcelDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelCommodityDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionParcelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionParcelNumber"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
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
