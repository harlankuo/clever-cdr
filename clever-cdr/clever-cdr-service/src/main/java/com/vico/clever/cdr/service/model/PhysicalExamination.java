package com.vico.clever.cdr.service.model;

import java.util.Date;

public class PhysicalExamination {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String requestID;//体检ID(*)
	private String examItemCode;//项目代码
	private String examItemName;//项目
	private String examResultCode;//项目结果代码
	private String examResultName;//项目结果
	private String performerCode;//检查人员代码
	private String performerName;//检查人员名称
	private Date recordDatetime;//记录时间
	private String recorderCode;//记录员代码
	private String recorderName;//记录员姓名
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
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getExamItemCode() {
		return examItemCode;
	}
	public void setExamItemCode(String examItemCode) {
		this.examItemCode = examItemCode;
	}
	public String getExamItemName() {
		return examItemName;
	}
	public void setExamItemName(String examItemName) {
		this.examItemName = examItemName;
	}
	public String getExamResultCode() {
		return examResultCode;
	}
	public void setExamResultCode(String examResultCode) {
		this.examResultCode = examResultCode;
	}
	public String getExamResultName() {
		return examResultName;
	}
	public void setExamResultName(String examResultName) {
		this.examResultName = examResultName;
	}
	public String getPerformerCode() {
		return performerCode;
	}
	public void setPerformerCode(String performerCode) {
		this.performerCode = performerCode;
	}
	public String getPerformerName() {
		return performerName;
	}
	public void setPerformerName(String performerName) {
		this.performerName = performerName;
	}
	public Date getRecordDatetime() {
		return recordDatetime;
	}
	public void setRecordDatetime(Date recordDatetime) {
		this.recordDatetime = recordDatetime;
	}
	public String getRecorderCode() {
		return recorderCode;
	}
	public void setRecorderCode(String recorderCode) {
		this.recorderCode = recorderCode;
	}
	public String getRecorderName() {
		return recorderName;
	}
	public void setRecorderName(String recorderName) {
		this.recorderName = recorderName;
	}
	
    
}
