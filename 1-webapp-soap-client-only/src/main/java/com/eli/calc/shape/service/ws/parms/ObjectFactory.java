
package com.eli.calc.shape.service.ws.parms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eli.calc.shape.service.ws.parms package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueueCalculationParms_QNAME = new QName("http://parms.ws.service.shape.calc.eli.com/", "queueCalculationParms");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eli.calc.shape.service.ws.parms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueueCalculationParms }
     * 
     */
    public QueueCalculationParms createQueueCalculationParms() {
        return new QueueCalculationParms();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueueCalculationParms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parms.ws.service.shape.calc.eli.com/", name = "queueCalculationParms")
    public JAXBElement<QueueCalculationParms> createQueueCalculationParms(QueueCalculationParms value) {
        return new JAXBElement<QueueCalculationParms>(_QueueCalculationParms_QNAME, QueueCalculationParms.class, null, value);
    }

}
