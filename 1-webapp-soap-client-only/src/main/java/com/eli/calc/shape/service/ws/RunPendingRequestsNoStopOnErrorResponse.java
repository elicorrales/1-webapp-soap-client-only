
package com.eli.calc.shape.service.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.eli.calc.shape.service.ws.resp.RunPendingRequestsResponse;


/**
 * <p>Java class for runPendingRequestsNoStopOnErrorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runPendingRequestsNoStopOnErrorResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://resp.ws.service.shape.calc.eli.com/}runPendingRequestsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runPendingRequestsNoStopOnErrorResponse", propOrder = {
    "_return"
})
public class RunPendingRequestsNoStopOnErrorResponse {

    @XmlElement(name = "return")
    protected RunPendingRequestsResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RunPendingRequestsResponse }
     *     
     */
    public RunPendingRequestsResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunPendingRequestsResponse }
     *     
     */
    public void setReturn(RunPendingRequestsResponse value) {
        this._return = value;
    }

}
