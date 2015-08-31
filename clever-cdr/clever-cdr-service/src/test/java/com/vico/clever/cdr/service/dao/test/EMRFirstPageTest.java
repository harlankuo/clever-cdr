package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.EMRFirstPageDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.EMRFirstPage;
import com.vico.clever.cdr.service.model.EMRFirstPageAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.EMRFirstPageService;


public class EMRFirstPageTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	@Test
	public void testEMRFirstPage()
	{
		EMRFirstPageService emrFirstPageService = new EMRFirstPageService();
		logger.debug("*********  testEMRFirstPageDao Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		EMRFirstPageDao emrFirstPageDao=sqlSession.getMapper(EMRFirstPageDao.class);
		logger.debug(emrFirstPageDao.toString()+"******");
		try{
			EMRFirstPage emrFirstPage = new EMRFirstPage();
			Random random = new Random();
			int num=random.nextInt();
			logger.debug("num");
			Date date=new Date();
			emrFirstPage.setEmrFirstPageID("F0"+num);
			emrFirstPage.setFirstCreateTime(date);
			emrFirstPage.setLastModifiedTime(date);
			emrFirstPage.setLastOperaterCode("c");
			emrFirstPage.setLastOperaterName("oper"+num);
			emrFirstPage.setPatientID("P0"+num);
			emrFirstPage.setTemplateID("te"+num);
			emrFirstPage.setVisitID("V0"+num);
			//int emrFirstPageResult = emrFirstPageDao.insertEMRFirstPage(emrFirstPage);
			
			//logger.debug("添加FirstPage"+emrFirstPageResult);
			
			
			EMRFirstPageAction emrFirstPageAction = new EMRFirstPageAction();
			emrFirstPageAction.setActionDatetime(date);
			emrFirstPageAction.setCareflowStepCode("care");
			emrFirstPageAction.setCareflowStepName("docu"+num);
			emrFirstPageAction.setComment("123");
			emrFirstPageAction.setCurStateCode("cur");
			emrFirstPageAction.setCurStateName("document"+num);
			emrFirstPageAction.setPatientID("p01"+num);
			emrFirstPageAction.setPerformDeptCode("code");
			emrFirstPageAction.setPerformDeptName("per"+num);
			emrFirstPageAction.setPerformerCode("p");
			emrFirstPageAction.setPerformerName("pName"+num);
			emrFirstPageAction.setTitleName("title");
			emrFirstPageAction.setVisitID("v01"+num);
			emrFirstPageAction.setEmrFirstPageID(emrFirstPage.getEmrFirstPageID());
           // int emrFirstPageActionResult = emrFirstPageDao.insertEMRFirstPageAction(emrFirstPageAction);
			
			emrFirstPage = emrFirstPageDao.selectEMRFirstPage("F01696046823");
			logger.debug(emrFirstPage.toString());
			
			//IntegrationResult integrationResult = emrFirstPageService.emrFirstPageExtract(emrFirstPage, emrFirstPageAction);
			//logger.debug(integrationResult.toString());
			
			//integrationResult = emrFirstPageService.updateEMRFirstPageAction(emrFirstPageAction);
			//logger.debug(integrationResult.toString()+"Action");
			
            sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
			
			
			
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
