package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.FollowUpVisitDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.FollowUpVisit;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class FollowUpVisitService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult followUpVisitExtract(FollowUpVisit followUpVisit)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("******** SqlSession Open *******");
		FollowUpVisitDao followUpVisitDao = sqlSession.getMapper(FollowUpVisitDao.class);
		try{
			String followUpID =  followUpVisit.getFollowUpID();
			FollowUpVisit followUpVisitTest = followUpVisitDao.selectFollowUpVisit(followUpID);
			if(followUpVisitTest == null || followUpVisitTest.getFollowUpID()=="")
			{
				logger.debug("未找到相应的随访："+followUpID);
				int followUpVisitInsert = followUpVisitDao.insertFollowUpVisit(followUpVisit);
				logger.debug("添加随访："+followUpVisitInsert);
				
			}
			else if(followUpVisitTest != null && followUpVisitTest.getFollowUpID()!="")
			{
				logger.debug("找到相应的随访："+followUpID);
				int followUpVisitUpdate = followUpVisitDao.updateFollowUpVisit(followUpVisit);
				logger.debug("更新该随访"+followUpVisitUpdate);
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
