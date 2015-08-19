package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.NursingInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Nursing;
import com.vico.clever.cdr.service.model.NursingAction;

public class NursingDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void nursingDaoTest(){
		logger.debug("*********  transfusionDaoTest Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NursingInfoDao nursingDao=sqlSession.getMapper(NursingInfoDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="nurse"+num;
			
			Nursing nursing=new Nursing();
			nursing.setAdministrationCode(param);
			nursing.setAdministrationName(param);
			nursing.setComment(param);
			nursing.setDosage(""+num);
			nursing.setDosageUnit(param);
			nursing.setFrequencyCount(num);
			nursing.setFrequencyDescription(param);
			nursing.setFrequencyInterval(num);
			nursing.setFrequencyIntervalUnit(param);
			nursing.setIssues(param);
			nursing.setNursingCategoryCode(param);
			nursing.setNursingCategoryName(param);
			nursing.setNursingID("nurid-"+num);
			nursing.setNursingItemType(param);
			nursing.setNursingLevel(param);
			nursing.setNursingObservationItem(param);
			nursing.setNursingObservationResult(param);
			nursing.setNursingOperation(param);
			nursing.setOrderID("orderid-"+num);
			nursing.setPatientID("patientID-"+num);
			nursing.setSuggest(param);
			nursing.setVisitID("visitID-"+num);
			logger.debug(nursing.toString());
			int insertNursing=nursingDao.insertNursingInfo(nursing);
			
			NursingAction nursingAction=new NursingAction();
			nursingAction.setActionDatetime(date);
			nursingAction.setCareflowStepCode(param);
			nursingAction.setCareflowStepName(param);
			nursingAction.setCurStateCode(param);
			nursingAction.setCurStateName(param);
			nursingAction.setNursingID("nurid-"+num);
			nursingAction.setOperation(param);
			nursingAction.setPatientID("patientID-"+num);
			nursingAction.setPerformDeptCode(param);
			nursingAction.setPerformDeptName(param);
			nursingAction.setPerformerCode(param);
			nursingAction.setPerformerName(param);
			nursingAction.setVisitID("visitID-"+num);
			logger.debug(nursingAction.toString());
			int insertNursAction=nursingDao.insertNursingAction(nursingAction);
			
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
