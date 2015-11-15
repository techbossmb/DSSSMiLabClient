
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="experimentResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlResultExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlBlobExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningMessages" type="{http://ilab.mit.edu}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultReport", propOrder = {
    "statusCode",
    "experimentResults",
    "xmlResultExtension",
    "xmlBlobExtension",
    "warningMessages",
    "errorMessage"
})
public class ResultReport {

    protected int statusCode;
    protected String experimentResults;
    protected String xmlResultExtension;
    protected String xmlBlobExtension;
    protected ArrayOfString warningMessages;
    protected String errorMessage;

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
     * Gets the value of the experimentResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentResults() {
        return experimentResults;
    }

    /**
     * Sets the value of the experimentResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentResults(String value) {
        this.experimentResults = value;
    }

    /**
     * Gets the value of the xmlResultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlResultExtension() {
        return xmlResultExtension;
    }

    /**
     * Sets the value of the xmlResultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlResultExtension(String value) {
        this.xmlResultExtension = value;
    }

    /**
     * Gets the value of the xmlBlobExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlBlobExtension() {
        return xmlBlobExtension;
    }

    /**
     * Sets the value of the xmlBlobExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlBlobExtension(String value) {
        this.xmlBlobExtension = value;
    }

    /**
     * Gets the value of the warningMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getWarningMessages() {
        return warningMessages;
    }

    /**
     * Sets the value of the warningMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setWarningMessages(ArrayOfString value) {
        this.warningMessages = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
