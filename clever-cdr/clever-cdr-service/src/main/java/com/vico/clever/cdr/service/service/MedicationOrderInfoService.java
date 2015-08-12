package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.MedcationOrderInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.MedcationOrder;
import com.vico.clever.cdr.service.model.MedcationOrderStatus;

public class MedicationOrderInfoService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult medicationOrderInfoExtract(
			MedcationOrder medicationOrder,
			MedcationOrderStatus medicationOrderStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		MedcationOrderInfoDao medcationOrderDao = sqlSession
				.getMapper(MedcationOrderInfoDao.class);
		try {
			// check if there has existed a record before insert a new record ;
			String medcationOrderID = medicationOrder.getMedicationOrderID();
			MedcationOrder medicationOrderFind = medcationOrderDao
					.selectMedcationOrder(medcationOrderID);
			if (medicationOrderFind == null
					|| medicationOrderFind.getMedicationOrderID() == "") {
				int insert = medcationOrderDao
						.insertMedcationOrder(medicationOrder);
			} else if (medicationOrderFind != null
					&& medicationOrderFind.getMedicationOrderID() != "") {
				int update = medcationOrderDao
						.updateMedcationOrder(medicationOrder);
			}
			// insert medicationOrderStatus

			int i = medcationOrderDao
					.insertMedcationOrderStatus(medicationOrderStatus);

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
	public IntegrationResult updateMedicationOrderStatus(MedcationOrderStatus medicationOrderStatus){
		IntegrationResult integrationResult=new IntegrationResult();
		SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		MedcationOrderInfoDao medOrderDao=sqlSession.getMapper(MedcationOrderInfoDao.class);
		try {
			int i=medOrderDao.insertMedcationOrderStatus(medicationOrderStatus);
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
			integrationResult.setResultCode(IntegrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(IntegrationResult.SUCCESSDESC);
		} catch (Exception e) {
			logger.error(e.toString());
			integrationResult.setResultCode(IntegrationResult.INTERNALERROR);
			integrationResult.setResultDesc(IntegrationResult.INTERNALDESC+e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		} finally {
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		return integrationResult;
	}
}
