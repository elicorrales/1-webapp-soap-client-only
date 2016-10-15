
package com.eli.calc.shape.soapclient;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.eli.calc.shape.mvc.controllers.RequestResponseController;
import com.eli.calc.shape.service.ws.CalcType;
import com.eli.calc.shape.service.ws.CalculationRequest;
import com.eli.calc.shape.service.ws.CalculationResult;
import com.eli.calc.shape.service.ws.ShapeCalculatorWebService;
import com.eli.calc.shape.service.ws.ShapeName;
import com.eli.calc.shape.service.ws.impl.ShapeCalculatorWebServiceImplService;
import com.eli.calc.shape.service.ws.parms.QueueCalculationParms;
import com.eli.calc.shape.service.ws.resp.CalcTypesResponse;
import com.eli.calc.shape.service.ws.resp.CalculatedResultsResponse;
import com.eli.calc.shape.service.ws.resp.PendingRequestsResponse;
import com.eli.calc.shape.service.ws.resp.RunPendingRequestsResponse;
import com.eli.calc.shape.service.ws.resp.ShapeNamesResponse;
//import com.eli.calc.shape.service.ws.CalcTypesResponse;
//import com.eli.calc.shape.service.ws.ShapeNamesResponse;
import com.eli.calc.shape.service.ws.resp.StatusCode;
import com.eli.calc.shape.service.ws.resp.StatusResponse;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-07T00:48:50.610-04:00
 * Generated source version: 3.1.7
 * 
 */
public final class ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client {

	private static final Logger logger = LoggerFactory.getLogger(ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client.class);

    private static final QName SERVICE_NAME = new QName("http://impl.ws.service.shape.calc.eli.com/", "ShapeCalculatorWebServiceImplService");

    private ShapeCalculatorWebService port;


    public ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client(URL wsdlURL) {


       	ShapeCalculatorWebServiceImplService ss = new ShapeCalculatorWebServiceImplService(wsdlURL, SERVICE_NAME);
       	port = ss.getShapeCalculatorWebServiceImplPort();  

    }

    public List<ShapeName> getShapeNames() {
 
    System.out.println("Invoking getShapeNames...");
    ShapeNamesResponse _getShapeNames__return = port.getShapeNames();

        checkForError(_getShapeNames__return);

        return _getShapeNames__return.getShapeNames();
    }
    
    public List<CalcType> getCalcTypes() {
 
    System.out.println("Invoking getCalcTypes...");
    CalcTypesResponse _getCalcTypes__return = port.getCalcTypes();

        checkForError(_getCalcTypes__return);

        return _getCalcTypes__return.getCalcTypes();
    }

    public void deletePendingRequests() {

        System.out.println("Invoking deletePendingRequests...");
 
        StatusResponse _deletePendingRequests__return = port.deletePendingRequests();

        checkForError(_deletePendingRequests__return);

    }
 
    public void deleteResults() {

        System.out.println("Invoking deleteResults...");

        StatusResponse _deleteResults__return = port.deleteResults();

        checkForError(_deleteResults__return);

    }
 
 
    public List<CalculationRequest> getPendingRequests() {

        	System.out.println("Invoking getPendingRequests...");

        	PendingRequestsResponse _getPendingRequests__return = port.getPendingRequests();

        	checkForError(_getPendingRequests__return);

        	List<CalculationRequest> pending = _getPendingRequests__return.getPendingRequests();

        	return pending;
    }


    public void queueCalculation(ShapeName shapeName, CalcType calcType, double dimension) {
    	
        System.out.println("Invoking queueCalculation...");
        QueueCalculationParms _queueCalculation_queueCalculationParms = 
        		new QueueCalculationParms();

        _queueCalculation_queueCalculationParms.setShapeName(shapeName);
        _queueCalculation_queueCalculationParms.setCalcType(calcType);
        _queueCalculation_queueCalculationParms.setDimension(dimension);

        StatusResponse _queueCalculation__return = 
        		port.queueCalculation(_queueCalculation_queueCalculationParms);

        checkForError(_queueCalculation__return);
    }


    public List<CalculationResult> getCalculatedResults() {
 
        System.out.println("Invoking getCalculatedResults...");
        CalculatedResultsResponse _getCalculatedResults__return = port.getCalculatedResults();

        checkForError(_getCalculatedResults__return);

       	List<CalculationResult> results = _getCalculatedResults__return.getCalculatedResults();
       	
       	return results;
    }
    
    public int runPendingRequestsNoStopOnError() {

    	System.out.println("Invoking runPendingRequestsNoStopOnError...");
    	RunPendingRequestsResponse _runPendingRequestsNoStopOnError__return = 
    																				port.runPendingRequestsNoStopOnError();

    	checkForError(_runPendingRequestsNoStopOnError__return);
 
     	return _runPendingRequestsNoStopOnError__return.getNumRun();
    }

    public int runPendingRequestsStopOnError() {

    	System.out.println("Invoking runPendingRequestsStopOnError...");
    	RunPendingRequestsResponse _runPendingRequestsStopOnError__return = 
    																				port.runPendingRequestsNoStopOnError();

    	checkForError(_runPendingRequestsStopOnError__return);

     	return _runPendingRequestsStopOnError__return.getNumRun();
    }

    private void checkForError(StatusResponse response){

     	if (!response.getCode().equals(StatusCode.SUCCESS)) {
       		throw new RuntimeException("<p>"
       				+"Service Error:<p>"
       				+"description: "+response.getDescription()+"<p>"
       				+"errMsg:"+response.getErrMsg()+"<p>"
       				+"clazz:"+response.getClazz()+"<p>"
       				);
       	}
    	
    }
 
}