package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EpigeneticTyerapy {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱ID
	private String epigeneticTherapyID;//表观治疗ID(*)
	private String clinicalComment;//临床评估
	private Date startDatetime;//开始时间
	private Date endDatetime;//结束时间
	private int continuousDays;//持续天数
	private String adverseReaction;//不良反应
	private String adverseReationDegree;//不良反应程度
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
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getEpigeneticTherapyID() {
		return epigeneticTherapyID;
	}
	public void setEpigeneticTherapyID(String epigeneticTherapyID) {
		this.epigeneticTherapyID = epigeneticTherapyID;
	}
	public String getClinicalComment() {
		return clinicalComment;
	}
	public void setClinicalComment(String clinicalComment) {
		this.clinicalComment = clinicalComment;
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
	public int getContinuousDays() {
		return continuousDays;
	}
	public void setContinuousDays(int continuousDays) {
		this.continuousDays = continuousDays;
	}
	public String getAdverseReaction() {
		return adverseReaction;
	}
	public void setAdverseReaction(String adverseReaction) {
		this.adverseReaction = adverseReaction;
	}
	public String getAdverseReationDegree() {
		return adverseReationDegree;
	}
	public void setAdverseReationDegree(String adverseReationDegree) {
		this.adverseReationDegree = adverseReationDegree;
	}
	public String getOtherInfomation() {
		return otherInfomation;
	}
	public void setOtherInfomation(String otherInfomation) {
		this.otherInfomation = otherInfomation;
	}
	
}
