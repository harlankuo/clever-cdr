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
 */
@Path("OrderInfoResource")
public class OrderInfoResource {

	protected final Logger logger = Logger.getLogger(this.getClass());
	private OrderInfoService orderInfoService=new OrderInfoService();
	
    @POST
    @Path("OrderInfo")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_XML })
    public IntegrationResult orderInfo(OrderInfoEntity orderInfoEntity) {
    	IntegrationResult integrationResult = new IntegrationResult();
    	OrderInfo orderInfo=orderInfoEntity.getOrderInfo();
    	OrderStatusInfo orderStatusInfo=orderInfoEntity.getOrderStatusInfo();
    	integrationResult=orderInfoService.insertOrderInfo(orderInfo, orderStatusInfo);
        return integrationResult;
    }
    
    @PUT
    @Path("OrderStatus")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_XML })
    public IntegrationResult orderStatus(OrderStatusInfo orderStatusInfo){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=orderInfoService.updateOrderStatus(orderStatusInfo);
    	return integrationResult;
    }
}
