package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryReqInfo {
	private String surgeryReqID;//手术申请号(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String orderID;//医嘱ID
	private String diagnosisBefore;//术前诊断
	private String operativeDoctorID;//手术医生代码
	private String operativeDoctorName;//手术医生名称
	private Date scheduleDate;//拟定手术日期时间
	private String urgencyCode;//用于标识是否是急诊手术，0-择期；1-急诊。
	private String urgencyName;//急诊标志
	private String isolationIndicatorCode;//隔离标志名称，例如正常、隔离、放射等
	private String isolationIndicator;//隔离标志名称，例如正常、隔离、放射等
	private String relevantLabTest;//相关化验结果
	private String operativeDeptCode;//手术室代码
	private String operativeDeptName;//手术室名称
	private String comments;//备注
	private String reqDeptCode;//手术申请科室代码
	private String reqDeptName;//手术申请科室名称
	private String reqDoctorID;//申请医生工号
	private String reqDoctorName;//申请医生姓名
	private Date reqDate;//申请日期及时间
	private String requestStatus;//手术申请状态
	private String dosage;//记录手术过程中用药剂量
	private String dosageUnit;//记录手术过程中用药剂量单位
	private String administrationCode;//记录手术过程中用药剂量给药途径代码
	private String administrationName;//记录手术过程中用药剂量给药途径
	private int frequency;//频率描述
	private String frequencyUnit;//频率描述单位
	private int frequencyInterval;//记录手术过程中用药剂量频率间隔
	private String frequencyIntervalUnit;//记录手术过程中用药剂量频率间隔单位
	public String getSurgeryReqID() {
		return surgeryReqID;
	}
	public void setSurgeryReqID(String surgeryReqID) {
		this.surgeryReqID = surgeryReqID;
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
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getDiagnosisBefore() {
		return diagnosisBefore;
	}
	public void setDiagnosisBefore(String diagnosisBefore) {
		this.diagnosisBefore = diagnosisBefore;
	}
	public String getOperativeDoctorID() {
		return operativeDoctorID;
	}
	public void setOperativeDoctorID(String operativeDoctorID) {
		this.operativeDoctorID = operativeDoctorID;
	}
	public String getOperativeDoctorName() {
		return operativeDoctorName;
	}
	public void setOperativeDoctorName(String operativeDoctorName) {
		this.operativeDoctorName = operativeDoctorName;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getUrgencyCode() {
		return urgencyCode;
	}
	public void setUrgencyCode(String urgencyCode) {
		this.urgencyCode = urgencyCode;
	}
	public String getUrgencyName() {
		return urgencyName;
	}
	public void setUrgencyName(String urgencyName) {
		this.urgencyName = urgencyName;
	}
	public String getIsolationIndicatorCode() {
		return isolationIndicatorCode;
	}
	public void setIsolationIndicatorCode(String isolationIndicatorCode) {
		this.isolationIndicatorCode = isolationIndicatorCode;
	}
	public String getIsolationIndicator() {
		return isolationIndicator;
	}
	public void setIsolationIndicator(String isolationIndicator) {
		this.isolationIndicator = isolationIndicator;
	}
	public String getRelevantLabTest() {
		return relevantLabTest;
	}
	public void setRelevantLabTest(String relevantLabTest) {
		this.relevantLabTest = relevantLabTest;
	}
	public String getOperativeDeptCode() {
		return operativeDeptCode;
	}
	public void setOperativeDeptCode(String operativeDeptCode) {
		this.operativeDeptCode = operativeDeptCode;
	}
	public String getOperativeDeptName() {
		return operativeDeptName;
	}
	public void setOperativeDeptName(String operativeDeptName) {
		this.operativeDeptName = operativeDeptName;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getReqDeptCode() {
		return reqDeptCode;
	}
	public void setReqDeptCode(String reqDeptCode) {
		this.reqDeptCode = reqDeptCode;
	}
	public String getReqDeptName() {
		return reqDeptName;
	}
	public void setReqDeptName(String reqDeptName) {
		this.reqDeptName = reqDeptName;
	}
	public String getReqDoctorID() {
		return reqDoctorID;
	}
	public void setReqDoctorID(String reqDoctorID) {
		this.reqDoctorID = reqDoctorID;
	}
	public String getReqDoctorName() {
		return reqDoctorName;
	}
	public void setReqDoctorName(String reqDoctorName) {
		this.reqDoctorName = reqDoctorName;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getDosageUnit() {
		return dosageUnit;
	}
	public void setDosageUnit(String dosageUnit) {
		this.dosageUnit = dosageUnit;
	}
	public String getAdministrationCode() {
		return administrationCode;
	}
	public void setAdministrationCode(String administrationCode) {
		this.administrationCode = administrationCode;
	}
	public String getAdministrationName() {
		return administrationName;
	}
	public void setAdministrationName(String administrationName) {
		this.administrationName = administrationName;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public String getFrequencyUnit() {
		return frequencyUnit;
	}
	public void setFrequencyUnit(String frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}
	public int getFrequencyInterval() {
		return frequencyInterval;
	}
	public void setFrequencyInterval(int frequencyInterval) {
		this.frequencyInterval = frequencyInterval;
	}
	public String getFrequencyIntervalUnit() {
		return frequencyIntervalUnit;
	}
	public void setFrequencyIntervalUnit(String frequencyIntervalUnit) {
		this.frequencyIntervalUnit = frequencyIntervalUnit;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = result*31 + (surgeryReqID==null?0:surgeryReqID.hashCode());
		result = result*31 + (patientID==null?0:patientID.hashCode());
		result = result*31 + (visitID==null?0:visitID.hashCode());
		result = result*31 + (orderID==null?0:orderID.hashCode());
		result = result*31 + (diagnosisBefore==null?0:diagnosisBefore.hashCode());
		result = result*31 + (operativeDoctorID==null?0:operativeDoctorID.hashCode());
		result = result*31 + (operativeDoctorName==null?0:operativeDoctorName.hashCode());
		result = result*31 + (scheduleDate==null?0:scheduleDate.hashCode());
		result = result*31 + (urgencyCode==null?0:urgencyCode.hashCode());
		result = result*31 + (urgencyName==null?0:urgencyName.hashCode());
		result = result*31 + (isolationIndicatorCode==null?0:isolationIndicatorCode.hashCode());
		result = result*31 + (isolationIndicator==null?0:isolationIndicator.hashCode());
		result = result*31 + (relevantLabTest==null?0:relevantLabTest.hashCode());
		result = result*31 + (operativeDeptCode==null?0:operativeDeptCode.hashCode());
		result = result*31 + (operativeDeptName==null?0:operativeDeptName.hashCode());
		result = result*31 + (comments==null?0:comments.hashCode());
		result = result*31 + (reqDeptCode==null?0:reqDeptCode.hashCode());
		result = result*31 + (reqDeptName==null?0:reqDeptName.hashCode());
		result = result*31 + (reqDoctorID==null?0:reqDoctorID.hashCode());
		result = result*31 + (reqDoctorName==null?0:reqDoctorName.hashCode());
		result = result*31 + (reqDate==null?0:reqDate.hashCode());
		result = result*31 + (requestStatus==null?0:requestStatus.hashCode());
		result = result*31 + (dosage==null?0:dosage.hashCode());
		result = result*31 + (dosageUnit==null?0:dosageUnit.hashCode());
		result = result*31 + (administrationCode==null?0:administrationCode.hashCode());
		result = result*31 + (administrationName==null?0:administrationName.hashCode());
		result = result*31 + (frequency==0?0:frequency);
		result = result*31 + (frequencyUnit==null?0:frequencyUnit.hashCode());
		result = result*31 + (frequencyInterval==0?0:frequencyInterval);
		result = result*31 + (frequencyIntervalUnit==null?0:frequencyIntervalUnit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode()) return false;
		if (this==null||obj==null) return false;
		if (this.getClass()!=obj.getClass()) return false;
		if (this==obj) return true;
		
		SurgeryReqInfo surgeryReqInfoObj = (SurgeryReqInfo) obj;
		if (surgeryReqID!=null) {
			if (!(surgeryReqID.equals(surgeryReqInfoObj.surgeryReqID))) return false;
		}
		else {
			if (surgeryReqInfoObj.surgeryReqID!=null) 
				return false;
		}
		if (patientID!=null) {
			if (!(patientID.equals(surgeryReqInfoObj.patientID))) return false;
		}
		else {
			if (surgeryReqInfoObj.patientID!=null) 
				return false;
		}
		if (visitID!=null) {
			if (!(visitID.equals(surgeryReqInfoObj.visitID))) return false;
		}
		else {
			if (surgeryReqInfoObj.visitID!=null) 
				return false;
		}
		if (orderID!=null) {
			if (!(orderID.equals(surgeryReqInfoObj.orderID))) return false;
		}
		else {
			if (surgeryReqInfoObj.orderID!=null) 
				return false;
		}
		if (diagnosisBefore!=null) {
			if (!(diagnosisBefore.equals(surgeryReqInfoObj.diagnosisBefore))) return false;
		}
		else {
			if (surgeryReqInfoObj.diagnosisBefore!=null) 
				return false;
		}
		if (operativeDoctorID!=null) {
			if (!(operativeDoctorID.equals(surgeryReqInfoObj.operativeDoctorID))) return false;
		}
		else {
			if (surgeryReqInfoObj.operativeDoctorID!=null) 
				return false;
		}
		if (operativeDoctorName!=null) {
			if (!(operativeDoctorName.equals(surgeryReqInfoObj.operativeDoctorName))) return false;
		}
		else {
			if (surgeryReqInfoObj.operativeDoctorName!=null) 
				return false;
		}
		if (scheduleDate!=null) {
			if (!(scheduleDate.equals(surgeryReqInfoObj.scheduleDate))) return false;
		}
		else {
			if (surgeryReqInfoObj.scheduleDate!=null) 
				return false;
		}
		if (urgencyCode!=null) {
			if (!(urgencyCode.equals(surgeryReqInfoObj.urgencyCode))) return false;
		}
		else {
			if (surgeryReqInfoObj.urgencyCode!=null) 
				return false;
		}
		if (urgencyName!=null) {
			if (!(urgencyName.equals(surgeryReqInfoObj.urgencyName))) return false;
		}
		else {
			if (surgeryReqInfoObj.urgencyName!=null) 
				return false;
		}
		if (isolationIndicatorCode!=null) {
			if (!(isolationIndicatorCode.equals(surgeryReqInfoObj.isolationIndicatorCode))) return false;
		}
		else {
			if (surgeryReqInfoObj.isolationIndicatorCode!=null) 
				return false;
		}
		if (isolationIndicator!=null) {
			if (!(isolationIndicator.equals(surgeryReqInfoObj.isolationIndicator))) return false;
		}
		else {
			if (surgeryReqInfoObj.isolationIndicator!=null) 
				return false;
		}
		if (relevantLabTest!=null) {
			if (!(relevantLabTest.equals(surgeryReqInfoObj.relevantLabTest))) return false;
		}
		else {
			if (surgeryReqInfoObj.relevantLabTest!=null) 
				return false;
		}
		if (operativeDeptCode!=null) {
			if (!(operativeDeptCode.equals(surgeryReqInfoObj.operativeDeptCode))) return false;
		}
		else {
			if (surgeryReqInfoObj.operativeDeptCode!=null) 
				return false;
		}
		if (operativeDeptName!=null) {
			if (!(operativeDeptName.equals(surgeryReqInfoObj.operativeDeptName))) return false;
		}
		else {
			if (surgeryReqInfoObj.operativeDeptName!=null) 
				return false;
		}
		if (comments!=null) {
			if (!(comments.equals(surgeryReqInfoObj.comments))) return false;
		}
		else {
			if (surgeryReqInfoObj.comments!=null) 
				return false;
		}
		if (reqDeptCode!=null) {
			if (!(reqDeptCode.equals(surgeryReqInfoObj.reqDeptCode))) return false;
		}
		else {
			if (surgeryReqInfoObj.reqDeptCode!=null) 
				return false;
		}
		if (reqDeptName!=null) {
			if (!(reqDeptName.equals(surgeryReqInfoObj.reqDeptName))) return false;
		}
		else {
			if (surgeryReqInfoObj.reqDeptName!=null) 
				return false;
		}
		if (reqDoctorID!=null) {
			if (!(reqDoctorID.equals(surgeryReqInfoObj.reqDoctorID))) return false;
		}
		else {
			if (surgeryReqInfoObj.reqDoctorID!=null) 
				return false;
		}
		if (reqDoctorName!=null) {
			if (!(reqDoctorName.equals(surgeryReqInfoObj.reqDoctorName))) return false;
		}
		else {
			if (surgeryReqInfoObj.reqDoctorName!=null) 
				return false;
		}
		if (reqDate!=null) {
			if (!(reqDate.equals(surgeryReqInfoObj.reqDate))) return false;
		}
		else {
			if (surgeryReqInfoObj.reqDate!=null) 
				return false;
		}
		if (requestStatus!=null) {
			if (!(requestStatus.equals(surgeryReqInfoObj.requestStatus))) return false;
		}
		else {
			if (surgeryReqInfoObj.requestStatus!=null) 
				return false;
		}
		if (dosage!=null) {
			if (!(dosage.equals(surgeryReqInfoObj.dosage))) return false;
		}
		else {
			if (surgeryReqInfoObj.dosage!=null) 
				return false;
		}
		if (dosageUnit!=null) {
			if (!(dosageUnit.equals(surgeryReqInfoObj.dosageUnit))) return false;
		}
		else {
			if (surgeryReqInfoObj.dosageUnit!=null) 
				return false;
		}
		if (administrationCode!=null) {
			if (!(administrationCode.equals(surgeryReqInfoObj.administrationCode))) return false;
		}
		else {
			if (surgeryReqInfoObj.administrationCode!=null) 
				return false;
		}
		if (administrationName!=null) {
			if (!(administrationName.equals(surgeryReqInfoObj.administrationName))) return false;
		}
		else {
			if (surgeryReqInfoObj.administrationName!=null) 
				return false;
		}
		if (frequency!=0) {
			if (frequency!=surgeryReqInfoObj.frequency) return false;
		}
		else {
			if (surgeryReqInfoObj.frequency!=0) 
				return false;
		}
		if (frequencyUnit!=null) {
			if (!(frequencyUnit.equals(surgeryReqInfoObj.frequencyUnit))) return false;
		}
		else {
			if (surgeryReqInfoObj.frequencyUnit!=null) 
				return false;
		}
		if (frequencyInterval!=0) {
			if (frequencyInterval!=surgeryReqInfoObj.frequencyInterval) return false;
		}
		else {
			if (surgeryReqInfoObj.frequencyInterval!=0) 
				return false;
		}
		if (frequencyIntervalUnit!=null) {
			if (!(frequencyIntervalUnit.equals(surgeryReqInfoObj.frequencyIntervalUnit))) return false;
		}
		else {
			if (surgeryReqInfoObj.frequencyIntervalUnit!=null) 
				return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuffer surgeryReqInfoBuffer = new StringBuffer();
		surgeryReqInfoBuffer.append("{\"surgeryReqID\":\"").append(surgeryReqID).append("\",")
			.append("\"patientID\":\"").append(patientID).append("\",")
			.append("\"visitID\":\"").append(visitID).append("\",")
			.append("\"orderID\":\"").append(orderID).append("\",")
			.append("\"diagnosisBefore\":\"").append(diagnosisBefore).append("\",")
			.append("\"operativeDoctorID\":\"").append(operativeDoctorID).append("\",")
			.append("\"operativeDoctorName\":\"").append(operativeDoctorName).append("\",")
			.append("\"scheduleDate\":\"").append(scheduleDate).append("\",")
			.append("\"urgencyCode\":\"").append(urgencyCode).append("\",")
			.append("\"urgencyName\":\"").append(urgencyName).append("\",")
			.append("\"isolationIndicatorCode\":\"").append(isolationIndicatorCode).append("\",")
			.append("\"isolationIndicator\":\"").append(isolationIndicator).append("\",")
			.append("{\"relevantLabTest\":\"").append(relevantLabTest).append("\",")
			.append("\"operativeDeptCode\":\"").append(operativeDeptCode).append("\",")
			.append("\"operativeDeptName\":\"").append(operativeDeptName).append("\",")
			.append("\"comments\":\"").append(comments).append("\",")
			.append("\"reqDeptCode\":\"").append(reqDeptCode).append("\",")
			.append("\"reqDeptName\":\"").append(reqDeptName).append("\",")
			.append("\"reqDoctorID\":\"").append(reqDoctorID).append("\",")
			.append("\"reqDoctorName\":\"").append(reqDoctorName).append("\",")
			.append("\"reqDate\":\"").append(reqDate).append("\",")
			.append("\"requestStatus\":\"").append(requestStatus).append("\",")
			.append("\"dosage\":\"").append(dosage).append("\",")
			.append("\"dosageUnit\":\"").append(dosageUnit).append("\",")
			.append("{\"administrationCode\":\"").append(administrationCode).append("\",")
			.append("\"administrationName\":\"").append(administrationName).append("\",")
			.append("\"frequency\":\"").append(frequency).append("\",")
			.append("\"frequencyUnit\":\"").append(frequencyUnit).append("\",")
			.append("\"frequencyInterval\":\"").append(frequencyInterval).append("\",")
			.append("\"frequencyIntervalUnit\":\"").append(frequencyIntervalUnit).append("\"}");
		return surgeryReqInfoBuffer.toString();
	} 
}
