package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.RemainInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;

public class RemainDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void remianDaoTest(){
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		RemainInfoDao remainDao=sqlSession.getMapper(RemainInfoDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="remain"+num;
			
			Remain remain=new Remain();
			remain.setAdministrationCode(param);
			remain.setAdministrationName(param);
			remain.setDosage(""+num);
			remain.setDosageUnit(param);
			remain.setFrequencyDescription(param);
			remain.setFrequencyInterval(num);
			remain.setFrequencyIntervalUnit(param);
			remain.setFrequencyUnit(param);
			remain.setMemo(param);
			remain.setOrderContent(param);
			remain.setOrderID("order-"+num);
			remain.setPatientID("patient-"+num);
			remain.setPlannedExecDatetime(date);
			remain.setPlannedStopDatetime(date);
			remain.setRequestID("remain-"+num);
			remain.setVisitID("visit-"+num);
			logger.debug(remain.toString());
			
			int insertRemain=remainDao.insertRemain(remain);
			
			RemainAction remainAction=new RemainAction();
			remainAction.setActionDatetime(date);
			remainAction.setCareflowStepCode(param);
			remainAction.setCareflowStepName(param);
			remainAction.setCurStateCode(param);
			remainAction.setCurStateName(param);
			remainAction.setMemo(param);
			remainAction.setOrderContent(param);
			remainAction.setPatientID("patient-"+num);
			remainAction.setPerformDeptCode(param);
			remainAction.setPerformDeptName(param);
			remainAction.setPerformerCode(param);
			remainAction.setPerformerName(param);
			remainAction.setRequestID("remain-"+num);
			remainAction.setVisitID("visit-"+num);
			logger.debug(remainAction.toString());
			
			int insertRemainAction=remainDao.insertRemainAction(remainAction);
			
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
