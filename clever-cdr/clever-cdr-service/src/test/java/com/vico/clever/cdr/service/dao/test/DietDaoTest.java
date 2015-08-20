package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.DietInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Diet;
import com.vico.clever.cdr.service.model.DietAction;

public class DietDaoTest {
	
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	
	@Test
	public void dietDaoTest(){
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DietInfoDao dietDao = sqlSession.getMapper(DietInfoDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="diet"+num;
			
			Diet diet=new Diet();
			diet.setAdministrationCode(param);
			diet.setAdministrationName(param);
			diet.setDietContent(param);
			diet.setDietID("diet-"+num);
			diet.setDosage(""+num);
			diet.setDosageUnit(param);
			diet.setFrequencyCount(num);
			diet.setFrequencyDescription(param);
			diet.setFrequencyInterval(num);
			diet.setFrequencyIntervalUnit(param);
			diet.setMemo(param);
			diet.setOrderID("order-"+num);
			diet.setPatientID("patient-"+num);
			diet.setPlannedExecDatetime(date);
			diet.setPlannedStopDatetime(date);
			diet.setVisitID("visit-"+num);
			logger.debug(diet.toString());
			int insertDiet=dietDao.insertDiet(diet);
			
			DietAction dietAction=new DietAction();
			dietAction.setActionDatetime(date);
			dietAction.setCareflowStepCode(param);
			dietAction.setCareflowStepName(param);
			dietAction.setCurStateCode(param);
			dietAction.setCurStateName(param);
			dietAction.setDietContent(param);
			dietAction.setDietID("diet-"+num);
			dietAction.setPatientID("patient-"+num);
			dietAction.setPerformDeptCode(param);
			dietAction.setPerformDeptName(param);
			dietAction.setPerformerCode(param);
			dietAction.setPerformerName(param);
			dietAction.setVisitID("visit-"+num);
			logger.debug(dietAction.toString());
			int insertDietAction=dietDao.insertDietAction(dietAction);
			
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
