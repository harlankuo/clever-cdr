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

import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.entity.PatientAdtEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientTransferInfo;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientDischargeInfo;
import com.vico.clever.cdr.service.model.PatientInfo;
import com.vico.clever.cdr.service.service.PatientADTService;

/**
 * Root resource (exposed at "patientAdt" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("patientAdt")
public class PatientAdtResource {

	protected final Logger logger = Logger.getLogger(this.getClass());
	private PatientADTService patientAdtService = new PatientADTService();

	/**
	 * 
	 * Element resource (exposed at "patientAdmission" path);
	 * 
	 * Method handling the data entry of patient Admission information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param patientAdtEntity
	 *            input json or xml object data that contains
	 *            PatientInfo,PatientTransferInfo and PatientAdmission info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/patientAdmission")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult patientAdmission(PatientAdtEntity patientAdtEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		PatientInfo patientInfo = patientAdtEntity.getPatientInfo();
		PatientAdmission patientAdmission = patientAdtEntity
				.getPatientAdmission();
		PatientTransferInfo patientTransferInfo = patientAdtEntity
				.getPatientTransferInfo();
		integrationResult = patientAdtService.insertPatADTA01Info(patientInfo,
				patientAdmission, patientTransferInfo);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "patientUpdate" path);
	 * 
	 * Method handling the data operation of updating patient basic information
	 * from CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param patientInfo
	 *            input json or xml object data that contains patient basic
	 *            information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/patientUpdate")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updatePatientInfo(PatientInfo patientInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = patientAdtService
				.updatePatientInfoById(patientInfo);
		return integrationResult;
	}

	/**
	 * 
	 * Element resource (exposed at "patientTransfer" path);
	 * 
	 * Method handling the data entry of patient Admission information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param patientTransferInfo
	 *            input json or xml object data that contains
	 *            PatientTransferInfo;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/patientTransfer")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult patientTransfer(PatientAdtEntity patientAdtEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		PatientTransferInfo patientTransferInfo = patientAdtEntity
				.getPatientTransferInfo();
		PatientAdmission patientAdmission = patientAdtEntity
				.getPatientAdmission();
		integrationResult = patientAdtService.insertPatTransferInfo(
				patientAdmission, patientTransferInfo);
		return integrationResult;
	}

	/**
	 * 
	 * Element resource (exposed at "patientDischarge" path);
	 * 
	 * Method handling the data entry of patient Discharge information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param patientAdtEntity
	 *            input json or xml object data that contains
	 *            PatientTransferInfo and PatientDischargeInfo;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/patientDischarge")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult patientDischarge(PatientAdtEntity patientAdtEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		PatientTransferInfo patientTransferInfo = patientAdtEntity
				.getPatientTransferInfo();
		PatientDischargeInfo patDischargeInfo = patientAdtEntity
				.getPatientDischargeInfo();
		integrationResult = patientAdtService.patientDischarge(
				patientTransferInfo, patDischargeInfo);
		return integrationResult;
	}

	@GET
	@Path("/getPatientdischarge")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public PatientDischargeInfo getPatientdischarge(
			@QueryParam("patientId") String patientId,
			@QueryParam("visitId") String visitId) {
		PatientDischargeInfo patientDischargeInfo = patientAdtService
				.getPatientDischargeInfoById(patientId, visitId);
		logger.debug(patientDischargeInfo);
		return patientDischargeInfo;
	}

	/**
	 * 
	 * Element resource (exposed at "patientDischargeCancel" path);
	 * 
	 * Method handling the data entry of patient Discharge Cancel information
	 * into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param patientTransferInfo
	 *            input json or xml object data that contains
	 *            PatientTransferInfo;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/patientDischargeCancel")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult patientDischargeCancel(
			PatientTransferInfo patientTransferInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = patientAdtService
				.patientDischargeCancel(patientTransferInfo);
		return integrationResult;
	}
}
