package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PhysicalExamination;
import com.vico.clever.cdr.service.service.PhysicalExaminationService;

@Path("PhysicalExaminationResource")
public class PhysicalExaminationResource {
	
	private PhysicalExaminationService physicalExaminationService = new PhysicalExaminationService();
	
	@Path("/physicalExamination")
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult PhysicalExaminationExtract(PhysicalExamination physicalExamination)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = physicalExaminationService.physicalExaminationExtract(physicalExamination);
		return integrationResult;
	}

}
