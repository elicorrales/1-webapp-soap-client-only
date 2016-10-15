
package com.eli.calc.shape.service.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eli.calc.shape.service.ws package. 
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

    private final static QName _DeletePendingRequests_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "deletePendingRequests");
    private final static QName _DeletePendingRequestsResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "deletePendingRequestsResponse");
    private final static QName _DeleteResults_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "deleteResults");
    private final static QName _DeleteResultsResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "deleteResultsResponse");
    private final static QName _GetCalcTypes_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getCalcTypes");
    private final static QName _GetCalcTypesResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getCalcTypesResponse");
    private final static QName _GetCalculatedResults_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getCalculatedResults");
    private final static QName _GetCalculatedResultsResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getCalculatedResultsResponse");
    private final static QName _GetPendingRequests_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getPendingRequests");
    private final static QName _GetPendingRequestsResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getPendingRequestsResponse");
    private final static QName _GetShapeNames_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getShapeNames");
    private final static QName _GetShapeNamesResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "getShapeNamesResponse");
    private final static QName _QueueCalculation_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "queueCalculation");
    private final static QName _QueueCalculationResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "queueCalculationResponse");
    private final static QName _RunPendingRequestsNoStopOnError_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "runPendingRequestsNoStopOnError");
    private final static QName _RunPendingRequestsNoStopOnErrorResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "runPendingRequestsNoStopOnErrorResponse");
    private final static QName _RunPendingRequestsStopOnError_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "runPendingRequestsStopOnError");
    private final static QName _RunPendingRequestsStopOnErrorResponse_QNAME = new QName("http://ws.service.shape.calc.eli.com/", "runPendingRequestsStopOnErrorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eli.calc.shape.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePendingRequests }
     * 
     */
    public DeletePendingRequests createDeletePendingRequests() {
        return new DeletePendingRequests();
    }

    /**
     * Create an instance of {@link DeletePendingRequestsResponse }
     * 
     */
    public DeletePendingRequestsResponse createDeletePendingRequestsResponse() {
        return new DeletePendingRequestsResponse();
    }

    /**
     * Create an instance of {@link DeleteResults }
     * 
     */
    public DeleteResults createDeleteResults() {
        return new DeleteResults();
    }

    /**
     * Create an instance of {@link DeleteResultsResponse }
     * 
     */
    public DeleteResultsResponse createDeleteResultsResponse() {
        return new DeleteResultsResponse();
    }

    /**
     * Create an instance of {@link GetCalcTypes }
     * 
     */
    public GetCalcTypes createGetCalcTypes() {
        return new GetCalcTypes();
    }

    /**
     * Create an instance of {@link GetCalcTypesResponse }
     * 
     */
    public GetCalcTypesResponse createGetCalcTypesResponse() {
        return new GetCalcTypesResponse();
    }

    /**
     * Create an instance of {@link GetCalculatedResults }
     * 
     */
    public GetCalculatedResults createGetCalculatedResults() {
        return new GetCalculatedResults();
    }

    /**
     * Create an instance of {@link GetCalculatedResultsResponse }
     * 
     */
    public GetCalculatedResultsResponse createGetCalculatedResultsResponse() {
        return new GetCalculatedResultsResponse();
    }

    /**
     * Create an instance of {@link GetPendingRequests }
     * 
     */
    public GetPendingRequests createGetPendingRequests() {
        return new GetPendingRequests();
    }

    /**
     * Create an instance of {@link GetPendingRequestsResponse }
     * 
     */
    public GetPendingRequestsResponse createGetPendingRequestsResponse() {
        return new GetPendingRequestsResponse();
    }

    /**
     * Create an instance of {@link GetShapeNames }
     * 
     */
    public GetShapeNames createGetShapeNames() {
        return new GetShapeNames();
    }

    /**
     * Create an instance of {@link GetShapeNamesResponse }
     * 
     */
    public GetShapeNamesResponse createGetShapeNamesResponse() {
        return new GetShapeNamesResponse();
    }

    /**
     * Create an instance of {@link QueueCalculation }
     * 
     */
    public QueueCalculation createQueueCalculation() {
        return new QueueCalculation();
    }

    /**
     * Create an instance of {@link QueueCalculationResponse }
     * 
     */
    public QueueCalculationResponse createQueueCalculationResponse() {
        return new QueueCalculationResponse();
    }

    /**
     * Create an instance of {@link RunPendingRequestsNoStopOnError }
     * 
     */
    public RunPendingRequestsNoStopOnError createRunPendingRequestsNoStopOnError() {
        return new RunPendingRequestsNoStopOnError();
    }

    /**
     * Create an instance of {@link RunPendingRequestsNoStopOnErrorResponse }
     * 
     */
    public RunPendingRequestsNoStopOnErrorResponse createRunPendingRequestsNoStopOnErrorResponse() {
        return new RunPendingRequestsNoStopOnErrorResponse();
    }

    /**
     * Create an instance of {@link RunPendingRequestsStopOnError }
     * 
     */
    public RunPendingRequestsStopOnError createRunPendingRequestsStopOnError() {
        return new RunPendingRequestsStopOnError();
    }

    /**
     * Create an instance of {@link RunPendingRequestsStopOnErrorResponse }
     * 
     */
    public RunPendingRequestsStopOnErrorResponse createRunPendingRequestsStopOnErrorResponse() {
        return new RunPendingRequestsStopOnErrorResponse();
    }

    /**
     * Create an instance of {@link CalculationRequest }
     * 
     */
    public CalculationRequest createCalculationRequest() {
        return new CalculationRequest();
    }

    /**
     * Create an instance of {@link CalculationResult }
     * 
     */
    public CalculationResult createCalculationResult() {
        return new CalculationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePendingRequests }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "deletePendingRequests")
    public JAXBElement<DeletePendingRequests> createDeletePendingRequests(DeletePendingRequests value) {
        return new JAXBElement<DeletePendingRequests>(_DeletePendingRequests_QNAME, DeletePendingRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePendingRequestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "deletePendingRequestsResponse")
    public JAXBElement<DeletePendingRequestsResponse> createDeletePendingRequestsResponse(DeletePendingRequestsResponse value) {
        return new JAXBElement<DeletePendingRequestsResponse>(_DeletePendingRequestsResponse_QNAME, DeletePendingRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "deleteResults")
    public JAXBElement<DeleteResults> createDeleteResults(DeleteResults value) {
        return new JAXBElement<DeleteResults>(_DeleteResults_QNAME, DeleteResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResultsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "deleteResultsResponse")
    public JAXBElement<DeleteResultsResponse> createDeleteResultsResponse(DeleteResultsResponse value) {
        return new JAXBElement<DeleteResultsResponse>(_DeleteResultsResponse_QNAME, DeleteResultsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalcTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getCalcTypes")
    public JAXBElement<GetCalcTypes> createGetCalcTypes(GetCalcTypes value) {
        return new JAXBElement<GetCalcTypes>(_GetCalcTypes_QNAME, GetCalcTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalcTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getCalcTypesResponse")
    public JAXBElement<GetCalcTypesResponse> createGetCalcTypesResponse(GetCalcTypesResponse value) {
        return new JAXBElement<GetCalcTypesResponse>(_GetCalcTypesResponse_QNAME, GetCalcTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculatedResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getCalculatedResults")
    public JAXBElement<GetCalculatedResults> createGetCalculatedResults(GetCalculatedResults value) {
        return new JAXBElement<GetCalculatedResults>(_GetCalculatedResults_QNAME, GetCalculatedResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculatedResultsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getCalculatedResultsResponse")
    public JAXBElement<GetCalculatedResultsResponse> createGetCalculatedResultsResponse(GetCalculatedResultsResponse value) {
        return new JAXBElement<GetCalculatedResultsResponse>(_GetCalculatedResultsResponse_QNAME, GetCalculatedResultsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingRequests }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getPendingRequests")
    public JAXBElement<GetPendingRequests> createGetPendingRequests(GetPendingRequests value) {
        return new JAXBElement<GetPendingRequests>(_GetPendingRequests_QNAME, GetPendingRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingRequestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getPendingRequestsResponse")
    public JAXBElement<GetPendingRequestsResponse> createGetPendingRequestsResponse(GetPendingRequestsResponse value) {
        return new JAXBElement<GetPendingRequestsResponse>(_GetPendingRequestsResponse_QNAME, GetPendingRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShapeNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getShapeNames")
    public JAXBElement<GetShapeNames> createGetShapeNames(GetShapeNames value) {
        return new JAXBElement<GetShapeNames>(_GetShapeNames_QNAME, GetShapeNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShapeNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "getShapeNamesResponse")
    public JAXBElement<GetShapeNamesResponse> createGetShapeNamesResponse(GetShapeNamesResponse value) {
        return new JAXBElement<GetShapeNamesResponse>(_GetShapeNamesResponse_QNAME, GetShapeNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueueCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "queueCalculation")
    public JAXBElement<QueueCalculation> createQueueCalculation(QueueCalculation value) {
        return new JAXBElement<QueueCalculation>(_QueueCalculation_QNAME, QueueCalculation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueueCalculationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "queueCalculationResponse")
    public JAXBElement<QueueCalculationResponse> createQueueCalculationResponse(QueueCalculationResponse value) {
        return new JAXBElement<QueueCalculationResponse>(_QueueCalculationResponse_QNAME, QueueCalculationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPendingRequestsNoStopOnError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "runPendingRequestsNoStopOnError")
    public JAXBElement<RunPendingRequestsNoStopOnError> createRunPendingRequestsNoStopOnError(RunPendingRequestsNoStopOnError value) {
        return new JAXBElement<RunPendingRequestsNoStopOnError>(_RunPendingRequestsNoStopOnError_QNAME, RunPendingRequestsNoStopOnError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPendingRequestsNoStopOnErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "runPendingRequestsNoStopOnErrorResponse")
    public JAXBElement<RunPendingRequestsNoStopOnErrorResponse> createRunPendingRequestsNoStopOnErrorResponse(RunPendingRequestsNoStopOnErrorResponse value) {
        return new JAXBElement<RunPendingRequestsNoStopOnErrorResponse>(_RunPendingRequestsNoStopOnErrorResponse_QNAME, RunPendingRequestsNoStopOnErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPendingRequestsStopOnError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "runPendingRequestsStopOnError")
    public JAXBElement<RunPendingRequestsStopOnError> createRunPendingRequestsStopOnError(RunPendingRequestsStopOnError value) {
        return new JAXBElement<RunPendingRequestsStopOnError>(_RunPendingRequestsStopOnError_QNAME, RunPendingRequestsStopOnError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPendingRequestsStopOnErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.shape.calc.eli.com/", name = "runPendingRequestsStopOnErrorResponse")
    public JAXBElement<RunPendingRequestsStopOnErrorResponse> createRunPendingRequestsStopOnErrorResponse(RunPendingRequestsStopOnErrorResponse value) {
        return new JAXBElement<RunPendingRequestsStopOnErrorResponse>(_RunPendingRequestsStopOnErrorResponse_QNAME, RunPendingRequestsStopOnErrorResponse.class, null, value);
    }

}
