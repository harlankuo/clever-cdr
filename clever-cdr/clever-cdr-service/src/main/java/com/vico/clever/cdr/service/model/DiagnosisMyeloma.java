package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisMyeloma {
	private String diagnosisID;//诊断ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String heavyChain;//重链
	private String lightChain;//轻链
	private int nonSecretion;//不分泌
	private String DSStage;//D-S分期
	private String DSSubStage;//D-S亚分期
	private String aggressiveSite;//侵犯部位
	private String ISSStage;//SS分期
	private String ISSSubStage;//ISS亚分期
	private Date diagnosisDatetime;//确诊时间
	private Date recrudescentDatetime;//复发时间
	private int transplantFlag;//标志患者是否移植,0否 1是
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
	public String getHeavyChain() {
		return heavyChain;
	}
	public void setHeavyChain(String heavyChain) {
		this.heavyChain = heavyChain;
	}
	public String getLightChain() {
		return lightChain;
	}
	public void setLightChain(String lightChain) {
		this.lightChain = lightChain;
	}
	public int getNonSecretion() {
		return nonSecretion;
	}
	public void setNonSecretion(int nonSecretion) {
		this.nonSecretion = nonSecretion;
	}
	public String getDSStage() {
		return DSStage;
	}
	public void setDSStage(String dSStage) {
		DSStage = dSStage;
	}
	public String getDSSubStage() {
		return DSSubStage;
	}
	public void setDSSubStage(String dSSubStage) {
		DSSubStage = dSSubStage;
	}
	public String getAggressiveSite() {
		return aggressiveSite;
	}
	public void setAggressiveSite(String aggressiveSite) {
		this.aggressiveSite = aggressiveSite;
	}
	public String getISSStage() {
		return ISSStage;
	}
	public void setISSStage(String iSSStage) {
		ISSStage = iSSStage;
	}
	public String getISSSubStage() {
		return ISSSubStage;
	}
	public void setISSSubStage(String iSSSubStage) {
		ISSSubStage = iSSSubStage;
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
	

}
