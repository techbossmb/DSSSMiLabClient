
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
 *         &lt;element name="RetrieveResultResult" type="{http://ilab.mit.edu}ResultReport" minOccurs="0"/>
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
    "retrieveResultResult"
})
@XmlRootElement(name = "RetrieveResultResponse")
public class RetrieveResultResponse {

    @XmlElement(name = "RetrieveResultResult")
    protected ResultReport retrieveResultResult;

    /**
     * Gets the value of the retrieveResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultReport }
     *     
     */
    public ResultReport getRetrieveResultResult() {
        return retrieveResultResult;
    }

    /**
     * Sets the value of the retrieveResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultReport }
     *     
     */
    public void setRetrieveResultResult(ResultReport value) {
        this.retrieveResultResult = value;
    }

}
