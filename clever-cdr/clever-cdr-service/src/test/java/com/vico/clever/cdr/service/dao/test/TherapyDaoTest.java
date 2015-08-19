package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.TherapyInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Therapy;
import com.vico.clever.cdr.service.model.TherapyAction;

public class TherapyDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void therapyDaoTest(){
		logger.debug("*********  therapyDaoTest Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		TherapyInfoDao therapyDao=sqlSession.getMapper(TherapyInfoDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="thera"+num;
			
			Therapy therapy=new Therapy();
			therapy.setAdministrationCode(param);
			therapy.setAdministrationName(param);
			therapy.setDosage(""+num);
			therapy.setDosageUnit(param);
			therapy.setFrequencyCount(num);
			therapy.setFrequencyDescription(param);
			therapy.setFrequencyInterval(num);
			therapy.setFrequencyIntervalUnit(param);
			therapy.setMemo(param);
			therapy.setOrderID("orderid-"+num);
			therapy.setPatientID("patient-"+num);
			therapy.setPlannedExecDatetime(date);
			therapy.setPlannedStopDatetime(date);
			therapy.setTherapyContent(param);
			therapy.setTherapyID("therapy-"+num);
			therapy.setVisitID("visitid-"+num);
			logger.debug(therapy.toString());
			int insertTherapy=therapyDao.insertTherapy(therapy);
			
			TherapyAction therapyAction=new TherapyAction();
			therapyAction.setActionDatetime(date);
			therapyAction.setCareflowStepCode(param);
			therapyAction.setCareflowStepName(param);
			therapyAction.setCurStateCode(param);
			therapyAction.setCurStateName(param);
			therapyAction.setPatientID("patient-"+num);
			therapyAction.setPerformDeptCode(param);
			therapyAction.setPerformDeptName(param);
			therapyAction.setPerformerCode(param);
			therapyAction.setPerformerName(param);
			therapyAction.setTherapyContent(param);
			therapyAction.setTherapyID("therapy-"+num);
			therapyAction.setVisitID("visitid-"+num);
			logger.debug(therapyAction.toString());
			
			int insertTherapyAction=therapyDao.insertTherapyAction(therapyAction);
			
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
		
	}
}
