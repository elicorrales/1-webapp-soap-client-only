
package com.eli.calc.shape.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.ShapeName;


/**
 * <p>Java class for CalculationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shapeName" type="{http://model.shape.calc.eli.com/}ShapeName"/&gt;
 *         &lt;element name="calcType" type="{http://model.shape.calc.eli.com/}CalcType"/&gt;
 *         &lt;element name="dimension" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationResult", propOrder = {
    "shapeName",
    "calcType",
    "dimension",
    "result",
    "error"
})
public class CalculationResult {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ShapeName shapeName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CalcType calcType;
    protected double dimension;
    protected double result;
    protected boolean error;

    /**
     * Gets the value of the shapeName property.
     * 
     * @return
     *     possible object is
     *     {@link ShapeName }
     *     
     */
    public ShapeName getShapeName() {
        return shapeName;
    }

    /**
     * Sets the value of the shapeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeName }
     *     
     */
    public void setShapeName(ShapeName value) {
        this.shapeName = value;
    }

    /**
     * Gets the value of the calcType property.
     * 
     * @return
     *     possible object is
     *     {@link CalcType }
     *     
     */
    public CalcType getCalcType() {
        return calcType;
    }

    /**
     * Sets the value of the calcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcType }
     *     
     */
    public void setCalcType(CalcType value) {
        this.calcType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     */
    public double getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     */
    public void setDimension(double value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(double value) {
        this.result = value;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

}
