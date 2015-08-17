package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.MedicationOrderEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.MedcationOrder;
import com.vico.clever.cdr.service.model.MedcationOrderStatus;
import com.vico.clever.cdr.service.service.MedicationOrderInfoService;

/**
 * Root resource (exposed at "MedicationOrderResource" path)
 * @author Yuan.Ziyang
 */
@Path("MedicationOrderResource")
public class MedicationOrderResource {
	
	private MedicationOrderInfoService medOrderService=new MedicationOrderInfoService();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMedicationOrder() {
        return "Got MedicationOrderResource!";
    }
    /**
	 * 
	 * Element resource (exposed at "medicationOrder" path);
	 * 
	 * Method handling the data entry of medicine order information into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param medicationOrderEntity
	 *            input json or xml object data that contains medicationOrder and 
	 *            medicationOrderStatus info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
    @POST
    @Path("/medicationOrder")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult medicationOrderInfo(MedicationOrderEntity medicationOrderEntity){
    	IntegrationResult integrationResult=new IntegrationResult();
    	MedcationOrder medicationOrder=medicationOrderEntity.getMedicationOrder();
    	MedcationOrderStatus medicationOrderStatus=medicationOrderEntity.getMedicationOrderStatus();
    	integrationResult=medOrderService.medicationOrderInfoExtract(medicationOrder, medicationOrderStatus);
    	return integrationResult;
    }
    
    /**
	 * 
	 * Element resource (exposed at "medicationOrderStatus" path);
	 * 
	 * Method handling the data entry of medicine order status information into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param medicationOrderStatus
	 *            input json or xml object data that contains medicationOrderStatus info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
    @POST
    @Path("/medicationOrderStatus")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult  medicationOrderStatusInfo(MedcationOrderStatus medicationOrderStatus){
    	IntegrationResult integrationResult=new IntegrationResult();
    	integrationResult=medOrderService.updateMedicationOrderStatus(medicationOrderStatus);
    	return integrationResult;
    }
}
