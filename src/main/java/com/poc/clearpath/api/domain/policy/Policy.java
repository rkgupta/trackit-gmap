/**
 * Policy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.api.domain.policy;

public class Policy  implements java.io.Serializable {
    private java.lang.String policyDate;

    private java.lang.String policyError;

    private java.lang.String policyId;

    private java.lang.String policyStatus;

    public Policy() {
    }

    public Policy(
           java.lang.String policyDate,
           java.lang.String policyError,
           java.lang.String policyId,
           java.lang.String policyStatus) {
           this.policyDate = policyDate;
           this.policyError = policyError;
           this.policyId = policyId;
           this.policyStatus = policyStatus;
    }


    /**
     * Gets the policyDate value for this Policy.
     * 
     * @return policyDate
     */
    public java.lang.String getPolicyDate() {
        return policyDate;
    }


    /**
     * Sets the policyDate value for this Policy.
     * 
     * @param policyDate
     */
    public void setPolicyDate(java.lang.String policyDate) {
        this.policyDate = policyDate;
    }


    /**
     * Gets the policyError value for this Policy.
     * 
     * @return policyError
     */
    public java.lang.String getPolicyError() {
        return policyError;
    }


    /**
     * Sets the policyError value for this Policy.
     * 
     * @param policyError
     */
    public void setPolicyError(java.lang.String policyError) {
        this.policyError = policyError;
    }


    /**
     * Gets the policyId value for this Policy.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this Policy.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the policyStatus value for this Policy.
     * 
     * @return policyStatus
     */
    public java.lang.String getPolicyStatus() {
        return policyStatus;
    }


    /**
     * Sets the policyStatus value for this Policy.
     * 
     * @param policyStatus
     */
    public void setPolicyStatus(java.lang.String policyStatus) {
        this.policyStatus = policyStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyDate==null && other.getPolicyDate()==null) || 
             (this.policyDate!=null &&
              this.policyDate.equals(other.getPolicyDate()))) &&
            ((this.policyError==null && other.getPolicyError()==null) || 
             (this.policyError!=null &&
              this.policyError.equals(other.getPolicyError()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.policyStatus==null && other.getPolicyStatus()==null) || 
             (this.policyStatus!=null &&
              this.policyStatus.equals(other.getPolicyStatus())));
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
        if (getPolicyDate() != null) {
            _hashCode += getPolicyDate().hashCode();
        }
        if (getPolicyError() != null) {
            _hashCode += getPolicyError().hashCode();
        }
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getPolicyStatus() != null) {
            _hashCode += getPolicyStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policy.domain.api.clearpath.pb.com", "Policy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyStatus"));
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
