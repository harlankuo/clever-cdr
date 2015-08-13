package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.ExamDataEntity;
import com.vico.clever.cdr.service.entity.ExamReqEntity;
import com.vico.clever.cdr.service.model.ExamDataInfo;
import com.vico.clever.cdr.service.model.ExamItem;
import com.vico.clever.cdr.service.model.ExamReqInfo;
import com.vico.clever.cdr.service.model.ExamStatus;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.ExamInfoService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("examResource")
public class ExamInfoResource {
	private ExamInfoService examService=new ExamInfoService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getExamInfoResource() {
        return "Got ExamInfoResource!";
    }
    
    @POST
    @Path("/examRequest")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult examReqInfoExtract(ExamReqEntity examReqEntity){
    	IntegrationResult integrationResult = new IntegrationResult();
    	ExamReqInfo examReqInfo=examReqEntity.getExamReqInfo();
    	List<ExamItem> examItemList=examReqEntity.getExamItemList();
    	ExamStatus examStatus=examReqEntity.getExamStatus();
    	integrationResult=examService.examReqInfoExtract(examReqInfo, examItemList, examStatus);
    	return integrationResult;
    }
    
    @POST
    @Path("/examData")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public IntegrationResult examDataExtract(ExamDataEntity examDataEntity){
    	IntegrationResult integrationResult = new IntegrationResult();
    	List<ExamDataInfo> examDataList=examDataEntity.getExamDataList();
    	ExamStatus examStatus=examDataEntity.getExamStatus();
    	integrationResult=examService.examDataExtract(examDataList, examStatus);
    	return integrationResult;
    }
    
}
