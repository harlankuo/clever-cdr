package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.DisposeInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Dispose;
import com.vico.clever.cdr.service.model.DisposeAction;
import com.vico.clever.cdr.service.model.IntegrationResult;

/**
 * @author Yuan.Ziyang
 * 
 */
public class DisposeInfoService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult dispose(Dispose dispose,
			DisposeAction disposeAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DisposeInfoDao disposeDao = sqlSession.getMapper(DisposeInfoDao.class);
		try {
			String disposeID = dispose.getDisposeID();
			Dispose disposeFind = disposeDao.selectDispose(disposeID);
			if (disposeFind == null || disposeFind.getDisposeID() == "") {
				logger.debug("未找到处置医嘱记录，处置医嘱申请号：" + disposeID);
				int insertDispose = disposeDao.insertDispose(dispose);
				logger.debug("插入处置医嘱新纪录：" + insertDispose);
			} else {
				logger.debug("找到处置医嘱已有记录，处置申请号：" + disposeID);
				int deleteDispose = disposeDao.deleteDispose(disposeID);
				logger.debug("删除已有处置医嘱记录：" + deleteDispose);
				int insertDispose = disposeDao.insertDispose(dispose);
				logger.debug("插入处置医嘱新纪录：" + insertDispose);
			}
			// insert dispose action info
			int insertDisposeAction = disposeDao
					.insertDisposeAction(disposeAction);
			logger.debug("插入处置医嘱状态信息记录：" + insertDisposeAction);

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

	public IntegrationResult updateDispose(DisposeAction disposeAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		DisposeInfoDao disposeDao = sqlSession.getMapper(DisposeInfoDao.class);
		try {
			// insert dispose action info
			int insertDisposeAction = disposeDao
					.insertDisposeAction(disposeAction);
			logger.debug("插入处置医嘱状态信息记录：" + insertDisposeAction);

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
