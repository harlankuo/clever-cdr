package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.SurgeryItem;
import com.vico.clever.cdr.service.model.SurgeryMaster;
import com.vico.clever.cdr.service.model.SurgeryRecord;
import com.vico.clever.cdr.service.model.SurgeryReqInfo;
import com.vico.clever.cdr.service.model.SurgeryStatus;
import com.vico.clever.cdr.service.service.SurgeryService;

/** 
* @author ding.yuanyuan
* @description Related interfaces of surgery 
* @date Aug 18, 2015 2:33:46 PM 
*/
@Path("surgery")
public class SurgeryResource {
	/*
	 * @description After confirmed surgery by the docotor's order,
	 *              a surgery application message will been send to the integration.
	 *              When the integration monitor this message,it will call this interface
	 *              to write related data into table Inst_OperationRequest, 
	 *              table Inst_OperationRequest_OperationItems and table Action_Operation.
	 * @return IntegrationResult
	 */
	@POST
	@Path("/surgeryRequest")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	IntegrationResult surgeryReqExtract (SurgeryReqInfo surgeryReqInfo, 
			List<SurgeryItem>  surgeryItemList, SurgeryStatus  surgeryStatus){
		SurgeryService surgeryService = new SurgeryService();
		return surgeryService.surgeryReqExtract(surgeryReqInfo,surgeryItemList,surgeryStatus);
	}
	/*
	 * @description When the integration platform receives message of surgery arrangement,
	 *              it calls this interface to write related information into 
	 *              table Inst_OperationArrangement and update table Action_Operation
	 * @return IntegrationResult
	 */
	@POST
	@Path("/surgeryArrange")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	@Consumes(MediaType.APPLICATION_ATOM_XML)
	IntegrationResult  surgeryArrange(SurgeryMaster surgeryMaster,SurgeryStatus surgeryStatus){
		SurgeryService surgeryService = new SurgeryService();
		return surgeryService.surgeryArrange(surgeryMaster,surgeryStatus);
	}
	/*
	 * @description When the integration platform receives message of creating surgery record,
	 *              it calls this interface to write related information into
	 *              table Obsr_OperationRecord and update table Action_Operation
	 * @return IntegrationResult 
	 */
	@POST
	@Path("/surgeryRecord")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	@Consumes(MediaType.APPLICATION_ATOM_XML)
	IntegrationResult  surgeryRecord(SurgeryRecord surgeryRecord,SurgeryStatus surgeryStatus){
		SurgeryService surgeryService = new SurgeryService();
		return surgeryService.surgeryRecord(surgeryRecord,surgeryStatus);
	}
	/*
	 * @description When the integration platform receives message of surgery cancellation,
	 *              it calls this interface to update table Action_Operation
	 * @return IntegrationResult
	 */
	@POST
	@Path("/surgeryCancel")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	@Consumes(MediaType.APPLICATION_ATOM_XML)
	IntegrationResult  surgeryCancel(SurgeryStatus surgeryStatus){
		SurgeryService surgeryService = new SurgeryService();
		return surgeryService.surgeryCancel(surgeryStatus);
	}

}
