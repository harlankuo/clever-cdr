package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EMRFirstPageAction {
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID（*）
	private String emrFirstPageID;//病案首页ID(*)
	private String titleName;//病历标题名称
	private String curStateCode;//标准状态代码
	private String curStateName;//标准状态
	private String careflowStepCode;//实际状态代码
	private String careflowStepName;//实际状态
	private String comment;//状态备注
	private Date actionDatetime;//执行时间
	private String performerCode;//执行人代码
	private String performerName;//执行人姓名
	private String performDeptCode;//执行科室代码
	private String performDeptName;//执行科室姓名
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
	public String getEmrFirstPageID() {
		return emrFirstPageID;
	}
	public void setEmrFirstPageID(String emrFirstPageID) {
		this.emrFirstPageID = emrFirstPageID;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
	

}
