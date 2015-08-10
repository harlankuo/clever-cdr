package com.vico.clever.cdr;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.ProblemDiagnosis;
import com.vico.clever.cdr.service.service.PatientDiagnoseService;

/**
 * Root resource (exposed at "PatientDiagnoseResource" path)
 */
@Path("PatientDiagnoseResource")
public class PatientDiagnoseResource {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	private PatientDiagnoseService patientDiagService=new PatientDiagnoseService();
   
    @POST
    @Produces({ MediaType.APPLICATION_XML })
    public IntegrationResult problemDiagnosis(ProblemDiagnosis problemDiagnosis) {
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=patientDiagService.insertProblemDiagnosis(problemDiagnosis);
        return integrationResult;
    }
    
    @PUT
    @Produces({ MediaType.APPLICATION_XML })
    public IntegrationResult updateProblemDiagnosis(ProblemDiagnosis problemDiagnosis){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=patientDiagService.updateProblemDiagnosis(problemDiagnosis);
    	return integrationResult;
    }
    @DELETE 
    @Produces({ MediaType.APPLICATION_XML })
    public IntegrationResult deleteProblemDiagnosis(@QueryParam("patientId") String patientId ,@QueryParam("visitId") String visitId){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=patientDiagService.deleteProblemDiagnosis(patientId, visitId);
    	return integrationResult;
    }
    
}
