
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabExperimentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabExperimentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusReport" type="{http://ilab.mit.edu}ExperimentStatus" minOccurs="0"/>
 *         &lt;element name="minTimetoLive" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabExperimentStatus", propOrder = {
    "statusReport",
    "minTimetoLive"
})
public class LabExperimentStatus {

    protected ExperimentStatus statusReport;
    protected double minTimetoLive;

    /**
     * Gets the value of the statusReport property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentStatus }
     *     
     */
    public ExperimentStatus getStatusReport() {
        return statusReport;
    }

    /**
     * Sets the value of the statusReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentStatus }
     *     
     */
    public void setStatusReport(ExperimentStatus value) {
        this.statusReport = value;
    }

    /**
     * Gets the value of the minTimetoLive property.
     * 
     */
    public double getMinTimetoLive() {
        return minTimetoLive;
    }

    /**
     * Sets the value of the minTimetoLive property.
     * 
     */
    public void setMinTimetoLive(double value) {
        this.minTimetoLive = value;
    }

}
