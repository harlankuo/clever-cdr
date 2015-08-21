package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.ConsultationDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Consultation;
import com.vico.clever.cdr.service.model.ConsultationAction;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class ConsultationService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult inserConsultationInfo(Consultation consultation,
			ConsultationAction consultationAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ConsultationDao consultationDao = sqlSession
				.getMapper(ConsultationDao.class);
		try {
			String consultRequestID = consultation.getConsultRequestID();
			Consultation consultationFind = consultationDao
					.selectConsultation(consultRequestID);
			if (consultationFind == null
					|| consultationFind.getConsultRequestID() == "") {
				logger.debug("未找到会诊申请记录，会诊申请号：" + consultRequestID);
				int insertConsultation = consultationDao
						.insertConsultation(consultation);
				logger.debug("插入会诊申请新纪录：" + insertConsultation);
			} else {
				logger.debug("找到已有会诊申请记录信息，会诊申请号：" + consultRequestID);
				int deleteConsultation = consultationDao
						.deleteConsultation(consultRequestID);
				logger.debug("删除已有会诊申请记录：" + deleteConsultation);
				int insertConsultation = consultationDao
						.insertConsultation(consultation);
				logger.debug("插入会诊申请新纪录：" + insertConsultation);
			}
			// insert consultation action info
			int insertConsultationAction = consultationDao
					.insertConsultationAction(consultationAction);
			logger.debug("写入会诊申请状态记录信息：" + insertConsultationAction);

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

	public IntegrationResult updateConsultationInfo(Consultation consultation,
			ConsultationAction consultationAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ConsultationDao consultationDao = sqlSession
				.getMapper(ConsultationDao.class);
		try {
			String consultRequestID = consultation.getConsultRequestID();
			Consultation consultationFind = consultationDao
					.selectConsultation(consultRequestID);
			if (consultationFind == null
					|| consultationFind.getConsultRequestID() == "") {
				logger.debug("未找到会诊申请记录，会诊申请号：" + consultRequestID);
				int insertConsultation = consultationDao
						.insertConsultation(consultation);
				logger.debug("插入会诊申请新纪录：" + insertConsultation);
			} else {
				logger.debug("找到已有会诊申请记录信息，会诊申请号：" + consultRequestID);
				int updateConsultation = consultationDao
						.updateConsultation(consultation);
				logger.debug("更新已有会诊申请记录：" + updateConsultation);
			}

			// insert consultation action info
			int insertConsultationAction = consultationDao
					.insertConsultationAction(consultationAction);
			logger.debug("写入会诊申请状态记录信息：" + insertConsultationAction);

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

	public IntegrationResult deleteConsultationInfo(String consultRequestID) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ConsultationDao consultationDao = sqlSession
				.getMapper(ConsultationDao.class);
		try {
			int deleteConsultation = consultationDao
					.deleteConsultation(consultRequestID);
			logger.debug("删除已有会诊申请记录：" + deleteConsultation);

			// insert consultation action info
			int deleteConsultationAction = consultationDao.deleteConsultationAction(consultRequestID);
			logger.debug("删除会诊申请状态记录信息：" + deleteConsultationAction);

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
