package com.vico.clever.cdr.service.model;

import java.util.Date;

public class CellPhenotype {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱ID
	private String cellPhenotypeID;//细胞表型ID(*)
	private String classification;//类别
	private String testSample;//检测标本
	private String items;//检测项目
	private Date testDatetime;//检测时间

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
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getCellPhenotypeID() {
		return cellPhenotypeID;
	}
	public void setCellPhenotypeID(String cellPhenotypeID) {
		this.cellPhenotypeID = cellPhenotypeID;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getTestSample() {
		return testSample;
	}
	public void setTestSample(String testSample) {
		this.testSample = testSample;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Date getTestDatetime() {
		return testDatetime;
	}
	public void setTestDatetime(Date testDatetime) {
		this.testDatetime = testDatetime;
	}
	
}
