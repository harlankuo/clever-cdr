package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.EMRFirstPageDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.EMRFirstPage;
import com.vico.clever.cdr.service.model.EMRFirstPageAction;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class EMRFirstPageService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	public IntegrationResult emrFirstPageExtract(EMRFirstPage emrFirstPage,EMRFirstPageAction emrFirstPageAction)
	{
        IntegrationResult integrationResult = new IntegrationResult();
        SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		EMRFirstPageDao emrFirstPageDao = sqlSession.getMapper(EMRFirstPageDao.class);
		try{
			String emrFirstPageID = emrFirstPage.getEmrFirstPageID();
			EMRFirstPage emrFirstPageTest = new EMRFirstPage();
			emrFirstPageTest = emrFirstPageDao.selectEMRFirstPage(emrFirstPageID);
			if(emrFirstPageTest == null|| emrFirstPageTest.getEmrFirstPageID()=="")
			{
				logger.debug("未找到相应的病历首页，ID号为："+emrFirstPageID);
				int emrFirstPageInsert = emrFirstPageDao.insertEMRFirstPage(emrFirstPage);
				logger.debug("添加新的病历首页"+emrFirstPageInsert);
			}
			else if(emrFirstPageTest != null&& emrFirstPageTest.getEmrFirstPageID()!="")
			{
				logger.debug("找到相应的病历首页，ID号为："+emrFirstPageID);
				int emrFirstPageUpdate = emrFirstPageDao.updateEMRFirstPage(emrFirstPage);
				logger.debug("将相应的病历首页进行更新"+emrFirstPageUpdate);
			}
			
			int emrFirstPageActionInsert = emrFirstPageDao.insertEMRFirstPageAction(emrFirstPageAction);
			logger.debug("添加状态信息");
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
			
		}
		catch(Exception e)
		{
			logger.error(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC
					+ e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		}
		finally{
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
        return integrationResult;
	}
    
	 public IntegrationResult updateEMRFirstPageAction(EMRFirstPageAction emrFirstPageAction)
	 {
		 IntegrationResult integrationResult = new IntegrationResult();
		 SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		 logger.debug("*********  SqlSession Open  ***********");
		 EMRFirstPageDao emrFirstPageDao = sqlSession.getMapper(EMRFirstPageDao.class);
		 try{
			 int emrFirstPageActionInsert = emrFirstPageDao.insertEMRFirstPageAction(emrFirstPageAction);
			 logger.debug("状态变更");
			 integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			 integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
			 sqlSession.commit();
			 logger.debug("********** SqlSession Commit ***********");
		 }
		 catch(Exception e)
		 {
			 logger.debug(e.toString());
			 integrationResult.setResultCode(integrationResult.INTERNALERROR);
			 integrationResult.setResultDesc(integrationResult.INTERNALDESC+e.toString());
			 sqlSession.rollback();
			 logger.debug("*********  SqlSession Rollback  ***********");
			 
		 }
		 
		 finally{
			 sqlSession.close();
			 logger.debug("*********  SqlSession Closed  ***********"); 
		 }
		 return integrationResult;
	 }
}
