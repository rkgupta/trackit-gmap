
package com.poc.pts.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scanHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scanHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scanDetails" type="{http://v1_0.endpoint.service.pts.pb.com/}scanDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scanHistory", propOrder = {
    "scanDetails"
})
public class ScanHistory {

    @XmlElement(nillable = true)
    protected List<ScanDetail> scanDetails;

    /**
     * Gets the value of the scanDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scanDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScanDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScanDetail }
     * 
     * 
     */
    public List<ScanDetail> getScanDetails() {
        if (scanDetails == null) {
            scanDetails = new ArrayList<ScanDetail>();
        }
        return this.scanDetails;
    }

}
