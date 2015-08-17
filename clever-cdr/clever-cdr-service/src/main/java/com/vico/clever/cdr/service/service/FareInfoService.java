package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.FareInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.FareInfo;
import com.vico.clever.cdr.service.model.FareStatus;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class FareInfoService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult fareInfoExtract(FareInfo fareInfo, FareStatus fareStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		FareInfoDao fareDao=sqlSession.getMapper(FareInfoDao.class);
		try {
			//check if there already exists a sanme record in database
			String feeID=fareInfo.getFeeID();
			FareInfo fareInfoFind=fareDao.selectFareInfo(feeID);
			if(fareInfoFind==null||fareInfoFind.getFeeID()==""){
				logger.debug("未找到相同记录，费用申请号："+feeID);
				int insertFareInfo=fareDao.insertFareInfo(fareInfoFind);
				logger.debug("插入费用信息新记录："+insertFareInfo);
			}else{
				logger.debug("找到已有费用信息记录，费用申请号："+feeID);
				int deleteFareInfo=fareDao.deleteFareInfo(feeID);
				logger.debug("删除已有费用信息记录:"+deleteFareInfo);
				int insertFareInfo=fareDao.insertFareInfo(fareInfo);
				logger.debug("插入费用信息新纪录："+insertFareInfo);
			}
			//insert fare status info
			int insertFareStatus=fareDao.insertFareStatus(fareStatus);
			logger.debug("写入费用状态信息："+insertFareStatus);
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
	
	public IntegrationResult updateFareStatus(FareStatus fareStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		FareInfoDao fareDao=sqlSession.getMapper(FareInfoDao.class);
		try {
			int insertFareStatus=fareDao.insertFareStatus(fareStatus);
			logger.debug("写入费用状态信息："+insertFareStatus);
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
