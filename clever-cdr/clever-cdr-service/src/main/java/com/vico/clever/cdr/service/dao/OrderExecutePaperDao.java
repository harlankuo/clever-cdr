package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.OrderExecutePaper;
import com.vico.clever.cdr.service.model.OrderExecutePaperStatus;

public interface OrderExecutePaperDao {
	
	public OrderExecutePaper selectOrderExecuteInfo(String orderExcuteID);
	
	public int deleteOrderExecuteInfo(String orderExcuteID);
	
	public int updateOrderExecuteInfo(OrderExecutePaper orderExecutePaper);
	
	public int insertOrderExecuteInfo(OrderExecutePaper orderExecutePaper);
	
	public OrderExecutePaperStatus selectOrderExecutePaperStatus(String orderExcuteID);
	
	public int deleteOrderExecutePaperStatus(String orderExcuteID);
	
	public int insertOrderExecutePaperStatus(OrderExecutePaperStatus orderExecutePaperStatus);
	
	public int updateOrderExecutePaperStatus(OrderExecutePaperStatus orderExecutePaperStatus);
	
}
