
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
 *         &lt;element name="ListAllClientItemsResult" type="{http://ilab.mit.edu}ArrayOfString" minOccurs="0"/>
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
    "listAllClientItemsResult"
})
@XmlRootElement(name = "ListAllClientItemsResponse")
public class ListAllClientItemsResponse {

    @XmlElement(name = "ListAllClientItemsResult")
    protected ArrayOfString listAllClientItemsResult;

    /**
     * Gets the value of the listAllClientItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getListAllClientItemsResult() {
        return listAllClientItemsResult;
    }

    /**
     * Sets the value of the listAllClientItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setListAllClientItemsResult(ArrayOfString value) {
        this.listAllClientItemsResult = value;
    }

}
