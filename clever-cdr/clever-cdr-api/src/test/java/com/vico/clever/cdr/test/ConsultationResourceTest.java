package com.vico.clever.cdr.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.vico.clever.cdr.CleverRestApplication;
import com.vico.clever.cdr.service.entity.ConsultationEntity;
import com.vico.clever.cdr.service.entity.RemainEntity;
import com.vico.clever.cdr.service.model.Consultation;
import com.vico.clever.cdr.service.model.ConsultationAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientInfo;
import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;

public class ConsultationResourceTest extends JerseyTest {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	protected Application configure(){
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new CleverRestApplication();
	}
	/**
	 * 
	 */
	@Test
	public void testMyResource(){
		
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
		consultationAction.setConsultRequestID(param);
		consultationAction.setCurStateCode(param);
		consultationAction.setCurStateName(param);
		consultationAction.setMemo(param);
		consultationAction.setPatientID(param);
		consultationAction.setPerformDeptCode(param);
		consultationAction.setPerformDeptName(param);
		consultationAction.setPerformerCode(param);
		consultationAction.setPerformerName(param);
		consultationAction.setVisitID(param);
		
		ConsultationEntity consultationEntity=new ConsultationEntity();
		consultationEntity.setConsultation(consultation);
		consultationEntity.setConsultationAction(consultationAction);
		//Response response = target("consultationResource").path("consultationRequest").request().buildPost(Entity.entity(consultationEntity, MediaType.APPLICATION_JSON)).invoke();
		//final IntegrationResult result=response.readEntity(IntegrationResult.class);
		//logger.debug(result.toString());
		
		
		Response response =target("consultationResource").path("consultationRequest").queryParam("consultRequestID", "consul-13").request().delete();
		final IntegrationResult result=response.readEntity(IntegrationResult.class);
		logger.debug(result.toString());
	}
}
