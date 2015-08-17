package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.DrugsDispenseEntity;
import com.vico.clever.cdr.service.model.DrugDispenseReqStatus;
import com.vico.clever.cdr.service.model.DrugDispensingReq;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.DrugsDispenseService;

/**
 * Root resource (exposed at "drugsDispenseResource" path)
 * 
 * @author <a href="mailto:Yuan.Ziyang@vico-lab.com">Yuan.Ziyang</a>
 * 
 */
@Path("drugsDispenseResource")
public class DrugsDispenseResource {

	private DrugsDispenseService drugsDispenseService = new DrugsDispenseService();

	/**
	 * Element resource (exposed at "drugsDispenseReq" path);
	 * 
	 * Method handling HTTP POST requests to write drug dispense request
	 * information into CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param drugsDispenseEntity
	 *            input json object data that contains DrugDispensingReq and
	 *            DrugDispenseReqStatus information
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
	@POST
	@Path("/drugsDispenseReq")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult drugDispenseReqExtract(
			DrugsDispenseEntity drugsDispenseEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		DrugDispensingReq drugDispensingReq = drugsDispenseEntity
				.getDrugDispensingReq();
		DrugDispenseReqStatus drugDispenseReqStatus = drugsDispenseEntity
				.getDrugDispenseReqStatus();
		integrationResult = drugsDispenseService.drugDispenseInfoExtract(
				drugDispensingReq, drugDispenseReqStatus);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "drugsDispenseStatus" path);
	 * 
	 * Method handling HTTP POST requests to write drug dispense status
	 * information into CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param drugDispenseReqStatus
	 *            input json or xml object data that contains drugDispenseReqStatus info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/drugsDispenseStatus")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateDrugDispenseReqStatus(
			DrugDispenseReqStatus drugDispenseReqStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = drugsDispenseService
				.updateDrugDispenseReqStatus(drugDispenseReqStatus);
		return integrationResult;
	}
}
