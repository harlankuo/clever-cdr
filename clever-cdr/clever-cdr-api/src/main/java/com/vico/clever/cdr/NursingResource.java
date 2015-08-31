package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.NursingInfoEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Nursing;
import com.vico.clever.cdr.service.model.NursingAction;
import com.vico.clever.cdr.service.service.NursingInfoService;

/**
 * Root resource (exposed at "nursingResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("nursingResource")
public class NursingResource {

	private NursingInfoService nursingService = new NursingInfoService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getNursingResource() {
		return "Got NursingResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "nursingRequest" path);
	 * 
	 * Method handling the data entry of nursing information into CDR with HTTP
	 * POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param nursingInfoEntity
	 *            input json or xml object data that contains Nursing and
	 *            NursingAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/nursingRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult nursing(NursingInfoEntity nursingInfoEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Nursing nursing = nursingInfoEntity.getNursing();
		NursingAction nursingAction = nursingInfoEntity.getNursingAction();
		integrationResult = nursingService.nursing(nursing, nursingAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "nursingAction" path);
	 * 
	 * Method handling the data entry of nursingAction information into CDR with
	 * HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param nursingAction
	 *            input json or xml object data that contains NursingAction
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/nursingAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateNursing(NursingAction nursingAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = nursingService.updateNursing(nursingAction);
		return integrationResult;
	}

}
