package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
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
 * Root resource (exposed at "patientDiagnoseResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("patientDiagnoseResource")
public class PatientDiagnoseResource {

	protected final Logger logger = Logger.getLogger(this.getClass());
	private PatientDiagnoseService patientDiagService = new PatientDiagnoseService();

	/**
	 * 
	 * Method handling the data entry of patient Diagnose information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param problemDiagnosis
	 *            input json or xml object data that contains problemDiagnosis
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult problemDiagnosis(ProblemDiagnosis problemDiagnosis) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = patientDiagService
				.insertProblemDiagnosis(problemDiagnosis);
		return integrationResult;
	}

	/**
	 * Method handling operation of updating patient Diagnose information from
	 * CDR with HTTP PUT requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param problemDiagnosis
	 *            input json or xml object data that contains problemDiagnosis
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateProblemDiagnosis(
			ProblemDiagnosis problemDiagnosis) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = patientDiagService
				.updateProblemDiagnosis(problemDiagnosis);
		return integrationResult;
	}

	/**
	 * Method handling operation of deleting patient Diagnose information from
	 * CDR with HTTP DELETE requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param patientId
	 *            input String as patient identifier;
	 * @param visitId
	 *            input String as patient visit identifier;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult deleteProblemDiagnosis(
			@QueryParam("patientId") String patientId,
			@QueryParam("visitId") String visitId) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = patientDiagService.deleteProblemDiagnosis(
				patientId, visitId);
		return integrationResult;
	}

}
