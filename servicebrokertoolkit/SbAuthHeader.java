
package servicebrokertoolkit;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for sbAuthHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sbAuthHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="couponPassKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="sbAuthHeader", namespace="http://ilab.mit.edu")
@XmlType(name = "sbAuthHeader", propOrder = {
    "couponID",
    "couponPassKey"
})
public class SbAuthHeader {

    protected long couponID;
    protected String couponPassKey;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the couponID property.
     * 
     */
    public long getCouponID() {
        return couponID;
    }

    /**
     * Sets the value of the couponID property.
     * 
     */
    public void setCouponID(long value) {
        this.couponID = value;
    }

    /**
     * Gets the value of the couponPassKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponPassKey() {
        return couponPassKey;
    }

    /**
     * Sets the value of the couponPassKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponPassKey(String value) {
        this.couponPassKey = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
