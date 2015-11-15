
package servicebrokertoolkit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaitEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaitEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveQueueLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estWait" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitEstimate", propOrder = {
    "effectiveQueueLength",
    "estWait"
})
public class WaitEstimate {

    protected int effectiveQueueLength;
    protected double estWait;

    /**
     * Gets the value of the effectiveQueueLength property.
     * 
     */
    public int getEffectiveQueueLength() {
        return effectiveQueueLength;
    }

    /**
     * Sets the value of the effectiveQueueLength property.
     * 
     */
    public void setEffectiveQueueLength(int value) {
        this.effectiveQueueLength = value;
    }

    /**
     * Gets the value of the estWait property.
     * 
     */
    public double getEstWait() {
        return estWait;
    }

    /**
     * Sets the value of the estWait property.
     * 
     */
    public void setEstWait(double value) {
        this.estWait = value;
    }

}
