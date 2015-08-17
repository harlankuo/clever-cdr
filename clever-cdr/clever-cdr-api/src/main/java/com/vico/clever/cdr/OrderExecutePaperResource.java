package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.OrderExcutePaperEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.OrderExecutePaper;
import com.vico.clever.cdr.service.model.OrderExecutePaperStatus;
import com.vico.clever.cdr.service.service.OrderExcutePaperService;

/**
 * Root resource (exposed at "orderExecutePaperResource" path)
 * @author Yuan.Ziyang
 */
@Path("orderExecutePaperResource")
public class OrderExecutePaperResource {
	
	private OrderExcutePaperService orderExcutePaperService=new OrderExcutePaperService();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getOrderExecutePaperResource() {
        return "Got OrderExecutePaperResource!";
    }
    
    /**
	 * 
	 * Element resource (exposed at "orderExecute" path);
	 * 
	 * Method handling the data entry of order execute paper information into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param orderExePaperEntity
	 *            input json or xml object data that contains OrderExecutePaper and 
	 *            OrderExecutePaperStatus info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
    @POST
    @Path("/orderExecute")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult orderExcute(OrderExcutePaperEntity orderExePaperEntity){
    	IntegrationResult integrationResult=new IntegrationResult();
    	OrderExecutePaper orderExecutePaper=orderExePaperEntity.getOrderExecutePaper();
    	OrderExecutePaperStatus orderExecutePaperStatus=orderExePaperEntity.getOrderExecutePaperStatus();
    	integrationResult=orderExcutePaperService.orderExcute(orderExecutePaper, orderExecutePaperStatus);
    	return integrationResult;
    }
    /**
	 * 
	 * Element resource (exposed at "orderExecuteStatus" path);
	 * 
	 * Method handling the data entry of order execute status information into CDR with HTTP PUT requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param orderExePaperEntity
	 *            input json or xml object data that contains 
	 *            OrderExecutePaperStatus info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
    @PUT
    @Path("/orderExecuteStatus")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult updateOrderExecute(OrderExecutePaperStatus orderExecutePaperStatus){
    	IntegrationResult integrationResult=new IntegrationResult();
    	integrationResult=orderExcutePaperService.updateOrderExecute(orderExecutePaperStatus);
    	return integrationResult;
    }
}
