package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.ConsultationEntity;
import com.vico.clever.cdr.service.model.Consultation;
import com.vico.clever.cdr.service.model.ConsultationAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.ConsultationService;

/**
 * Root resource (exposed at "consultationResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("consultationResource")
public class ConsultationResource {

	private ConsultationService consultationService = new ConsultationService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getConsultationResource() {
		return "Got ConsultationResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "consultationRequest" path);
	 * 
	 * Method handling the data entry of consultation Request information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param consultationEntity
	 *            input json or xml object data that contains Consultation and
	 *            ConsultationAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/consultationRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult inserConsultationInfo(
			ConsultationEntity consultationEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Consultation consultation = consultationEntity.getConsultation();
		ConsultationAction consultationAction = consultationEntity
				.getConsultationAction();
		integrationResult = consultationService.inserConsultationInfo(
				consultation, consultationAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "consultationRequest" path);
	 * 
	 * Method handling the data operation of deleting consultation Request
	 * information from CDR with HTTP DELETE requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param consultRequestID
	 *            String that identifies a consultation request record;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@DELETE
	@Path("/consultationRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult deleteConsultationInfo(
			@QueryParam("consultRequestID") String consultRequestID) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = consultationService
				.deleteConsultationInfo(consultRequestID);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "consultationRequest" path);
	 * 
	 * Method handling the data updating of consultation Request information
	 * into CDR with HTTP PUT requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param consultationEntity
	 *            input json or xml object data that contains Consultation and
	 *            ConsultationAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@PUT
	@Path("/consultationRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateConsultationInfo(
			ConsultationEntity consultationEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Consultation consultation = consultationEntity.getConsultation();
		ConsultationAction consultationAction = consultationEntity
				.getConsultationAction();
		integrationResult = consultationService.updateConsultationInfo(
				consultation, consultationAction);
		return integrationResult;
	}
}
