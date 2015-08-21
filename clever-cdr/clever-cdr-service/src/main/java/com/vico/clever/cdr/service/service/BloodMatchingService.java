package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.BloodMatchingDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.BloodMatching;
import com.vico.clever.cdr.service.model.BloodMatchingAction;
import com.vico.clever.cdr.service.model.IntegrationResult;

/**
 * @author Yuan.Ziyang
 * 
 */
public class BloodMatchingService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult bloodMatching(BloodMatching bloodMatching,
			BloodMatchingAction bloodMatchingAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		BloodMatchingDao bloodMatchDao = sqlSession
				.getMapper(BloodMatchingDao.class);
		try {
			String bloodMatchingID = bloodMatching.getBloodMatchingID();
			BloodMatching bloodMatchingFind = bloodMatchDao
					.selectBloodMatching(bloodMatchingID);
			if (bloodMatchingFind == null
					|| bloodMatchingFind.getBloodMatchingID() == "") {
				logger.debug("未找到配血申请记录，配血申请号：" + bloodMatchingID);
				int insertBloodMatch = bloodMatchDao
						.insertBloodMatching(bloodMatching);
				logger.debug("插入新配血申请记录：" + insertBloodMatch);
			} else {
				logger.debug("找到已有配血申请记录，配血申请号：" + bloodMatchingID);
				int deleteBloodMatch = bloodMatchDao
						.deleteBloodMatching(bloodMatchingID);
				logger.debug("删除已有记录：" + deleteBloodMatch);
				int insertBloodMatch = bloodMatchDao
						.insertBloodMatching(bloodMatching);
				logger.debug("插入新配血申请记录：" + insertBloodMatch);
			}
			// insert blood match action information
			int insertBloodMatchAction = bloodMatchDao
					.insertBloodMatchingAction(bloodMatchingAction);
			logger.debug("插入配血申请状态信息：" + insertBloodMatchAction);

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

	public IntegrationResult updateBloodMatching(
			BloodMatchingAction bloodMatchingAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		BloodMatchingDao bloodMatchDao = sqlSession
				.getMapper(BloodMatchingDao.class);
		try {
			// insert blood match action information
			int insertBloodMatchAction = bloodMatchDao
					.insertBloodMatchingAction(bloodMatchingAction);
			logger.debug("插入配血申请状态信息：" + insertBloodMatchAction);

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
