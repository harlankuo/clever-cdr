package com.vico.clever.cdr.service.model;

import java.util.Date;

public class CellTherapyInfusion {
	private String requestID;//细胞治疗ID
	private int sequencyOfDay;//输注天序,标志是第几天进行输注
	private Date Datetime;//输注日期
	private String amount;//细胞输注的数量
	private String amountUnit;//输注单位
	private String reaction;//不良反应
	private String classification;//不良反应级别
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public int getSequencyOfDay() {
		return sequencyOfDay;
	}
	public void setSequencyOfDay(int sequencyOfDay) {
		this.sequencyOfDay = sequencyOfDay;
	}
	public Date getDatetime() {
		return Datetime;
	}
	public void setDatetime(Date datetime) {
		Datetime = datetime;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmountUnit() {
		return amountUnit;
	}
	public void setAmountUnit(String amountUnit) {
		this.amountUnit = amountUnit;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	

}
