/**
 * 
 */
package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PatientAdtDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientTransferInfo;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientDischargeInfo;
import com.vico.clever.cdr.service.model.PatientInfo;

/**
 * This is the Patient ADT API in the CDR Restful APIs
 * 
 * @version 0.0.1
 * @author Yuan.Ziyang
 * 
 */
public class PatientADTService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult insertPatADTA01Info(PatientInfo patientInfo,
			PatientAdmission patientAdmission,
			PatientTransferInfo patientTransferInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  InsertPatientAdmission Start ***********");

		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */

		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			String patientId = patientInfo.getPatientID();
			int countPatInfo = patientAdtDao.selectCountPatInfo(patientId);
			if (countPatInfo > 0) {
				int update = patientAdtDao.updatePatInfoByPatId(patientInfo);
			} else {
				int insert = patientAdtDao.insertPatientInfo(patientInfo);
			}
			String visitId = patientAdmission.getVisitID();
			int countVisit = patientAdtDao.selectCountPatVisit(visitId);
			if (countVisit > 0) {
				int update = patientAdtDao.updatePatVisitInfo(patientAdmission);
			} else {
				int insert = patientAdtDao
						.insertPatientAdmission(patientAdmission);
			}

			int k = patientAdtDao.insertPatTransferInfo(patientTransferInfo);

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
		logger.debug("*********  InsertPatientAdmission End ***********");
		return integrationResult;
	}

	public IntegrationResult updatePatientInfoById(PatientInfo patientInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  updatePatientInfoById Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			String patientId = patientInfo.getPatientID();
			PatientInfo patientInfoExist = patientAdtDao
					.selectPatientInfo(patientId);
			if (patientInfoExist != null) {
				int update = patientAdtDao.updatePatInfoByPatId(patientInfo);
			} else {
				int insert = patientAdtDao.insertPatientInfo(patientInfo);
			}
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

	public PatientInfo getPatientInfoById(String patientId) {
		logger.debug("*********  getPatientInfoById Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		PatientInfo patientInfo = patientAdtDao.selectPatientInfo(patientId);
		sqlSession.commit();
		logger.debug("*********  SqlSession Commit  ***********");
		sqlSession.close();
		logger.debug("*********  SqlSession Close  ***********");
		return patientInfo;
	}

	public IntegrationResult deletePatientInfoById(String patientId) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  deletePatientInfoById Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			int i = patientAdtDao.deletePatInfoByPatId(patientId);
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
	 * insert a record when patient transfer information changed
	 */
	public IntegrationResult insertPatTransferInfo(
			PatientAdmission patientAdmission,
			PatientTransferInfo patientAdtInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			// 更新就诊表记录
			String visitId = patientAdmission.getVisitID();
			int countVisit = patientAdtDao.selectCountPatVisit(visitId);
			if (countVisit > 0) {
				int update = patientAdtDao.updatePatVisitInfo(patientAdmission);
				logger.debug("已有就诊信息，更新该就诊信息：" + update);
			} else {
				int insert = patientAdtDao
						.insertPatientAdmission(patientAdmission);
				logger.debug("没有就诊信息，新添加该就诊信息：" + insert);
			}
			int i = patientAdtDao.insertPatTransferInfo(patientAdtInfo);
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
	 * insert patient discharge and transfer information when patient discharged
	 * from hospital
	 */
	public IntegrationResult patientDischarge(
			PatientTransferInfo patientTransferInfo,
			PatientDischargeInfo patDischargeInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			int i = patientAdtDao.insertPatTransferInfo(patientTransferInfo);
			logger.debug("写入出院记录信息到专科表中：" + i);
			String patientID = patDischargeInfo.getPatientID();
			String visitId = patDischargeInfo.getVisitID();
			PatientDischargeInfo patDischargeInfoFind = patientAdtDao
					.selectPatientDischargeInfo(patientID, visitId);
			logger.debug("查询离院信息表是否已有记录，病人号：" + patientID + ",就诊号：" + visitId);
			if (patDischargeInfoFind == null
					|| patDischargeInfoFind.getVisitID() == "") {
				logger.debug("未找到离院记录");
				int insert = patientAdtDao
						.insertPatDisChargeInfo(patDischargeInfo);
				logger.debug("写入离院信息记录：" + insert);
			} else {
				logger.debug("找到该患者已有离院记录");
				int delete = patientAdtDao.deletePatDisCharge(patientID,
						visitId);
				logger.debug("删除已有离院患者记录：" + delete);
				int insert = patientAdtDao
						.insertPatDisChargeInfo(patDischargeInfo);
				logger.debug("写入患者新的离院信息记录：" + insert);
			}
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
	 * insert patient transfer info and delete patient discharge info when the
	 * patients cancel discharging from hospital
	 */
	public IntegrationResult patientDischargeCancel(
			PatientTransferInfo patientTransferInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			String patientId = patientTransferInfo.getPatientID();
			String visitId = patientTransferInfo.getVisitID();
			int i = patientAdtDao.deletePatDisCharge(patientId, visitId);
			int j = patientAdtDao.insertPatTransferInfo(patientTransferInfo);
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

	public PatientDischargeInfo getPatientDischargeInfoById(String patientId,
			String visitId) {
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		PatientDischargeInfo patientDischargeInfo = patientAdtDao
				.selectPatientDischargeInfo(patientId, visitId);
		sqlSession.commit();
		sqlSession.close();
		return patientDischargeInfo;
	}
}
