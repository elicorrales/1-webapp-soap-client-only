
package com.eli.calc.shape.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShapeName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShapeName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAKE_XSD_VAL_ONLY_NOT_USED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShapeName", namespace = "http://model.shape.calc.eli.com/")
@XmlEnum
public enum ShapeName {

    FAKE_XSD_VAL_ONLY_NOT_USED;

    public String value() {
        return name();
    }

    public static ShapeName fromValue(String v) {
        return valueOf(v);
    }

}
