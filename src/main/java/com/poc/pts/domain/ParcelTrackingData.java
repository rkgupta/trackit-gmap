
package com.poc.pts.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parcelTrackingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcelTrackingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="weightUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentStatus" type="{http://v1_0.endpoint.service.pts.pb.com/}currentStatus" minOccurs="0"/>
 *         &lt;element name="scanHistory" type="{http://v1_0.endpoint.service.pts.pb.com/}scanHistory" minOccurs="0"/>
 *         &lt;element name="sendersAddress" type="{http://v1_0.endpoint.service.pts.pb.com/}address" minOccurs="0"/>
 *         &lt;element name="destinationAddress" type="{http://v1_0.endpoint.service.pts.pb.com/}address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcelTrackingData", propOrder = {
    "refNum",
    "refType",
    "orderId",
    "carrierName",
    "serviceName",
    "estimatedDeliveryDateTime",
    "weight",
    "weightUom",
    "currentStatus",
    "scanHistory",
    "sendersAddress",
    "destinationAddress"
})
public class ParcelTrackingData {

    protected String refNum;
    protected String refType;
    protected String orderId;
    protected String carrierName;
    protected String serviceName;
    protected String estimatedDeliveryDateTime;
    protected Float weight;
    protected String weightUom;
    protected CurrentStatus currentStatus;
    protected ScanHistory scanHistory;
    protected Address sendersAddress;
    protected Address destinationAddress;

    /**
     * Gets the value of the refNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * Sets the value of the refNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum(String value) {
        this.refNum = value;
    }

    /**
     * Gets the value of the refType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Sets the value of the refType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
    }

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

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentStatus }
     *     
     */
    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentStatus }
     *     
     */
    public void setCurrentStatus(CurrentStatus value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the scanHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ScanHistory }
     *     
     */
    public ScanHistory getScanHistory() {
        return scanHistory;
    }

    /**
     * Sets the value of the scanHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanHistory }
     *     
     */
    public void setScanHistory(ScanHistory value) {
        this.scanHistory = value;
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

}
