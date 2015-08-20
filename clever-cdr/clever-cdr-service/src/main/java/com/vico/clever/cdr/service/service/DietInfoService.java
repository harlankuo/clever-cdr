package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.DietInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Diet;
import com.vico.clever.cdr.service.model.DietAction;
import com.vico.clever.cdr.service.model.IntegrationResult;

/**
 * @author Yuan.Ziyang
 * 
 */
public class DietInfoService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult insertDietInfo(Diet diet, DietAction dietAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DietInfoDao dietDao = sqlSession.getMapper(DietInfoDao.class);
		try {
			// check if there exists a same record
			String dietID = diet.getDietID();
			Diet dietFind = dietDao.selectDiet(dietID);
			if (dietFind == null || dietFind.getDietID() == "") {
				logger.debug("未找到已有饮食申请记录，饮食申请号：" + dietID);
				int insertDiet = dietDao.insertDiet(diet);
				logger.debug("插入新纪录：" + insertDiet);
			} else {
				logger.debug("找到已有饮食申请记录，饮食申请号：" + dietID);
				int updateDiet = dietDao.updateDiet(diet);
				logger.debug("更新已有饮食申请记录：" + updateDiet);
			}
			// insert diet action info
			int insertDietAction = dietDao.insertDietAction(dietAction);
			logger.debug("插入饮食申请状态信息：" + insertDietAction);
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

	public IntegrationResult updateDiet(DietAction dietAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DietInfoDao dietDao = sqlSession.getMapper(DietInfoDao.class);
		try {
			int insertDietAction = dietDao.insertDietAction(dietAction);
			logger.debug("插入饮食申请状态信息：" + insertDietAction);
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
