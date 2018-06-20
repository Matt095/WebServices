
package moneyTransfer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="senderCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountTransferred" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="amountReceived" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transfer", propOrder = {
    "senderName",
    "receiverName",
    "moneyOrigin",
    "moneyDestination",
    "conversionRate",
    "senderCurrency",
    "receiverCurrency",
    "amountTransferred",
    "amountReceived"
})
public class Transfer {

    protected String senderName;
    protected String receiverName;
    protected String moneyOrigin;
    protected String moneyDestination;
    protected Double conversionRate;
    protected String senderCurrency;
    protected String receiverCurrency;
    protected double amountTransferred;
    protected double amountReceived;

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the moneyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyOrigin() {
        return moneyOrigin;
    }

    /**
     * Sets the value of the moneyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyOrigin(String value) {
        this.moneyOrigin = value;
    }

    /**
     * Gets the value of the moneyDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyDestination() {
        return moneyDestination;
    }

    /**
     * Sets the value of the moneyDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyDestination(String value) {
        this.moneyDestination = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionRate(Double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the senderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCurrency() {
        return senderCurrency;
    }

    /**
     * Sets the value of the senderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCurrency(String value) {
        this.senderCurrency = value;
    }

    /**
     * Gets the value of the receiverCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCurrency() {
        return receiverCurrency;
    }

    /**
     * Sets the value of the receiverCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCurrency(String value) {
        this.receiverCurrency = value;
    }

    /**
     * Gets the value of the amountTransferred property.
     * 
     */
    public double getAmountTransferred() {
        return amountTransferred;
    }

    /**
     * Sets the value of the amountTransferred property.
     * 
     */
    public void setAmountTransferred(double value) {
        this.amountTransferred = value;
    }

    /**
     * Gets the value of the amountReceived property.
     * 
     */
    public double getAmountReceived() {
        return amountReceived;
    }

    /**
     * Sets the value of the amountReceived property.
     * 
     */
    public void setAmountReceived(double value) {
        this.amountReceived = value;
    }

}
