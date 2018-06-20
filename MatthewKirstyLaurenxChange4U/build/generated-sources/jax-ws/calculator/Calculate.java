
package calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculate", propOrder = {
    "num1",
    "operation",
    "num2"
})
public class Calculate {

    protected double num1;
    protected String operation;
    protected double num2;

    /**
     * Gets the value of the num1 property.
     * 
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Sets the value of the num1 property.
     * 
     */
    public void setNum1(double value) {
        this.num1 = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the num2 property.
     * 
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Sets the value of the num2 property.
     * 
     */
    public void setNum2(double value) {
        this.num2 = value;
    }

}
