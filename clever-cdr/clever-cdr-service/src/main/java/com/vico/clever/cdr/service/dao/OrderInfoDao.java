package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.OrderInfo;
import com.vico.clever.cdr.service.model.OrderStatusInfo;


public interface OrderInfoDao {
	
   public OrderInfo selectOrderInfoByOrderId(String orderID);
   
   public int deleteOrderInfoByOrderId(String orderID);
   
   public int insertOrderInfo(OrderInfo orderInfo);
   
   public int updateOrderInfoByOrderId(OrderInfo orderInfo);
   
   public int selectOrderInfoCount(String orderID);
   
   
   public OrderStatusInfo selectOrderStatusInfo(String orderID);
   
   public int deleteOrderStatusInfo(String orderID);
   
   public int insertOrderStatusInfo(OrderStatusInfo orderStatusInfo);
   
   public int updateOrderStatusInfo(OrderStatusInfo orderStatusInfo);
}