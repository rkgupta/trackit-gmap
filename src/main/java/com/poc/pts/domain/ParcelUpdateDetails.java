
package com.poc.pts.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parcelUpdateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcelUpdateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transportParcelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentUpid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="weightUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcelUpdateDetails", propOrder = {
    "upid",
    "transportParcelId",
    "parentUpid",
    "serviceName",
    "carrierName",
    "estimatedDeliveryDateTime",
    "weight",
    "weightUom"
})
public class ParcelUpdateDetails {

    @XmlElement(required = true)
    protected String upid;
    @XmlElement(required = true)
    protected String transportParcelId;
    protected String parentUpid;
    protected String serviceName;
    protected String carrierName;
    protected String estimatedDeliveryDateTime;
    protected Float weight;
    protected String weightUom;

    /**
     * Gets the value of the upid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpid() {
        return upid;
    }

    /**
     * Sets the value of the upid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpid(String value) {
        this.upid = value;
    }

    /**
     * Gets the value of the transportParcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportParcelId() {
        return transportParcelId;
    }

    /**
     * Sets the value of the transportParcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportParcelId(String value) {
        this.transportParcelId = value;
    }

    /**
     * Gets the value of the parentUpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUpid() {
        return parentUpid;
    }

    /**
     * Sets the value of the parentUpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUpid(String value) {
        this.parentUpid = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeliveryDateTime() {
        return estimatedDeliveryDateTime;
    }

    /**
     * Sets the value of the estimatedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryDateTime(String value) {
        this.estimatedDeliveryDateTime = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUom() {
        return weightUom;
    }

    /**
     * Sets the value of the weightUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUom(String value) {
        this.weightUom = value;
    }

}
