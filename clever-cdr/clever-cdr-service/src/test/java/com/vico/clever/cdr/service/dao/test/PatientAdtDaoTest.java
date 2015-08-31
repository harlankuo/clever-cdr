package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.PatientAdtDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

public class PatientAdtDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Before
	public void init(){
		
	}
	@Test
	public void testPatientAdtDao(){
		logger.debug("*********  testPatientAdtDao Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao=sqlSession.getMapper(PatientAdtDao.class);
		try{
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
			patientInfo.setPatientID("M0000"+num);
			patientInfo.setPatientIdNO("42058231657321354");
			patientInfo.setPatientName("程序员"+num+"号");
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
			patientAdm.setVisitID("visitId-"+num);
			logger.debug("*********  patientAdmission Created  ***********");
			logger.debug(patientAdm.toString());
			long j=patientAdtDao.insertPatientAdmission(patientAdm);
			logger.debug("*********  patientAdmission Inserted  ***********");
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
		}catch(Exception e){
			logger.error(e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		}finally{
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		logger.debug("*********  testPatientAdtDao End ***********");
	}
}
