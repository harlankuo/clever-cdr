package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.CellPhenotypeDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.CellPhenotype;
import com.vico.clever.cdr.service.model.CellPhenotypeValue;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class CellPhenotypeService {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult cellPhenotypeExtract( CellPhenotype cellPhenotype,List<CellPhenotypeValue> cellPhenotypeValueList)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		CellPhenotypeDao cellPhenotypeDao = sqlSession.getMapper(CellPhenotypeDao.class);
		try{
			String cellPhenotypeID = cellPhenotype.getCellPhenotypeID();
			CellPhenotype cellPhenotypeTest = cellPhenotypeDao.selectCellPhenotype(cellPhenotypeID);
			if(cellPhenotypeTest==null||cellPhenotypeTest.getCellPhenotypeID()=="" )
			{
				logger.debug("未找到相应的细胞表型"+cellPhenotypeID);
				int cellPhenotypeInsert = cellPhenotypeDao.insertCellPhenotype(cellPhenotype);
				logger.debug("添加新的细胞表型："+cellPhenotypeInsert);
				int cellPhenotypeValueInsert = cellPhenotypeDao.insertCellPhenotypeValue(cellPhenotypeValueList);
				logger.debug("添加细胞表型检测值："+cellPhenotypeValueInsert);
			}
			else if(cellPhenotypeTest!=null&&cellPhenotypeTest.getCellPhenotypeID()!="")
			{
				logger.debug("找到相应的细胞表型"+cellPhenotypeID);
				int cellPhenotypeUpdate = cellPhenotypeDao.updateCellPhenotype(cellPhenotype);
				logger.debug("更新细胞表型："+cellPhenotypeUpdate);
				int cellPhenotypeValueDelete = cellPhenotypeDao.deleteCellPhenotypeValue(cellPhenotypeID);
				int cellPhenotypeValueInsert = cellPhenotypeDao.insertCellPhenotypeValue(cellPhenotypeValueList);
				logger.debug("添加细胞表型检测值："+cellPhenotypeValueInsert);
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
