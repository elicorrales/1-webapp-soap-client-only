package com.eli.calc.shape.mvc.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eli.calc.shape.exceptions.CreateRequestException;
import com.eli.calc.shape.service.ws.CalcType;
import com.eli.calc.shape.service.ws.CalculationRequest;
import com.eli.calc.shape.service.ws.CalculationResult;
import com.eli.calc.shape.service.ws.ShapeName;
import com.eli.calc.shape.soapclient.ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client;

@Controller
public class RequestResponseController {

	private static final Logger logger = LoggerFactory.getLogger(RequestResponseController.class);

	private final static String shapeNamesObsoleteMessage = "WARNING: Service's ShapeName(s) changed<p>";

	private final static String calcTypesObsoleteMessage = "WARNING: Service's CalcType(s) changed<p>";

	@Autowired
	private ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client soapClient;
	

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcomeTheSlash() {

    	System.err.println("\n\n\nWelcome: The / (slash) ; Index page\n\n\n");

		return new ModelAndView("/index","message","Slash Index Page: dynamic message from Controller - not used at the moment");
	}


	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView welcomeTheIndex() {

    	System.err.println("\n\n\nWelcome2: The /index Index page\n\n\n");

		return new ModelAndView("/index","message","Index Index Page: dynamic message from Controller - not used at the moment");
	}


    @RequestMapping(value="/newreq", method = RequestMethod.GET)
    public String newreq(Map<String, Object> model) {
    	
    	System.err.println("\n\n\nINSIDE Controller newreq()\n\n\n");

   		CalculationRequest calcRequestForm = new CalculationRequest();
   		model.put("calcRequestForm", calcRequestForm);
         
   		String obsolete = checkIfThisAppIsOutdated();
   		if (!obsolete.isEmpty()) {
   			model.put("obsoleteMsg", obsolete);
   		}

    	populateLists(model);

        return "newreq";
    }

 
 
    @RequestMapping(value="/newreq", method = RequestMethod.POST)
    public String processRequest(
    		@ModelAttribute("calcRequestForm") CalculationRequest calcRequestForm,
            Map<String, Object> model
            ) {
         
    	System.err.println("\n\n\nINSIDE Controller processRequest()\n\n\n");

    	try {

    		String obsolete = checkIfThisAppIsOutdated();
   			if (!obsolete.isEmpty()) {
   				model.put("obsoleteMsg", obsolete);
   			}

    	
   			if (null==calcRequestForm) {
   				throw new IllegalArgumentException("Form Object is null.");
   			}
   			if (calcRequestForm.getShapeName()==null) {
   				throw new IllegalArgumentException("Form ShapeName is null.");
   			}
   			if (calcRequestForm.getCalcType()==null) {
   				throw new IllegalArgumentException("Form CalcType is null.");
   			}
   			if (calcRequestForm.getDimension()==null) {
   				throw new IllegalArgumentException("Dimension is null.");
   			}

    		this.soapClient.queueCalculation(
    			calcRequestForm.getShapeName(),
    			calcRequestForm.getCalcType(),
    			calcRequestForm.getDimension());

    	} catch (Exception e) {
    		throw new CreateRequestException(e);
    	}

   		populateLists(model);

   		model.put("success","Success: Request Queued or Calculated Previously");

        return "newreq";
    }

    @ExceptionHandler(value={BindException.class})
    public ModelAndView handleBindException(HttpServletRequest req, BindException e) {
    	
    	System.err.println("\n\n\nINSIDE Controller handleBindingException()\n\n\n");

    	StringBuffer errors = new StringBuffer("There are errors:");

    	List<FieldError> fieldErrors = e.getFieldErrors();
    	for (FieldError fe : fieldErrors) {
    		errors.append(fe.getRejectedValue()+" is not valid for "+fe.getField()+".\n");
    	}

    	ModelAndView mav = new ModelAndView();
 
    	CalculationRequest calcRequestForm = new CalculationRequest();
		mav.addObject("calcRequestForm", calcRequestForm);
         
   		populateLists(mav.getModel());

   		mav.addObject("error",errors.toString());

    	mav.setViewName("newreq");

    	return mav;
    }

 
    @ExceptionHandler(value={CreateRequestException.class})
    public ModelAndView handleCreateRequestException(HttpServletRequest req, CreateRequestException e) {
    	
    	System.err.println("\n\n\nINSIDE Controller handleCreateRequestException()\n\n\n");

    	StringBuffer errors = 
    			new StringBuffer("There was an error Creating Request:"+e.getMessage());

    	ModelAndView mav = new ModelAndView();

   		CalculationRequest calcRequestForm = new CalculationRequest();
		mav.addObject("calcRequestForm", calcRequestForm);
         
   		populateLists(mav.getModel());

   		mav.addObject("error",errors.toString());

    	mav.setViewName("newreq");

    	return mav;
    }

 
    @ExceptionHandler(value={Exception.class})
    public ModelAndView handleException(HttpServletRequest req, Exception e) {
    	
    	System.err.println("\n\n\nINSIDE Controller handleException()\n\n\n");

    	String errMsg = e.getMessage();
    	Throwable throwable = e.getCause();
    	
    	ModelAndView mav = new ModelAndView();

   		mav.addObject("errmsg",errMsg);

   		if (null!=throwable) { mav.addObject("cause",throwable.getClass()); }

    	mav.setViewName("error");

    	return mav;
    }

 
    private void populateLists(Map<String, Object> model) {

   		List<String> shapeList = new ArrayList<>();
   		for (ShapeName name : ShapeName.values()) {
   			shapeList.add(name.name());
   		}
   		model.put("shapeList", shapeList);

   		List<String> calcTypeList = new ArrayList<>();
   		for (CalcType type : CalcType.values()) {
   			calcTypeList.add(type.name());
   		}
   		model.put("calcTypeList", calcTypeList);

    }
    

	@RequestMapping(value="/pending",method=RequestMethod.GET)
	public ModelAndView pending() {

    	System.err.println("\n\n\nPending Requests\n\n\n");

    	ModelAndView mav = new ModelAndView("/pending");

   		String obsolete = checkIfThisAppIsOutdated();
		if (!obsolete.isEmpty()) {
			mav.addObject("obsoleteMsg", obsolete);
		}

   		List<CalculationRequest> pendingRequests = soapClient.getPendingRequests();

   		if (null==pendingRequests || pendingRequests.isEmpty()) {
   			mav.addObject("message", "There are NO Pending Requests");
   			return mav;
   		}

   		mav.addObject("pendingRequests",pendingRequests);
		return mav;

	}

	@RequestMapping(value="/results",method=RequestMethod.GET)
	public ModelAndView results() {

    	System.err.println("\n\n\nCalculated Results\n\n\n");

    	ModelAndView mav = new ModelAndView("/results");

   		String obsolete = checkIfThisAppIsOutdated();
		if (!obsolete.isEmpty()) {
			mav.addObject("obsoleteMsg", obsolete);
		}

   		List<CalculationResult> calculatedResults = this.soapClient.getCalculatedResults();

   		if (null==calculatedResults || calculatedResults.isEmpty()) {
   			mav.addObject("message", "There are NO Calculated Results Yet");
   			return mav;
   		}

   		mav.addObject("calculatedResults",calculatedResults);
		return mav;

	}


	@RequestMapping(value="/delpending",method=RequestMethod.POST)
	public ModelAndView delpending() {

    	System.err.println("\n\n\nINSIDE Controller delpending()\n\n\n");

   		this.soapClient.deletePendingRequests();

   		List<CalculationRequest> pending = this.soapClient.getPendingRequests();

   		if (null==pending || pending.isEmpty()) {
   			return new ModelAndView("/pending","message", "There are NO Pending Requests");
 		}

   		return new ModelAndView("/pending","error","Oops! there are "+pending.size());

	}

	@RequestMapping(value="/delresults",method=RequestMethod.POST)
	public ModelAndView delresults() {

    	System.err.println("\n\n\nINSIDE Controller delresults()\n\n\n");

   		this.soapClient.deleteResults();

   		List<CalculationResult> results = this.soapClient.getCalculatedResults();

   		if (null==results || results.isEmpty()) {
		  	return new ModelAndView("/results","message", "There are NO Results");
   		}

   		return new ModelAndView("/results","error","Oops! there are "+results.size());

	}

	@RequestMapping(value="/runpendingnostop",method=RequestMethod.POST)
	public ModelAndView runpendingnostop() {

    	System.err.println("\n\n\nINSIDE Controller runpending()\n\n\n");

   		this.soapClient.runPendingRequestsNoStopOnError();

   		List<CalculationResult> calculatedResults = this.soapClient.getCalculatedResults();

   		if (null==calculatedResults || calculatedResults.isEmpty()) {
   			return new ModelAndView("/results","message", "There are NO Results");
   		}

		return new ModelAndView("/results","calculatedResults",calculatedResults);

	}

	private String checkIfThisAppIsOutdated() {

		// this app's generated classes may need re-generation if the service
		// has new items...

		String obsoleteMessage = "";
		
		if (ShapeName.values().length != soapClient.getShapeNames().size()){
	
			obsoleteMessage += shapeNamesObsoleteMessage;
		}

		if (CalcType.values().length != soapClient.getCalcTypes().size()) {
	
			obsoleteMessage += calcTypesObsoleteMessage;
		}

		return obsoleteMessage;
	}

}
