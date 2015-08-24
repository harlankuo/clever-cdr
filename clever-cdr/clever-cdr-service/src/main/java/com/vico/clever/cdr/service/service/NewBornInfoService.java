package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.NewBornInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.NewBornMaster;

public class NewBornInfoService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult newBorn(NewBornMaster newBornMaster){
		IntegrationResult integrationResult = new IntegrationResult();
		/*
		 * input object data integrity checking
		 * 
		 * add object.ValidateData() method
		 */
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao=sqlSession.getMapper(NewBornInfoDao.class);
		try {
			String newBornID=newBornMaster.getNewBornID();
			NewBornMaster newBornMasterFind=newBornDao.selectNewBornMaster(newBornID);
			if(newBornMasterFind==null||newBornMasterFind.getNewBornID()==""){
				logger.debug("未找到新生儿主表记录，新生儿ID："+newBornID);
				int insertNewBorn=newBornDao.insertNewBornMaster(newBornMaster);
				logger.debug("插入新生儿新记录："+insertNewBorn);
			}else{
				logger.debug("找到已有新生儿记录，新生儿ID："+newBornID);
				int deleteNewBorn=newBornDao.deleteNewBornMaster(newBornID);
				logger.debug("删除已有新生儿记录："+deleteNewBorn);
				int insertNewBorn=newBornDao.insertNewBornMaster(newBornMaster);
				logger.debug("插入新生儿新记录："+insertNewBorn);
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
}
