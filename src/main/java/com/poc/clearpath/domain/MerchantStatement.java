/**
 * MerchantStatement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class MerchantStatement  implements java.io.Serializable {
    private com.poc.clearpath.domain.Address address;

    private com.poc.clearpath.domain.CostComponent[] costComponents;

    private com.poc.clearpath.domain.ParcelStatement[] exceptionParcelStatements;

    private java.lang.String merchantCode;

    private com.poc.clearpath.domain.ParcelStatement[] parcelStatements;

    private com.poc.clearpath.domain.ParcelStatement[] returnStatements;

    public MerchantStatement() {
    }

    public MerchantStatement(
           com.poc.clearpath.domain.Address address,
           com.poc.clearpath.domain.CostComponent[] costComponents,
           com.poc.clearpath.domain.ParcelStatement[] exceptionParcelStatements,
           java.lang.String merchantCode,
           com.poc.clearpath.domain.ParcelStatement[] parcelStatements,
           com.poc.clearpath.domain.ParcelStatement[] returnStatements) {
           this.address = address;
           this.costComponents = costComponents;
           this.exceptionParcelStatements = exceptionParcelStatements;
           this.merchantCode = merchantCode;
           this.parcelStatements = parcelStatements;
           this.returnStatements = returnStatements;
    }


    /**
     * Gets the address value for this MerchantStatement.
     * 
     * @return address
     */
    public com.poc.clearpath.domain.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this MerchantStatement.
     * 
     * @param address
     */
    public void setAddress(com.poc.clearpath.domain.Address address) {
        this.address = address;
    }


    /**
     * Gets the costComponents value for this MerchantStatement.
     * 
     * @return costComponents
     */
    public com.poc.clearpath.domain.CostComponent[] getCostComponents() {
        return costComponents;
    }


    /**
     * Sets the costComponents value for this MerchantStatement.
     * 
     * @param costComponents
     */
    public void setCostComponents(com.poc.clearpath.domain.CostComponent[] costComponents) {
        this.costComponents = costComponents;
    }


    /**
     * Gets the exceptionParcelStatements value for this MerchantStatement.
     * 
     * @return exceptionParcelStatements
     */
    public com.poc.clearpath.domain.ParcelStatement[] getExceptionParcelStatements() {
        return exceptionParcelStatements;
    }


    /**
     * Sets the exceptionParcelStatements value for this MerchantStatement.
     * 
     * @param exceptionParcelStatements
     */
    public void setExceptionParcelStatements(com.poc.clearpath.domain.ParcelStatement[] exceptionParcelStatements) {
        this.exceptionParcelStatements = exceptionParcelStatements;
    }


    /**
     * Gets the merchantCode value for this MerchantStatement.
     * 
     * @return merchantCode
     */
    public java.lang.String getMerchantCode() {
        return merchantCode;
    }


    /**
     * Sets the merchantCode value for this MerchantStatement.
     * 
     * @param merchantCode
     */
    public void setMerchantCode(java.lang.String merchantCode) {
        this.merchantCode = merchantCode;
    }


    /**
     * Gets the parcelStatements value for this MerchantStatement.
     * 
     * @return parcelStatements
     */
    public com.poc.clearpath.domain.ParcelStatement[] getParcelStatements() {
        return parcelStatements;
    }


    /**
     * Sets the parcelStatements value for this MerchantStatement.
     * 
     * @param parcelStatements
     */
    public void setParcelStatements(com.poc.clearpath.domain.ParcelStatement[] parcelStatements) {
        this.parcelStatements = parcelStatements;
    }


    /**
     * Gets the returnStatements value for this MerchantStatement.
     * 
     * @return returnStatements
     */
    public com.poc.clearpath.domain.ParcelStatement[] getReturnStatements() {
        return returnStatements;
    }


    /**
     * Sets the returnStatements value for this MerchantStatement.
     * 
     * @param returnStatements
     */
    public void setReturnStatements(com.poc.clearpath.domain.ParcelStatement[] returnStatements) {
        this.returnStatements = returnStatements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantStatement)) return false;
        MerchantStatement other = (MerchantStatement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.costComponents==null && other.getCostComponents()==null) || 
             (this.costComponents!=null &&
              java.util.Arrays.equals(this.costComponents, other.getCostComponents()))) &&
            ((this.exceptionParcelStatements==null && other.getExceptionParcelStatements()==null) || 
             (this.exceptionParcelStatements!=null &&
              java.util.Arrays.equals(this.exceptionParcelStatements, other.getExceptionParcelStatements()))) &&
            ((this.merchantCode==null && other.getMerchantCode()==null) || 
             (this.merchantCode!=null &&
              this.merchantCode.equals(other.getMerchantCode()))) &&
            ((this.parcelStatements==null && other.getParcelStatements()==null) || 
             (this.parcelStatements!=null &&
              java.util.Arrays.equals(this.parcelStatements, other.getParcelStatements()))) &&
            ((this.returnStatements==null && other.getReturnStatements()==null) || 
             (this.returnStatements!=null &&
              java.util.Arrays.equals(this.returnStatements, other.getReturnStatements())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
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
        if (getExceptionParcelStatements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExceptionParcelStatements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExceptionParcelStatements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMerchantCode() != null) {
            _hashCode += getMerchantCode().hashCode();
        }
        if (getParcelStatements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelStatements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcelStatements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnStatements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnStatements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnStatements(), i);
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
        new org.apache.axis.description.TypeDesc(MerchantStatement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantStatement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionParcelStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionParcelStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelStatement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelStatement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelStatement"));
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
