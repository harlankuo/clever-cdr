package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.OrderInfo;
import com.vico.clever.cdr.service.model.OrderStatusInfo;
@XmlRootElement(name="OrderInfoEntity")
public class OrderInfoEntity {
	private OrderInfo orderInfo;
	private OrderStatusInfo orderStatusInfo;
	public OrderInfoEntity() {
		super();
	}
	public OrderInfoEntity(OrderInfo orderInfo, OrderStatusInfo orderStatusInfo) {
		super();
		this.orderInfo = orderInfo;
		this.orderStatusInfo = orderStatusInfo;
	}
	public OrderInfo getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public OrderStatusInfo getOrderStatusInfo() {
		return orderStatusInfo;
	}
	public void setOrderStatusInfo(OrderStatusInfo orderStatusInfo) {
		this.orderStatusInfo = orderStatusInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((orderInfo == null) ? 0 : orderInfo.hashCode());
		result = prime * result
				+ ((orderStatusInfo == null) ? 0 : orderStatusInfo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderInfoEntity other = (OrderInfoEntity) obj;
		if (orderInfo == null) {
			if (other.orderInfo != null)
				return false;
		} else if (!orderInfo.equals(other.orderInfo))
			return false;
		if (orderStatusInfo == null) {
			if (other.orderStatusInfo != null)
				return false;
		} else if (!orderStatusInfo.equals(other.orderStatusInfo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderInfoEntity [orderInfo=" + orderInfo + ", orderStatusInfo="
				+ orderStatusInfo + "]";
	}
	
}
