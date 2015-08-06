package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PatientAdtDao;
import com.vico.clever.cdr.service.entity.PatientAdmissionEntity;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

/**
 * Root resource (exposed at "patientAdt" path)
 */
@Path("patientAdt")
public class PatientAdtResource {

	protected final Logger logger = Logger.getLogger(this.getClass());

	@POST
	@Path("/patientAdmission")
	@Produces({ MediaType.APPLICATION_XML })
	public IntegrationResult insertPatientAdmission(
			PatientAdmissionEntity patientAdmissionEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  InsertPatientAdmission Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			PatientInfo patientInfo = patientAdmissionEntity.getPatientInfo();
			long i = patientAdtDao.insertPatientInfo(patientInfo);
			logger.debug("*********  patientInfo Inserted  ***********");

			PatientAdmission patientAdm = patientAdmissionEntity
					.getPatientAdmission();

			logger.debug("*********  patientAdmission Created  ***********");
			logger.debug(patientAdm.toString());
			long j = patientAdtDao.insertPatientAdmission(patientAdm);
			logger.debug("*********  patientAdmission Inserted  ***********");
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

	@GET
	@Path("/patientInfo")
	@Produces({ MediaType.APPLICATION_XML })
	public PatientInfo getPatientInfoByPatId(
			@QueryParam("patientId") String patientId) {
		logger.debug("*********  getPatientInfoByPatId Start ***********");
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

	@DELETE
	@Path("/patientInfo")
	@Produces({ MediaType.APPLICATION_XML })
	public IntegrationResult deletePatientInfoById(
			@QueryParam("patientId") String patientId) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  deletePatientInfoById Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao = sqlSession.getMapper(PatientAdtDao.class);
		try {
			int i = patientAdtDao.deletPatInfoByPatId(patientId);
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

	@PUT
	@Path("/patientInfo")
	@Produces({ MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_XML })
	public IntegrationResult updatePatiebtInfo(PatientInfo patientInfo) {
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("*********  deletePatientInfoById Start ***********");
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
