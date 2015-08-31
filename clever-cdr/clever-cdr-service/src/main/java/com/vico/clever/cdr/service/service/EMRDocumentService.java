package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.EMRDocumentDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.EMRDocument;
import com.vico.clever.cdr.service.model.EMRDocumentAction;
import com.vico.clever.cdr.service.model.EMRDocumentDetails;
import com.vico.clever.cdr.service.model.IntegrationResult;
public class EMRDocumentService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	//病历档案信息录入
	public IntegrationResult emrDocumentExtract(EMRDocument emrDocument,List<EMRDocumentDetails> emrDocumentDetailsList,
			EMRDocumentAction emrDocumentAction)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		EMRDocumentDao emrDocumentDao = sqlSession.getMapper(EMRDocumentDao.class);
		try{
			String documentID = emrDocument.getDocumentID();
			EMRDocument emrDocumentFind = emrDocumentDao.selectEMRDocument(documentID);
			if(emrDocumentFind == null||emrDocumentFind.getDocumentID() == "")
			{
				logger.debug("未找到相应的病历档案，病历号为："+documentID);
				int emrDocumentInsert = emrDocumentDao.insertEMRDocument(emrDocument);
				logger.debug("添加新的病历档案记录："+emrDocumentInsert);
				int emrDocumentDetailInsert = emrDocumentDao.insertEMRDocumentDetails(emrDocumentDetailsList);
				logger.debug("添加新的病历档案细节:"+emrDocumentDetailInsert);
							
			}
			else if (emrDocumentFind != null&&emrDocumentFind.getDocumentID() != "") {
				logger.debug("找到相应的病历档案，病历号为："+documentID);
				int emrDocumentUpdate = emrDocumentDao.updateEMRDocument(emrDocument);
				logger.debug("更新相应的病历档案信息"+emrDocumentUpdate);
				int emrDocumentDetailDel = emrDocumentDao.deleteEMRDocumentDetails(documentID);
				logger.debug("删除该病历档案相应的细节"+emrDocumentDetailDel);
				int emrDocumentDetailInsert = emrDocumentDao.insertEMRDocumentDetails(emrDocumentDetailsList);
				logger.debug("添加该病历档案细节信息"+emrDocumentDetailInsert);				
			}
			
		    int emrDocumentActionInsert = emrDocumentDao.insertEMRDocumentAction(emrDocumentAction);
		    logger.debug("添加病历档案状态信息"+emrDocumentActionInsert);
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
   
	public IntegrationResult updateEMRDocumentAction(EMRDocumentAction emrDocumentAction)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		EMRDocumentDao emrDocumentDao = sqlSession.getMapper(EMRDocumentDao.class);
		
		try{
			int emrDocumentActionInsert = emrDocumentDao.insertEMRDocumentAction(emrDocumentAction);
			logger.debug("添加病历档案状态信息"+emrDocumentActionInsert);
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
		finally
		{
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");			
		}
		
		return integrationResult;
	}
	
}
