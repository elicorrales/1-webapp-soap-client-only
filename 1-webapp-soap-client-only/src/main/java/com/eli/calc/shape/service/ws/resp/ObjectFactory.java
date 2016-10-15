
package com.eli.calc.shape.service.ws.resp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eli.calc.shape.service.ws.resp package. 
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

    private final static QName _CalcTypesResponse_QNAME = new QName("http://resp.ws.service.shape.calc.eli.com/", "calcTypesResponse");
    private final static QName _CalculatedResultsResponse_QNAME = new QName("http://resp.ws.service.shape.calc.eli.com/", "calculatedResultsResponse");
    private final static QName _PendingRequestsResponse_QNAME = new QName("http://resp.ws.service.shape.calc.eli.com/", "pendingRequestsResponse");
    private final static QName _RunPendingRequestsResponse_QNAME = new QName("http://resp.ws.service.shape.calc.eli.com/", "runPendingRequestsResponse");
    private final static QName _ShapeNamesResponse_QNAME = new QName("http://resp.ws.service.shape.calc.eli.com/", "shapeNamesResponse");
    private final static QName _StatusResponse_QNAME = new QName("http://resp.ws.service.shape.calc.eli.com/", "statusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eli.calc.shape.service.ws.resp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcTypesResponse }
     * 
     */
    public CalcTypesResponse createCalcTypesResponse() {
        return new CalcTypesResponse();
    }

    /**
     * Create an instance of {@link CalculatedResultsResponse }
     * 
     */
    public CalculatedResultsResponse createCalculatedResultsResponse() {
        return new CalculatedResultsResponse();
    }

    /**
     * Create an instance of {@link PendingRequestsResponse }
     * 
     */
    public PendingRequestsResponse createPendingRequestsResponse() {
        return new PendingRequestsResponse();
    }

    /**
     * Create an instance of {@link RunPendingRequestsResponse }
     * 
     */
    public RunPendingRequestsResponse createRunPendingRequestsResponse() {
        return new RunPendingRequestsResponse();
    }

    /**
     * Create an instance of {@link ShapeNamesResponse }
     * 
     */
    public ShapeNamesResponse createShapeNamesResponse() {
        return new ShapeNamesResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resp.ws.service.shape.calc.eli.com/", name = "calcTypesResponse")
    public JAXBElement<CalcTypesResponse> createCalcTypesResponse(CalcTypesResponse value) {
        return new JAXBElement<CalcTypesResponse>(_CalcTypesResponse_QNAME, CalcTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatedResultsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resp.ws.service.shape.calc.eli.com/", name = "calculatedResultsResponse")
    public JAXBElement<CalculatedResultsResponse> createCalculatedResultsResponse(CalculatedResultsResponse value) {
        return new JAXBElement<CalculatedResultsResponse>(_CalculatedResultsResponse_QNAME, CalculatedResultsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PendingRequestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resp.ws.service.shape.calc.eli.com/", name = "pendingRequestsResponse")
    public JAXBElement<PendingRequestsResponse> createPendingRequestsResponse(PendingRequestsResponse value) {
        return new JAXBElement<PendingRequestsResponse>(_PendingRequestsResponse_QNAME, PendingRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPendingRequestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resp.ws.service.shape.calc.eli.com/", name = "runPendingRequestsResponse")
    public JAXBElement<RunPendingRequestsResponse> createRunPendingRequestsResponse(RunPendingRequestsResponse value) {
        return new JAXBElement<RunPendingRequestsResponse>(_RunPendingRequestsResponse_QNAME, RunPendingRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapeNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resp.ws.service.shape.calc.eli.com/", name = "shapeNamesResponse")
    public JAXBElement<ShapeNamesResponse> createShapeNamesResponse(ShapeNamesResponse value) {
        return new JAXBElement<ShapeNamesResponse>(_ShapeNamesResponse_QNAME, ShapeNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resp.ws.service.shape.calc.eli.com/", name = "statusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

}
