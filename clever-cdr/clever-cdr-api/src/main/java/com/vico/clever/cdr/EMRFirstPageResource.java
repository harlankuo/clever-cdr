package com.vico.clever.cdr;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.EMRFirstPageEntity;
import com.vico.clever.cdr.service.model.EMRFirstPage;
import com.vico.clever.cdr.service.model.EMRFirstPageAction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.EMRFirstPageService;

@Path("EMRFirstPageResource")
public class EMRFirstPageResource {
	
private EMRFirstPageService emrFirstPageService = new EMRFirstPageService();

@POST
@Path("/emrFirstPage")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public IntegrationResult emrFirsrPage(EMRFirstPageEntity emrFirstPageEntity)
{
	IntegrationResult integrationResult = new IntegrationResult();
	EMRFirstPage emrFirstPage = emrFirstPageEntity.getEmrFirstPage();
	EMRFirstPageAction emrFirstPageAction = emrFirstPageEntity.getEmrFirstPageAction();
	integrationResult = emrFirstPageService.emrFirstPageExtract(emrFirstPage, emrFirstPageAction);
	return integrationResult;
	}

@POST
@Path("/emrFirstPageAction")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public IntegrationResult updateEMRFirstPageAction(EMRFirstPageAction emrFirstPageAction)
{
	IntegrationResult integrationResult = new IntegrationResult();
	integrationResult = emrFirstPageService.updateEMRFirstPageAction(emrFirstPageAction);
	return integrationResult;
	}

}
