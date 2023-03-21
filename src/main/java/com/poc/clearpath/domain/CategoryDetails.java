/**
 * CategoryDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.domain;

public class CategoryDetails  extends com.poc.clearpath.domain.Category  implements java.io.Serializable {
    private java.math.BigDecimal categoryId;

    private java.math.BigDecimal parentCategoryId;

    public CategoryDetails() {
    }

    public CategoryDetails(
           java.lang.String URL,
           java.lang.String categoryCode,
           java.lang.String merchantCode,
           java.lang.String name,
           java.lang.String parentCategoryCode,
           java.math.BigDecimal categoryId,
           java.math.BigDecimal parentCategoryId) {
        super(
            URL,
            categoryCode,
            merchantCode,
            name,
            parentCategoryCode);
        this.categoryId = categoryId;
        this.parentCategoryId = parentCategoryId;
    }


    /**
     * Gets the categoryId value for this CategoryDetails.
     * 
     * @return categoryId
     */
    public java.math.BigDecimal getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this CategoryDetails.
     * 
     * @param categoryId
     */
    public void setCategoryId(java.math.BigDecimal categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the parentCategoryId value for this CategoryDetails.
     * 
     * @return parentCategoryId
     */
    public java.math.BigDecimal getParentCategoryId() {
        return parentCategoryId;
    }


    /**
     * Sets the parentCategoryId value for this CategoryDetails.
     * 
     * @param parentCategoryId
     */
    public void setParentCategoryId(java.math.BigDecimal parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryDetails)) return false;
        CategoryDetails other = (CategoryDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.categoryId==null && other.getCategoryId()==null) || 
             (this.categoryId!=null &&
              this.categoryId.equals(other.getCategoryId()))) &&
            ((this.parentCategoryId==null && other.getParentCategoryId()==null) || 
             (this.parentCategoryId!=null &&
              this.parentCategoryId.equals(other.getParentCategoryId())));
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
        if (getCategoryId() != null) {
            _hashCode += getCategoryId().hashCode();
        }
        if (getParentCategoryId() != null) {
            _hashCode += getParentCategoryId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CategoryDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentCategoryId"));
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
