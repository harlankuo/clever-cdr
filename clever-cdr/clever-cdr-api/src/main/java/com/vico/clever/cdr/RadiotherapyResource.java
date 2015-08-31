package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Radiotherapy;
import com.vico.clever.cdr.service.service.RadiotherapyService;

@Path("RadiotherapyResource")
public class RadiotherapyResource {
	private RadiotherapyService radiotherapyService = new RadiotherapyService();
	
	@POST
    @Path("/Radiotherapy")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult RadiotherapyExtract(Radiotherapy  radiotherapy)
    {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = radiotherapyService.radiotherapyExtract(radiotherapy);
		return integrationResult;
    }
}
