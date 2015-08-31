package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisLeukemia {
	private String diagnosisID;//诊断ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String sampleType;//样本类型
	private String leukemiaType;//白血病种类
	private String FABMorphology;//FAB形态学
	private String immumologyClassification;//免疫学分型
	private String aggressiveSite;//侵犯部位
	private Date diagnosisDatetime;//确诊时间
	private Date recrudescentDatetime;//首次复发时间
	private int transplantFlag;//标志患者是否移植
	private int HBV;//标记患者是否有乙肝
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
	public String getLeukemiaType() {
		return leukemiaType;
	}
	public void setLeukemiaType(String leukemiaType) {
		this.leukemiaType = leukemiaType;
	}
	public String getFABMorphology() {
		return FABMorphology;
	}
	public void setFABMorphology(String fABMorphology) {
		FABMorphology = fABMorphology;
	}
	public String getImmumologyClassification() {
		return immumologyClassification;
	}
	public void setImmumologyClassification(String immumologyClassification) {
		this.immumologyClassification = immumologyClassification;
	}
	public String getAggressiveSite() {
		return aggressiveSite;
	}
	public void setAggressiveSite(String aggressiveSite) {
		this.aggressiveSite = aggressiveSite;
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
