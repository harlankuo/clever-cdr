package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.TherapyEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Therapy;
import com.vico.clever.cdr.service.model.TherapyAction;
import com.vico.clever.cdr.service.service.TherapyService;

/**
 * Root resource (exposed at "TherapyResource" path)
 */
@Path("therapyResource")
public class TherapyResource {

	private TherapyService therapyService = new TherapyService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTherapyResource() {
		return "Got TherapyResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "therapyRequest" path);
	 * 
	 * Method handling the data entry of therapy information into CDR with HTTP
	 * POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param therapyEntity
	 *            input json or xml object data that contains therapy and
	 *            therapyAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/therapyRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult therapy(TherapyEntity therapyEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Therapy therapy = therapyEntity.getTherapy();
		TherapyAction therapyAction = therapyEntity.getTherapyAction();
		integrationResult = therapyService.therapyInfoExtract(therapy,
				therapyAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "therapyAction" path);
	 * 
	 * Method handling the data entry of therapy information into CDR with HTTP
	 * POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param therapyAction
	 *            input json or xml object data that contains therapyAction
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/therapyAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateTherapy(TherapyAction therapyAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = therapyService.updateTherapyAction(therapyAction);
		return integrationResult;
	}
}
