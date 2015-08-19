package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.NursingInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Nursing;
import com.vico.clever.cdr.service.model.NursingAction;

/**
 * @author Yuan.Ziyang
 */
public class NursingInfoService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult nursing(Nursing nursing,
			NursingAction nursingAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NursingInfoDao nursingDao = sqlSession.getMapper(NursingInfoDao.class);
		try {
			// check if there exists a same record
			String nursingID = nursing.getNursingID();
			Nursing nursingFind = nursingDao.selectNursingInfo(nursingID);
			if (nursingFind == null || nursingFind.getNursingID() == "") {
				logger.debug("未找到已有记录，护理号：" + nursingID);
				int insertNursing = nursingDao.insertNursingInfo(nursing);
				logger.debug("插入新纪录：" + insertNursing);
			} else {
				logger.debug("找到已有记录，护理号：" + nursingID);
				int deleteNursing = nursingDao.deleteNursingInfo(nursingID);
				logger.debug("删除已有记录：" + deleteNursing);
				int insertNursing = nursingDao.insertNursingInfo(nursing);
				logger.debug("插入新纪录：" + insertNursing);
			}

			// insert nursing action info
			int insertNursingAction = nursingDao
					.insertNursingAction(nursingAction);
			logger.debug("写入护理申请状态信息：" + insertNursingAction);

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

	public IntegrationResult updateNursing(NursingAction nursingAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NursingInfoDao nursingDao = sqlSession.getMapper(NursingInfoDao.class);
		try {
			// insert nursing action info
			int insertNursingAction = nursingDao
					.insertNursingAction(nursingAction);
			logger.debug("写入护理申请状态信息：" + insertNursingAction);

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
