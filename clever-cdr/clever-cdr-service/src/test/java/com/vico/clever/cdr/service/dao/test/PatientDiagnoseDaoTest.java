package com.vico.clever.cdr.service.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.PatientDiagnoseDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.ProblemDiagnosis;

public class PatientDiagnoseDaoTest {
	protected final Logger logger = Logger.getLogger(this.getClass());

	@Test
	public void patientDiagDaoTest() {
		logger.debug("*********  patientDiagDaoTest Start ***********");
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientDiagnoseDao patientDiagDao=sqlSession.getMapper(PatientDiagnoseDao.class);
		try {
			ProblemDiagnosis problemDiagnosis=new ProblemDiagnosis();
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="insert"+num;
			problemDiagnosis.setClassOfDiagnosisCode(param);
			problemDiagnosis.setClassOfDiagnosisName(param);
			problemDiagnosis.setCondition(param);
			problemDiagnosis.setDateOfDiagnosis(date);
			problemDiagnosis.setDayOfTreatment(1);
			problemDiagnosis.setDescription(param);
			problemDiagnosis.setDiagnosisID(""+num);
			problemDiagnosis.setDiagnosisNO(""+num);
			problemDiagnosis.setDoctor(param);
			problemDiagnosis.setFlagOfOperation("1");
			problemDiagnosis.setPatientID("M000"+num);
			problemDiagnosis.setProblemDiagnosis(param);
			problemDiagnosis.setResult(param);
			problemDiagnosis.setVisitID("visitId-"+num);
			logger.debug("*********  problemDiagnosis Created  ***********");
			logger.debug(problemDiagnosis.toString());
			int insert=patientDiagDao.insertPatientDiagnose(problemDiagnosis);
			logger.debug("*********  problemDiagnosis Inserted  ***********");
			
			
			ProblemDiagnosis problemDiagnosis2=new ProblemDiagnosis();
			int num2=random.nextInt(100);
			String param2="update"+num2;
			problemDiagnosis2.setClassOfDiagnosisCode("updateTest");
			problemDiagnosis2.setClassOfDiagnosisName(param);
			problemDiagnosis2.setCondition(param);
			problemDiagnosis2.setDateOfDiagnosis(date);
			problemDiagnosis2.setDayOfTreatment(1);
			problemDiagnosis2.setDescription(param);
			problemDiagnosis2.setDiagnosisID(""+num2);
			problemDiagnosis2.setDiagnosisNO(""+num2);
			problemDiagnosis2.setDoctor(param);
			problemDiagnosis2.setFlagOfOperation("1");
			problemDiagnosis2.setPatientID("M00077");
			problemDiagnosis2.setProblemDiagnosis("updateTest");
			problemDiagnosis2.setResult(param);
			problemDiagnosis2.setVisitID("visitId-77");
			logger.debug("*********  problemDiagnosis Created  ***********");
			logger.debug(problemDiagnosis2.toString());
			int update=patientDiagDao.updatePatientDiagnose(problemDiagnosis2);
			logger.debug("*********  problemDiagnosis update  ***********");
			
			List<ProblemDiagnosis> problemDiagnosisList=new ArrayList<ProblemDiagnosis>();
			problemDiagnosisList.add(problemDiagnosis);
			problemDiagnosisList.add(problemDiagnosis2);
			int insertList=patientDiagDao.insertPatientDiagnoseList(problemDiagnosisList);
			logger.debug("insertList:"+insertList);
			logger.debug("*********  insertPatientDiagnoseList  ***********");
			
			logger.debug("*********  updatePatientDiagnoseList  ***********");
			int updateList=patientDiagDao.updatePatientDiagnoseList(problemDiagnosisList);
			logger.debug("updateList:"+updateList);
			logger.debug("*********  updatePatientDiagnoseList  ***********");
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
		} catch (Exception e) {
			logger.error(e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		} finally {
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		logger.debug("*********  patientDiagDaoTest End ***********");
	}
}
