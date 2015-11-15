
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperimentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wait" type="{http://ilab.mit.edu}WaitEstimate" minOccurs="0"/>
 *         &lt;element name="estRuntime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estRemainingRuntime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentStatus", propOrder = {
    "statusCode",
    "wait",
    "estRuntime",
    "estRemainingRuntime"
})
public class ExperimentStatus {

    protected int statusCode;
    protected WaitEstimate wait;
    protected double estRuntime;
    protected double estRemainingRuntime;

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the wait property.
     * 
     * @return
     *     possible object is
     *     {@link WaitEstimate }
     *     
     */
    public WaitEstimate getWait() {
        return wait;
    }

    /**
     * Sets the value of the wait property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitEstimate }
     *     
     */
    public void setWait(WaitEstimate value) {
        this.wait = value;
    }

    /**
     * Gets the value of the estRuntime property.
     * 
     */
    public double getEstRuntime() {
        return estRuntime;
    }

    /**
     * Sets the value of the estRuntime property.
     * 
     */
    public void setEstRuntime(double value) {
        this.estRuntime = value;
    }

    /**
     * Gets the value of the estRemainingRuntime property.
     * 
     */
    public double getEstRemainingRuntime() {
        return estRemainingRuntime;
    }

    /**
     * Sets the value of the estRemainingRuntime property.
     * 
     */
    public void setEstRemainingRuntime(double value) {
        this.estRemainingRuntime = value;
    }

}
