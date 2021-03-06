
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
 *         &lt;element name="GetCountryByIDResult" type="{http://webservices2.ticketnetwork.com}Country" minOccurs="0"/>
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
    "getCountryByIDResult"
})
@XmlRootElement(name = "GetCountryByIDResponse")
public class GetCountryByIDResponse {

    @XmlElement(name = "GetCountryByIDResult")
    protected Country getCountryByIDResult;

    /**
     * Gets the value of the getCountryByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getGetCountryByIDResult() {
        return getCountryByIDResult;
    }

    /**
     * Sets the value of the getCountryByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setGetCountryByIDResult(Country value) {
        this.getCountryByIDResult = value;
    }

}
