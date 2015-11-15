
package servicebrokertoolkit;

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
 *         &lt;element name="GetExperimentStatusResult" type="{http://ilab.mit.edu}LabExperimentStatus" minOccurs="0"/>
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
    "getExperimentStatusResult"
})
@XmlRootElement(name = "GetExperimentStatusResponse")
public class GetExperimentStatusResponse {

    @XmlElement(name = "GetExperimentStatusResult")
    protected LabExperimentStatus getExperimentStatusResult;

    /**
     * Gets the value of the getExperimentStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link LabExperimentStatus }
     *     
     */
    public LabExperimentStatus getGetExperimentStatusResult() {
        return getExperimentStatusResult;
    }

    /**
     * Sets the value of the getExperimentStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabExperimentStatus }
     *     
     */
    public void setGetExperimentStatusResult(LabExperimentStatus value) {
        this.getExperimentStatusResult = value;
    }

}
