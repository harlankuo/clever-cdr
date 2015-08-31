package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.EMRDocumentEntity;
import com.vico.clever.cdr.service.model.EMRDocument;
import com.vico.clever.cdr.service.model.EMRDocumentAction;
import com.vico.clever.cdr.service.model.EMRDocumentDetails;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.EMRDocumentService;

   @Path("emrDocumentResource")
public class EMRDocumentResource {
	
	private EMRDocumentService emrDocumentService = new EMRDocumentService();
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getEMRDocumentResource() {
        return "Got EMRDocumentResource!";
    }
	
    @POST
    @Path("/emrDocument")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult EMRDocumentExtract(EMRDocumentEntity emrDocumentEntity)
    {
    	IntegrationResult integrationResult = new IntegrationResult();
    	EMRDocument emrDocument=emrDocumentEntity.getEmrDocument();
    	List<EMRDocumentDetails> emrDocumentDetailList = emrDocumentEntity.getEmrDocumentDetailList();
    	EMRDocumentAction emrDocumentAction  =  emrDocumentEntity.getEmrDocumentAction();
    	integrationResult = emrDocumentService.emrDocumentExtract(emrDocument, emrDocumentDetailList, emrDocumentAction);
    	
    	return integrationResult;
    }
    
    @POST
    @Path("/emrDocumentAction")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult updateEMRDocumentAction(EMRDocumentAction emrDocumentAction)
    {
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult = emrDocumentService.updateEMRDocumentAction(emrDocumentAction);
    	return integrationResult;
    }

}
