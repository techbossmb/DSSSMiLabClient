
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
 *         &lt;element name="GetEffectiveQueueLengthResult" type="{http://ilab.mit.edu}WaitEstimate" minOccurs="0"/>
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
    "getEffectiveQueueLengthResult"
})
@XmlRootElement(name = "GetEffectiveQueueLengthResponse")
public class GetEffectiveQueueLengthResponse {

    @XmlElement(name = "GetEffectiveQueueLengthResult")
    protected WaitEstimate getEffectiveQueueLengthResult;

    /**
     * Gets the value of the getEffectiveQueueLengthResult property.
     * 
     * @return
     *     possible object is
     *     {@link WaitEstimate }
     *     
     */
    public WaitEstimate getGetEffectiveQueueLengthResult() {
        return getEffectiveQueueLengthResult;
    }

    /**
     * Sets the value of the getEffectiveQueueLengthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitEstimate }
     *     
     */
    public void setGetEffectiveQueueLengthResult(WaitEstimate value) {
        this.getEffectiveQueueLengthResult = value;
    }

}
