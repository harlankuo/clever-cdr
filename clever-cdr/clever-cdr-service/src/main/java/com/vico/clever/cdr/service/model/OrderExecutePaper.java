package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderExecutePaper")
public class OrderExecutePaper {
	private String orderExcuteID;// 执行单号码(*)
	private String orderID;// 医嘱ID(*)
	private String orderNO;// 医嘱序号(*)
	private String referenceID;// 引用ID,对应各类医嘱主键，如检查申请号，检验申请号
	private String patientID;// 病人ID(*)
	private String visitID;// 就诊ID(*)
	private String performClassName;// 执行单类别名称,例如检查单、检验单
	private String performClassCode;// 执行单类别代码
	private String orderItem;// 医嘱内容
	private Date scheduleDateTime;// 计划执行日期时间
	private int performSerialNumber;// 执行序号,本条项目在患者某天执行单中的序号，从1开始。
	private int performStepNumber;// 执行步数,表示一条医嘱的第几步执行
	private int schemaPrint;// 执行单打印标记,0-未打印 1-打印
	private int labelPrint;// 标签打印标记,0-未打印 1-打印

	public OrderExecutePaper() {
		super();
	}

	public OrderExecutePaper(String orderExcuteID, String orderID,
			String orderNO, String referenceID, String patientID,
			String visitID, String performClassName, String performClassCode,
			String orderItem, Date scheduleDateTime, int performSerialNumber,
			int performStepNumber, int schemaPrint, int labelPrint) {
		super();
		this.orderExcuteID = orderExcuteID;
		this.orderID = orderID;
		this.orderNO = orderNO;
		this.referenceID = referenceID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.performClassName = performClassName;
		this.performClassCode = performClassCode;
		this.orderItem = orderItem;
		this.scheduleDateTime = scheduleDateTime;
		this.performSerialNumber = performSerialNumber;
		this.performStepNumber = performStepNumber;
		this.schemaPrint = schemaPrint;
		this.labelPrint = labelPrint;
	}

	public String getOrderExcuteID() {
		return orderExcuteID;
	}

	public void setOrderExcuteID(String orderExcuteID) {
		this.orderExcuteID = orderExcuteID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderNO() {
		return orderNO;
	}

	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
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

	public String getPerformClassName() {
		return performClassName;
	}

	public void setPerformClassName(String performClassName) {
		this.performClassName = performClassName;
	}

	public String getPerformClassCode() {
		return performClassCode;
	}

	public void setPerformClassCode(String performClassCode) {
		this.performClassCode = performClassCode;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public Date getScheduleDateTime() {
		return scheduleDateTime;
	}

	public void setScheduleDateTime(Date scheduleDateTime) {
		this.scheduleDateTime = scheduleDateTime;
	}

	public int getPerformSerialNumber() {
		return performSerialNumber;
	}

	public void setPerformSerialNumber(int performSerialNumber) {
		this.performSerialNumber = performSerialNumber;
	}

	public int getPerformStepNumber() {
		return performStepNumber;
	}

	public void setPerformStepNumber(int performStepNumber) {
		this.performStepNumber = performStepNumber;
	}

	public int getSchemaPrint() {
		return schemaPrint;
	}

	public void setSchemaPrint(int schemaPrint) {
		this.schemaPrint = schemaPrint;
	}

	public int getLabelPrint() {
		return labelPrint;
	}

	public void setLabelPrint(int labelPrint) {
		this.labelPrint = labelPrint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + labelPrint;
		result = prime * result
				+ ((orderExcuteID == null) ? 0 : orderExcuteID.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((orderItem == null) ? 0 : orderItem.hashCode());
		result = prime * result + ((orderNO == null) ? 0 : orderNO.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((performClassCode == null) ? 0 : performClassCode.hashCode());
		result = prime
				* result
				+ ((performClassName == null) ? 0 : performClassName.hashCode());
		result = prime * result + performSerialNumber;
		result = prime * result + performStepNumber;
		result = prime * result
				+ ((referenceID == null) ? 0 : referenceID.hashCode());
		result = prime
				* result
				+ ((scheduleDateTime == null) ? 0 : scheduleDateTime.hashCode());
		result = prime * result + schemaPrint;
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
		OrderExecutePaper other = (OrderExecutePaper) obj;
		if (labelPrint != other.labelPrint)
			return false;
		if (orderExcuteID == null) {
			if (other.orderExcuteID != null)
				return false;
		} else if (!orderExcuteID.equals(other.orderExcuteID))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (orderItem == null) {
			if (other.orderItem != null)
				return false;
		} else if (!orderItem.equals(other.orderItem))
			return false;
		if (orderNO == null) {
			if (other.orderNO != null)
				return false;
		} else if (!orderNO.equals(other.orderNO))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (performClassCode == null) {
			if (other.performClassCode != null)
				return false;
		} else if (!performClassCode.equals(other.performClassCode))
			return false;
		if (performClassName == null) {
			if (other.performClassName != null)
				return false;
		} else if (!performClassName.equals(other.performClassName))
			return false;
		if (performSerialNumber != other.performSerialNumber)
			return false;
		if (performStepNumber != other.performStepNumber)
			return false;
		if (referenceID == null) {
			if (other.referenceID != null)
				return false;
		} else if (!referenceID.equals(other.referenceID))
			return false;
		if (scheduleDateTime == null) {
			if (other.scheduleDateTime != null)
				return false;
		} else if (!scheduleDateTime.equals(other.scheduleDateTime))
			return false;
		if (schemaPrint != other.schemaPrint)
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
		return "OrderExecutePaper [orderExcuteID=" + orderExcuteID
				+ ", orderID=" + orderID + ", orderNO=" + orderNO
				+ ", referenceID=" + referenceID + ", patientID=" + patientID
				+ ", visitID=" + visitID + ", performClassName="
				+ performClassName + ", performClassCode=" + performClassCode
				+ ", orderItem=" + orderItem + ", scheduleDateTime="
				+ scheduleDateTime + ", performSerialNumber="
				+ performSerialNumber + ", performStepNumber="
				+ performStepNumber + ", schemaPrint=" + schemaPrint
				+ ", labelPrint=" + labelPrint + "]";
	}

}
