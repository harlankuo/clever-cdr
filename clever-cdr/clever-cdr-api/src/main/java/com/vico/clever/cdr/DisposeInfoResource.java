package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.DisposeEntity;
import com.vico.clever.cdr.service.model.Dispose;
import com.vico.clever.cdr.service.model.DisposeAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.DisposeInfoService;

/**
 * Root resource (exposed at "disposeResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("disposeResource")
public class DisposeInfoResource {

	private DisposeInfoService disposeService = new DisposeInfoService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDisposeInfoResource() {
		return "Got DisposeInfoResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "disposeRequest" path);
	 * 
	 * Method handling the data entry of dispose request information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param disposeEntity
	 *            input json or xml object data that contains Dispose and
	 *            DisposeAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/disposeRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult dispose(DisposeEntity disposeEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Dispose dispose = disposeEntity.getDispose();
		DisposeAction disposeAction = disposeEntity.getDisposeAction();
		integrationResult = disposeService.dispose(dispose, disposeAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "disposeAction" path);
	 * 
	 * Method handling the data entry of dispose Action information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param disposeAction
	 *            input json or xml object data that contains DisposeAction
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/disposeAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateDispose(DisposeAction disposeAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = disposeService.updateDispose(disposeAction);
		return integrationResult;
	}
}
