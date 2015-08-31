package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryStatus {
	
	private String surgeryReqID;//手术申请号
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String operationName;//手术名称
	private String curStateCode;//标准状态代码
	private String curStateName;//标准状态
	private String careflowStepCode;//实际状态代码
	private String careflowStepName;//实际状态
	private String comment;//手术备注
	private Date performDateTime;//执行时间
	private String performDoctorCode;//执行人员代码
	private String performDoctorName;//执行人员名称
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
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getCurStateCode() {
		return curStateCode;
	}
	public void setCurStateCode(String curStateCode) {
		this.curStateCode = curStateCode;
	}
	public String getCurStateName() {
		return curStateName;
	}
	public void setCurStateName(String curStateName) {
		this.curStateName = curStateName;
	}
	public String getCareflowStepCode() {
		return careflowStepCode;
	}
	public void setCareflowStepCode(String careflowStepCode) {
		this.careflowStepCode = careflowStepCode;
	}
	public String getCareflowStepName() {
		return careflowStepName;
	}
	public void setCareflowStepName(String careflowStepName) {
		this.careflowStepName = careflowStepName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getPerformDateTime() {
		return performDateTime;
	}
	public void setPerformDateTime(Date performDateTime) {
		this.performDateTime = performDateTime;
	}
	public String getPerformDoctorCode() {
		return performDoctorCode;
	}
	public void setPerformDoctorCode(String performDoctorCode) {
		this.performDoctorCode = performDoctorCode;
	}
	public String getPerformDoctorName() {
		return performDoctorName;
	}
	public void setPerformDoctorName(String performDoctorName) {
		this.performDoctorName = performDoctorName;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = result*31 + (surgeryReqID==null?0:surgeryReqID.hashCode());
		result = result*31 + (patientID==null?0:patientID.hashCode());
		result = result*31 + (visitID==null?0:visitID.hashCode());
		result = result*31 + (operationName==null?0:operationName.hashCode());
		result = result*31 + (curStateCode==null?0:curStateCode.hashCode());
		result = result*31 + (curStateName==null?0:curStateName.hashCode());
		result = result*31 + (careflowStepCode==null?0:careflowStepCode.hashCode());
		result = result*31 + (careflowStepName==null?0:careflowStepName.hashCode());
		result = result*31 + (comment==null?0:comment.hashCode());
		result = result*31 + (performDateTime==null?0:performDateTime.hashCode());
		result = result*31 + (performDoctorCode==null?0:performDoctorCode.hashCode());
		result = result*31 + (performDoctorName==null?0:performDoctorName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode()) return false;
		if (this==null||obj==null) return false;
		if (this.getClass()!=obj.getClass()) return false;
		if (this==obj) return true;
		
		SurgeryStatus surgeryStatusObj = (SurgeryStatus) obj;
		if (surgeryReqID!=null) {
			if (!(surgeryReqID.equals(surgeryStatusObj.surgeryReqID))) return false;
		}
		else {
			if (surgeryStatusObj.surgeryReqID!=null) 
				return false;
		}
		if (patientID!=null) {
			if (!(patientID.equals(surgeryStatusObj.patientID))) return false;
		}
		else {
			if (surgeryStatusObj.patientID!=null) 
				return false;
		}
		if (visitID!=null) {
			if (!(visitID.equals(surgeryStatusObj.visitID))) return false;
		}
		else {
			if (surgeryStatusObj.visitID!=null) 
				return false;
		}
		if (operationName!=null) {
			if (!(operationName.equals(surgeryStatusObj.operationName))) return false;
		}
		else {
			if (surgeryStatusObj.operationName!=null) 
				return false;
		}
		if (curStateCode!=null) {
			if (!(curStateCode.equals(surgeryStatusObj.curStateCode))) return false;
		}
		else {
			if (surgeryStatusObj.curStateCode!=null) 
				return false;
		}
		if (curStateName!=null) {
			if (!(curStateName.equals(surgeryStatusObj.curStateName))) return false;
		}
		else {
			if (surgeryStatusObj.curStateName!=null) 
				return false;
		}
		if (careflowStepCode!=null) {
			if (!(careflowStepCode.equals(surgeryStatusObj.careflowStepCode))) return false;
		}
		else {
			if (surgeryStatusObj.careflowStepCode!=null) 
				return false;
		}
		if (careflowStepName!=null) {
			if (!(careflowStepName.equals(surgeryStatusObj.careflowStepName))) return false;
		}
		else {
			if (surgeryStatusObj.careflowStepName!=null) 
				return false;
		}
		if (comment!=null) {
			if (!(comment.equals(surgeryStatusObj.comment))) return false;
		}
		else {
			if (surgeryStatusObj.comment!=null) 
				return false;
		}
		if (performDateTime!=null) {
			if (!(performDateTime.equals(surgeryStatusObj.performDateTime))) return false;
		}
		else {
			if (surgeryStatusObj.performDateTime!=null) 
				return false;
		}
		if (performDoctorCode!=null) {
			if (!(performDoctorCode.equals(surgeryStatusObj.performDoctorCode))) return false;
		}
		else {
			if (surgeryStatusObj.performDoctorCode!=null) 
				return false;
		}
		if (performDoctorName!=null) {
			if (!(performDoctorName.equals(surgeryStatusObj.performDoctorName))) return false;
		}
		else {
			if (surgeryStatusObj.performDoctorName!=null) 
				return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuffer surgeryStatusBuffer = new StringBuffer();
		surgeryStatusBuffer.append("{\"surgeryReqID\":\"").append(surgeryReqID).append("\",")
			.append("\"patientID\":\"").append(patientID).append("\",")
			.append("\"visitID\":\"").append(visitID).append("\",")
			.append("\"operationName\":\"").append(operationName).append("\",")
			.append("\"curStateCode\":\"").append(curStateCode).append("\",")
			.append("\"curStateName\":\"").append(curStateName).append("\",")
			.append("\"careflowStepCode\":\"").append(careflowStepCode).append("\",")
			.append("\"careflowStepName\":\"").append(careflowStepName).append("\",")
			.append("\"comment\":\"").append(comment).append("\",")
			.append("\"performDateTime\":\"").append(performDateTime).append("\",")
			.append("\"performDoctorCode\":\"").append(performDoctorCode).append("\",")
			.append("\"performDoctorName\":\"").append(performDoctorName).append("\"}");
		return surgeryStatusBuffer.toString();
	}
}
