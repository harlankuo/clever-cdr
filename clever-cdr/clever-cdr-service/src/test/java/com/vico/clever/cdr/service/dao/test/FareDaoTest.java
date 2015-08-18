package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.FareInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.FareInfo;
import com.vico.clever.cdr.service.model.FareStatus;

public class FareDaoTest {
	
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	
	@Test
	public void testFareDao(){
		logger.debug("*********  testFareDao Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		FareInfoDao fareDao=sqlSession.getMapper(FareInfoDao.class);
		try {
			FareInfo fare=new FareInfo();
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="fare"+num;
			fare.setAdministration(param);
			fare.setAdministrationCode(param);
			fare.setDosage(param);
			fare.setDosageUnit(param);
			fare.setFeeContent(param);
			fare.setFeeID("fee-"+num);
			fare.setMemo(param);
			fare.setOrderID(param);
			fare.setPatientID("M0000"+num);
			fare.setVisitID("visitId-"+num);
			logger.debug(fare.toString());
			
			int insertFare=fareDao.insertFareInfo(fare);
			
			FareStatus fareStatus=new FareStatus();
			fareStatus.setCareflowStepCode(param);
			fareStatus.setCareflowStepName(param);
			fareStatus.setCurStateCode(param);
			fareStatus.setCurStateName(param);
			fareStatus.setFeeContent(param);
			fareStatus.setFeeID("fee-"+num);
			fareStatus.setMemo(param);
			fareStatus.setPatientID("M0000"+num);
			fareStatus.setPerformDateTime(date);
			fareStatus.setPerformDeptCode(param);
			fareStatus.setPerformDeptName(param);
			fareStatus.setPerformDoctorCode(param);
			fareStatus.setPerformDoctorName(param);
			fareStatus.setVisitID("visitId-"+num);
			
			int insertFareStatus=fareDao.insertFareStatus(fareStatus);
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
		logger.debug("*********  testFareDao End ***********");

	}
}
