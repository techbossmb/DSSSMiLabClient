
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
 *         &lt;element name="GetExperimentInformationResult" type="{http://ilab.mit.edu}ArrayOfExperimentInformation" minOccurs="0"/>
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
    "getExperimentInformationResult"
})
@XmlRootElement(name = "GetExperimentInformationResponse")
public class GetExperimentInformationResponse {

    @XmlElement(name = "GetExperimentInformationResult")
    protected ArrayOfExperimentInformation getExperimentInformationResult;

    /**
     * Gets the value of the getExperimentInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExperimentInformation }
     *     
     */
    public ArrayOfExperimentInformation getGetExperimentInformationResult() {
        return getExperimentInformationResult;
    }

    /**
     * Sets the value of the getExperimentInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExperimentInformation }
     *     
     */
    public void setGetExperimentInformationResult(ArrayOfExperimentInformation value) {
        this.getExperimentInformationResult = value;
    }

}
