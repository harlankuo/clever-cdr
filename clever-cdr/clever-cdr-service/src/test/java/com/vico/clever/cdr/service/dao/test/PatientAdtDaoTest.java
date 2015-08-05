package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.vico.clever.cdr.service.dao.PatientAdtDao;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

public class PatientAdtDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	private ClassPathXmlApplicationContext context;
	@Resource (name="patientAdtDao")
	private PatientAdtDao patientAdtDao;
	private PlatformTransactionManager platformTransactionManager;
	@Before
	public void init(){
		context=new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		patientAdtDao=(PatientAdtDao) context.getBean("patientAdtDao");
		platformTransactionManager=(PlatformTransactionManager) context.getBean("transactionManager");
	}
	@Test
	public void testPatientAdtDao(){
		logger.debug("*********  testPatientAdtDao Start ***********");
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setName("Patient-Admission-Transaction");
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status=platformTransactionManager.getTransaction(def);
		try{
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
			patientInfo.setEducationBackground("��ѧ");
			patientInfo.setEthnic("汉族");
			patientInfo.setEthnicCode("01");
			patientInfo.setHealthNO("98786465");
			patientInfo.setMaritalStatus("未婚");
			patientInfo.setMaritalStatusCode("01");
			patientInfo.setNationality("中国");
			patientInfo.setPatientID("M0000003");
			patientInfo.setPatientIdNO("42058231657321354");
			patientInfo.setPatientName("程序员2号");
			patientInfo.setPatientSexCode("01");
			patientInfo.setPatientSexName("男");
			patientInfo.setProfession("程序员");
			logger.debug("*********  patientInfo Created  ***********");
			logger.debug(patientInfo.toString());
			long i=patientAdtDao.insertPatientInfo(patientInfo);
			logger.debug("*********  patientInfo Inserted  ***********");
						
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
			patientAdm.setPatientID("M0000003");
			patientAdm.setVisitID("76354734");
			logger.debug("*********  patientAdmission Created  ***********");
			logger.debug(patientAdm.toString());
			long j=patientAdtDao.insertPatientAdmission(patientAdm);
			logger.debug("*********  patientAdmission Inserted  ***********");
			platformTransactionManager.commit(status);
			logger.debug("*********  platformTransactionManager commit  ***********");
		}catch(Exception e){
			logger.error(e.toString());
			platformTransactionManager.rollback(status);
			logger.debug("*********  platformTransactionManager Rollback  ***********");
		}
		logger.debug("*********  testPatientAdtDao End ***********");
	}
}
