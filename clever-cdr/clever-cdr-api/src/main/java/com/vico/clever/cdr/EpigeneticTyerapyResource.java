package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.EpigeneticTyerapy;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.EpigeneticTyerapyService;

@Path("EpigeneticTyerapyResource")
public class EpigeneticTyerapyResource {
	private EpigeneticTyerapyService epigeneticTyerapyService =new EpigeneticTyerapyService();
	@POST
    @Path("/EpigeneticTyerapy")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult EpigeneticTyerapyExtract(EpigeneticTyerapy epigeneticTyerapy)
    {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = epigeneticTyerapyService.epigeneticTyerapyExtract(epigeneticTyerapy);
		return integrationResult;
    }

}
