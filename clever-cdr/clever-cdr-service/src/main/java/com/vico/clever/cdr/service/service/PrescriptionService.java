package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PrescriptionInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PrescriptionDetail;
import com.vico.clever.cdr.service.model.PrescriptionInfo;
import com.vico.clever.cdr.service.model.PrescriptionStatus;

public class PrescriptionService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult prescriptionInfoExtract(
			PrescriptionInfo prescriptionInfo,
			List<PrescriptionDetail> prescriptionDetailList,
			PrescriptionStatus prescriptionStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PrescriptionInfoDao prescInfoDao=sqlSession.getMapper(PrescriptionInfoDao.class);
		try {
			// check if there has existed a record before insert a new record ;
			String prescriptionID=prescriptionInfo.getPresciptionID();
			PrescriptionInfo prescInfoFind=prescInfoDao.selectPrescriptionInfo(prescriptionID);
			if(prescInfoFind==null||prescInfoFind.getPresciptionID()==""){
				logger.info("未找到处方记录");
				int insert = prescInfoDao.insertPrescriptionInfo(prescriptionInfo);
				logger.info("写入处方申请表 ： "+insert);
				int insertPrescDetail=prescInfoDao.insertPrescriptionDetailList(prescriptionDetailList);
				logger.info("写入处方细节表 ： "+insertPrescDetail);
				
			}else if (prescInfoFind!=null&&prescInfoFind.getPresciptionID()!=""){
				logger.info("找到已有处方记录");
				int update = prescInfoDao.updatePrescriptionInfo(prescriptionInfo);
				logger.info("更新处方申请表记录 ： "+update);
				int deletePrescDetail=prescInfoDao.deletePrescriptionDetail(prescriptionID);
				logger.info("先删除处方细节表记录 : "+deletePrescDetail);
				int insertPrescDetail=prescInfoDao.insertPrescriptionDetailList(prescriptionDetailList);
				logger.info("再写入新处方细节表记录 : "+insertPrescDetail);
			}
			
			int insertPrescStatus=prescInfoDao.insertPrescriptionStatus(prescriptionStatus);
			logger.info("写入处方状态表记录 : "+insertPrescStatus);
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
	
	public IntegrationResult updatePrescStatus(PrescriptionStatus prescriptionStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PrescriptionInfoDao prescInfoDao=sqlSession.getMapper(PrescriptionInfoDao.class);
		try {
			int insert=prescInfoDao.insertPrescriptionStatus(prescriptionStatus);
			logger.info("插入处方状态表信息 ： "+insert);
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
