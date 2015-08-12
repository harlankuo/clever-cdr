package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.DrugsDispenseDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.DrugDispenseReqStatus;
import com.vico.clever.cdr.service.model.DrugDispensingReq;

public class DrugsDispenseDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void drugsDispenseDaoTest(){
		logger.debug("*********  drugsDispenseDaoTest Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DrugsDispenseDao drugsDispenseDao=sqlSession.getMapper(DrugsDispenseDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="drug"+num;
			
			DrugDispensingReq drugDispensingReq=new DrugDispensingReq();
			drugDispensingReq.setApprpvalNumber(param);;
			drugDispensingReq.setBatchID(param);
			drugDispensingReq.setDestinationPharmacyCode(param);
			drugDispensingReq.setDestinationPharmacyName(param);
			drugDispensingReq.setDrugDispensingReqID("drugReq-"+num);
			drugDispensingReq.setEmergency("0");
			drugDispensingReq.setManufacturer(param);
			drugDispensingReq.setMedicationID("med");
			drugDispensingReq.setMedicineTradeName(param);
			drugDispensingReq.setPatientID("patientId-"+num);
			drugDispensingReq.setReceiveDispensingAmount(param);
			drugDispensingReq.setReceiveDispensingAmountUnit(param);
			drugDispensingReq.setReqDeptCode(param);
			drugDispensingReq.setReqDeptName(param);
			drugDispensingReq.setReqDispensingAmount(param);
			drugDispensingReq.setReqDispensingAmountUnit(param);
			drugDispensingReq.setReqWardCode(param);
			drugDispensingReq.setReqWardName(param);
			drugDispensingReq.setVisitID("visitiD-"+num);
			logger.debug("*********  drugDispensingReq Created  ***********");
			logger.debug(drugDispensingReq.toString());
			
			int i=drugsDispenseDao.insertDrugDispenseReq(drugDispensingReq);
			
			DrugDispenseReqStatus drugDispenseReqStatus=new DrugDispenseReqStatus();
			drugDispenseReqStatus.setCareflowStepCode(param);
			drugDispenseReqStatus.setCareflowStepName(param);
			drugDispenseReqStatus.setCurStateCode(param);
			drugDispenseReqStatus.setCurStateName(param);
			drugDispenseReqStatus.setDrugDispensingReqID("drugReq-"+num);
			drugDispenseReqStatus.setMedicationCode(param);
			drugDispenseReqStatus.setMedicationName(param);
			drugDispenseReqStatus.setMemo(param);
			drugDispenseReqStatus.setPatientID("patientId-"+num);
			drugDispenseReqStatus.setPerformDateTime(date);
			drugDispenseReqStatus.setPerformDeptCode(param);
			drugDispenseReqStatus.setPerformDeptName(param);
			drugDispenseReqStatus.setPerformDoctorCode(param);
			drugDispenseReqStatus.setPerformDoctorName(param);
			drugDispenseReqStatus.setPerformSerialNumber(""+num);
			drugDispenseReqStatus.setVisitID("visitID-"+num);
			logger.debug("*********  drugDispenseReqStatus Created  ***********");
			logger.debug(drugDispenseReqStatus.toString());
			
			int j=drugsDispenseDao.insertDrugDispenseReqStatus(drugDispenseReqStatus);
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
		} catch (Exception e) {
			logger.error(e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		} finally {
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		logger.debug("*********  drugsDispenseDaoTest End ***********");
	}
}
