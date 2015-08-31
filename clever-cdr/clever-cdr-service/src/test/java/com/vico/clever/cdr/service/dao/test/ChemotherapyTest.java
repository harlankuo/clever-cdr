package com.vico.clever.cdr.service.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.ChemotherapyDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Chemotherapy;
import com.vico.clever.cdr.service.model.ChemotherapyMedicine;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.ChemotherapyService;

public class ChemotherapyTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void chemotherapyTest()
	{
		logger.debug("*********  testChemotherapyDao Start ***********");
    	SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ChemotherapyDao chemotherapyDao = sqlSession.getMapper(ChemotherapyDao.class);
		ChemotherapyService chemotherapyService = new ChemotherapyService();
		try{
			
			Random random = new Random();
			int num=random.nextInt(100);
			Date date=new Date();
			byte a = 0;
			Chemotherapy  chemotherapy = new Chemotherapy();
			chemotherapy.setAdverseReaction("adverseReaction");
			chemotherapy.setAdverseReactionDegree("D"+num);
			chemotherapy.setChemotherapyID("CH"+num);
			chemotherapy.setComment("comment"+num);
			chemotherapy.setCommentCount(num);
			chemotherapy.setDoseAdjustmentFlag(a);
			chemotherapy.setDoseAdjustmentReason("doseAdjustmentReason"+num);
			chemotherapy.setEndDatetime(date);
			chemotherapy.setModifiedReason("modifiedReason"+num);
			chemotherapy.setModifiedSolutionFlag(a);
			chemotherapy.setOtherInfomation("otherInfomation"+num);
			chemotherapy.setPatientID("P"+num);
			chemotherapy.setPeriod(num);
			chemotherapy.setStartDatetime(date);
			chemotherapy.setSolutionName("solutionName"+num);
			chemotherapy.setStartDatetime(date);
			
			chemotherapy.setVisitID("V"+num);
			
			
			List<ChemotherapyMedicine>  chemotherapyMedicineList = new ArrayList<ChemotherapyMedicine>();
			
			ChemotherapyMedicine chemotherapyMedicine = new ChemotherapyMedicine();
			chemotherapyMedicine.setChemotherapyID(chemotherapy.getChemotherapyID());
			chemotherapyMedicine.setMedicationOrderID("M"+num);
			chemotherapyMedicine.setName("Name"+num);
			
			chemotherapyMedicineList.add(chemotherapyMedicine);
			
			//int chemotherapyInsert = chemotherapyDao.insertChemotherapy(chemotherapy);
			//logger.debug("chemotherapyInsert"+chemotherapyInsert);
			
			//int chemotherapyUpdate = chemotherapyDao.updateChemotherapy(chemotherapy);
			//logger.debug("chemotherapyUpdate"+chemotherapyUpdate);
			
			//int chemotherapyMedicineInsert = chemotherapyDao.insertChemotherapyMedicine(chemotherapyMedicineList);
			//logger.debug("chemotherapyMedicineInsert"+chemotherapyMedicineInsert);
			IntegrationResult integrationResult = chemotherapyService.chemotherapyExtract(chemotherapy, chemotherapyMedicineList);
			logger.debug(integrationResult.toString());
			
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
