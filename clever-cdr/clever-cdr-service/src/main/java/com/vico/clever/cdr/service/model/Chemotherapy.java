package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Chemotherapy {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String chemotherapyID;//放疗ID(*)
	private String solutionName;//化疗方案名称
	private Date startDatetime;//化疗开始时间
	private Date endDatetime;//化疗结束时间
	private int period;//周期数
	private int commentCount;//评估次数
	private String comment;//评估
	private byte doseAdjustmentFlag;//剂量调整标志
	private String doseAdjustmentReason;//剂量调整原因
	private byte modifiedSolutionFlag;//方案更改标志
	private String modifiedReason;//方案更改原因
	private String adverseReaction;//不良反应
	private String adverseReactionDegree;//不良反应程度
	private String otherInfomation;//其他信息
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
	public String getChemotherapyID() {
		return chemotherapyID;
	}
	public void setChemotherapyID(String chemotherapyID) {
		this.chemotherapyID = chemotherapyID;
	}
	public String getSolutionName() {
		return solutionName;
	}
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}
	public Date getStartDatetime() {
		return startDatetime;
	}
	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}
	public Date getEndDatetime() {
		return endDatetime;
	}
	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public byte getDoseAdjustmentFlag() {
		return doseAdjustmentFlag;
	}
	public void setDoseAdjustmentFlag(byte doseAdjustmentFlag) {
		this.doseAdjustmentFlag = doseAdjustmentFlag;
	}
	public String getDoseAdjustmentReason() {
		return doseAdjustmentReason;
	}
	public void setDoseAdjustmentReason(String doseAdjustmentReason) {
		this.doseAdjustmentReason = doseAdjustmentReason;
	}
	public byte getModifiedSolutionFlag() {
		return modifiedSolutionFlag;
	}
	public void setModifiedSolutionFlag(byte modifiedSolutionFlag) {
		this.modifiedSolutionFlag = modifiedSolutionFlag;
	}
	public String getModifiedReason() {
		return modifiedReason;
	}
	public void setModifiedReason(String modifiedReason) {
		this.modifiedReason = modifiedReason;
	}
	public String getAdverseReaction() {
		return adverseReaction;
	}
	public void setAdverseReaction(String adverseReaction) {
		this.adverseReaction = adverseReaction;
	}
	public String getAdverseReactionDegree() {
		return adverseReactionDegree;
	}
	public void setAdverseReactionDegree(String adverseReactionDegree) {
		this.adverseReactionDegree = adverseReactionDegree;
	}
	public String getOtherInfomation() {
		return otherInfomation;
	}
	public void setOtherInfomation(String otherInfomation) {
		this.otherInfomation = otherInfomation;
	}
	
	
}
