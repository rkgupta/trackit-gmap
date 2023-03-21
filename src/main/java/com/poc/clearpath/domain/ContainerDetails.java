/**
 * ContainerDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class ContainerDetails  extends com.poc.clearpath.domain.Container  implements java.io.Serializable {
    private java.lang.String[] parcels;

    public ContainerDetails() {
    }

    public ContainerDetails(
           java.lang.String closedDate,
           java.lang.String containerNumber,
           java.lang.String containerType,
           java.lang.String createdDate,
           java.lang.String status,
           java.lang.String[] parcels) {
        super(
            closedDate,
            containerNumber,
            containerType,
            createdDate,
            status);
        this.parcels = parcels;
    }


    /**
     * Gets the parcels value for this ContainerDetails.
     * 
     * @return parcels
     */
    public java.lang.String[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this ContainerDetails.
     * 
     * @param parcels
     */
    public void setParcels(java.lang.String[] parcels) {
        this.parcels = parcels;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContainerDetails)) return false;
        ContainerDetails other = (ContainerDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parcels==null && other.getParcels()==null) || 
             (this.parcels!=null &&
              java.util.Arrays.equals(this.parcels, other.getParcels())));
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
        if (getParcels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcels(), i);
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
        new org.apache.axis.description.TypeDesc(ContainerDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ContainerDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcels"));
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
