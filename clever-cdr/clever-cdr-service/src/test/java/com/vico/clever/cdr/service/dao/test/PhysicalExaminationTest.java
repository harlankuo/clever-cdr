package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.PhysicalExaminationDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PhysicalExamination;
import com.vico.clever.cdr.service.service.PhysicalExaminationService;

public class PhysicalExaminationTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void physicalExaminationTest()
	{
		SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PhysicalExaminationService physicalExaminationService = new PhysicalExaminationService();
		PhysicalExaminationDao physicalExaminationDao = sqlSession.getMapper(PhysicalExaminationDao.class);
		try{
			Random random = new Random();
			int num=random.nextInt(100);
			Date date=new Date();
			
			PhysicalExamination  physicalExamination = new PhysicalExamination();
			physicalExamination.setExamItemCode("iC"+num);
			physicalExamination.setExamItemName("itemName"+num);
			physicalExamination.setExamResultCode("RE"+num);
			physicalExamination.setExamResultName("result");
			physicalExamination.setPatientID("P"+num);
			physicalExamination.setPerformerCode("PC"+num);
			physicalExamination.setPerformerName("performerName");
			physicalExamination.setRecordDatetime(date);
			physicalExamination.setRecorderCode("REC"+num);
			physicalExamination.setRecorderName("recorderName");
			physicalExamination.setRequestID("R"+num);
			physicalExamination.setVisitID("V"+num);
			//int physicalExaminationInsert = physicalExaminationDao.insertPhysicalExamination(physicalExamination);
			//logger.debug("physicalExaminationInsert"+physicalExaminationInsert);
			
			//int physicalExaminationUpd = physicalExaminationDao.updatePhysicalExamination(physicalExamination);
			//logger.debug("physicalExaminationUpd"+physicalExaminationUpd);
			
			//PhysicalExamination  physicalExaminationF = physicalExaminationDao.selectPhysicalExamination(physicalExamination.getRequestID());
			//logger.debug(physicalExaminationF.toString());
			
			IntegrationResult integrationResult = physicalExaminationService.physicalExaminationExtract(physicalExamination);
			logger.debug(integrationResult.toString());
			sqlSession.commit();
			logger.debug("********* SqlSession Commit*********");
			
		}
		
		
		catch(Exception e)
		{
			logger.error(e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		}
		finally{
			sqlSession.close();
			logger.debug("********* SqlSession Closed*********");
		}
		
	}

}
