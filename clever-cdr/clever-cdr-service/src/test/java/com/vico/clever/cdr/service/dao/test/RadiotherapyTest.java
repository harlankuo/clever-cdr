package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.RadiotherapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Radiotherapy;
import com.vico.clever.cdr.service.service.RadiotherapyService;

public class RadiotherapyTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void radiotherapyTest()
	{
		logger.debug("*********  testRadiotherapyDao Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		RadiotherapyService radiotherapyService = new RadiotherapyService();
		RadiotherapyDao radiotherapyDao = sqlSession.getMapper(RadiotherapyDao.class);
		try{
			Random random = new Random();
			int num=random.nextInt(100);
			Date date=new Date();
			Radiotherapy radiotherapy = new Radiotherapy();
			radiotherapy.setAdverseReaction("adverseReaction"+num);
			radiotherapy.setAdverseReationDegree("DE"+num);
			radiotherapy.setClinicalComment("clinicalComment"+num);
			radiotherapy.setEndDatetime(date);
			radiotherapy.setOrderID("O"+num);
			radiotherapy.setOtherInfomation("Other");
			radiotherapy.setPatientID("P"+num);
			radiotherapy.setRadiotherapyCount(num);
			radiotherapy.setRadiotherapyID("Ra"+num);
			radiotherapy.setSite("身体");
			radiotherapy.setStartDatetime(date);
			radiotherapy.setTotalDose(num);
			radiotherapy.setTotalDoseUnit("m");
			radiotherapy.setVisitID("V"+num);
			
			//int radiotherapyInsert = radiotherapyDao.insertRadiotherapy(radiotherapy);
			//logger.debug("radiotherapyInsert"+radiotherapyInsert);
			//int radiotherapyUpdate = radiotherapyDao.updateRadiotherapy(radiotherapy);
			//logger.debug("radiotherapyUpdate"+radiotherapyUpdate);
			//sqlSession.commit();
			//logger.debug("*********  SqlSession Commit  ***********");
            sqlSession.close();
			
			logger.debug("********* SqlSession Closed*********");
			
			IntegrationResult integrationResult = radiotherapyService.radiotherapyExtract(radiotherapy);
			logger.debug(integrationResult.toString());
			
		}
		
		catch(Exception e)
		{
			logger.error(e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		}
		finally{
			sqlSession.close();
			
			logger.debug("********* SqlSession Closed*********");
		}
	}

}
