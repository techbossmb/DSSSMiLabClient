
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientSubmissionReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientSubmissionReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vReport" type="{http://ilab.mit.edu}ValidationReport" minOccurs="0"/>
 *         &lt;element name="experimentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minTimeToLive" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="wait" type="{http://ilab.mit.edu}WaitEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientSubmissionReport", propOrder = {
    "vReport",
    "experimentID",
    "minTimeToLive",
    "wait"
})
public class ClientSubmissionReport {

    protected ValidationReport vReport;
    protected int experimentID;
    protected double minTimeToLive;
    protected WaitEstimate wait;

    /**
     * Gets the value of the vReport property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationReport }
     *     
     */
    public ValidationReport getVReport() {
        return vReport;
    }

    /**
     * Sets the value of the vReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationReport }
     *     
     */
    public void setVReport(ValidationReport value) {
        this.vReport = value;
    }

    /**
     * Gets the value of the experimentID property.
     * 
     */
    public int getExperimentID() {
        return experimentID;
    }

    /**
     * Sets the value of the experimentID property.
     * 
     */
    public void setExperimentID(int value) {
        this.experimentID = value;
    }

    /**
     * Gets the value of the minTimeToLive property.
     * 
     */
    public double getMinTimeToLive() {
        return minTimeToLive;
    }

    /**
     * Sets the value of the minTimeToLive property.
     * 
     */
    public void setMinTimeToLive(double value) {
        this.minTimeToLive = value;
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

}
