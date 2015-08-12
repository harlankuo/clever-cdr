package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.DrugsDispenseEntity;
import com.vico.clever.cdr.service.model.DrugDispenseReqStatus;
import com.vico.clever.cdr.service.model.DrugDispensingReq;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.DrugsDispenseService;
/**
 * Root resource (exposed at "DrugsDispenseResource" path)
 */
@Path("DrugsDispenseResource")
public class DrugsDispenseResource {
	
	private DrugsDispenseService drugsDispenseService=new DrugsDispenseService();
	
    @POST
    @Path("DrugsDispenseReq")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_XML })
	public IntegrationResult drugDispenseReqExtract(DrugsDispenseEntity drugsDispenseEntity){
    	IntegrationResult integrationResult = new IntegrationResult();
    	DrugDispensingReq drugDispensingReq=drugsDispenseEntity.getDrugDispensingReq();
    	DrugDispenseReqStatus drugDispenseReqStatus=drugsDispenseEntity.getDrugDispenseReqStatus();
    	integrationResult=drugsDispenseService.drugDispenseInfoExtract(drugDispensingReq, drugDispenseReqStatus);
    	return integrationResult;
    }
    
    @POST
    @Path("DrugsDispenseStatus")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_XML })
    public IntegrationResult updateDrugDispenseReqStatus(DrugDispenseReqStatus drugDispenseReqStatus){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=drugsDispenseService.updateDrugDispenseReqStatus(drugDispenseReqStatus);
    	return integrationResult;
    }
}
