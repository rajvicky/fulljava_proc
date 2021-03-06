
package com.ticketnetwork.webservices2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPhoneResult" type="{http://webservices2.ticketnetwork.com}ArrayOfPhone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPhoneResult"
})
@XmlRootElement(name = "GetPhoneResponse")
public class GetPhoneResponse {

    @XmlElement(name = "GetPhoneResult")
    protected ArrayOfPhone getPhoneResult;

    /**
     * Gets the value of the getPhoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhone }
     *     
     */
    public ArrayOfPhone getGetPhoneResult() {
        return getPhoneResult;
    }

    /**
     * Sets the value of the getPhoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhone }
     *     
     */
    public void setGetPhoneResult(ArrayOfPhone value) {
        this.getPhoneResult = value;
    }

}
