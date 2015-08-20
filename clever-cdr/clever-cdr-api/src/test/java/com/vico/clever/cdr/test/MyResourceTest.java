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
import com.vico.clever.cdr.service.entity.RemainEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PatientInfo;
import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;

public class MyResourceTest extends JerseyTest {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	protected Application configure(){
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new CleverRestApplication();
	}
	@Test
	public void testMyResource(){
		//final PatientInfo patientInfo=target("myresourceTest").request().get(PatientInfo.class);
//		final String patientInfo=target("patientAdt").path("patientInfo").queryParam("patientId", "M000060").request().get(String.class);
//		logger.debug(patientInfo.toString());
		//assertEquals("Got it!", myresource);
//		Response response = target("patientAdt").path("patientInfo").queryParam("patientId", "M000060").request().delete();
//		final IntegrationResult result=response.readEntity(IntegrationResult.class); 
//		logger.debug(result.toString());
		//response.close();
		
		Date date=new Date();
		Random random = new Random();
		int num=random.nextInt(100);
		String param="remain"+num;
		
		Remain remain=new Remain();
		remain.setAdministrationCode(param);
		remain.setAdministrationName(param);
		remain.setDosage(""+num);
		remain.setDosageUnit(param);
		remain.setFrequencyDescription(param);
		remain.setFrequencyInterval(num);
		remain.setFrequencyIntervalUnit(param);
		remain.setFrequencyUnit(param);
		remain.setMemo(param);
		remain.setOrderContent(param);
		remain.setOrderID("order-"+num);
		remain.setPatientID("patient-"+num);
		remain.setPlannedExecDatetime(date);
		remain.setPlannedStopDatetime(date);
		remain.setRequestID("remain-"+num);
		remain.setVisitID("visit-"+num);
		logger.debug(remain.toString());
		
		RemainAction remainAction=new RemainAction();
		remainAction.setActionDatetime(date);
		remainAction.setCareflowStepCode(param);
		remainAction.setCareflowStepName(param);
		remainAction.setCurStateCode(param);
		remainAction.setCurStateName(param);
		remainAction.setMemo(param);
		remainAction.setOrderContent(param);
		remainAction.setPatientID("patient-"+num);
		remainAction.setPerformDeptCode(param);
		remainAction.setPerformDeptName(param);
		remainAction.setPerformerCode(param);
		remainAction.setPerformerName(param);
		remainAction.setRequestID("remain-"+num);
		remainAction.setVisitID("visit-"+num);
		logger.debug(remainAction.toString());
		
		RemainEntity remainEntity=new RemainEntity();
		remainEntity.setRemain(remain);
		remainEntity.setRemainAction(remainAction);
		
		Response response = target("remainResource").path("remainRequest").request().buildPost(Entity.entity(remainEntity, MediaType.APPLICATION_JSON)).invoke();
		final IntegrationResult result=response.readEntity(IntegrationResult.class);
		logger.debug(result.toString());
	}
}
