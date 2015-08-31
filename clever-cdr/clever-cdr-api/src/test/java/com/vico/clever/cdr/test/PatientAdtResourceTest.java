package com.vico.clever.cdr.test;

import java.util.Date;
import java.util.Random;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.vico.clever.cdr.CleverRestApplication;
import com.vico.clever.cdr.service.entity.PatientAdtEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientDischargeInfo;
import com.vico.clever.cdr.service.model.PatientInfo;
import com.vico.clever.cdr.service.model.PatientTransferInfo;

public class PatientAdtResourceTest extends JerseyTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	protected Application configure(){
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new CleverRestApplication();
	}
	@Test
	public void patientAdtTest(){
		Random random = new Random();
		int num=random.nextInt(100);
		PatientInfo patientInfo=new PatientInfo();
		patientInfo.setBirthPlace("浙江杭州");
		patientInfo.setBirthPlaceCity("杭州");
		patientInfo.setBirthPlaceCityCode("3310");
		patientInfo.setBirthPlaceCountry("中国");
		patientInfo.setBirthPlaceCountryCode("1");
		patientInfo.setBirthPlaceProvince("浙江省");
		patientInfo.setBirthPlaceProvinceCode("3");
		patientInfo.setBloodTypeABO("AB");
		patientInfo.setBloodTypeRH("RH-");
		patientInfo.setDateOfBirth(new Date());
		patientInfo.setDateOfDeath(new Date());
		patientInfo.setEducationBackground("大学");
		patientInfo.setEthnic("汉族");
		patientInfo.setEthnicCode("01");
		patientInfo.setHealthNO("98786465");
		patientInfo.setMaritalStatus("未婚");
		patientInfo.setMaritalStatusCode("01");
		patientInfo.setNationality("中国");
		String patientId="M0000"+num;
		patientInfo.setPatientID(patientId);
		patientInfo.setPatientIdNO("42058231657321354");
		patientInfo.setPatientName("程序员"+num+"号");
		patientInfo.setPatientSexCode("01");
		patientInfo.setPatientSexName("男");
		patientInfo.setProfession("程序员");
		logger.debug("*********  patientInfo Created  ***********");
		logger.debug(patientInfo.toString());
		
		PatientAdmission patientAdm=new PatientAdmission();
		Date date=new Date();
		String id="1234";
		String str="test";
		patientAdm.setAdmissionType(str);
		patientAdm.setAdmissionTypeCode(id);
		patientAdm.setAdmitDateTime(new Date());
		patientAdm.setAdmitDoctorID(id);
		patientAdm.setAdmitDoctorName(str);
		patientAdm.setAdmitIntent(str);
		patientAdm.setAdmitSource(str);
		patientAdm.setAttendingDoctorID(id);
		patientAdm.setAttendingDoctorName(str);
		patientAdm.setBedCode(id);
		patientAdm.setBedName(str);
		patientAdm.setBusinessPhone("1232456789");
		patientAdm.setDeptCode(id);
		patientAdm.setDeptName(str);
		patientAdm.setDeputyDoctorID(id);
		patientAdm.setDeputyDoctorName(str);
		patientAdm.setDirecotrID(id);
		patientAdm.setDirecotrName(str);
		patientAdm.setDoctorGroupID(id);
		patientAdm.setPatientClassCode("I");
		patientAdm.setPatientClassName("住院");
		patientAdm.setPatientID(patientId);
		patientAdm.setVisitID("visitId-"+num);
		logger.debug("*********  patientAdmission Created  ***********");
		logger.debug(patientAdm.toString());
		
		
		PatientTransferInfo patientTransferInfo=new PatientTransferInfo();
		String param="test"+num;
		patientTransferInfo.setActionType(param);
		patientTransferInfo.setCurAttendingDoctorCode(param);
		patientTransferInfo.setCurAttendingDoctorName(param);
		patientTransferInfo.setCurAttendingDoctorName(param);
		patientTransferInfo.setCurDeputyDoctorID(param);
		patientTransferInfo.setCurDirectorID(param);
		patientTransferInfo.setCurDirectorName(param);
		patientTransferInfo.setCurResidentDoctorCode(param);
		patientTransferInfo.setCurResidentDoctorName(param);
		patientTransferInfo.setDestinationBedCode(param);
		patientTransferInfo.setDestinationBedName(param);
		patientTransferInfo.setDestinationDeptCode(param);
		patientTransferInfo.setDestinationDeptName(param);
		patientTransferInfo.setDestinationWardCode(param);
		patientTransferInfo.setDestinationWardName(param);
		patientTransferInfo.setExcuteDateTime(date);
		patientTransferInfo.setMemo(param);
		patientTransferInfo.setOrderID(param);
		patientTransferInfo.setPatientID("M0000"+num);
		patientTransferInfo.setPerformerCode(param);
		patientTransferInfo.setPerformerName(param);
		patientTransferInfo.setPreAttendingDoctorCode(param);
		patientTransferInfo.setPreAttendingDoctorName(param);
		patientTransferInfo.setPreDeputyDoctorID(param);
		patientTransferInfo.setPreDeputyDoctorName(param);
		patientTransferInfo.setPreDirectorID(param);
		patientTransferInfo.setPreDirectorName(param);
		patientTransferInfo.setPreResidentDoctorCode(param);
		patientTransferInfo.setPreResidentDoctorName(param);
		patientTransferInfo.setSourceBedCode(param);
		patientTransferInfo.setSourceBedName(param);
		patientTransferInfo.setSourceDeptCode(param);
		patientTransferInfo.setSourceDeptName(param);
		patientTransferInfo.setSourceWardCode(param);
		patientTransferInfo.setSourceWardName(param);
		patientTransferInfo.setStatus(""+num);
		patientTransferInfo.setVisitID("visitID-"+num);
		logger.debug("*********  patientTransferInfo Created  ***********");
		logger.debug(patientTransferInfo.toString());
		
		PatientDischargeInfo patientDischargeInfo=new PatientDischargeInfo();
		patientDischargeInfo.setDateOfCharge(date);
		patientDischargeInfo.setDischargeDept(param);
		patientDischargeInfo.setDischargeDescripition(param);
		patientDischargeInfo.setDischargeDestination(str);
		patientDischargeInfo.setDischargeDestinationType(param);
		patientDischargeInfo.setDisChargeWard(param);
		patientDischargeInfo.setOrderID(id);
		patientDischargeInfo.setPatientID("patient-"+num);
		patientDischargeInfo.setVisitID("visit-"+num);
		logger.debug("*********  patientDischargeInfo Created  ***********");
		logger.debug(patientDischargeInfo.toString());
		
		PatientAdtEntity patientAdtEntity=new PatientAdtEntity();
		patientAdtEntity.setPatientAdmission(patientAdm);
		patientAdtEntity.setPatientDischargeInfo(patientDischargeInfo);
		patientAdtEntity.setPatientInfo(patientInfo);
		patientAdtEntity.setPatientTransferInfo(patientTransferInfo);
		
		Response response = target("patientAdt").path("patientAdmission").request().buildPost(Entity.entity(patientAdtEntity, MediaType.APPLICATION_JSON)).invoke();
		final IntegrationResult result=response.readEntity(IntegrationResult.class);
		logger.debug(result.toString());
	}
}
