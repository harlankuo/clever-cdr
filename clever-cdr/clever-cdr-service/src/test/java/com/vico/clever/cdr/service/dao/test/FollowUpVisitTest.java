package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.FollowUpVisitDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.FollowUpVisit;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.FollowUpVisitService;

public class FollowUpVisitTest {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void testFollowUpVisit()
	{
		FollowUpVisitService followUpVisitService = new FollowUpVisitService();
		logger.debug("*********  FollowUpVisit Test Start  ***********");
		SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		FollowUpVisitDao followUpVisitDao = sqlSession.getMapper(FollowUpVisitDao.class);
		try{
			Random random = new Random();
			int num=random.nextInt(100);
			Date date=new Date();
			FollowUpVisit followUpVisit = new FollowUpVisit();
			followUpVisit.setAssessment("assessment"+num);
			followUpVisit.setFollowUpDatetime(date);
			followUpVisit.setFollowUpID("F"+num);
			followUpVisit.setFollowUpMode("mode"+num);
			followUpVisit.setPatientID("P"+num);
			followUpVisit.setVisitID("V"+num);
			
			//int followUpVisitInsert = followUpVisitDao.insertFollowUpVisit(followUpVisit);
			//logger.debug("followUpVisitInsert" +followUpVisitInsert);
			
			//int followUpVisitUpdate = followUpVisitDao.updateFollowUpVisit(followUpVisit);
			//logger.debug("followUpVisitUpdate" +followUpVisitUpdate);
			
			//FollowUpVisit followUp = followUpVisitDao.selectFollowUpVisit(followUpVisit.getFollowUpID());
			
			//logger.debug("followUp" +followUp.toString());
			IntegrationResult integrationResult = followUpVisitService.followUpVisitExtract(followUpVisit);
			
			logger.debug("integrationResult" +integrationResult.toString());
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
