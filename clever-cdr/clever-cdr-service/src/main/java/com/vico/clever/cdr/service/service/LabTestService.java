package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.LabTestInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.LabTestData;
import com.vico.clever.cdr.service.model.LabTestItem;
import com.vico.clever.cdr.service.model.LabTestReqInfo;
import com.vico.clever.cdr.service.model.LabTestStatus;

public class LabTestService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult labTestReqExtract(LabTestReqInfo labTestReqInfo,
			List<LabTestItem> labTestItemList, LabTestStatus labTestStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		LabTestInfoDao labTestDao = sqlSession.getMapper(LabTestInfoDao.class);
		try {
			String testReqID = labTestReqInfo.getTestReqID();
			LabTestReqInfo labTestReqFind = labTestDao
					.selectLabTestReqInfo(testReqID);
			if (labTestReqFind == null || labTestReqFind.getTestReqID() == "") {
				logger.debug("未找到对应的检验申请表记录，申请单号：" + testReqID);
				int insertLabTestReq = labTestDao
						.insertLabTestReqInfo(labTestReqInfo);
				logger.debug("插入新检验申请单记录：" + insertLabTestReq);
				int insertLabTestItem = labTestDao
						.insertLabTestItemList(labTestItemList);
				logger.debug("插入新检验申请项目信息：" + insertLabTestItem);

			} else if (labTestReqFind != null
					&& labTestReqFind.getTestReqID() != "") {
				logger.debug("找到对应的检验申请表记录，申请单号：" + testReqID);
				int updateLabTestReq = labTestDao
						.updateLabTestReqInfo(labTestReqInfo);
				logger.debug("更新对应的检验申请表记录：" + updateLabTestReq);
				int deleteLabTestItem = labTestDao.deleteLabTestItem(testReqID);
				logger.debug("删除已有的检验项目记录：" + deleteLabTestItem);
				int insertLabTestItem = labTestDao
						.insertLabTestItemList(labTestItemList);
				logger.debug("插入新的的检验项目记录：" + insertLabTestItem);
			}

			// insert lab test Status record
			int insertLabTestStatus = labTestDao
					.insertLabTestStatus(labTestStatus);
			logger.debug("插入检验申请状态信息：" + insertLabTestStatus);
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

	public IntegrationResult labTestDataExtract(
			List<LabTestData> labTestDataList, LabTestStatus labTestStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		LabTestInfoDao labTestDao = sqlSession.getMapper(LabTestInfoDao.class);
		try {
			String testReqID = labTestDataList.get(0).getTestReqID();
			int deleteLabTestData = labTestDao.deleteLabTestData(testReqID);
			logger.debug("删除已有的检验数据：" + deleteLabTestData);

			int insertLabTestData = labTestDao
					.insertLabTestDataList(labTestDataList);
			logger.debug("插入新的检验结果信息：" + insertLabTestData);

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
	
	public IntegrationResult labTestStatus(LabTestStatus labTestStatus){
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		LabTestInfoDao labTestDao = sqlSession.getMapper(LabTestInfoDao.class);
		try {
			//insert Lab Test Status info
			int insertLabTestStatus=labTestDao.insertLabTestStatus(labTestStatus);
			logger.debug("插入新的检验状态信息："+insertLabTestStatus);
			
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
