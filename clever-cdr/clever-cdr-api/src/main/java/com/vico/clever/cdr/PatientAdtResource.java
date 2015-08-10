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
 */
@Path("patientAdt")
public class PatientAdtResource {

	protected final Logger logger = Logger.getLogger(this.getClass());
	private PatientADTService patientAdtService=new PatientADTService();;
	@POST
	@Path("/patientADTA01")
	@Produces({ MediaType.APPLICATION_XML })
	public IntegrationResult insertPatientADTA01(
			PatientAdtEntity patientAdtEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		PatientInfo patientInfo=patientAdtEntity.getPatientInfo();
		PatientAdmission patientAdmission=patientAdtEntity.getPatientAdmission();
		PatientTransferInfo patientTransferInfo=patientAdtEntity.getPatientTransferInfo();
		integrationResult=patientAdtService.insertPatADTA01Info(patientInfo, patientAdmission,patientTransferInfo);
		return integrationResult;
	}

	@GET
	@Path("/patientInfo")
	@Produces({ MediaType.APPLICATION_XML })
	public PatientInfo queryPatientInfoById(
			@QueryParam("patientId") String patientId) {
		PatientInfo patientInfo=patientAdtService.getPatientInfoById(patientId);
		return patientInfo;
	}

	@DELETE
	@Path("/patientInfo")
	@Produces({ MediaType.APPLICATION_XML })
	public IntegrationResult removePatientInfo(
			@QueryParam("patientId") String patientId) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult=patientAdtService.deletePatientInfoById(patientId);
		return integrationResult;
	}

	@PUT
	@Path("/patientInfo")
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public IntegrationResult updatePatientInfo(PatientInfo patientInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult=patientAdtService.updatePatientInfoById(patientInfo);
		return integrationResult;
	}
	@POST
	@Path("/patientTransfer")
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public IntegrationResult patientTransfer(PatientTransferInfo patientTransferInfo){
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult=patientAdtService.insertPatTransferInfo(patientTransferInfo);
		return integrationResult;
	}
	@POST
	@Path("/patientDischarge")
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public IntegrationResult patientDischarge(PatientAdtEntity patientAdtEntity){
		IntegrationResult integrationResult = new IntegrationResult();
		PatientTransferInfo patientTransferInfo=patientAdtEntity.getPatientTransferInfo();
		PatientDischargeInfo patDischargeInfo=patientAdtEntity.getPatientDischargeInfo();
		integrationResult=patientAdtService.patientDischarge(patientTransferInfo, patDischargeInfo);
		return integrationResult;
	}
	@POST
	@Path("/patientDischargeCancel")
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public IntegrationResult patientDischargeCancel(PatientTransferInfo patientTransferInfo){
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult=patientAdtService.patientDischargeCancel(patientTransferInfo);
		return integrationResult;
	}
}
