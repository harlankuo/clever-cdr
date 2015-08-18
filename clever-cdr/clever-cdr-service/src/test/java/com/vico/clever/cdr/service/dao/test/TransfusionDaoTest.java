package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.TransfusionDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Transfusion;
import com.vico.clever.cdr.service.model.TransfusionAction;

public class TransfusionDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	
	@Test
	public void transfusionDaoTest(){
		logger.debug("*********  transfusionDaoTest Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		TransfusionDao transfusionDao=sqlSession.getMapper(TransfusionDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="transf"+num;
			Transfusion transfusion=new Transfusion();
			transfusion.setAdministrationCode(param);
			transfusion.setAdministrationName(param);
			transfusion.setAmountAll(num);
			transfusion.setAmountVolume(num);
			transfusion.setAmountVolumeUnit(param);
			transfusion.setBloodType(param);
			transfusion.setCount(num);
			transfusion.setFrequencyCount(num);
			transfusion.setFrequencyDec(param);
			transfusion.setFrequencyInterval(num);
			transfusion.setFrequencyIntervalUnit(param);
			transfusion.setIndication(param);
			transfusion.setMemo(param);
			transfusion.setOrderID("orderid-"+num);
			transfusion.setPatientID("M0000"+num);
			transfusion.setReactionFlag(param);
			transfusion.setReactionType(param);
			transfusion.setReason(param);
			transfusion.setReasonCode(param);
			transfusion.setRequestID("reqId-"+num);
			transfusion.setStartDatetime(date);
			transfusion.setTransfusionID("transfid-"+num);
			transfusion.setVisitID("visitid-"+num);
			logger.debug(transfusion.toString());
			int insertTransfusion=transfusionDao.insertTransfusion(transfusion);
			
			TransfusionAction transfusionAction=new TransfusionAction();
			transfusionAction.setActionDatetime(date);;
			transfusionAction.setCareflowStepCode(param);
			transfusionAction.setCareflowStepName(param);
			transfusionAction.setCurStateCode(param);
			transfusionAction.setCurStateName(param);
			transfusionAction.setPatientID("patientID-"+num);
			transfusionAction.setPerformDeptCode(param);
			transfusionAction.setPerformDeptName(param);
			transfusionAction.setPerformerCode(param);
			transfusionAction.setPerformerName(param);
			transfusionAction.setReaction(param);
			transfusionAction.setReason(param);
			transfusionAction.setTransfusionID("transfid-"+num);
			transfusionAction.setVisitID("visitid-"+num);
			logger.debug(transfusionAction.toString());
			int insertTransfusionAction=transfusionDao.insertTransfusionAction(transfusionAction);
			
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
		logger.debug("*********  transfusionDaoTest End ***********");
	}
}
