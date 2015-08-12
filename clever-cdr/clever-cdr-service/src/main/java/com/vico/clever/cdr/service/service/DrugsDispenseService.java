package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.DrugsDispenseDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.DrugDispenseReqStatus;
import com.vico.clever.cdr.service.model.DrugDispensingReq;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class DrugsDispenseService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult drugDispenseInfoExtract(DrugDispensingReq drugDispensingReq,DrugDispenseReqStatus drugDispenseReqStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DrugsDispenseDao drugsDispenseDao=sqlSession.getMapper(DrugsDispenseDao.class);
		try {
			// check if there has existed a record before insert a new record ;
			String drugDispensingReqID=drugDispensingReq.getDrugDispensingReqID();
			DrugDispensingReq drugDispReqFind=drugsDispenseDao.selectDrugDispenseReq(drugDispensingReqID);
			if(drugDispReqFind==null||drugDispReqFind.getDrugDispensingReqID()==""){
				int insert=drugsDispenseDao.insertDrugDispenseReq(drugDispensingReq);
				logger.debug("未查到摆药申请单，新增申请表记录");
			} else if (drugDispReqFind!=null&&drugDispReqFind.getDrugDispensingReqID()!=""){
				int update=drugsDispenseDao.updateDrugDispenseReq(drugDispensingReq);
				logger.debug("找到已有申请单记录，更新申请单信息，申请单号："+drugDispensingReqID);
			}
			logger.info("写入摆药申请状态表记录");
			int i=drugsDispenseDao.insertDrugDispenseReqStatus(drugDispenseReqStatus);
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
	
	public IntegrationResult updateDrugDispenseReqStatus(DrugDispenseReqStatus drugDispenseReqStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DrugsDispenseDao drugsDispenseDao=sqlSession.getMapper(DrugsDispenseDao.class);
		try {
			int i=drugsDispenseDao.insertDrugDispenseReqStatus(drugDispenseReqStatus);
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
