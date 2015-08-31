package com.vico.clever.cdr.service.model;

import java.util.Date;

public class FollowUpVisit {
	private String patientID;//病人号(*)
    private String visitID;//就诊号
    private String followUpID;//随访ID(*)
    private String followUpMode;//随访方式
    private Date followUpDatetime;//随访日期
    private String assessment;//评估
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
	public String getFollowUpID() {
		return followUpID;
	}
	public void setFollowUpID(String followUpID) {
		this.followUpID = followUpID;
	}
	public String getFollowUpMode() {
		return followUpMode;
	}
	public void setFollowUpMode(String followUpMode) {
		this.followUpMode = followUpMode;
	}
	public Date getFollowUpDatetime() {
		return followUpDatetime;
	}
	public void setFollowUpDatetime(Date followUpDatetime) {
		this.followUpDatetime = followUpDatetime;
	}
	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
    
}
