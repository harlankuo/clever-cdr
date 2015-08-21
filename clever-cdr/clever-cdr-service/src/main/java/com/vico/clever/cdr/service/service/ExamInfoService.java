package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.ExamInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.ExamDataInfo;
import com.vico.clever.cdr.service.model.ExamItem;
import com.vico.clever.cdr.service.model.ExamReportInfo;
import com.vico.clever.cdr.service.model.ExamReqInfo;
import com.vico.clever.cdr.service.model.ExamStatus;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class ExamInfoService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult examReqInfoExtract(ExamReqInfo examReqInfo,
			List<ExamItem> examItemList, ExamStatus examStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ExamInfoDao examInfoDao = sqlSession.getMapper(ExamInfoDao.class);
		try {
			String examReqID = examReqInfo.getExamReqID();
			ExamReqInfo examReqFind = examInfoDao.selectExamReqInfo(examReqID);
			if (examReqFind == null || examReqFind.getExamReqID() == "") {
				logger.debug("未找到对应的检查申请表记录，申请单号：" + examReqID);
				int insertExamReq = examInfoDao.insertExamReqInfo(examReqInfo);
				logger.debug("插入新检查申请单记录：" + insertExamReq);
				int insertExamItem = examInfoDao
						.insertExamItemList(examItemList);
				logger.debug("批量插入检查项目信息：" + insertExamItem);

			} else if (examReqFind != null && examReqFind.getExamReqID() != "") {
				logger.debug("找到已有的检查申请单，申请单号：" + examReqID);
				int updateExamReq = examInfoDao.updateExamReqInfo(examReqInfo);
				logger.debug("更新已有的检查申请单信息：" + updateExamReq);
				int deleteExamItem = examInfoDao.deleteExamItem(examReqID);
				logger.debug("删除啊已有的检查项目信息：" + deleteExamItem);
				int insertExamItem = examInfoDao
						.insertExamItemList(examItemList);
				logger.debug("插入新的检查项目信息：" + insertExamItem);
			}
			int insertExamStatus = examInfoDao.insertExamStatus(examStatus);
			logger.debug("插入检查申请状态信息：" + insertExamStatus);
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

	public IntegrationResult examArrangeMent(List<ExamItem> examItemList,
			ExamStatus examStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ExamInfoDao examInfoDao = sqlSession.getMapper(ExamInfoDao.class);
		try {
			String examReqID = examItemList.get(0).getExamReqID();
			logger.debug("检查预约，检查申请号：" + examReqID);
			int deleteExamItem = examInfoDao.deleteExamItem(examReqID);
			logger.debug("删除已有检查项目信息：" + deleteExamItem);
			int insertExamItem = examInfoDao.insertExamItemList(examItemList);
			logger.debug("插入带有检查预约信息的检查项目信息：" + insertExamItem);
			int insertExamStatus = examInfoDao.insertExamStatus(examStatus);
			logger.debug("插入检查申请状态信息：" + insertExamStatus);
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

	public IntegrationResult examDataExtract(List<ExamDataInfo> examDataList,
			ExamStatus examStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ExamInfoDao examInfoDao = sqlSession.getMapper(ExamInfoDao.class);
		try {
			/*
			 * delete all exam data records before insert exam data info
			 */
			String examID = examDataList.get(0).getExamID();

			int deleteExamData = examInfoDao.deleteExamData(examID);
			logger.debug("examID:" + examID + ",删除已有的检查数据：" + deleteExamData);
			int insertExamData = examInfoDao.insertExamDataList(examDataList);
			logger.debug("批量插入检查数据新纪录：" + insertExamData);
			int insertExamStatus = examInfoDao.insertExamStatus(examStatus);
			logger.debug("插入检查状态变更记录：" + insertExamStatus);

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

	public IntegrationResult examReportExtract(ExamReportInfo examReportInfo,
			ExamStatus examStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ExamInfoDao examInfoDao = sqlSession.getMapper(ExamInfoDao.class);
		try {
			// delete all exam report records before insert new exam report info

			String examID = examReportInfo.getExamID();
			logger.debug("检查号：" + examID);
			int deleteExamReport = examInfoDao.deleteExamReportInfo(examID);
			logger.debug("删除已有检查报告记录：" + deleteExamReport);
			int insertExamReport = examInfoDao.insertExamReport(examReportInfo);
			logger.debug("插入新检查报告记录：" + insertExamReport);
			int insertExamStatus = examInfoDao.insertExamStatus(examStatus);
			logger.debug("插入检查状态变更记录：" + insertExamStatus);

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

	public IntegrationResult updateExamStatus(ExamStatus examStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ExamInfoDao examInfoDao = sqlSession.getMapper(ExamInfoDao.class);
		try {
			// insert new exam status info record
			int insertExamStatus = examInfoDao.insertExamStatus(examStatus);
			logger.debug("插入检查状态变更记录：" + insertExamStatus);
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
