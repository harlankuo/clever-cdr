package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.PrescriptionEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PrescriptionDetail;
import com.vico.clever.cdr.service.model.PrescriptionInfo;
import com.vico.clever.cdr.service.model.PrescriptionStatus;
import com.vico.clever.cdr.service.service.PrescriptionService;

/**
 * Root resource (exposed at "PrescriptionResource" path)
 */
@Path("PrescriptionResource")
public class PrescriptionResource {
	
	private PrescriptionService prescService=new PrescriptionService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPrescription() {
        return "Got PrescriptionResource!";
    }
    
    @POST
    @Path("/Prescription")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult prescriptionInfoExtract(PrescriptionEntity prescriptionEntity){
    	IntegrationResult integrationResult=new IntegrationResult();
    	PrescriptionInfo prescriptionInfo=prescriptionEntity.getPrescriptionInfo();
    	List<PrescriptionDetail> prescriptionDetailList=prescriptionEntity.getPrescriptionDetailList();
    	PrescriptionStatus prescriptionStatus=prescriptionEntity.getPrescriptionStatus();
    	integrationResult=prescService.prescriptionInfoExtract(prescriptionInfo, prescriptionDetailList, prescriptionStatus);
    	return integrationResult;
    }
    
    @POST
    @Path("/PrescriptionStatus")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult updatePrescStatus (PrescriptionStatus prescriptionStatus){
    	IntegrationResult integrationResult=new IntegrationResult();
    	integrationResult=prescService.updatePrescStatus(prescriptionStatus);
    	return integrationResult;
    }
}
