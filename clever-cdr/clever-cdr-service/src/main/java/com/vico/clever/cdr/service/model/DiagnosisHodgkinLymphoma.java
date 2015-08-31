package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisHodgkinLymphoma {
	private String diagnosisID;//诊断ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String sampleType;//样本类型
	private String pathologicalType;//病理类型
	private String stage;//分期
	private String aggressiveSite;//侵犯部位
	private String tumorSize;//瘤灶大小
	private String Bsymptom;//B症状
	private String IPSScore;//IPS评分
	private Date diagnosisDatetime;//确诊时间
	private Date recrudescentDatetime;//复发时间
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
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public String getPathologicalType() {
		return pathologicalType;
	}
	public void setPathologicalType(String pathologicalType) {
		this.pathologicalType = pathologicalType;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getAggressiveSite() {
		return aggressiveSite;
	}
	public void setAggressiveSite(String aggressiveSite) {
		this.aggressiveSite = aggressiveSite;
	}
	public String getTumorSize() {
		return tumorSize;
	}
	public void setTumorSize(String tumorSize) {
		this.tumorSize = tumorSize;
	}
	public String getBsymptom() {
		return Bsymptom;
	}
	public void setBsymptom(String bsymptom) {
		Bsymptom = bsymptom;
	}
	public String getIPSScore() {
		return IPSScore;
	}
	public void setIPSScore(String iPSScore) {
		IPSScore = iPSScore;
	}
	public Date getDiagnosisDatetime() {
		return diagnosisDatetime;
	}
	public void setDiagnosisDatetime(Date diagnosisDatetime) {
		this.diagnosisDatetime = diagnosisDatetime;
	}
	public Date getRecrudescentDatetime() {
		return recrudescentDatetime;
	}
	public void setRecrudescentDatetime(Date recrudescentDatetime) {
		this.recrudescentDatetime = recrudescentDatetime;
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
