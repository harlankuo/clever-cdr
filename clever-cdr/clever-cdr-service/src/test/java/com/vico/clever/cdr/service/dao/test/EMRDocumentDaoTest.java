package com.vico.clever.cdr.service.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.EMRDocumentDao;
import com.vico.clever.cdr.service.entity.EMRDocumentEntity;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.EMRDocument;
import com.vico.clever.cdr.service.model.EMRDocumentAction;
import com.vico.clever.cdr.service.model.EMRDocumentDetails;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.EMRDocumentService;


public class EMRDocumentDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Before
	public void init(){
		EMRDocumentService emrDocumentService =new EMRDocumentService();
	}

	@Test
	public void testEMRDocument(){
		logger.debug("*********  testEMRDocumentDao Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		EMRDocumentDao emrDocumentDao=sqlSession.getMapper(EMRDocumentDao.class);
		logger.debug(emrDocumentDao.toString()+"******");
		try{
			Random random = new Random();
			int num=random.nextInt();
			logger.debug("num");
			Date date=new Date();
			EMRDocument emrDocument = new EMRDocument();
			emrDocument.setDocumentID("D10"+num);
			emrDocument.setPatientID("P10"+num);
			emrDocument.setVisitID("V10"+num);
			emrDocument.setContentText("无病史");
		
			emrDocument.setParentTypeID("Pa01"+num);
			logger.debug(emrDocument.toString());
			
			int emrDocumentInsert = emrDocumentDao.insertEMRDocument(emrDocument);
			
			List<EMRDocumentDetails> emrDocumentDetailList = new ArrayList<EMRDocumentDetails>();
			
			EMRDocumentDetails emrDocumentDetail = new EMRDocumentDetails();
			
			emrDocumentDetail.setContentText("1222");
			emrDocumentDetail.setAdditionInformation("456");
			emrDocumentDetail.setDocumentID( emrDocument.getDocumentID());
			emrDocumentDetail.setEmrTypeID("e01"+num);
			emrDocumentDetail.setLastOperateTime(date);
			emrDocumentDetail.setLineAlign("789");
			emrDocumentDetail.setParentTypeID("pa01"+num);
			emrDocumentDetail.setPrintNO(num);
			emrDocumentDetail.setSectionEndFlag("1");
			emrDocumentDetail.setSectionStartFlag("0");
			emrDocumentDetail.setShowTime(date);
			emrDocumentDetail.setTemplateID("te01"+num);
			emrDocumentDetail.setTitleName("title"+num);
			
			emrDocumentDetailList.add(emrDocumentDetail);
			
			
			int emrDocumentDetailInsert = emrDocumentDao.insertEMRDocumentDetails(emrDocumentDetailList);
			
			EMRDocumentAction emrDocumentAction = new EMRDocumentAction();
			
			emrDocumentAction.setActionDatetime(date);
			emrDocumentAction.setCareflowStepCode("care");
			emrDocumentAction.setCareflowStepName("docu"+num);
			emrDocumentAction.setComment("123");
			emrDocumentAction.setCurStateCode("cur");
			emrDocumentAction.setCurStateName("document"+num);
			emrDocumentAction.setDocumentID(emrDocument.getDocumentID());
			emrDocumentAction.setPatientID("p01"+num);
			emrDocumentAction.setPerformDeptCode("code");
			emrDocumentAction.setPerformDeptName("per"+num);
			emrDocumentAction.setPerformerCode("p");
			emrDocumentAction.setPerformerName("pName"+num);
			emrDocumentAction.setTitleName("title");
			emrDocumentAction.setVisitID("v01"+num);
			
			int emrActionInsert = emrDocumentDao.insertEMRDocumentAction(emrDocumentAction);
			
			
			
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
			logger.debug("*********  SqlSession Closed  ***********");
			
		}
		logger.debug("*********  testEMRDocumentDao End ***********");
	}

}
