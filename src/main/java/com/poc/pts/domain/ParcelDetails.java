
package com.poc.pts.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parcelDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcelDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="upid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcelCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendersAddress" type="{http://v1_0.endpoint.service.pts.pb.com/}address" minOccurs="0"/>
 *         &lt;element name="destinationAddress" type="{http://v1_0.endpoint.service.pts.pb.com/}address" minOccurs="0"/>
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
@XmlType(name = "parcelDetails", propOrder = {
    "orderId",
    "upid",
    "serviceName",
    "carrierName",
    "estimatedDeliveryDateTime",
    "parcelCreationDate",
    "sendersAddress",
    "destinationAddress",
    "weight",
    "weightUom"
})
public class ParcelDetails {

    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected String upid;
    @XmlElement(required = true)
    protected String serviceName;
    protected String carrierName;
    protected String estimatedDeliveryDateTime;
    protected String parcelCreationDate;
    protected Address sendersAddress;
    protected Address destinationAddress;
    protected Float weight;
    protected String weightUom;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

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
     * Gets the value of the parcelCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelCreationDate() {
        return parcelCreationDate;
    }

    /**
     * Sets the value of the parcelCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelCreationDate(String value) {
        this.parcelCreationDate = value;
    }

    /**
     * Gets the value of the sendersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSendersAddress() {
        return sendersAddress;
    }

    /**
     * Sets the value of the sendersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSendersAddress(Address value) {
        this.sendersAddress = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationAddress(Address value) {
        this.destinationAddress = value;
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
