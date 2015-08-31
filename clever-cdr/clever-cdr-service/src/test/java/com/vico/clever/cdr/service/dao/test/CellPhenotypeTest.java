package com.vico.clever.cdr.service.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.CellPhenotypeDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.CellPhenotype;
import com.vico.clever.cdr.service.model.CellPhenotypeValue;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.CellPhenotypeService;

public class CellPhenotypeTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void cellPhenotypeTest()
	{
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		CellPhenotypeDao cellPhenotypeDao = sqlSession.getMapper(CellPhenotypeDao.class);
        CellPhenotypeService cellPhenotypeService = new CellPhenotypeService();
		try{
			Date date = new Date();
			Random random = new Random();
			int num = random.nextInt(100);
			CellPhenotype cellPhenotype = new CellPhenotype();
			cellPhenotype.setCellPhenotypeID("CE"+num);
			cellPhenotype.setClassification("C"+num);
			cellPhenotype.setItems("Item"+num);
			cellPhenotype.setOrderID("O"+num);
			cellPhenotype.setPatientID("P"+num);
			cellPhenotype.setTestDatetime(date);
			cellPhenotype.setTestSample("Samp"+num);
			cellPhenotype.setVisitID("V"+num);
			
			List<CellPhenotypeValue> cellPhenotypeValueList = new ArrayList<CellPhenotypeValue>();
			
			CellPhenotypeValue cellPhenotypeValue = new CellPhenotypeValue();
			cellPhenotypeValue.setAbsoluteNO(num+"0");
			cellPhenotypeValue.setAccountLymphocytesPercentage("10");
			cellPhenotypeValue.setCellPhenotypeID(cellPhenotype.getCellPhenotypeID());
			cellPhenotypeValue.setName("Name"+num);
			cellPhenotypeValueList.add(cellPhenotypeValue);
			
		/*	int cellPhenotypeInsert = cellPhenotypeDao.insertCellPhenotype(cellPhenotype);
			logger.debug("cellPhenotypeInsert"+cellPhenotypeInsert);
			int cellPhenotypeUpdate = cellPhenotypeDao.updateCellPhenotype(cellPhenotype);
			logger.debug("cellPhenotypeUpdate"+cellPhenotypeUpdate);
			CellPhenotype cellPhenotypeTest = cellPhenotypeDao.selectCellPhenotype(cellPhenotype.getCellPhenotypeID());
			logger.debug(cellPhenotypeTest.toString());
			
			int cellPhenotypeValueInsert = cellPhenotypeDao.insertCellPhenotypeValue(cellPhenotypeValueList);
			logger.debug("cellPhenotypeValueInsert"+cellPhenotypeValueInsert);
			int cellPhenotypeValueDelete = cellPhenotypeDao.deleteCellPhenotypeValue(cellPhenotype.getCellPhenotypeID());
			logger.debug("cellPhenotypeValueDelete"+cellPhenotypeValueDelete);
			sqlSession.commit();
			logger.debug("********** SqlSession Commit **********"); */
			sqlSession.close();
			IntegrationResult integrationResult = cellPhenotypeService.cellPhenotypeExtract(cellPhenotype, cellPhenotypeValueList);
			logger.debug(integrationResult.toString());
			
		}
		catch(Exception e){
			logger.debug(e.toString());
			sqlSession.rollback();
			logger.debug("********** SqlSession  Rollback**********");
		}
		finally{
			sqlSession.close();
			logger.debug("********** SqlSession  Closed**********");
			
		}
	}

}
