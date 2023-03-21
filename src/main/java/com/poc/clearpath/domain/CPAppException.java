/**
 * CPAppException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class CPAppException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.poc.clearpath.domain.CPError[] errors;

    private com.poc.clearpath.domain.CPException[] exceptions;

    public CPAppException() {
    }

    public CPAppException(
           com.poc.clearpath.domain.CPError[] errors,
           com.poc.clearpath.domain.CPException[] exceptions) {
        this.errors = errors;
        this.exceptions = exceptions;
    }


    /**
     * Gets the errors value for this CPAppException.
     * 
     * @return errors
     */
    public com.poc.clearpath.domain.CPError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this CPAppException.
     * 
     * @param errors
     */
    public void setErrors(com.poc.clearpath.domain.CPError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the exceptions value for this CPAppException.
     * 
     * @return exceptions
     */
    public com.poc.clearpath.domain.CPException[] getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this CPAppException.
     * 
     * @param exceptions
     */
    public void setExceptions(com.poc.clearpath.domain.CPException[] exceptions) {
        this.exceptions = exceptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPAppException)) return false;
        CPAppException other = (CPAppException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              java.util.Arrays.equals(this.exceptions, other.getExceptions())));
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
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExceptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExceptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExceptions(), i);
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
        new org.apache.axis.description.TypeDesc(CPAppException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPError"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPException"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
