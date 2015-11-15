
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
 *         &lt;element name="GetLabStatusResult" type="{http://ilab.mit.edu}LabStatus" minOccurs="0"/>
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
    "getLabStatusResult"
})
@XmlRootElement(name = "GetLabStatusResponse")
public class GetLabStatusResponse {

    @XmlElement(name = "GetLabStatusResult")
    protected LabStatus getLabStatusResult;

    /**
     * Gets the value of the getLabStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link LabStatus }
     *     
     */
    public LabStatus getGetLabStatusResult() {
        return getLabStatusResult;
    }

    /**
     * Sets the value of the getLabStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabStatus }
     *     
     */
    public void setGetLabStatusResult(LabStatus value) {
        this.getLabStatusResult = value;
    }

}
