package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ExamReqInfo")
public class ExamReqInfo {
	private String examReqID;//检查申请号(*)
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderNO;//医嘱序号
	private String urgencyCode;//优先级0-普通 1-紧急
	private String urgencyName;//优先级
	private Date reqDate;//申请日期时间
	private String reqHospitalName;//申请机构名称
	private String reqHospitalID;//申请机构代码
	private String reqDeptName;//申请科室名称
	private String reqDeptCode;//申请科室代码
	private String reqDoctorName;//申请医生姓名
	private String reqDoctorID;//申请医生代码
	private String intent;//检查目的
	private String syndrom;//临床症状
	private String bodySign;//体征
	private String relevantTest;//相关化验结果
	private String memo;//申请备注
	private String patientRequirement;//说明患者检查时注意事项
	private String receiverDeptName;//检查科室名称
	private String receiverDeptID;//检查科室代码
	private String receiverDoctorName;//检查医师姓名
	private String receiverDoctorID;//检查医师代码
	private String receiverOrganizationName;//检查组织
	private String receiverOrganizationCode;//检查组织代码
	private Date latestDateServiceReq;//最迟的日期是可以接受的服务完成
	public ExamReqInfo() {
		super();
	}
	public ExamReqInfo(String examReqID, String patientID, String visitID,
			String orderNO, String urgencyCode, String urgencyName,
			Date reqDate, String reqHospitalName, String reqHospitalID,
			String reqDeptName, String reqDeptCode, String reqDoctorName,
			String reqDoctorID, String intent, String syndrom, String bodySign,
			String relevantTest, String memo, String patientRequirement,
			String receiverDeptName, String receiverDeptID,
			String receiverDoctorName, String receiverDoctorID,
			String receiverOrganizationName, String receiverOrganizationCode,
			Date latestDateServiceReq) {
		super();
		this.examReqID = examReqID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderNO = orderNO;
		this.urgencyCode = urgencyCode;
		this.urgencyName = urgencyName;
		this.reqDate = reqDate;
		this.reqHospitalName = reqHospitalName;
		this.reqHospitalID = reqHospitalID;
		this.reqDeptName = reqDeptName;
		this.reqDeptCode = reqDeptCode;
		this.reqDoctorName = reqDoctorName;
		this.reqDoctorID = reqDoctorID;
		this.intent = intent;
		this.syndrom = syndrom;
		this.bodySign = bodySign;
		this.relevantTest = relevantTest;
		this.memo = memo;
		this.patientRequirement = patientRequirement;
		this.receiverDeptName = receiverDeptName;
		this.receiverDeptID = receiverDeptID;
		this.receiverDoctorName = receiverDoctorName;
		this.receiverDoctorID = receiverDoctorID;
		this.receiverOrganizationName = receiverOrganizationName;
		this.receiverOrganizationCode = receiverOrganizationCode;
		this.latestDateServiceReq = latestDateServiceReq;
	}
	public String getExamReqID() {
		return examReqID;
	}
	public void setExamReqID(String examReqID) {
		this.examReqID = examReqID;
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
	public String getOrderNO() {
		return orderNO;
	}
	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
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
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqHospitalName() {
		return reqHospitalName;
	}
	public void setReqHospitalName(String reqHospitalName) {
		this.reqHospitalName = reqHospitalName;
	}
	public String getReqHospitalID() {
		return reqHospitalID;
	}
	public void setReqHospitalID(String reqHospitalID) {
		this.reqHospitalID = reqHospitalID;
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
	public String getSyndrom() {
		return syndrom;
	}
	public void setSyndrom(String syndrom) {
		this.syndrom = syndrom;
	}
	public String getBodySign() {
		return bodySign;
	}
	public void setBodySign(String bodySign) {
		this.bodySign = bodySign;
	}
	public String getRelevantTest() {
		return relevantTest;
	}
	public void setRelevantTest(String relevantTest) {
		this.relevantTest = relevantTest;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getPatientRequirement() {
		return patientRequirement;
	}
	public void setPatientRequirement(String patientRequirement) {
		this.patientRequirement = patientRequirement;
	}
	public String getReceiverDeptName() {
		return receiverDeptName;
	}
	public void setReceiverDeptName(String receiverDeptName) {
		this.receiverDeptName = receiverDeptName;
	}
	public String getReceiverDeptID() {
		return receiverDeptID;
	}
	public void setReceiverDeptID(String receiverDeptID) {
		this.receiverDeptID = receiverDeptID;
	}
	public String getReceiverDoctorName() {
		return receiverDoctorName;
	}
	public void setReceiverDoctorName(String receiverDoctorName) {
		this.receiverDoctorName = receiverDoctorName;
	}
	public String getReceiverDoctorID() {
		return receiverDoctorID;
	}
	public void setReceiverDoctorID(String receiverDoctorID) {
		this.receiverDoctorID = receiverDoctorID;
	}
	public String getReceiverOrganizationName() {
		return receiverOrganizationName;
	}
	public void setReceiverOrganizationName(String receiverOrganizationName) {
		this.receiverOrganizationName = receiverOrganizationName;
	}
	public String getReceiverOrganizationCode() {
		return receiverOrganizationCode;
	}
	public void setReceiverOrganizationCode(String receiverOrganizationCode) {
		this.receiverOrganizationCode = receiverOrganizationCode;
	}
	public Date getLatestDateServiceReq() {
		return latestDateServiceReq;
	}
	public void setLatestDateServiceReq(Date latestDateServiceReq) {
		this.latestDateServiceReq = latestDateServiceReq;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bodySign == null) ? 0 : bodySign.hashCode());
		result = prime * result
				+ ((examReqID == null) ? 0 : examReqID.hashCode());
		result = prime * result + ((intent == null) ? 0 : intent.hashCode());
		result = prime
				* result
				+ ((latestDateServiceReq == null) ? 0 : latestDateServiceReq
						.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderNO == null) ? 0 : orderNO.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((patientRequirement == null) ? 0 : patientRequirement
						.hashCode());
		result = prime * result
				+ ((receiverDeptID == null) ? 0 : receiverDeptID.hashCode());
		result = prime
				* result
				+ ((receiverDeptName == null) ? 0 : receiverDeptName.hashCode());
		result = prime
				* result
				+ ((receiverDoctorID == null) ? 0 : receiverDoctorID.hashCode());
		result = prime
				* result
				+ ((receiverDoctorName == null) ? 0 : receiverDoctorName
						.hashCode());
		result = prime
				* result
				+ ((receiverOrganizationCode == null) ? 0
						: receiverOrganizationCode.hashCode());
		result = prime
				* result
				+ ((receiverOrganizationName == null) ? 0
						: receiverOrganizationName.hashCode());
		result = prime * result
				+ ((relevantTest == null) ? 0 : relevantTest.hashCode());
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
				+ ((reqHospitalID == null) ? 0 : reqHospitalID.hashCode());
		result = prime * result
				+ ((reqHospitalName == null) ? 0 : reqHospitalName.hashCode());
		result = prime * result + ((syndrom == null) ? 0 : syndrom.hashCode());
		result = prime * result
				+ ((urgencyCode == null) ? 0 : urgencyCode.hashCode());
		result = prime * result
				+ ((urgencyName == null) ? 0 : urgencyName.hashCode());
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
		ExamReqInfo other = (ExamReqInfo) obj;
		if (bodySign == null) {
			if (other.bodySign != null)
				return false;
		} else if (!bodySign.equals(other.bodySign))
			return false;
		if (examReqID == null) {
			if (other.examReqID != null)
				return false;
		} else if (!examReqID.equals(other.examReqID))
			return false;
		if (intent == null) {
			if (other.intent != null)
				return false;
		} else if (!intent.equals(other.intent))
			return false;
		if (latestDateServiceReq == null) {
			if (other.latestDateServiceReq != null)
				return false;
		} else if (!latestDateServiceReq.equals(other.latestDateServiceReq))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (orderNO == null) {
			if (other.orderNO != null)
				return false;
		} else if (!orderNO.equals(other.orderNO))
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
		if (receiverDeptID == null) {
			if (other.receiverDeptID != null)
				return false;
		} else if (!receiverDeptID.equals(other.receiverDeptID))
			return false;
		if (receiverDeptName == null) {
			if (other.receiverDeptName != null)
				return false;
		} else if (!receiverDeptName.equals(other.receiverDeptName))
			return false;
		if (receiverDoctorID == null) {
			if (other.receiverDoctorID != null)
				return false;
		} else if (!receiverDoctorID.equals(other.receiverDoctorID))
			return false;
		if (receiverDoctorName == null) {
			if (other.receiverDoctorName != null)
				return false;
		} else if (!receiverDoctorName.equals(other.receiverDoctorName))
			return false;
		if (receiverOrganizationCode == null) {
			if (other.receiverOrganizationCode != null)
				return false;
		} else if (!receiverOrganizationCode
				.equals(other.receiverOrganizationCode))
			return false;
		if (receiverOrganizationName == null) {
			if (other.receiverOrganizationName != null)
				return false;
		} else if (!receiverOrganizationName
				.equals(other.receiverOrganizationName))
			return false;
		if (relevantTest == null) {
			if (other.relevantTest != null)
				return false;
		} else if (!relevantTest.equals(other.relevantTest))
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
		if (reqHospitalID == null) {
			if (other.reqHospitalID != null)
				return false;
		} else if (!reqHospitalID.equals(other.reqHospitalID))
			return false;
		if (reqHospitalName == null) {
			if (other.reqHospitalName != null)
				return false;
		} else if (!reqHospitalName.equals(other.reqHospitalName))
			return false;
		if (syndrom == null) {
			if (other.syndrom != null)
				return false;
		} else if (!syndrom.equals(other.syndrom))
			return false;
		if (urgencyCode == null) {
			if (other.urgencyCode != null)
				return false;
		} else if (!urgencyCode.equals(other.urgencyCode))
			return false;
		if (urgencyName == null) {
			if (other.urgencyName != null)
				return false;
		} else if (!urgencyName.equals(other.urgencyName))
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
		return "ExamReqInfo [examReqID=" + examReqID + ", patientID="
				+ patientID + ", visitID=" + visitID + ", orderNO=" + orderNO
				+ ", urgencyCode=" + urgencyCode + ", urgencyName="
				+ urgencyName + ", reqDate=" + reqDate + ", reqHospitalName="
				+ reqHospitalName + ", reqHospitalID=" + reqHospitalID
				+ ", reqDeptName=" + reqDeptName + ", reqDeptCode="
				+ reqDeptCode + ", reqDoctorName=" + reqDoctorName
				+ ", reqDoctorID=" + reqDoctorID + ", intent=" + intent
				+ ", syndrom=" + syndrom + ", bodySign=" + bodySign
				+ ", relevantTest=" + relevantTest + ", memo=" + memo
				+ ", patientRequirement=" + patientRequirement
				+ ", receiverDeptName=" + receiverDeptName
				+ ", receiverDeptID=" + receiverDeptID
				+ ", receiverDoctorName=" + receiverDoctorName
				+ ", receiverDoctorID=" + receiverDoctorID
				+ ", receiverOrganizationName=" + receiverOrganizationName
				+ ", receiverOrganizationCode=" + receiverOrganizationCode
				+ ", latestDateServiceReq=" + latestDateServiceReq + "]";
	}

}
