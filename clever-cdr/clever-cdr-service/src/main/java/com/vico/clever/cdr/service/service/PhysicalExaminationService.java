package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PhysicalExaminationDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PhysicalExamination;

public class PhysicalExaminationService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult physicalExaminationExtract(PhysicalExamination  physicalExamination)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("******** SqlSession Open *******");
		PhysicalExaminationDao physicalExaminationDao = sqlSession.getMapper(PhysicalExaminationDao.class);
		try{
			
			String requestID = physicalExamination.getRequestID();
			
			PhysicalExamination physicalExaminationTest = physicalExaminationDao.selectPhysicalExamination(requestID);
			if(physicalExaminationTest == null || physicalExaminationTest.getRequestID()=="")
			{
				logger.debug("未找到相应的体检："+requestID);
				int physicalExaminationInsert = physicalExaminationDao.insertPhysicalExamination(physicalExamination);
				logger.debug("添加体检："+physicalExaminationInsert);
			}
			else if(physicalExaminationTest!=null&&physicalExaminationTest.getRequestID()!="")
			{
				logger.debug("找到相应的体检："+requestID);
				int physicalExaminationUpdate = physicalExaminationDao.updatePhysicalExamination(physicalExamination);
				logger.debug("更新体检："+physicalExaminationUpdate);
				
			}
			sqlSession.commit();
			logger.debug("******** SqlSession Commit *******");
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
			
		}
		catch(Exception e)
		{
			logger.debug(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC+e.toString());
			sqlSession.rollback();
			logger.debug("******** SqlSession Rollback *******");
		}
		finally{
			sqlSession.close();
			logger.debug("******** SqlSession Close *******");
		}
		return integrationResult;
		 
	}

}
