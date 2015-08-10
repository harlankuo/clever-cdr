package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.OrderInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.OrderInfo;
import com.vico.clever.cdr.service.model.OrderStatusInfo;
/**
 * This is the Patient ADT API in the CDR Restful APIs
 * 
 * @version 0.0.1
 * @author Yuan.Ziyang
 * 
 */
public class OrderInfoService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult insertOrderInfo(OrderInfo orderInfo, OrderStatusInfo orderStatusInfo){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */

		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		OrderInfoDao orderInfoDao = sqlSession.getMapper(OrderInfoDao.class);
		try {
			/*
			 * check if there has existed a record before insert a new record ;
			 * 
			 * */
			String orderID=orderInfo.getOrderID();
			int count=orderInfoDao.selectOrderInfoCount(orderID);
			if(count==0){
				int insert=orderInfoDao.insertOrderInfo(orderInfo);
			}else{
				//if exists a record ,execute update
				int update=orderInfoDao.updateOrderInfoByOrderId(orderInfo);
			}
			int insertOrderStatus=orderInfoDao.insertOrderStatusInfo(orderStatusInfo);
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
	/*
	 * when order status has changed ,insert a new record into the order status table
	 * 
	 * */
	public IntegrationResult updateOrderStatus(OrderStatusInfo orderStatusInfo){
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		OrderInfoDao orderInfoDao = sqlSession.getMapper(OrderInfoDao.class);
		try {
			int i=orderInfoDao.insertOrderStatusInfo(orderStatusInfo);
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
		} catch (Exception e){
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
