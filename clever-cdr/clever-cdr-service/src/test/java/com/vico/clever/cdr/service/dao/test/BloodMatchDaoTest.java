package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.BloodMatchingDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.BloodMatching;
import com.vico.clever.cdr.service.model.BloodMatchingAction;

public class BloodMatchDaoTest {
	
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	
	@Test
	public void bloodMatchDaoTest(){
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		BloodMatchingDao bloodMatchDao=sqlSession.getMapper(BloodMatchingDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="bloodM"+num;
			
			BloodMatching bloodMatching=new BloodMatching();
			bloodMatching.setAdministrationCode(param);
			bloodMatching.setAdministrationName(param);
			bloodMatching.setBloodMatchingContent(param);
			bloodMatching.setBloodMatchingID("bloodM-"+num);
			bloodMatching.setDosage(""+num);
			bloodMatching.setDosageUnit(param);
			bloodMatching.setMemo(param);
			bloodMatching.setOrderID("order-"+num);
			bloodMatching.setPatientID("patient-"+num);
			bloodMatching.setPlannedExecDatetime(date);
			bloodMatching.setPlannedStopDatetime(date);
			bloodMatching.setVisitID("visit-"+num);
			logger.debug(bloodMatching.toString());
			
			int insertBloodMatch=bloodMatchDao.insertBloodMatching(bloodMatching);
			
			BloodMatchingAction bloodMatchAction=new BloodMatchingAction();
			bloodMatchAction.setActionDatetime(date);
			bloodMatchAction.setBloodMatchingContent(param);
			bloodMatchAction.setBloodMatchingID("bloodM-"+num);
			bloodMatchAction.setCareflowStepCode(param);
			bloodMatchAction.setCareflowStepName(param);
			bloodMatchAction.setCurStateCode(param);
			bloodMatchAction.setCurStateName(param);
			bloodMatchAction.setMemo(param);
			bloodMatchAction.setPatientID("patient-"+num);
			bloodMatchAction.setPerformDeptCode(param);
			bloodMatchAction.setPerformDeptName(param);
			bloodMatchAction.setPerformerCode(param);
			bloodMatchAction.setPerformerName(param);
			bloodMatchAction.setVisitID("visit-"+num);
			logger.debug(bloodMatchAction.toString());
			
			int insertBloodMatchAction=bloodMatchDao.insertBloodMatchingAction(bloodMatchAction);
			
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
