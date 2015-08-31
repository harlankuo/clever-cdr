package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PhysicalSign;
import com.vico.clever.cdr.service.service.PhysicalSignService;

/** 
* @author ding.yuanyuan
* @description Related interfaces of physicalSign 
* @date Aug 24, 2015 9:19:52 AM 
*/
@Path("/physicalSign")
public class PhysicalSignResource {
	/*
	 * @description After inputting the patient information clinically and submitting,
	 *              it will send a message to the Integration Platform.
	 *              When the Integration Platform receives this message,
	 *              it will call this interface to insert the physical sign of patient into the database
	 * @parameter PhysicalSign entity
	 * @return IntegrationResult
	 */
	@POST
	@Path("/physicalSignInsert")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public IntegrationResult insertPhysicalSign(PhysicalSign physicalSign){
		PhysicalSignService physicalSignService = new PhysicalSignService();
		return physicalSignService.insertPhysicalSign(physicalSign);
	}
	
	/*
	 * @description After updating the patient information clinically and submitting,
	 *              it will send a message to the Integration Platform.
	 *              When the Integration Platform receives this message,
	 *              it will call this interface to update the physical sign of patient in the database
	 * @parameter PhysicalSign entity
	 * @return IntegrationResult
	 */
	@POST
	@Path("/physicalSignUpdate")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public IntegrationResult updatePhysicalSign(PhysicalSign physicalSign){
		PhysicalSignService physicalSignService = new PhysicalSignService();
		return physicalSignService.updatePhysicalSign(physicalSign);
	}
	
	/*
	 * @description After deleting the patient information clinically and submitting,
	 *              it will send a message to the Integration Platform.
	 *              When the Integration Platform receives this message,
	 *              it will call this interface to delete the physical sign of patient in the database
	 * @parameter PhysicalSign entity
	 * @return IntegrationResult
	 */
	@POST
	@Path("/physicalSignDelete")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public IntegrationResult deletePhysicalSign(PhysicalSign physicalSign){
		PhysicalSignService physicalSignService = new PhysicalSignService();
		return physicalSignService.deletePhysicalSign(physicalSign);
	}
}
