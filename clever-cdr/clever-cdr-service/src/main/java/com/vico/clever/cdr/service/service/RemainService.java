package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.RemainInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;

/**
 * @author Yuan.Ziyang
 * 
 */
public class RemainService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult remainRequest(Remain remain, RemainAction remainAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		RemainInfoDao remainDao = sqlSession.getMapper(RemainInfoDao.class);
		try {
			String requestID = remain.getRequestID();
			Remain remainFind = remainDao.selectRemain(requestID);
			if (remainFind == null || remainFind.getRequestID() == "") {
				logger.debug("未找到其他医嘱申请记录，申请号：" + requestID);
				int insertRemain = remainDao.insertRemain(remain);
				logger.debug("插入其他医嘱信息新纪录：" + insertRemain);
			} else {
				logger.debug("找到其他医嘱记录信息，申请号：" + requestID);
				int deleteRemain = remainDao.deleteRemain(requestID);
				logger.debug("删除已有的其他医嘱记录：" + deleteRemain);
				int insertRemain = remainDao.insertRemain(remain);
				logger.debug("插入其他医嘱信息新纪录：" + insertRemain);
			}
			// insert remain action info
			int insertRemainAction = remainDao.insertRemainAction(remainAction);
			logger.debug("插入其他医嘱状态信息：" + insertRemainAction);
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

	public IntegrationResult updateRemainAction(RemainAction remainAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		RemainInfoDao remainDao = sqlSession.getMapper(RemainInfoDao.class);
		try {
			// insert remain action info
			int insertRemainAction = remainDao.insertRemainAction(remainAction);
			logger.debug("插入其他医嘱状态信息：" + insertRemainAction);
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
