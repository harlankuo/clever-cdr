package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.EpigeneticTyerapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.EpigeneticTyerapy;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class EpigeneticTyerapyService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	public IntegrationResult epigeneticTyerapyExtract(EpigeneticTyerapy  epigeneticTyerapy)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		EpigeneticTyerapyDao epigeneticTyerapyDao =sqlSession.getMapper(EpigeneticTyerapyDao.class);
		try{
			
			String epigeneticTherapyID = epigeneticTyerapy.getEpigeneticTherapyID();
			EpigeneticTyerapy epigeneticTyerapyTest = epigeneticTyerapyDao.selectEpigeneticTyerapy(epigeneticTherapyID);
			if(epigeneticTyerapyTest == null ||epigeneticTyerapyTest.getEpigeneticTherapyID()=="")
			{
				logger.debug("未找到相应的表现治疗"+epigeneticTherapyID);
				int epigeneticTyerapyInsert = epigeneticTyerapyDao.insertEpigeneticTyerapy(epigeneticTyerapy);
				logger.debug("epigeneticTyerapyInsert"+epigeneticTyerapyInsert);
			}
			else if(epigeneticTyerapyTest!=null&&epigeneticTyerapyTest.getEpigeneticTherapyID()!="")
			{
				logger.debug("找到相应的表现治疗"+epigeneticTherapyID);
				int epigeneticTyerapyUpdate = epigeneticTyerapyDao.updateEpigeneticTyerapy(epigeneticTyerapy);
				logger.debug("epigeneticTyerapyUpdate"+epigeneticTyerapyUpdate);
			}
			sqlSession.commit();
			logger.debug("********** SqlSession Commit **********");
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
		}
		catch(Exception e){
			logger.debug(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC
					+ e.toString());
			sqlSession.rollback();
			logger.debug("********** SqlSession  Rollback**********");
		}
		finally{
			sqlSession.close();
			logger.debug("********** SqlSession  Closed**********");
			
		}
		return integrationResult;
	}

}
