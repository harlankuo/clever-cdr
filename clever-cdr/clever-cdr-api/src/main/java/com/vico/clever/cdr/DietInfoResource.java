package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.DietInfoEntity;
import com.vico.clever.cdr.service.model.Diet;
import com.vico.clever.cdr.service.model.DietAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.DietInfoService;

/**
 * Root resource (exposed at "dietResource" path)
 */
@Path("dietResource")
public class DietInfoResource {

	private DietInfoService dietService = new DietInfoService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDietInfoResource() {
		return "Got DietInfoResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "dietRequest" path);
	 * 
	 * Method handling the data entry of diet information into CDR with HTTP
	 * POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param dietInfoEntity
	 *            input json or xml object data that contains Diet and
	 *            DietAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/dietRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult diet(DietInfoEntity dietInfoEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Diet diet = dietInfoEntity.getDiet();
		DietAction dietAction = dietInfoEntity.getDietAction();
		integrationResult = dietService.insertDietInfo(diet, dietAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "dietAction" path);
	 * 
	 * Method handling the data entry of dietAction information into CDR with
	 * HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param dietAction
	 *            input json or xml object data that contains DietAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/dietAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateDiet(DietAction dietAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = dietService.updateDiet(dietAction);
		return integrationResult;
	}

}
