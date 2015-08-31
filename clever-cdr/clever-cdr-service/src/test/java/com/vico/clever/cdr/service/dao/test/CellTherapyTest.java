package com.vico.clever.cdr.service.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.CellTherapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.CellTherapy;
import com.vico.clever.cdr.service.model.CellTherapyInfusion;
import com.vico.clever.cdr.service.model.CellTherapyPreprocess;
import com.vico.clever.cdr.service.model.CellTherapyReaction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.CellTherapyService;



public class CellTherapyTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void cellTherapyTest()
	{
		CellTherapyService cellTherapyService = new CellTherapyService();
		logger.debug("*********  testCellTherapyDao Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		CellTherapyDao cellTherapyDao = sqlSession.getMapper(CellTherapyDao.class);
	     try{
	    		Random random = new Random();
				int num=random.nextInt(100);;
				logger.debug("num");
				Date date=new Date();
				CellTherapy cellTherapy = new CellTherapy();
				cellTherapy.setCartAmount("car"+num);
				cellTherapy.setCartTransfectionEfficiency("fection"+num);
				cellTherapy.setCellTherapyType("CARt");
				cellTherapy.setInfusionAmount(num);
				cellTherapy.setInfusionAmountUnit("mml");
				cellTherapy.setOrderID("O"+num);
				cellTherapy.setPatientID("P0"+num);
				cellTherapy.setPerKgAmount("pek");
				cellTherapy.setPreprocessFlag("0");
				cellTherapy.setRequestID("Cell"+num);
				cellTherapy.setUnburdingFlag("0");
				cellTherapy.setVisitID("V"+num);
				//int cellThreapyInsert = cellTherapyDao.insertCellTherapy(cellTherapy);
			//	logger.debug("cellThreapyInsert:"+cellThreapyInsert);
				//int cellTherapyUpdate = cellTherapyDao.updateCellTherapy(cellTherapy);
			   // logger.debug("cellTherapyUpdate"+cellTherapyUpdate);
				
				//logger.debug("cellTherapy:"+cellTherapy.toString());
				//CellTherapy cellTherapySelect = cellTherapyDao.selectCellTherapy(cellTherapy.getRequestID());
				
				//logger.debug("cellTherapySelect:"+cellTherapySelect.toString());
				
			    List<CellTherapyPreprocess> CellTherapyPreprocessList  = new ArrayList<CellTherapyPreprocess>();
			    CellTherapyPreprocess cellTherapyPreprocess = new CellTherapyPreprocess();
			    cellTherapyPreprocess.setPreprocessDatetime(date);
			    cellTherapyPreprocess.setPreprocessSolution("processSultion");
			    cellTherapyPreprocess.setRequestID(cellTherapy.getRequestID());
			    cellTherapyPreprocess.setUnburdingDatetime(date);
			    cellTherapyPreprocess.setUnburdingSolution("unburdingSolution");
			    
			    CellTherapyPreprocessList.add(cellTherapyPreprocess);
			    
			 //   int cellTherapyProInsert = cellTherapyDao.insertCellTherapyPreprocess(CellTherapyPreprocessList);
			  //  logger.debug("cellTherapyProInsert:"+cellTherapyProInsert);
			    
				List<CellTherapyInfusion> cellTherapyInfusionList = new ArrayList<CellTherapyInfusion>() ;
				CellTherapyInfusion cellTherapyInfusion = new CellTherapyInfusion();
				cellTherapyInfusion.setAmount("A"+num);
				cellTherapyInfusion.setAmountUnit("unit");
				cellTherapyInfusion.setClassification("classification");
				cellTherapyInfusion.setDatetime(date);
				cellTherapyInfusion.setReaction("reaction");
				cellTherapyInfusion.setRequestID(cellTherapy.getRequestID());
				cellTherapyInfusion.setSequencyOfDay(num);
				cellTherapyInfusionList.add(cellTherapyInfusion);
				
			//	int cellTherapyInfusionInsert = cellTherapyDao.insertCellTherapyInfusion(cellTherapyInfusionList);
				//logger.debug("cellTherapyInfusionInsert"+cellTherapyInfusionInsert);
				
				
				
				List<CellTherapyReaction> cellTherapyReactionList =new ArrayList<CellTherapyReaction>();
				
				CellTherapyReaction cellTherapyReaction = new CellTherapyReaction();
				cellTherapyReaction.setReactionDispose("reactionDispose");
				cellTherapyReaction.setReactionLevel("L"+num);
				cellTherapyReaction.setReactionResult("result");
				cellTherapyReaction.setRequestID(cellTherapy.getRequestID());
				cellTherapyReactionList.add(cellTherapyReaction);
				CellTherapyReaction cellTherapyReaction1 = new CellTherapyReaction();
				cellTherapyReaction1.setReactionDispose("reactionDispose");
				cellTherapyReaction1.setReactionLevel("L"+num+"1");
				cellTherapyReaction1.setReactionResult("result");
				cellTherapyReaction1.setRequestID(cellTherapy.getRequestID());
				cellTherapyReactionList.add(cellTherapyReaction1);
				
				//int cellTherapyReactionInsert = cellTherapyDao.insertCellTherapyReaction(cellTherapyReactionList);
				//logger.debug("cellTherapyReactionInsert"+cellTherapyReactionInsert);
				
				cellTherapyReactionList = cellTherapyDao.selectCellTherapyReaction(cellTherapy.getRequestID());
				logger.debug(cellTherapyReactionList.toString());
				//IntegrationResult integrationResult = cellTherapyService.cellTherapyExtract(cellTherapy, CellTherapyPreprocessList, cellTherapyInfusionList, cellTherapyReactionList);
				//logger.debug(integrationResult.toString());
				sqlSession.commit();
				logger.debug("*********  SqlSession Commit  ***********");
				
				
	     }
	 	catch(Exception e)
			{
				logger.error(e.toString());
				sqlSession.rollback();
				logger.debug("*********  SqlSession Rollback  ***********");
			}
			finally{
				sqlSession.close();
				
				logger.debug("********* SqlSession Closed*********");
			}
	}

}
