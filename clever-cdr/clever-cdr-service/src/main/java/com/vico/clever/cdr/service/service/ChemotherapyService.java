package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.ChemotherapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Chemotherapy;
import com.vico.clever.cdr.service.model.ChemotherapyMedicine;
import com.vico.clever.cdr.service.model.IntegrationResult;

public class ChemotherapyService {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	public IntegrationResult chemotherapyExtract(Chemotherapy  chemotherapy,List<ChemotherapyMedicine>  chemotherapyMedicineList)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		
		logger.debug("********** SqlSession Open **********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory().openSession();
		
		ChemotherapyDao chemotherapyDao = sqlSession.getMapper(ChemotherapyDao.class);
		try{
			String chemotherapyID = chemotherapy.getChemotherapyID();
			Chemotherapy chemotherapyTest = chemotherapyDao.selectChemotherapy(chemotherapyID);
			if(chemotherapyTest == null || chemotherapyTest.getChemotherapyID()=="")
			{
				logger.debug("未找到相应的化疗治疗"+chemotherapyID);
				int chemotherapyInsert = chemotherapyDao.insertChemotherapy(chemotherapy);
				logger.debug("添加化疗治疗"+chemotherapyInsert);
				int chemotherapyMedicineInsert = chemotherapyDao.insertChemotherapyMedicine(chemotherapyMedicineList);
				logger.debug("添加化疗药物"+chemotherapyMedicineInsert);
			}
			else if (chemotherapyTest!=null&&chemotherapyTest.getChemotherapyID()!="")
			{
				logger.debug("找到相应的化疗治疗"+chemotherapyID);
				int chemotherapyUpdate = chemotherapyDao.updateChemotherapy(chemotherapy);
				logger.debug("更新该化疗治疗"+chemotherapyUpdate);
				int chemotherapyMedicineDelete =chemotherapyDao.deleteChemotherapy(chemotherapy.getChemotherapyID()) ;
				int chemotherapyMedicineInsert = chemotherapyDao.insertChemotherapyMedicine(chemotherapyMedicineList);
				logger.debug("更新化疗药物"+chemotherapyMedicineInsert);
				
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
