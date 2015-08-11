package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.OrderExecutePaperDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.OrderExecutePaper;
import com.vico.clever.cdr.service.model.OrderExecutePaperStatus;

public class OrderExcutePaperService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult orderExcute(OrderExecutePaper orderExecutePaper,OrderExecutePaperStatus orderExecutePaperStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		OrderExecutePaperDao orderExePaperDao=sqlSession.getMapper(OrderExecutePaperDao.class);
		try {
			//check if there has existed a record before insert a new record ;
			String orderExcuteID=orderExecutePaper.getOrderExcuteID();
			OrderExecutePaper orderExecutePaperFind=orderExePaperDao.selectOrderExecuteInfo(orderExcuteID);
			if(orderExecutePaperFind==null||orderExecutePaperFind.getOrderExcuteID()==""){
				int insert=orderExePaperDao.insertOrderExecuteInfo(orderExecutePaper);
			}else if(orderExecutePaperFind!=null&&orderExecutePaperFind.getOrderExcuteID()!=""){
				int update=orderExePaperDao.updateOrderExecuteInfo(orderExecutePaper);
			}
			
			//insert orderExecutePaperStatus
			int i=orderExePaperDao.insertOrderExecutePaperStatus(orderExecutePaperStatus);
			
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
	public IntegrationResult updateOrderExecute(OrderExecutePaperStatus orderExecutePaperStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		OrderExecutePaperDao orderExePaperDao=sqlSession.getMapper(OrderExecutePaperDao.class);
		try {
			//insert orderExecutePaperStatus
			int i=orderExePaperDao.insertOrderExecutePaperStatus(orderExecutePaperStatus);
			
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
}
