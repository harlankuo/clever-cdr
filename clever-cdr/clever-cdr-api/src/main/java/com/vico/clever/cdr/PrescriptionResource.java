package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.PrescriptionEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PrescriptionDetail;
import com.vico.clever.cdr.service.model.PrescriptionInfo;
import com.vico.clever.cdr.service.model.PrescriptionStatus;
import com.vico.clever.cdr.service.service.PrescriptionService;

/**
 * Root resource (exposed at "prescriptionResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("prescriptionResource")
public class PrescriptionResource {

	private PrescriptionService prescService = new PrescriptionService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPrescription() {
		return "Got PrescriptionResource!";
	}

	/**
	 * Element resource (exposed at "prescription" path);
	 * 
	 * Method handling the data entry of Prescription information into CDR with
	 * HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param prescriptionEntity
	 *            input json or xml object data that contains
	 *            prescriptionInfo,prescriptionDetailList and prescriptionStatus
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/prescription")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public IntegrationResult prescriptionInfoExtract(
			PrescriptionEntity prescriptionEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		PrescriptionInfo prescriptionInfo = prescriptionEntity
				.getPrescriptionInfo();
		List<PrescriptionDetail> prescriptionDetailList = prescriptionEntity
				.getPrescriptionDetailList();
		PrescriptionStatus prescriptionStatus = prescriptionEntity
				.getPrescriptionStatus();
		integrationResult = prescService.prescriptionInfoExtract(
				prescriptionInfo, prescriptionDetailList, prescriptionStatus);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "prescriptionStatus" path);
	 * 
	 * Method handling the data entry of Prescription Status information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param prescriptionStatus
	 *            input json or xml object data that contains prescriptionStatus
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/prescriptionStatus")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public IntegrationResult updatePrescStatus(
			PrescriptionStatus prescriptionStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = prescService.updatePrescStatus(prescriptionStatus);
		return integrationResult;
	}
}
