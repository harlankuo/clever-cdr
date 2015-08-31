package com.vico.clever.cdr;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.FollowUpVisit;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.FollowUpVisitService;

@Path("FollowUpVisitResource")
public class FollowUpVisitResource {
	
	private FollowUpVisitService  followUpVisitService = new FollowUpVisitService();
	
	@Path("/followUpVisit")
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult FollowUpVisitExtract(FollowUpVisit followUpVisit)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = followUpVisitService.followUpVisitExtract(followUpVisit);
		return integrationResult;
	}
	

}
