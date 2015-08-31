package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisSolidTumor {
	private String diagnosisID;//诊断ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String sampleType;//样本类型
	private String pathologicalType;//病理类型
	private String differentiatedDegree;//分化程度
	private String system;//系统
	private String site;//部位
	private String tumorSize;//肿瘤大小
	private String Tstage;//T分期
	private String NStage;//N分期
	private String MStage;//M分期
	private String coprehensiveStage;//综合分期
	private String transferSite;//转移部位
	private Date diagnosisDatetime;//确诊时间
	private Date recrudescentDatetime;//复发时间
	private Date transferDatetime;//转移时间
	private int operationFlag;//标志患者是否手术 0否 1是
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
	public String getDifferentiatedDegree() {
		return differentiatedDegree;
	}
	public void setDifferentiatedDegree(String differentiatedDegree) {
		this.differentiatedDegree = differentiatedDegree;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTumorSize() {
		return tumorSize;
	}
	public void setTumorSize(String tumorSize) {
		this.tumorSize = tumorSize;
	}
	public String getTstage() {
		return Tstage;
	}
	public void setTstage(String tstage) {
		Tstage = tstage;
	}
	public String getNStage() {
		return NStage;
	}
	public void setNStage(String nStage) {
		NStage = nStage;
	}
	public String getMStage() {
		return MStage;
	}
	public void setMStage(String mStage) {
		MStage = mStage;
	}
	public String getCoprehensiveStage() {
		return coprehensiveStage;
	}
	public void setCoprehensiveStage(String coprehensiveStage) {
		this.coprehensiveStage = coprehensiveStage;
	}
	public String getTransferSite() {
		return transferSite;
	}
	public void setTransferSite(String transferSite) {
		this.transferSite = transferSite;
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
	public Date getTransferDatetime() {
		return transferDatetime;
	}
	public void setTransferDatetime(Date transferDatetime) {
		this.transferDatetime = transferDatetime;
	}
	public int getOperationFlag() {
		return operationFlag;
	}
	public void setOperationFlag(int operationFlag) {
		this.operationFlag = operationFlag;
	}
	

}
