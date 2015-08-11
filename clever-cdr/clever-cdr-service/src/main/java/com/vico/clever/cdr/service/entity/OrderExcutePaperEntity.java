package com.vico.clever.cdr.service.entity;

import com.vico.clever.cdr.service.model.OrderExecutePaper;
import com.vico.clever.cdr.service.model.OrderExecutePaperStatus;

public class OrderExcutePaperEntity {
	private OrderExecutePaper orderExecutePaper;
	private OrderExecutePaperStatus orderExecutePaperStatus;
	public OrderExcutePaperEntity() {
		super();
	}
	public OrderExcutePaperEntity(OrderExecutePaper orderExecutePaper,
			OrderExecutePaperStatus orderExecutePaperStatus) {
		super();
		this.orderExecutePaper = orderExecutePaper;
		this.orderExecutePaperStatus = orderExecutePaperStatus;
	}
	public OrderExecutePaper getOrderExecutePaper() {
		return orderExecutePaper;
	}
	public void setOrderExecutePaper(OrderExecutePaper orderExecutePaper) {
		this.orderExecutePaper = orderExecutePaper;
	}
	public OrderExecutePaperStatus getOrderExecutePaperStatus() {
		return orderExecutePaperStatus;
	}
	public void setOrderExecutePaperStatus(
			OrderExecutePaperStatus orderExecutePaperStatus) {
		this.orderExecutePaperStatus = orderExecutePaperStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((orderExecutePaper == null) ? 0 : orderExecutePaper
						.hashCode());
		result = prime
				* result
				+ ((orderExecutePaperStatus == null) ? 0
						: orderExecutePaperStatus.hashCode());
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
		OrderExcutePaperEntity other = (OrderExcutePaperEntity) obj;
		if (orderExecutePaper == null) {
			if (other.orderExecutePaper != null)
				return false;
		} else if (!orderExecutePaper.equals(other.orderExecutePaper))
			return false;
		if (orderExecutePaperStatus == null) {
			if (other.orderExecutePaperStatus != null)
				return false;
		} else if (!orderExecutePaperStatus
				.equals(other.orderExecutePaperStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderExcutePaperEntity [orderExecutePaper=" + orderExecutePaper
				+ ", orderExecutePaperStatus=" + orderExecutePaperStatus + "]";
	}
}
