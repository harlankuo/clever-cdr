package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.ExamArrangeEntity;
import com.vico.clever.cdr.service.entity.ExamDataEntity;
import com.vico.clever.cdr.service.entity.ExamReportEntity;
import com.vico.clever.cdr.service.entity.ExamReqEntity;
import com.vico.clever.cdr.service.model.ExamDataInfo;
import com.vico.clever.cdr.service.model.ExamItem;
import com.vico.clever.cdr.service.model.ExamReportInfo;
import com.vico.clever.cdr.service.model.ExamReqInfo;
import com.vico.clever.cdr.service.model.ExamStatus;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.ExamInfoService;

/**
 * Root resource (exposed at "examResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("examResource")
public class ExamInfoResource {
	private ExamInfoService examService = new ExamInfoService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getExamInfoResource() {
		return "Got ExamInfoResource!";
	}

	/**
	 * Element resource (exposed at "examRequest" path);
	 * 
	 * Method handling HTTP POST requests to write exam request information into
	 * CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examReqEntity
	 *            input json or xml object that contains
	 *            examReqInfo,examItemList and examStatus information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
	@POST
	@Path("/examRequest")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult examReqInfoExtract(ExamReqEntity examReqEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		ExamReqInfo examReqInfo = examReqEntity.getExamReqInfo();
		List<ExamItem> examItemList = examReqEntity.getExamItemList();
		ExamStatus examStatus = examReqEntity.getExamStatus();
		integrationResult = examService.examReqInfoExtract(examReqInfo,
				examItemList, examStatus);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "examArrange" path);
	 * 
	 * Method handling HTTP POST requests to write exam Arrange information into
	 * CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examArrangeEntity
	 *            input json or xml object that contains examItemList and
	 *            examStatus information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
	@POST
	@Path("/examArrange")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult examArrangeMent(ExamArrangeEntity examArrangeEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		List<ExamItem> examItemList = examArrangeEntity.getExamItemList();
		ExamStatus examStatus = examArrangeEntity.getExamStatus();
		integrationResult = examService.examArrangeMent(examItemList,
				examStatus);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "examData" path);
	 * 
	 * Method handling HTTP POST requests to write exam data information into
	 * CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examDataEntity
	 *            input json or xml object that contains examDataList and
	 *            examStatus information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
	@POST
	@Path("/examData")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult examDataExtract(ExamDataEntity examDataEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		List<ExamDataInfo> examDataList = examDataEntity.getExamDataList();
		ExamStatus examStatus = examDataEntity.getExamStatus();
		integrationResult = examService.examDataExtract(examDataList,
				examStatus);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "examReport" path);
	 * 
	 * Method handling HTTP POST requests to write exam report information into
	 * CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examReportEntity
	 *            input json or xml object that contains examReportInfo and
	 *            examStatus information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
	@POST
	@Path("/examReport")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult examReportExtract(ExamReportEntity examReportEntity) {
		IntegrationResult integrationResult = new IntegrationResult();
		ExamReportInfo examReportInfo = examReportEntity.getExamReportInfo();
		ExamStatus examStatus = examReportEntity.getExamStatus();
		integrationResult = examService.examReportExtract(examReportInfo,
				examStatus);
		return integrationResult;
	}

	/**
	 * Element resource (exposed at "examStatus" path);
	 * 
	 * Method handling HTTP POST requests to write exam status information into
	 * CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examDataEntity
	 *            input json or xml object that contains examStatus information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
	@POST
	@Path("/examStatus")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult updateExamStatus(ExamStatus examStatus) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = examService.updateExamStatus(examStatus);
		return integrationResult;
	}

}
