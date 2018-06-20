
package currencyConversion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convertCurrency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convertCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertCurrency", propOrder = {
    "countryFrom",
    "countryTo",
    "amount"
})
public class ConvertCurrency {

    protected String countryFrom;
    protected String countryTo;
    protected double amount;

    /**
     * Gets the value of the countryFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryFrom() {
        return countryFrom;
    }

    /**
     * Sets the value of the countryFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryFrom(String value) {
        this.countryFrom = value;
    }

    /**
     * Gets the value of the countryTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTo() {
        return countryTo;
    }

    /**
     * Sets the value of the countryTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTo(String value) {
        this.countryTo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
