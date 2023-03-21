/**
 * Container.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class Container  implements java.io.Serializable {
    private java.lang.String closedDate;

    private java.lang.String containerNumber;

    private java.lang.String containerType;

    private java.lang.String createdDate;

    private java.lang.String status;

    public Container() {
    }

    public Container(
           java.lang.String closedDate,
           java.lang.String containerNumber,
           java.lang.String containerType,
           java.lang.String createdDate,
           java.lang.String status) {
           this.closedDate = closedDate;
           this.containerNumber = containerNumber;
           this.containerType = containerType;
           this.createdDate = createdDate;
           this.status = status;
    }


    /**
     * Gets the closedDate value for this Container.
     * 
     * @return closedDate
     */
    public java.lang.String getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this Container.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.lang.String closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the containerNumber value for this Container.
     * 
     * @return containerNumber
     */
    public java.lang.String getContainerNumber() {
        return containerNumber;
    }


    /**
     * Sets the containerNumber value for this Container.
     * 
     * @param containerNumber
     */
    public void setContainerNumber(java.lang.String containerNumber) {
        this.containerNumber = containerNumber;
    }


    /**
     * Gets the containerType value for this Container.
     * 
     * @return containerType
     */
    public java.lang.String getContainerType() {
        return containerType;
    }


    /**
     * Sets the containerType value for this Container.
     * 
     * @param containerType
     */
    public void setContainerType(java.lang.String containerType) {
        this.containerType = containerType;
    }


    /**
     * Gets the createdDate value for this Container.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Container.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the status value for this Container.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Container.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Container)) return false;
        Container other = (Container) obj;
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
            ((this.containerNumber==null && other.getContainerNumber()==null) || 
             (this.containerNumber!=null &&
              this.containerNumber.equals(other.getContainerNumber()))) &&
            ((this.containerType==null && other.getContainerType()==null) || 
             (this.containerType!=null &&
              this.containerType.equals(other.getContainerType()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
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
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getContainerNumber() != null) {
            _hashCode += getContainerNumber().hashCode();
        }
        if (getContainerType() != null) {
            _hashCode += getContainerType().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Container.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Container"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "containerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "containerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
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
