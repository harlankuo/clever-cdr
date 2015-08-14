package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.LabTestDataEntity;
import com.vico.clever.cdr.service.entity.LabTestReqEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.LabTestData;
import com.vico.clever.cdr.service.model.LabTestItem;
import com.vico.clever.cdr.service.model.LabTestReqInfo;
import com.vico.clever.cdr.service.model.LabTestStatus;
import com.vico.clever.cdr.service.service.LabTestService;

/**
 * Root resource (exposed at "labTestResource" path)
 */
@Path("labTestResource")
public class LabTestResource {
	
	private LabTestService labTestService= new LabTestService();
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getLabTestResource() {
        return "Got LabTestResource!";
    }
    
    @POST
    @Path("/labTestRequest")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult labTestReqExtract(LabTestReqEntity labTestReqEntity){
    	IntegrationResult integrationResult = new IntegrationResult();
    	LabTestReqInfo labTestReqInfo=labTestReqEntity.getLabTestReqInfo();
    	List<LabTestItem> labTestItemList=labTestReqEntity.getLabTestItemList();
    	LabTestStatus labTestStatus=labTestReqEntity.getLabTestStatus();
    	integrationResult=labTestService.labTestReqExtract(labTestReqInfo, labTestItemList, labTestStatus);
    	return integrationResult;
    }
    
    @POST
    @Path("/labTestData")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult labTestDataExtract(LabTestDataEntity labTestDataEntity){
    	IntegrationResult integrationResult = new IntegrationResult();
    	List<LabTestData> labTestDataList=labTestDataEntity.getLabTestDataList();
    	LabTestStatus labTestStatus=labTestDataEntity.getLabTestStatus();
    	integrationResult=labTestService.labTestDataExtract(labTestDataList, labTestStatus);
    	return integrationResult;
    }
    
    @POST
    @Path("/labTestStatus")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult labTestStatus(LabTestStatus labTestStatus){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=labTestService.labTestStatus(labTestStatus);
    	return integrationResult;
    }
    
}
