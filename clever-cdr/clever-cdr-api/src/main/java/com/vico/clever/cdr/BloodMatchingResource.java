package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.BloodMatchingEntity;
import com.vico.clever.cdr.service.model.BloodMatching;
import com.vico.clever.cdr.service.model.BloodMatchingAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.BloodMatchingService;

/**
 * Root resource (exposed at "bloodMatchResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("bloodMatchResource")
public class BloodMatchingResource {

	private BloodMatchingService bloodMatchService = new BloodMatchingService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getBloodMatchingResource() {
		return "Got BloodMatchingResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "bloodMatchRequest" path);
	 * 
	 * Method handling the data entry of blood Matching request information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param bloodMatchingEntity
	 *            input json or xml object data that contains BloodMatching and
	 *            BloodMatchingAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/bloodMatchRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult bloodMatching(
			BloodMatchingEntity bloodMatchingEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		BloodMatching bloodMatching = bloodMatchingEntity.getBloodMatching();
		BloodMatchingAction bloodMatchingAction = bloodMatchingEntity
				.getBloodMatchingAction();
		integrationResult = bloodMatchService.bloodMatching(bloodMatching,
				bloodMatchingAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "bloodMatchingAction" path);
	 * 
	 * Method handling the data entry of blood Matching action information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param bloodMatchingAction
	 *            input json or xml object data that contains
	 *            BloodMatchingAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/bloodMatchingAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateBloodMatching(
			BloodMatchingAction bloodMatchingAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = bloodMatchService
				.updateBloodMatching(bloodMatchingAction);
		return integrationResult;
	}

}
