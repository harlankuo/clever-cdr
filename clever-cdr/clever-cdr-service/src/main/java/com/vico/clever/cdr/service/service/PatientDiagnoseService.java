/**
 * 
 */
package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PatientDiagnoseDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.ProblemDiagnosis;

/**
 * @author Yuan.Ziyang
 *
 */
public class PatientDiagnoseService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult insertProblemDiagnosis(
			ProblemDiagnosis problemDiagnosis) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientDiagnoseDao patientDiagDao = sqlSession
				.getMapper(PatientDiagnoseDao.class);
		try {
			String patientID = problemDiagnosis.getPatientID();
			String visitID = problemDiagnosis.getVisitID();
			int count = patientDiagDao.selectPatientDiagCount(patientID,
					visitID);
			if (count > 0) {
				int update = patientDiagDao
						.updatePatientDiagnose(problemDiagnosis);
				logger.debug("*********  updatePatientDiagnose  ***********");
			} else {
				int insert = patientDiagDao
						.insertPatientDiagnose(problemDiagnosis);
				logger.debug("*********  insertPatientDiagnose  ***********");
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

	public IntegrationResult updateProblemDiagnosis(
			ProblemDiagnosis problemDiagnosis) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientDiagnoseDao patientDiagDao = sqlSession
				.getMapper(PatientDiagnoseDao.class);
		try {
			int update = patientDiagDao.updatePatientDiagnose(problemDiagnosis);
			logger.debug("updatePatientDiagnose count : " + update);
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

	public IntegrationResult deleteProblemDiagnosis(String patientID,
			String visitID) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientDiagnoseDao patientDiagDao = sqlSession
				.getMapper(PatientDiagnoseDao.class);
		try {
			int delete = patientDiagDao.deletePatientDiagnose(patientID,
					visitID);
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
			logger.debug("deletePatientDiagnose count : " + delete);
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
