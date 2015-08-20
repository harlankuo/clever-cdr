package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.ManagementDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Management;
import com.vico.clever.cdr.service.model.ManagementAction;

public class ManagementDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	
	@Test
	public void managementDaoTest(){
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ManagementDao managementDao=sqlSession.getMapper(ManagementDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="mngm"+num;
			
			Management management=new Management();
			management.setAdministrationCode(param);
			management.setAdministrationName(param);
			management.setDosage(""+num);
			management.setDosageUnit(param);
			management.setFrequencyCount(num);
			management.setFrequencyDescription(param);
			management.setFrequencyInterval(num);
			management.setFrequencyIntervalUnit(param);
			management.setManagementContent(param);
			management.setManagementID("mangm-"+num);
			management.setMemo(param);
			management.setOrderID("order-"+num);
			management.setPatientID("patient-"+num);
			management.setPlannedExecDatetime(date);
			management.setPlannedStopDatetime(date);
			management.setVisitID("visitid-"+num);
			logger.debug(management.toString());
			
			int insertManagement=managementDao.insertManagement(management);
			
			ManagementAction managementAction=new ManagementAction();
			managementAction.setActionDatetime(date);
			managementAction.setCareflowStepCode(param);
			managementAction.setCareflowStepName(param);
			managementAction.setCurStateCode(param);
			managementAction.setCurStateName(param);
			managementAction.setManagementContent(param);
			managementAction.setManagementID("mangm-"+num);
			managementAction.setPatientID("patient-"+num);
			managementAction.setPerformDeptCode(param);
			managementAction.setPerformDeptName(param);
			managementAction.setPerformerCode(param);
			managementAction.setPerformerName(param);
			managementAction.setVisitID("visitid-"+num);
			logger.debug(managementAction.toString());
			
			int insertManageAction=managementDao.insertManagementAction(managementAction);
			
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
