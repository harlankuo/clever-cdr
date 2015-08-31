package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Radiotherapy {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱ID
	private String radiotherapyID;//放疗ID
	private int radiotherapyCount;//放疗次数
	private String clinicalComment;//临床评估
	private Date startDatetime;//放疗开始时间
	private Date endDatetime;//放疗结束时间
	private String site;//放射部位
	private int totalDose;//放射总剂量
	private String totalDoseUnit;//放射总剂量单位
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
	public String getRadiotherapyID() {
		return radiotherapyID;
	}
	public void setRadiotherapyID(String radiotherapyID) {
		this.radiotherapyID = radiotherapyID;
	}
	public int getRadiotherapyCount() {
		return radiotherapyCount;
	}
	public void setRadiotherapyCount(int radiotherapyCount) {
		this.radiotherapyCount = radiotherapyCount;
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public int getTotalDose() {
		return totalDose;
	}
	public void setTotalDose(int totalDose) {
		this.totalDose = totalDose;
	}
	public String getTotalDoseUnit() {
		return totalDoseUnit;
	}
	public void setTotalDoseUnit(String totalDoseUnit) {
		this.totalDoseUnit = totalDoseUnit;
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
