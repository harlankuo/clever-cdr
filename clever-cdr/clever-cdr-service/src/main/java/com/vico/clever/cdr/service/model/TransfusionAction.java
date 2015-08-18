package com.vico.clever.cdr.service.model;

import java.util.Date;

public class TransfusionAction {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String transfusionID;//输血号码(*)
	private String curStateCode;//标准状态代码
	private String curStateName;//标准状态
	private String careflowStepCode;//实际状态代码
	private String careflowStepName;//实际状态
	private String reason;//输血原因
	private String reaction;//输血反应
	private Date actionDatetime;//执行时间
	private String performerCode;//执行人代码
	private String performerName;//执行人姓名
	private String performDeptCode;//执行科室代码
	private String performDeptName;//执行科室姓名
	public TransfusionAction() {
		super();
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
	public String getTransfusionID() {
		return transfusionID;
	}
	public void setTransfusionID(String transfusionID) {
		this.transfusionID = transfusionID;
	}
	public String getCurStateCode() {
		return curStateCode;
	}
	public void setCurStateCode(String curStateCode) {
		this.curStateCode = curStateCode;
	}
	public String getCurStateName() {
		return curStateName;
	}
	public void setCurStateName(String curStateName) {
		this.curStateName = curStateName;
	}
	public String getCareflowStepCode() {
		return careflowStepCode;
	}
	public void setCareflowStepCode(String careflowStepCode) {
		this.careflowStepCode = careflowStepCode;
	}
	public String getCareflowStepName() {
		return careflowStepName;
	}
	public void setCareflowStepName(String careflowStepName) {
		this.careflowStepName = careflowStepName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public Date getActionDatetime() {
		return actionDatetime;
	}
	public void setActionDatetime(Date actionDatetime) {
		this.actionDatetime = actionDatetime;
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
	public String getPerformDeptCode() {
		return performDeptCode;
	}
	public void setPerformDeptCode(String performDeptCode) {
		this.performDeptCode = performDeptCode;
	}
	public String getPerformDeptName() {
		return performDeptName;
	}
	public void setPerformDeptName(String performDeptName) {
		this.performDeptName = performDeptName;
	}
	@Override
	public String toString() {
		return "TransfusionAction [patientID=" + patientID + ", visitID="
				+ visitID + ", transfusionID=" + transfusionID
				+ ", curStateCode=" + curStateCode + ", curStateName="
				+ curStateName + ", careflowStepCode=" + careflowStepCode
				+ ", careflowStepName=" + careflowStepName + ", reason="
				+ reason + ", reaction=" + reaction + ", actionDatetime="
				+ actionDatetime + ", performerCode=" + performerCode
				+ ", performerName=" + performerName + ", performDeptCode="
				+ performDeptCode + ", performDeptName=" + performDeptName
				+ "]";
	}


}
