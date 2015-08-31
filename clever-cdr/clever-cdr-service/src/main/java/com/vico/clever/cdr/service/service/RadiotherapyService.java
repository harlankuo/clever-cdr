package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.RadiotherapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Radiotherapy;

public class RadiotherapyService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	public IntegrationResult radiotherapyExtract(Radiotherapy radiotherapy)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		RadiotherapyDao radiotherapyDao = sqlSession.getMapper(RadiotherapyDao.class);
		try{
			String radiotherapyID = radiotherapy.getRadiotherapyID();
			Radiotherapy radiotherapyTest = radiotherapyDao.selectRadiotherapy(radiotherapyID);
			
			if(radiotherapyTest ==null||radiotherapyTest.getRadiotherapyID()=="")
			{
				logger.debug("未找到相应的放射治疗"+radiotherapyID);
				int radiotherapyInsert = radiotherapyDao.insertRadiotherapy(radiotherapy);
				logger.debug("添加新的放射治疗"+radiotherapyInsert);
			}
			
			else if(radiotherapyTest!=null&&radiotherapyTest.getRadiotherapyID()!="")
			{
				logger.debug("找到相应的放射治疗"+radiotherapyID);
				int radiotherapyUpdate = radiotherapyDao.updateRadiotherapy(radiotherapy);
				logger.debug("更新放射治疗"+radiotherapyUpdate);
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
