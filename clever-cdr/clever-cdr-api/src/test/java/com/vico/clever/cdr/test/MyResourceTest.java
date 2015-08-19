package com.vico.clever.cdr.test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import com.vico.clever.cdr.CleverRestApplication;

public class MyResourceTest extends JerseyTest {
	protected Application configure(){
		return new CleverRestApplication();
	}
	@Test
	public void testMyResource(){
		final String myresource=target("myresource").request().get(String.class);
		assertEquals("Got it!", myresource);
	}
}
