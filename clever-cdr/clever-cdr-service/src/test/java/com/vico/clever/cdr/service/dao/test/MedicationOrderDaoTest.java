package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.MedcationOrderInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.MedcationOrder;
import com.vico.clever.cdr.service.model.MedcationOrderStatus;

public class MedicationOrderDaoTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	@Test
	public void medOrderDaoTest(){
		logger.debug("*********  medOrderDaoTest Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		MedcationOrderInfoDao medOrderDao=sqlSession.getMapper(MedcationOrderInfoDao.class);
		try {
			MedcationOrder medcationOrder=new MedcationOrder();
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="med"+num;
			medcationOrder.setAdministrationRouteCode(param);
			medcationOrder.setAdministrationRouteName(param);
			medcationOrder.setComment(param);
			medcationOrder.setDailyCount(num);
			medcationOrder.setDoseAmount(num);
			medcationOrder.setDoseUnit(param);
			medcationOrder.setDoseUnitCode(param);
			medcationOrder.setDurationOfTreat(""+num);
			medcationOrder.setDurationUnit(param);
			medcationOrder.setFormCode(param);
			medcationOrder.setFormName(param);
			medcationOrder.setFrequency(num);
			medcationOrder.setFrequencyInterval(num);
			medcationOrder.setFrequencyIntervalUnit(param);
			medcationOrder.setFrequencyUnit(param);
			medcationOrder.setMedicationCode(param);
			medcationOrder.setMedicationName(param);
			medcationOrder.setMedicationOrderID("Medodr-"+num);
			medcationOrder.setMedicineCompound(param);
			medcationOrder.setNumberAllOfMedicine(num);
			medcationOrder.setOrderID("OrderId-"+num);
			medcationOrder.setOwnMedicine(num);
			medcationOrder.setPatientID("patientId-"+num);
			medcationOrder.setStartDate(date);
			medcationOrder.setStCode(""+num);
			medcationOrder.setStName(param);
			medcationOrder.setStopDate(date);
			medcationOrder.setVisitID("visitId-"+num);
			logger.debug("*********  problemDiagnosis Created  ***********");
			logger.debug(medcationOrder.toString());
			
			int i=medOrderDao.insertMedcationOrder(medcationOrder);
			
			MedcationOrderStatus medOrdeStatus=new MedcationOrderStatus();
			medOrdeStatus.setCareflowStepCode(param);
			medOrdeStatus.setCareflowStepName(param);
			medOrdeStatus.setCurStateCode(param);
			medOrdeStatus.setCurStateName(param);
			medOrdeStatus.setMedcationOrderID("MedOrder-"+num);
			medOrdeStatus.setMedication(param);
			medOrdeStatus.setMedicationCode(param);
			medOrdeStatus.setPatientID("patientId-"+num);
			medOrdeStatus.setPerformDateTime(date);
			medOrdeStatus.setPerformDoctorCode(param);
			medOrdeStatus.setPerformDoctorName(param);
			medOrdeStatus.setVisitID("visitId-"+num);
			logger.debug("*********  medOrdeStatus Created  ***********");
			logger.debug(medOrdeStatus.toString());
			
			int j=medOrderDao.insertMedcationOrderStatus(medOrdeStatus);
			
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
		logger.debug("*********  medOrderDaoTest End ***********");
	}
}
