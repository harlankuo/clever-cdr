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
import com.vico.clever.cdr.service.entity.OrderInfoEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.OrderInfo;
import com.vico.clever.cdr.service.model.OrderStatusInfo;

public class OrderInfoResourceTest extends JerseyTest {
	protected final Logger logger = Logger.getLogger(this.getClass());

	protected Application configure() {
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new CleverRestApplication();
	}

	@Test
	public void orderInfoResourceTest() {
		Random random = new Random();
		int num = random.nextInt(100);
		Date date = new Date();
		String param = "test-" + num;
		OrderInfo orderInfo = new OrderInfo();
		OrderStatusInfo orderStatusInfo = new OrderStatusInfo();
		orderInfo.setEmergency(0);
		orderInfo.setMotherOrBaby("0");
		orderInfo.setOrderClassCode("code-" + num);
		orderInfo.setOrderClassName("name-" + num);
		orderInfo.setOrderID("" + num);
		orderInfo.setOrderNO("" + num);
		orderInfo.setOrderSubNO("" + num);
		orderInfo.setPatientID("" + num);
		orderInfo.setRepeatOrder(0);
		orderInfo.setReservedOrder(0);
		orderInfo.setSubsequentOrder(0);
		orderInfo.setVisitID("" + num);
		orderStatusInfo.setCareflowStepCode(param);
		orderStatusInfo.setCareflowStepName(param);
		orderStatusInfo.setCurStateCode(param);
		orderStatusInfo.setCurStateName(param);
		orderStatusInfo.setMemo(param);
		orderStatusInfo.setOrderID("" + num);
		orderStatusInfo.setOrderItem(param);
		orderStatusInfo.setPatientID("" + num);
		orderStatusInfo.setPerformDateTime(date);
		orderStatusInfo.setPerformDeptCode(param);
		orderStatusInfo.setPerformDeptName(param);
		orderStatusInfo.setPerformDoctorCode(param);
		orderStatusInfo.setPerformDoctorName(param);
		orderStatusInfo.setPersonTypeCode("0");
		orderStatusInfo.setPersonTypeName(param);
		orderStatusInfo.setVisitID("visit-" + num);
		OrderInfoEntity orderInfoEntity = new OrderInfoEntity();
		orderInfoEntity.setOrderInfo(orderInfo);
		orderInfoEntity.setOrderStatusInfo(orderStatusInfo);

//		Response response = target("orderInfoResource")
//				.path("orderInfo")
//				.request()
//				.buildPost(
//						Entity.entity(orderInfoEntity,
//								MediaType.APPLICATION_JSON)).invoke();
//		final IntegrationResult result = response
//				.readEntity(IntegrationResult.class);
//		logger.debug(result.toString());
		
		Response response2= target("orderInfoResource")
				.path("orderStatus")
				.request()
				.buildPost(
						Entity.entity(orderStatusInfo,
								MediaType.APPLICATION_JSON)).invoke();
		final IntegrationResult result2 = response2
				.readEntity(IntegrationResult.class);
		logger.debug(result2.toString());
	}
}
