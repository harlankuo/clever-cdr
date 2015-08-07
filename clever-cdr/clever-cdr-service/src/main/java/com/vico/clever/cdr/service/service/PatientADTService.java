/**
 * 
 */
package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PatientAdtDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientADTInfo;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

/**
 * @author Yuan.Ziyang
 *
 */
public class PatientADTService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult insertPatADTA01Info(PatientInfo patientInfo,
			PatientAdmission patientAdmission,PatientADTInfo patientADTInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  InsertPatientAdmission Start ***********");
		
		/*
		 * input object data integrity checking
		 * 
		 *  add object.ValidateData() method
		 *  
		 * */
		
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			String patientId=patientInfo.getPatientID();
			int countPatInfo=patientAdtDao.selectCountPatInfo(patientId);
			if(countPatInfo>0){
				int update=patientAdtDao.updatePatInfoByPatId(patientInfo);
			}else{
				int insert = patientAdtDao.insertPatientInfo(patientInfo);
			}
			String visitId=patientAdmission.getVisitID();
			int countVisit=patientAdtDao.selectCountPatVisit(visitId);
			if(countVisit>0){
				int update=patientAdtDao.updatePatVisitInfo(patientAdmission);
			}else{
				int insert=patientAdtDao.insertPatientAdmission(patientAdmission);
			}
			
			int k =patientAdtDao.insertPatTransferInfo(patientADTInfo);
			
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
	
	public IntegrationResult updatePatientInfoById(PatientInfo patientInfo){
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
	public PatientInfo getPatientInfoById(String patientId){
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
	public IntegrationResult deletePatientInfoById(String patientId){
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
}
