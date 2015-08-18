package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderInfo")
public class OrderInfo {
	private String orderID;// 医嘱ID,(*)
	private String patientID;// 病人ID,(*)
	private String visitID;// 就诊ID,(*);
	private String orderNO;// 医嘱序号,(*)
	private String orderSubNO;// 医嘱子序号(*)
	private int emergency;// 紧急医嘱属性,0-普通，1-紧急，默认为0
	private String motherOrBaby;// 母婴属性,0-母亲，从1开始表示第几个婴儿
	private int reservedOrder;// 备用医嘱属性,0-正常医嘱，1-备用医嘱
	private int subsequentOrder;// 补录医嘱属性,0-正常医嘱，1-后来补录的医嘱
	private int repeatOrder;// 是否长期医嘱,1-长期，0-临时索引(*)
	private String orderClassCode;// 医嘱类别代码
	private String orderClassName;// 医嘱类别

	public OrderInfo() {
		super();
	}

	public OrderInfo(String orderID, String patientID, String visitID,
			String orderNO, String orderSubNO, int emergency,
			String motherOrBaby, int reservedOrder, int subsequentOrder,
			int repeatOrder, String orderClassCode, String orderClassName) {
		super();
		this.orderID = orderID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderNO = orderNO;
		this.orderSubNO = orderSubNO;
		this.emergency = emergency;
		this.motherOrBaby = motherOrBaby;
		this.reservedOrder = reservedOrder;
		this.subsequentOrder = subsequentOrder;
		this.repeatOrder = repeatOrder;
		this.orderClassCode = orderClassCode;
		this.orderClassName = orderClassName;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getVisitID() {
		return visitID;
	}

	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}

	public String getOrderNO() {
		return orderNO;
	}

	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
	}

	public String getOrderSubNO() {
		return orderSubNO;
	}

	public void setOrderSubNO(String orderSubNO) {
		this.orderSubNO = orderSubNO;
	}

	public int getEmergency() {
		return emergency;
	}

	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public String getMotherOrBaby() {
		return motherOrBaby;
	}

	public void setMotherOrBaby(String motherOrBaby) {
		this.motherOrBaby = motherOrBaby;
	}

	public int getReservedOrder() {
		return reservedOrder;
	}

	public void setReservedOrder(int reservedOrder) {
		this.reservedOrder = reservedOrder;
	}

	public int getSubsequentOrder() {
		return subsequentOrder;
	}

	public void setSubsequentOrder(int subsequentOrder) {
		this.subsequentOrder = subsequentOrder;
	}

	public int getRepeatOrder() {
		return repeatOrder;
	}

	public void setRepeatOrder(int repeatOrder) {
		this.repeatOrder = repeatOrder;
	}

	public String getOrderClassCode() {
		return orderClassCode;
	}

	public void setOrderClassCode(String orderClassCode) {
		this.orderClassCode = orderClassCode;
	}

	public String getOrderClassName() {
		return orderClassName;
	}

	public void setOrderClassName(String orderClassName) {
		this.orderClassName = orderClassName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emergency;
		result = prime * result
				+ ((motherOrBaby == null) ? 0 : motherOrBaby.hashCode());
		result = prime * result
				+ ((orderClassCode == null) ? 0 : orderClassCode.hashCode());
		result = prime * result
				+ ((orderClassName == null) ? 0 : orderClassName.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((orderNO == null) ? 0 : orderNO.hashCode());
		result = prime * result
				+ ((orderSubNO == null) ? 0 : orderSubNO.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + repeatOrder;
		result = prime * result + reservedOrder;
		result = prime * result + subsequentOrder;
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
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
		OrderInfo other = (OrderInfo) obj;
		if (emergency != other.emergency)
			return false;
		if (motherOrBaby == null) {
			if (other.motherOrBaby != null)
				return false;
		} else if (!motherOrBaby.equals(other.motherOrBaby))
			return false;
		if (orderClassCode == null) {
			if (other.orderClassCode != null)
				return false;
		} else if (!orderClassCode.equals(other.orderClassCode))
			return false;
		if (orderClassName == null) {
			if (other.orderClassName != null)
				return false;
		} else if (!orderClassName.equals(other.orderClassName))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (orderNO == null) {
			if (other.orderNO != null)
				return false;
		} else if (!orderNO.equals(other.orderNO))
			return false;
		if (orderSubNO == null) {
			if (other.orderSubNO != null)
				return false;
		} else if (!orderSubNO.equals(other.orderSubNO))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (repeatOrder != other.repeatOrder)
			return false;
		if (reservedOrder != other.reservedOrder)
			return false;
		if (subsequentOrder != other.subsequentOrder)
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderID=" + orderID + ", patientID=" + patientID
				+ ", visitID=" + visitID + ", orderNO=" + orderNO
				+ ", orderSubNO=" + orderSubNO + ", emergency=" + emergency
				+ ", motherOrBaby=" + motherOrBaby + ", reservedOrder="
				+ reservedOrder + ", subsequentOrder=" + subsequentOrder
				+ ", repeatOrder=" + repeatOrder + ", orderClassCode="
				+ orderClassCode + ", orderClassName=" + orderClassName + "]";
	}

}
