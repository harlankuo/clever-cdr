package com.vico.clever.cdr.service.service.test;

import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;
import com.vico.clever.cdr.service.service.PatientADTService;

public class PatientADTServiceTest {
	private PatientADTService patientADTService;
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Before
	public void init(){
		patientADTService=new PatientADTService();
	}
	@Test
	public void testPatientAdtService(){
		Random random = new Random();
		int num=random.nextInt();
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
		IntegrationResult integrationResult=patientADTService.insertPatientAndVisitInfo(patientInfo, patientAdm);
		logger.debug("*********  insertPatientAndVisitInfo  ***********");
		logger.debug(integrationResult);
	}
}
