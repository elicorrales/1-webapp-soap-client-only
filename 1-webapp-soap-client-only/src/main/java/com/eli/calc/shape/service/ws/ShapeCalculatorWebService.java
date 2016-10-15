package com.eli.calc.shape.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-15T13:19:33.800-04:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://ws.service.shape.calc.eli.com/", name = "ShapeCalculatorWebService")
@XmlSeeAlso({com.eli.calc.shape.service.ws.parms.ObjectFactory.class, ObjectFactory.class, com.eli.calc.shape.service.ws.resp.ObjectFactory.class})
public interface ShapeCalculatorWebService {

    @WebMethod
    @RequestWrapper(localName = "getPendingRequests", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetPendingRequests")
    @ResponseWrapper(localName = "getPendingRequestsResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetPendingRequestsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.PendingRequestsResponse getPendingRequests();

    @WebMethod
    @RequestWrapper(localName = "getShapeNames", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetShapeNames")
    @ResponseWrapper(localName = "getShapeNamesResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetShapeNamesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.ShapeNamesResponse getShapeNames();

    @WebMethod
    @RequestWrapper(localName = "getCalcTypes", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetCalcTypes")
    @ResponseWrapper(localName = "getCalcTypesResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetCalcTypesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.CalcTypesResponse getCalcTypes();

    @WebMethod
    @RequestWrapper(localName = "deletePendingRequests", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.DeletePendingRequests")
    @ResponseWrapper(localName = "deletePendingRequestsResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.DeletePendingRequestsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.StatusResponse deletePendingRequests();

    @WebMethod
    @RequestWrapper(localName = "getCalculatedResults", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetCalculatedResults")
    @ResponseWrapper(localName = "getCalculatedResultsResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.GetCalculatedResultsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.CalculatedResultsResponse getCalculatedResults();

    @WebMethod
    @RequestWrapper(localName = "queueCalculation", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.QueueCalculation")
    @ResponseWrapper(localName = "queueCalculationResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.QueueCalculationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.StatusResponse queueCalculation(
        @WebParam(name = "QueueCalculationParms", targetNamespace = "")
        com.eli.calc.shape.service.ws.parms.QueueCalculationParms queueCalculationParms
    );

    @WebMethod
    @RequestWrapper(localName = "deleteResults", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.DeleteResults")
    @ResponseWrapper(localName = "deleteResultsResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.DeleteResultsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.StatusResponse deleteResults();

    @WebMethod
    @RequestWrapper(localName = "runPendingRequestsStopOnError", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.RunPendingRequestsStopOnError")
    @ResponseWrapper(localName = "runPendingRequestsStopOnErrorResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.RunPendingRequestsStopOnErrorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.RunPendingRequestsResponse runPendingRequestsStopOnError();

    @WebMethod
    @RequestWrapper(localName = "runPendingRequestsNoStopOnError", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.RunPendingRequestsNoStopOnError")
    @ResponseWrapper(localName = "runPendingRequestsNoStopOnErrorResponse", targetNamespace = "http://ws.service.shape.calc.eli.com/", className = "com.eli.calc.shape.service.ws.RunPendingRequestsNoStopOnErrorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.eli.calc.shape.service.ws.resp.RunPendingRequestsResponse runPendingRequestsNoStopOnError();
}