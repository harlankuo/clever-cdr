package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.NewBornInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.NewBirthProcess;
import com.vico.clever.cdr.service.model.NewBornApgarScore;
import com.vico.clever.cdr.service.model.NewBornExamination;
import com.vico.clever.cdr.service.model.NewBornHearingScreeningRecords;
import com.vico.clever.cdr.service.model.NewBornMaster;
import com.vico.clever.cdr.service.model.NewBornOtherInformation;
import com.vico.clever.cdr.service.model.NewBornVaccinationRecords;

public class NewBornInfoService {
	protected final Logger logger = Logger.getLogger(this.getClass());

	public IntegrationResult newBorn(NewBornMaster newBornMaster) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newBornMaster.getNewBornID();
			NewBornMaster newBornMasterFind = newBornDao
					.selectNewBornMaster(newBornID);
			if (newBornMasterFind == null
					|| newBornMasterFind.getNewBornID() == "") {
				logger.debug("未找到新生儿主表记录，新生儿ID：" + newBornID);
				int insertNewBorn = newBornDao
						.insertNewBornMaster(newBornMaster);
				logger.debug("插入新生儿新记录：" + insertNewBorn);
			} else {
				logger.debug("找到已有新生儿记录，新生儿ID：" + newBornID);
				int deleteNewBorn = newBornDao.deleteNewBornMaster(newBornID);
				logger.debug("删除已有新生儿记录：" + deleteNewBorn);
				int insertNewBorn = newBornDao
						.insertNewBornMaster(newBornMaster);
				logger.debug("插入新生儿新记录：" + insertNewBorn);
			}
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

	public IntegrationResult newBirthProcess(NewBirthProcess newBirthProcess) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newBirthProcess.getNewBornID();
			logger.debug("新生儿出生过程记录写入，新生儿ID：" + newBornID);
			int insertNewBirthProcess = newBornDao
					.insertNewBirthProcess(newBirthProcess);
			logger.debug("插入新生儿出生过程记录：" + insertNewBirthProcess);
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

	public IntegrationResult newBornExamination(
			NewBornExamination newBornExamination) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newBornExamination.getNewBornID();
			logger.debug("新生儿出生后检查记录，新生儿ID：" + newBornID);
			int insertNewBornExam = newBornDao
					.insertNewBornExamination(newBornExamination);
			logger.debug("写入新生儿出生后检查记录：" + insertNewBornExam);
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

	public IntegrationResult newBornApgarScore(
			NewBornApgarScore newBornApgarScore) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newBornApgarScore.getNewBornID();
			logger.debug("新生儿柯氏评分记录，新生儿ID：" + newBornID);
			int insertNewBornApgarScore = newBornDao
					.insertNewBornApgarScore(newBornApgarScore);
			logger.debug("写入新生儿柯氏评分记录：" + insertNewBornApgarScore);
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

	public IntegrationResult newBornVaccinationRecords(
			NewBornVaccinationRecords newBornVaccinationRecords) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newBornVaccinationRecords.getNewBornID();
			logger.debug("新生儿疫苗接种记录，新生儿ID：" + newBornID);
			int insertNewBornApgarScore = newBornDao
					.insertNewBornVaccinationRecords(newBornVaccinationRecords);
			logger.debug("写入新生儿疫苗接种记录：" + insertNewBornApgarScore);
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

	public IntegrationResult newBornHearingScreeningRecords(
			NewBornHearingScreeningRecords newHearingScreeningRecords) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newHearingScreeningRecords.getNewBornID();
			logger.debug("新生儿听力筛查记录，新生儿ID：" + newBornID);
			int insertNewBornHearingScreeningRecords = newBornDao
					.insertNewBornHearingScreeningRecords(newHearingScreeningRecords);
			logger.debug("写入新生儿听力筛查记录：" + insertNewBornHearingScreeningRecords);
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

	public IntegrationResult newBornOtherInformation(
			NewBornOtherInformation newBornOtherInformation) {
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao = sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID = newBornOtherInformation.getNewBornID();
			logger.debug("新生儿其他信息记录，新生儿ID：" + newBornID);
			int insertNewBornHearingScreeningRecords = newBornDao
					.insertNewBornOtherInfo(newBornOtherInformation);
			logger.debug("写入新生儿其他信息记录：" + insertNewBornHearingScreeningRecords);
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
