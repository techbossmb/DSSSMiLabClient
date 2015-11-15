
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExperimentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperimentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="labServerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="effectiveGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="submissionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="completionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="minTimeToLive" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="priorityHint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validationWarningMessages" type="{http://ilab.mit.edu}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="validationErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executionWarningMessages" type="{http://ilab.mit.edu}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="executionErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlResultExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlBlobExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentInformation", propOrder = {
    "experimentID",
    "labServerID",
    "userID",
    "effectiveGroupID",
    "submissionTime",
    "completionTime",
    "expirationTime",
    "minTimeToLive",
    "priorityHint",
    "statusCode",
    "validationWarningMessages",
    "validationErrorMessage",
    "executionWarningMessages",
    "executionErrorMessage",
    "annotation",
    "xmlResultExtension",
    "xmlBlobExtension"
})
public class ExperimentInformation {

    protected int experimentID;
    protected int labServerID;
    protected int userID;
    protected int effectiveGroupID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    protected double minTimeToLive;
    protected int priorityHint;
    protected int statusCode;
    protected ArrayOfString validationWarningMessages;
    protected String validationErrorMessage;
    protected ArrayOfString executionWarningMessages;
    protected String executionErrorMessage;
    protected String annotation;
    protected String xmlResultExtension;
    protected String xmlBlobExtension;

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
     * Gets the value of the labServerID property.
     * 
     */
    public int getLabServerID() {
        return labServerID;
    }

    /**
     * Sets the value of the labServerID property.
     * 
     */
    public void setLabServerID(int value) {
        this.labServerID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * Gets the value of the effectiveGroupID property.
     * 
     */
    public int getEffectiveGroupID() {
        return effectiveGroupID;
    }

    /**
     * Sets the value of the effectiveGroupID property.
     * 
     */
    public void setEffectiveGroupID(int value) {
        this.effectiveGroupID = value;
    }

    /**
     * Gets the value of the submissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionTime() {
        return submissionTime;
    }

    /**
     * Sets the value of the submissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionTime(XMLGregorianCalendar value) {
        this.submissionTime = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionTime(XMLGregorianCalendar value) {
        this.completionTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
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
     * Gets the value of the validationWarningMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getValidationWarningMessages() {
        return validationWarningMessages;
    }

    /**
     * Sets the value of the validationWarningMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setValidationWarningMessages(ArrayOfString value) {
        this.validationWarningMessages = value;
    }

    /**
     * Gets the value of the validationErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationErrorMessage() {
        return validationErrorMessage;
    }

    /**
     * Sets the value of the validationErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationErrorMessage(String value) {
        this.validationErrorMessage = value;
    }

    /**
     * Gets the value of the executionWarningMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getExecutionWarningMessages() {
        return executionWarningMessages;
    }

    /**
     * Sets the value of the executionWarningMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setExecutionWarningMessages(ArrayOfString value) {
        this.executionWarningMessages = value;
    }

    /**
     * Gets the value of the executionErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionErrorMessage() {
        return executionErrorMessage;
    }

    /**
     * Sets the value of the executionErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionErrorMessage(String value) {
        this.executionErrorMessage = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
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

}
