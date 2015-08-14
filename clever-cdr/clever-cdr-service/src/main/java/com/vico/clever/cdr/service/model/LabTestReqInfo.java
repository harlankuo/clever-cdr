package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="LabTestReqInfo")
public class LabTestReqInfo {
	private String testReqID;//检验申请号,(*)
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱ID
	private Date reqDate;//申请日期时间
	private String reqDeptName;//申请科室名称
	private String reqDeptCode;//申请科室代码
	private String reqDoctorName;//申请医生姓名
	private String reqDoctorID;//申请医生代码
	private String intent;//检验目的
	private String patientRequirement;//患者准备
	private String diagnosis;//临床诊断
	private String receiverDeptCode;//执行科室代码
	private String receiverDeptName;//执行科室名称
	private String comment;//标本说明
	private String urgency;//优先级
	private String urgencyCode;//优先级代码0-普通 1-紧急
	public LabTestReqInfo() {
		super();
	}
	public LabTestReqInfo(String testReqID, String patientID, String visitID,
			String orderID, Date reqDate, String reqDeptName,
			String reqDeptCode, String reqDoctorName, String reqDoctorID,
			String intent, String patientRequirement, String diagnosis,
			String receiverDeptCode, String receiverDeptName, String comment,
			String urgency, String urgencyCode) {
		super();
		this.testReqID = testReqID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.reqDate = reqDate;
		this.reqDeptName = reqDeptName;
		this.reqDeptCode = reqDeptCode;
		this.reqDoctorName = reqDoctorName;
		this.reqDoctorID = reqDoctorID;
		this.intent = intent;
		this.patientRequirement = patientRequirement;
		this.diagnosis = diagnosis;
		this.receiverDeptCode = receiverDeptCode;
		this.receiverDeptName = receiverDeptName;
		this.comment = comment;
		this.urgency = urgency;
		this.urgencyCode = urgencyCode;
	}
	public String getTestReqID() {
		return testReqID;
	}
	public void setTestReqID(String testReqID) {
		this.testReqID = testReqID;
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
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqDeptName() {
		return reqDeptName;
	}
	public void setReqDeptName(String reqDeptName) {
		this.reqDeptName = reqDeptName;
	}
	public String getReqDeptCode() {
		return reqDeptCode;
	}
	public void setReqDeptCode(String reqDeptCode) {
		this.reqDeptCode = reqDeptCode;
	}
	public String getReqDoctorName() {
		return reqDoctorName;
	}
	public void setReqDoctorName(String reqDoctorName) {
		this.reqDoctorName = reqDoctorName;
	}
	public String getReqDoctorID() {
		return reqDoctorID;
	}
	public void setReqDoctorID(String reqDoctorID) {
		this.reqDoctorID = reqDoctorID;
	}
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public String getPatientRequirement() {
		return patientRequirement;
	}
	public void setPatientRequirement(String patientRequirement) {
		this.patientRequirement = patientRequirement;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getReceiverDeptCode() {
		return receiverDeptCode;
	}
	public void setReceiverDeptCode(String receiverDeptCode) {
		this.receiverDeptCode = receiverDeptCode;
	}
	public String getReceiverDeptName() {
		return receiverDeptName;
	}
	public void setReceiverDeptName(String receiverDeptName) {
		this.receiverDeptName = receiverDeptName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public String getUrgencyCode() {
		return urgencyCode;
	}
	public void setUrgencyCode(String urgencyCode) {
		this.urgencyCode = urgencyCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result
				+ ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + ((intent == null) ? 0 : intent.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((patientRequirement == null) ? 0 : patientRequirement
						.hashCode());
		result = prime
				* result
				+ ((receiverDeptCode == null) ? 0 : receiverDeptCode.hashCode());
		result = prime
				* result
				+ ((receiverDeptName == null) ? 0 : receiverDeptName.hashCode());
		result = prime * result + ((reqDate == null) ? 0 : reqDate.hashCode());
		result = prime * result
				+ ((reqDeptCode == null) ? 0 : reqDeptCode.hashCode());
		result = prime * result
				+ ((reqDeptName == null) ? 0 : reqDeptName.hashCode());
		result = prime * result
				+ ((reqDoctorID == null) ? 0 : reqDoctorID.hashCode());
		result = prime * result
				+ ((reqDoctorName == null) ? 0 : reqDoctorName.hashCode());
		result = prime * result
				+ ((testReqID == null) ? 0 : testReqID.hashCode());
		result = prime * result + ((urgency == null) ? 0 : urgency.hashCode());
		result = prime * result
				+ ((urgencyCode == null) ? 0 : urgencyCode.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LabTestReqInfo other = (LabTestReqInfo) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (diagnosis == null) {
			if (other.diagnosis != null)
				return false;
		} else if (!diagnosis.equals(other.diagnosis))
			return false;
		if (intent == null) {
			if (other.intent != null)
				return false;
		} else if (!intent.equals(other.intent))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (patientRequirement == null) {
			if (other.patientRequirement != null)
				return false;
		} else if (!patientRequirement.equals(other.patientRequirement))
			return false;
		if (receiverDeptCode == null) {
			if (other.receiverDeptCode != null)
				return false;
		} else if (!receiverDeptCode.equals(other.receiverDeptCode))
			return false;
		if (receiverDeptName == null) {
			if (other.receiverDeptName != null)
				return false;
		} else if (!receiverDeptName.equals(other.receiverDeptName))
			return false;
		if (reqDate == null) {
			if (other.reqDate != null)
				return false;
		} else if (!reqDate.equals(other.reqDate))
			return false;
		if (reqDeptCode == null) {
			if (other.reqDeptCode != null)
				return false;
		} else if (!reqDeptCode.equals(other.reqDeptCode))
			return false;
		if (reqDeptName == null) {
			if (other.reqDeptName != null)
				return false;
		} else if (!reqDeptName.equals(other.reqDeptName))
			return false;
		if (reqDoctorID == null) {
			if (other.reqDoctorID != null)
				return false;
		} else if (!reqDoctorID.equals(other.reqDoctorID))
			return false;
		if (reqDoctorName == null) {
			if (other.reqDoctorName != null)
				return false;
		} else if (!reqDoctorName.equals(other.reqDoctorName))
			return false;
		if (testReqID == null) {
			if (other.testReqID != null)
				return false;
		} else if (!testReqID.equals(other.testReqID))
			return false;
		if (urgency == null) {
			if (other.urgency != null)
				return false;
		} else if (!urgency.equals(other.urgency))
			return false;
		if (urgencyCode == null) {
			if (other.urgencyCode != null)
				return false;
		} else if (!urgencyCode.equals(other.urgencyCode))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LabTestReqInfo [testReqID=").append(testReqID)
				.append(", patientID=").append(patientID).append(", visitID=")
				.append(visitID).append(", orderID=").append(orderID)
				.append(", reqDate=").append(reqDate).append(", reqDeptName=")
				.append(reqDeptName).append(", reqDeptCode=")
				.append(reqDeptCode).append(", reqDoctorName=")
				.append(reqDoctorName).append(", reqDoctorID=")
				.append(reqDoctorID).append(", intent=").append(intent)
				.append(", patientRequirement=").append(patientRequirement)
				.append(", diagnosis=").append(diagnosis)
				.append(", receiverDeptCode=").append(receiverDeptCode)
				.append(", receiverDeptName=").append(receiverDeptName)
				.append(", comment=").append(comment).append(", urgency=")
				.append(urgency).append(", urgencyCode=").append(urgencyCode)
				.append("]");
		return builder.toString();
	}

}
