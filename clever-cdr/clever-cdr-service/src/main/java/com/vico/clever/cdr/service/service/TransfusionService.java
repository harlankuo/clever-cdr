package com.vico.clever.cdr.service.service;
/**
 *@author Yuan.Ziyang 
 * 
 * 
 */
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.TransfusionDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Transfusion;
import com.vico.clever.cdr.service.model.TransfusionAction;

public class TransfusionService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult transfutionInfo(Transfusion transfusion,TransfusionAction transfusionAction){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
					.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		TransfusionDao transfusionDao=sqlSession.getMapper(TransfusionDao.class);
		try {
			String transfusionID=transfusion.getTransfusionID();
			Transfusion transfusionFind=transfusionDao.selectTransfusion(transfusionID);
			if(transfusionFind==null||transfusionFind.getTransfusionID()==""){
				logger.debug("未找到相同记录，输血申请号："+transfusionID);
				int insertTransfusion=transfusionDao.insertTransfusion(transfusion);
				logger.debug("插入新纪录："+insertTransfusion);
			}else{
				logger.debug("找到已有记录，输血申请号："+transfusionID);
				int updateTransfusion=transfusionDao.updateTransfusion(transfusion);
				logger.debug("更新已有记录："+updateTransfusion);
			}
			//插入输血状态信息
			int insertTransfusionAction=transfusionDao.insertTransfusionAction(transfusionAction);
			logger.debug("插入输血状态信息 :"+insertTransfusionAction);
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
		} catch (Exception e) {
			logger.error(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC
					+ e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		} finally {
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		return integrationResult;
	}
	
	public IntegrationResult updateTransfusion(TransfusionAction transfusionAction){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
					.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		TransfusionDao transfusionDao=sqlSession.getMapper(TransfusionDao.class);
		try {
			int insertTransfusionAction=transfusionDao.insertTransfusionAction(transfusionAction);
			logger.debug("插入输血状态信息 :"+insertTransfusionAction);
		} catch (Exception e) {
			logger.error(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC
					+ e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		} finally {
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		return integrationResult;
	}
}
