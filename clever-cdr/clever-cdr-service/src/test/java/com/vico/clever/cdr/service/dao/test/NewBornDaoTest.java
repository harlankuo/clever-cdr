package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.NewBornInfoDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.NewBornMaster;

public class NewBornDaoTest {
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void newBornDaoTest(){
		IntegrationResult integrationResult = new IntegrationResult();
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		NewBornInfoDao newBornDao=sqlSession.getMapper(NewBornInfoDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="newborn"+num;
			NewBornMaster newBornMaster=new NewBornMaster();
			newBornMaster.setBirthDate(date);
			newBornMaster.setBirthPlace(param);
			newBornMaster.setBirthPlaceType(num);
			newBornMaster.setCreateDate(date);
			newBornMaster.setCreator(param);
			newBornMaster.setPatientID("patient-"+num);
			newBornMaster.setCreatorID(param);
			newBornMaster.setDeliveringInstitutions(param);
			newBornMaster.setFatherEthnicGroup(param);
			newBornMaster.setFatherID(param);
			newBornMaster.setFatherIDType(param);
			newBornMaster.setFatherName(param);
			newBornMaster.setFatherNation(param);
			newBornMaster.setGender("F");
			newBornMaster.setHealthState(param);
			newBornMaster.setHeight(num);
			newBornMaster.setHeightUnit(param);
			newBornMaster.setLastModifiedDate(date);
			newBornMaster.setLastModifierCode(param);
			newBornMaster.setLastModifierName(param);
			newBornMaster.setMotherEthnicGroup(param);
			newBornMaster.setMotherID(param);
			newBornMaster.setMotherIDType(param);
			newBornMaster.setMotherName(param);
			newBornMaster.setMotherNation(param);
			newBornMaster.setName(param);
			newBornMaster.setNewBornID(param);
			newBornMaster.setStatus("0");
			newBornMaster.setVisitID("visit-"+num);
			newBornMaster.setWeight(num);
			newBornMaster.setWeightUnit(param);
			logger.debug(newBornMaster.toString());
			int insert=newBornDao.insertNewBornMaster(newBornMaster);
			
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
		
	}
}
