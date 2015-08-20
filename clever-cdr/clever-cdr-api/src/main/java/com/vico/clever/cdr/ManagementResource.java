package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.ManagementEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Management;
import com.vico.clever.cdr.service.model.ManagementAction;
import com.vico.clever.cdr.service.service.ManagementService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("managementResource")
public class ManagementResource {

	private ManagementService managementService = new ManagementService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getManagementResource() {
		return "Got ManagementResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "management" path);
	 * 
	 * Method handling the data entry of management information into CDR with
	 * HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param managementEntity
	 *            input json or xml object data that contains Management and
	 *            ManagementAction info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/management")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult management(ManagementEntity managementEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		Management management = managementEntity.getManagement();
		ManagementAction managementAction = managementEntity
				.getManagementAction();
		integrationResult = managementService.management(management,
				managementAction);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "managementAction" path);
	 * 
	 * Method handling the data entry of management action information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param managementAction
	 *            input json or xml object data that contains ManagementAction
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/managementAction")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateManagement(ManagementAction managementAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = managementService
				.updateManagement(managementAction);
		return integrationResult;
	}
}
