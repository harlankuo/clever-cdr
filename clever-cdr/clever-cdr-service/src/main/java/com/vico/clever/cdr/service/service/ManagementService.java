package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.ManagementDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Management;
import com.vico.clever.cdr.service.model.ManagementAction;

/**
 * @author Yuan.Ziyang
 * 
 */
public class ManagementService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult management(Management management,
			ManagementAction managementAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ManagementDao managementDao = sqlSession.getMapper(ManagementDao.class);
		try {
			String managementID = management.getManagementID();
			Management managementFind = managementDao
					.selectManagement(managementID);
			if (managementFind == null
					|| managementFind.getManagementID() == "") {
				logger.debug("未找到管理申请信息记录，管理申请号：" + managementID);
				int insertManagement = managementDao
						.insertManagement(management);
				logger.debug("插入管理医嘱申请新记录:" + insertManagement);
			} else {
				logger.debug("找到已有管理医嘱申请记录，管理申请号：" + managementID);
				int deleteManagement = managementDao
						.deleteManagement(managementID);
				logger.debug("删除已有管理申请记录：" + deleteManagement);
				int insertManagement = managementDao
						.insertManagement(management);
				logger.debug("插入管理医嘱申请新记录:" + insertManagement);
			}
			// insert management action info
			int insertManagementAction = managementDao
					.insertManagementAction(managementAction);
			logger.debug("插入管理申请状态信息：" + insertManagementAction);
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

	public IntegrationResult updateManagement(ManagementAction managementAction) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ManagementDao managementDao = sqlSession.getMapper(ManagementDao.class);
		try {
			// insert management action info
			int insertManagementAction = managementDao
					.insertManagementAction(managementAction);
			logger.debug("插入管理申请状态信息：" + insertManagementAction);
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
