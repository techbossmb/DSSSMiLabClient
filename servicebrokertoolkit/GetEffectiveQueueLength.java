
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="labServerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityHint" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "labServerID",
    "priorityHint"
})
@XmlRootElement(name = "GetEffectiveQueueLength")
public class GetEffectiveQueueLength {

    protected String labServerID;
    protected int priorityHint;

    /**
     * Gets the value of the labServerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabServerID() {
        return labServerID;
    }

    /**
     * Sets the value of the labServerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabServerID(String value) {
        this.labServerID = value;
    }

    /**
     * Gets the value of the priorityHint property.
     * 
     */
    public int getPriorityHint() {
        return priorityHint;
    }

    /**
     * Sets the value of the priorityHint property.
     * 
     */
    public void setPriorityHint(int value) {
        this.priorityHint = value;
    }

}
