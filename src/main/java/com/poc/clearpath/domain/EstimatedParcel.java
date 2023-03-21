/**
 * EstimatedParcel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class EstimatedParcel  implements java.io.Serializable {
    private java.lang.String estimationMethodology;

    private java.lang.String type;

    private java.math.BigDecimal weight;

    public EstimatedParcel() {
    }

    public EstimatedParcel(
           java.lang.String estimationMethodology,
           java.lang.String type,
           java.math.BigDecimal weight) {
           this.estimationMethodology = estimationMethodology;
           this.type = type;
           this.weight = weight;
    }


    /**
     * Gets the estimationMethodology value for this EstimatedParcel.
     * 
     * @return estimationMethodology
     */
    public java.lang.String getEstimationMethodology() {
        return estimationMethodology;
    }


    /**
     * Sets the estimationMethodology value for this EstimatedParcel.
     * 
     * @param estimationMethodology
     */
    public void setEstimationMethodology(java.lang.String estimationMethodology) {
        this.estimationMethodology = estimationMethodology;
    }


    /**
     * Gets the type value for this EstimatedParcel.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this EstimatedParcel.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the weight value for this EstimatedParcel.
     * 
     * @return weight
     */
    public java.math.BigDecimal getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this EstimatedParcel.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstimatedParcel)) return false;
        EstimatedParcel other = (EstimatedParcel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estimationMethodology==null && other.getEstimationMethodology()==null) || 
             (this.estimationMethodology!=null &&
              this.estimationMethodology.equals(other.getEstimationMethodology()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getEstimationMethodology() != null) {
            _hashCode += getEstimationMethodology().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstimatedParcel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "EstimatedParcel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimationMethodology");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimationMethodology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
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
