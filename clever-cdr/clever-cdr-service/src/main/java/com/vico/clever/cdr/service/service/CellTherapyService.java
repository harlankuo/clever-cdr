package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.CellTherapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.CellTherapy;
import com.vico.clever.cdr.service.model.CellTherapyInfusion;
import com.vico.clever.cdr.service.model.CellTherapyPreprocess;
import com.vico.clever.cdr.service.model.CellTherapyReaction;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class CellTherapyService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult cellTherapyExtract(CellTherapy cellTherapy,List<CellTherapyPreprocess> CellTherapyPreprocessList,
			List<CellTherapyInfusion> cellTherapyInfusionList,List<CellTherapyReaction> cellTherapyReactionList)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		CellTherapyDao cellTherapyDao = sqlSession.getMapper(CellTherapyDao.class);
		try{
			String requestID = cellTherapy.getRequestID();
			CellTherapy cellTherapyTest = new CellTherapy();
			cellTherapyTest = cellTherapyDao.selectCellTherapy(requestID);
			if(cellTherapyTest == null || cellTherapyTest.getRequestID()=="")
			{
				logger.debug("未找到相应的细胞治疗"+requestID);
				int insertCellTherapy = cellTherapyDao.insertCellTherapy(cellTherapy);
				logger.debug("添加细胞治疗"+insertCellTherapy);
				int insertCellTherapyPre = cellTherapyDao.insertCellTherapyPreprocess(CellTherapyPreprocessList);
				logger.debug("添加该细胞治疗的预处理"+insertCellTherapyPre);
				int insertCellTherapyInfusion = cellTherapyDao.insertCellTherapyInfusion(cellTherapyInfusionList);
				logger.debug("添加该细胞治疗的细胞输注"+insertCellTherapyInfusion);
				int insertCellTherapyReaction = cellTherapyDao.insertCellTherapyReaction(cellTherapyReactionList);
				logger.debug("添加该细胞治疗的细胞反应"+insertCellTherapyReaction);
			
			}
			else if(cellTherapyTest != null && cellTherapyTest.getRequestID()!="")
			{
				logger.debug("找到相应的细胞治疗"+requestID);
				int updateCellTherapy = cellTherapyDao.updateCellTherapy(cellTherapy);
				logger.debug("更新该细胞治疗记录："+updateCellTherapy);
				int cellTherapyPreDel = cellTherapyDao.deleteCellTherapyPreprocess(cellTherapyTest.getRequestID());
				int insertCellTherapyPre = cellTherapyDao.insertCellTherapyPreprocess(CellTherapyPreprocessList);
				logger.debug("添加该细胞治疗的预处理"+insertCellTherapyPre);
				int cellTherapyInfusiondel = cellTherapyDao.deleteCellTherapyInfusion(cellTherapyTest.getRequestID());
				int insertCellTherapyInfusion = cellTherapyDao.insertCellTherapyInfusion(cellTherapyInfusionList);
				logger.debug("添加该细胞治疗的细胞输注"+insertCellTherapyInfusion);
				int cellTherapyReactiondel = cellTherapyDao.deleteCellTherapyReaction(cellTherapyTest.getRequestID());
				int insertCellTherapyReaction = cellTherapyDao.insertCellTherapyReaction(cellTherapyReactionList);
				logger.debug("添加该细胞治疗的细胞反应"+insertCellTherapyReaction);
				
			}
			sqlSession.commit();
			logger.debug("********** SqlSession Commit **********");
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
					
		}
		catch(Exception e){
			logger.debug(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC
					+ e.toString());
			sqlSession.rollback();
			logger.debug("********** SqlSession  Rollback**********");
		}
		finally{
			sqlSession.close();
			logger.debug("********** SqlSession  Closed**********");
			
		}
		return integrationResult;
	}

}
