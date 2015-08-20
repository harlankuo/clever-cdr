package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.DisposeInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Dispose;
import com.vico.clever.cdr.service.model.DisposeAction;

public class DisposeDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	
	@Test
	public void disposeDaoTest(){
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DisposeInfoDao disposeDao=sqlSession.getMapper(DisposeInfoDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="dispo"+num;
			
			Dispose dispose=new Dispose();
			dispose.setAdministrationCode(param);
			dispose.setAdministrationName(param);
			dispose.setDisposeContent(param);
			dispose.setDisposeID("dispose-"+num);
			dispose.setDosage(""+num);
			dispose.setDosageUnit(param);
			dispose.setFrequencyDescription(""+num);
			dispose.setFrequencyInterval(num);
			dispose.setFrequencyIntervalUnit(param);
			dispose.setFrequencyUnit(param);
			dispose.setMemo(param);
			dispose.setOrderID("order-"+num);
			dispose.setPatientID("patient-"+num);
			dispose.setPlannedExecDatetime(date);
			dispose.setPlannedStopDatetime(date);
			dispose.setVisitID("visitid-"+num);
			logger.debug(dispose.toString());
			
			int insertDispose=disposeDao.insertDispose(dispose);
			logger.debug("[insertDispose] :"+insertDispose);
			DisposeAction disposeAction=new DisposeAction();
			disposeAction.setActionDatetime(date);
			disposeAction.setCareflowStepCode(param);
			disposeAction.setCareflowStepName(param);
			disposeAction.setCurStateCode(param);
			disposeAction.setCurStateName(param);
			disposeAction.setDisposeContent(param);
			disposeAction.setDisposeID("dispose-"+num);
			disposeAction.setMemo(param);
			disposeAction.setPatientID("patient-"+num);
			disposeAction.setPerformDeptCode(param);
			disposeAction.setPerformDeptName(param);
			disposeAction.setPerformerCode(param);
			disposeAction.setPerformerName(param);
			disposeAction.setVisitID("visit-"+num);
			logger.debug(disposeAction.toString());
			
			int insertDisposeAction=disposeDao.insertDisposeAction(disposeAction);
			logger.debug("[insertDisposeAction] :"+insertDisposeAction);
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
