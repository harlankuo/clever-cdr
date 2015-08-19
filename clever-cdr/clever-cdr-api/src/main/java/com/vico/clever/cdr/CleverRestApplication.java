package com.vico.clever.cdr;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

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

		//property(ServerProperties.WADL_GENERATOR_CONFIG,true);
		
		//property(ServerProperties.WADL_FEATURE_DISABLE,false);
	}
}
