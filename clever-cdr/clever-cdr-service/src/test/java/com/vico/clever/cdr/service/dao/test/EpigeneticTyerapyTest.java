package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.EpigeneticTyerapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.EpigeneticTyerapy;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.EpigeneticTyerapyService;

public class EpigeneticTyerapyTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void epigeneticTyerapyTest()
	{
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		EpigeneticTyerapyDao epigeneticTyerapyDao =sqlSession.getMapper(EpigeneticTyerapyDao.class);
		EpigeneticTyerapyService epigeneticTyerapyService = new EpigeneticTyerapyService();
		try{
			Random random = new Random();
			int num = random.nextInt(100);
			Date date = new Date();
			EpigeneticTyerapy epigeneticTyerapy = new EpigeneticTyerapy();
			
			epigeneticTyerapy.setAdverseReaction("adverseReaction");
			epigeneticTyerapy.setAdverseReationDegree("De"+num);
			epigeneticTyerapy.setClinicalComment("clinicalComment");
			epigeneticTyerapy.setContinuousDays(num);
			epigeneticTyerapy.setEndDatetime(date);
			epigeneticTyerapy.setEpigeneticTherapyID("E"+num);
			epigeneticTyerapy.setOrderID("O"+num);
			epigeneticTyerapy.setOtherInfomation("otherInfomation");
			epigeneticTyerapy.setPatientID("P"+num);
			epigeneticTyerapy.setPatientID("P"+num);
			epigeneticTyerapy.setStartDatetime(date);
			epigeneticTyerapy.setVisitID("V"+num);
			
			//int epigeneticTyerapyInsert = epigeneticTyerapyDao.insertEpigeneticTyerapy(epigeneticTyerapy);
			//logger.debug("epigeneticTyerapyInsert"+epigeneticTyerapyInsert);
			
			//int epigeneticTyerapyUpdate = epigeneticTyerapyDao.updateEpigeneticTyerapy(epigeneticTyerapy);
			//logger.debug("epigeneticTyerapyUpdate"+epigeneticTyerapyUpdate);
			
			//EpigeneticTyerapy epigeneticTyerapyTest = epigeneticTyerapyDao.selectEpigeneticTyerapy(epigeneticTyerapy.getEpigeneticTherapyID());
			//logger.debug(epigeneticTyerapyTest.toString());
			
			
			sqlSession.commit();
			logger.debug("********** SqlSession Commit **********");
			sqlSession.close();
			integrationResult = epigeneticTyerapyService.epigeneticTyerapyExtract(epigeneticTyerapy);
			logger.debug(integrationResult.toString());
			
		}
		catch(Exception e){
			logger.debug(e.toString());
			sqlSession.rollback();
			logger.debug("********** SqlSession  Rollback**********");
		}
		finally{
			sqlSession.close();
			logger.debug("********** SqlSession  Closed**********");
			
		}
	}

}
