package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.TherapyInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Therapy;
import com.vico.clever.cdr.service.model.TherapyAction;

/**
 * @author Yuan.Ziyang
 */
public class TherapyService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult therapyInfoExtract(Therapy therapy,
			TherapyAction therapyAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		TherapyInfoDao therapyDao = sqlSession.getMapper(TherapyInfoDao.class);
		try {
			// check if there exists a same record
			String therapyID = therapy.getTherapyID();
			Therapy therapyFind = therapyDao.selectTherapy(therapyID);
			if (therapyFind == null || therapyFind.getTherapyID() == "") {
				logger.debug("未找到已有记录，治疗申请号：" + therapyID);
				int insertTherapy = therapyDao.insertTherapy(therapy);
				logger.debug("插入治疗申请信息新纪录：" + insertTherapy);
			} else {
				logger.debug("找到已有治疗申请记录，治疗申请号：" + therapyID);
				int deleteTherapy = therapyDao.deleteTherapy(therapyID);
				logger.debug("删除已有治疗申请信息记录:" + deleteTherapy);
				int insertTherapy = therapyDao.insertTherapy(therapy);
				logger.debug("插入治疗申请信息新纪录：" + insertTherapy);
			}
			// insert therapy action info
			int insertTheraAction = therapyDao
					.insertTherapyAction(therapyAction);
			logger.debug("插入治疗申请状态信息：" + insertTheraAction);

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

	public IntegrationResult updateTherapyAction(TherapyAction therapyAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		TherapyInfoDao therapyDao = sqlSession.getMapper(TherapyInfoDao.class);
		try {
			int insertTheraAction = therapyDao
					.insertTherapyAction(therapyAction);
			logger.debug("插入治疗申请状态信息：" + insertTheraAction);

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
