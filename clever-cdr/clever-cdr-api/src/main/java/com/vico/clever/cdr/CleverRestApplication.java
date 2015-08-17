package com.vico.clever.cdr;

import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * 
 * Add Json Support ResourceConfig
 * 
 * @author Yuan.Ziyang
 * 
 */
public class CleverRestApplication extends ResourceConfig {

	public CleverRestApplication() {

		// resource class packages
		packages("com.vico.clever.cdr");
		// register json provider class
		register(JacksonJsonProvider.class);

	}
}
