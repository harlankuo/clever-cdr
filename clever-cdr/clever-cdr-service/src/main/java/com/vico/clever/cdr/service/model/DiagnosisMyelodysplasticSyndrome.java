package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisMyelodysplasticSyndrome {
	private String diagnosisID;//诊断ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String classification;//分型
	private String IPSScore;//IPS评分
	private String WPSSScore;//WPSS评分
	private String riskAssessmentDegree;//危险度分级
	private Date diagnosisDatetime;//确诊时间
	private int transplantFlag;//标志患者是否移植,0否 1是
	private int HBV;//标记患者是否有乙肝,0否 1是
	public String getDiagnosisID() {
		return diagnosisID;
	}
	public void setDiagnosisID(String diagnosisID) {
		this.diagnosisID = diagnosisID;
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
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getIPSScore() {
		return IPSScore;
	}
	public void setIPSScore(String iPSScore) {
		IPSScore = iPSScore;
	}
	public String getWPSSScore() {
		return WPSSScore;
	}
	public void setWPSSScore(String wPSSScore) {
		WPSSScore = wPSSScore;
	}
	public String getRiskAssessmentDegree() {
		return riskAssessmentDegree;
	}
	public void setRiskAssessmentDegree(String riskAssessmentDegree) {
		this.riskAssessmentDegree = riskAssessmentDegree;
	}
	public Date getDiagnosisDatetime() {
		return diagnosisDatetime;
	}
	public void setDiagnosisDatetime(Date diagnosisDatetime) {
		this.diagnosisDatetime = diagnosisDatetime;
	}
	public int getTransplantFlag() {
		return transplantFlag;
	}
	public void setTransplantFlag(int transplantFlag) {
		this.transplantFlag = transplantFlag;
	}
	public int getHBV() {
		return HBV;
	}
	public void setHBV(int hBV) {
		HBV = hBV;
	}
	

}
