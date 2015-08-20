package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.RemainEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;
import com.vico.clever.cdr.service.service.RemainService;

/**
 * Root resource (exposed at "remainResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("remainResource")
public class RemainResource {

	private RemainService remainService = new RemainService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRemainResource() {
		return "Got RemainResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "remainRequest" path);
	 * 
	 * Method handling the data entry of remain order request information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param remianEntity
	 *            input json or xml object data that contains Remain and
	 *            RemainAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/remainRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult remain(RemainEntity remianEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Remain remain = remianEntity.getRemain();
		RemainAction remainAction = remianEntity.getRemainAction();
		integrationResult = remainService.remainRequest(remain, remainAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "remainAction" path);
	 * 
	 * Method handling the data entry of remain order action information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param remainAction
	 *            input json or xml object data that contains RemainAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/remainAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateRemain(RemainAction remainAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = remainService.updateRemainAction(remainAction);
		return integrationResult;
	}
}
