package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.TransfutionEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.Transfusion;
import com.vico.clever.cdr.service.model.TransfusionAction;
import com.vico.clever.cdr.service.service.TransfusionService;

/**
 * Root resource (exposed at "transfusionResource" path)
 */
@Path("transfusionResource")
public class TransfusionResource {

	private TransfusionService transfusionService=new TransfusionService();
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTransfusionResource() {
        return "Got TransfusionResource!";
    }
    
    /**
   	 * 
   	 * Element resource (exposed at "transfusion" path);
   	 * 
   	 * Method handling the data entry of transfusion information into CDR with HTTP POST requests.
   	 * 
   	 * @author Yuan.Ziyang
   	 * @param transfutionEntity
   	 *            input json or xml object data that contains Transfusion and 
   	 *            TransfusionAction info;
   	 * @return IntegrationResult that contains the handling result description
   	 *         as an application/json response.
   	 */    
    @POST
    @Path("/transfusion")
 	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult transfusion(TransfutionEntity transfutionEntity){
    	IntegrationResult integrationResult=new IntegrationResult();
    	Transfusion transfusion=transfutionEntity.getTransfusion();
    	TransfusionAction transfusionAction=transfutionEntity.getTransfusionAction();
    	integrationResult=transfusionService.transfutionInfo(transfusion, transfusionAction);
    	return integrationResult;
    }
    
    /**
   	 * 
   	 * Element resource (exposed at "transfusionAction" path);
   	 * 
   	 * Method handling the data entry of TransfusionAction information into CDR with HTTP POST requests.
   	 * 
   	 * @author Yuan.Ziyang
   	 * @param transfusionAction
   	 *            input json or xml object data that containsTransfusionAction info;
   	 * @return IntegrationResult that contains the handling result description
   	 *         as an application/json response.
   	 */    
    @POST
    @Path("/transfusionAction")
 	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult updateTransfusion(TransfusionAction transfusionAction){
    	IntegrationResult integrationResult=new IntegrationResult();
    	integrationResult=transfusionService.updateTransfusion(transfusionAction);
    	return integrationResult;
    }
}
