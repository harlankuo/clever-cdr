package com.vico.clever.cdr.service.dao.test;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.ConsultationDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.Consultation;
import com.vico.clever.cdr.service.model.ConsultationAction;

public class ConsultationDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Test
	public void consultationDaoTesr(){
		SqlSession sqlSession = SQLSessionConfig.getSqlSessionFactory()
				.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		ConsultationDao consultationDao=sqlSession.getMapper(ConsultationDao.class);
		try {
			Date date=new Date();
			Random random = new Random();
			int num=random.nextInt(100);
			String param="consul"+num;
			
			Consultation consultation=new Consultation();
			consultation.setConsultComment(param);
			consultation.setConsultGrade("1");
			consultation.setConsultPurpose(param);
			consultation.setConsultRequestID("consul-"+num);
			consultation.setIntendedConsultDatetime(date);
			consultation.setIntendedConsultDeptCode(param);
			consultation.setIntendedConsultDeptName(param);
			consultation.setIntendedConsultDoctorCode(param);
			consultation.setIntendedConsultDoctorName(param);
			consultation.setIntendedConsultPlace(param);
			consultation.setOrderID("order-"+num);
			consultation.setPatientID("patient-"+num);
			consultation.setVisitID("visit-"+num);
			
			ConsultationAction consultationAction=new ConsultationAction();
			consultationAction.setActionDatetime(date);
			consultationAction.setCareflowStepCode(param);
			consultationAction.setCareflowStepName(param);
			consultationAction.setConsultContent(param);
			consultationAction.setConsultRequestID("consul-"+num);
			consultationAction.setCurStateCode(param);
			consultationAction.setCurStateName(param);
			consultationAction.setMemo(param);
			consultationAction.setPatientID(param);
			consultationAction.setPerformDeptCode(param);
			consultationAction.setPerformDeptName(param);
			consultationAction.setPerformerCode(param);
			consultationAction.setPerformerName(param);
			consultationAction.setVisitID(param);
			
			int insertConsultation=consultationDao.insertConsultation(consultation);
			int insertConsultationAction=consultationDao.insertConsultationAction(consultationAction);
			
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
		
	} 
}
