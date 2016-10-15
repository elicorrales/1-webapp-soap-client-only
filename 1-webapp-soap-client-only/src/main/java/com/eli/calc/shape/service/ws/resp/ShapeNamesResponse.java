
package com.eli.calc.shape.service.ws.resp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.eli.calc.shape.service.ws.ShapeName;


/**
 * <p>Java class for shapeNamesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shapeNamesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://resp.ws.service.shape.calc.eli.com/}statusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shapeNames" type="{http://ws.service.shape.calc.eli.com/}shapeName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shapeNamesResponse", propOrder = {
    "shapeNames"
})
public class ShapeNamesResponse
    extends StatusResponse
{

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<ShapeName> shapeNames;

    /**
     * Gets the value of the shapeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeName }
     * 
     * 
     */
    public List<ShapeName> getShapeNames() {
        if (shapeNames == null) {
            shapeNames = new ArrayList<ShapeName>();
        }
        return this.shapeNames;
    }

}
