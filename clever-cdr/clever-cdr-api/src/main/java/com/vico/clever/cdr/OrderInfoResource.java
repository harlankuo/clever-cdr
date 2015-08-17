package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.entity.OrderInfoEntity;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.OrderInfo;
import com.vico.clever.cdr.service.model.OrderStatusInfo;
import com.vico.clever.cdr.service.service.OrderInfoService;

/**
 * Root resource (exposed at "OrderInfoResource" path)
 * @author Yuan.Ziyang
 */
@Path("orderInfoResource")
public class OrderInfoResource {

	protected final Logger logger = Logger.getLogger(this.getClass());
	private OrderInfoService orderInfoService=new OrderInfoService();
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getOrderInfoResource() {
        return "Got OrderInfoResource!";
    }
    /**
	 * 
	 * Element resource (exposed at "orderInfo" path);
	 * 
	 * Method handling the data entry of order information into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param orderExePaperEntity
	 *            input json or xml object data that contains OrderInfo and 
	 *            OrderStatusInfo info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
    @POST
    @Path("/orderInfo")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult orderInfo(OrderInfoEntity orderInfoEntity) {
    	IntegrationResult integrationResult = new IntegrationResult();
    	OrderInfo orderInfo=orderInfoEntity.getOrderInfo();
    	OrderStatusInfo orderStatusInfo=orderInfoEntity.getOrderStatusInfo();
    	integrationResult=orderInfoService.insertOrderInfo(orderInfo, orderStatusInfo);
        return integrationResult;
    }
    /**
	 * 
	 * Element resource (exposed at "orderStatus" path);
	 * 
	 * Method handling the data entry of order status information into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param orderExePaperEntity
	 *            input json or xml object data that contains OrderStatusInfo info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
    @POST
    @Path("/orderStatus")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult orderStatus(OrderStatusInfo orderStatusInfo){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=orderInfoService.updateOrderStatus(orderStatusInfo);
    	return integrationResult;
    }
}
