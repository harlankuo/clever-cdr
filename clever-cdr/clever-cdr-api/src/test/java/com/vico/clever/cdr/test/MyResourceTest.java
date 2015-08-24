package com.vico.clever.cdr.test;

import java.util.Date;
import java.util.Random;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.vico.clever.cdr.CleverRestApplication;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.NewBornMaster;

public class MyResourceTest extends JerseyTest {
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	protected Application configure(){
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new CleverRestApplication();
	}
	@Test
	public void testMyResource(){
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
		
		
		Response response = target("newBornResource").path("newBornMaster").request().buildPost(Entity.entity(newBornMaster, MediaType.APPLICATION_JSON)).invoke();
		final IntegrationResult result=response.readEntity(IntegrationResult.class);
		logger.debug(result.toString());
	}
}
