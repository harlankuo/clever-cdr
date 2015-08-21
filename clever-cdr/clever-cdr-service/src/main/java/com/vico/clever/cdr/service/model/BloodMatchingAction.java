package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BloodMatchingAction")
public class BloodMatchingAction {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String bloodMatchingID;// 配血医嘱申请号(*)
	private String bloodMatchingContent;// 配血医嘱内容
	private String curStateCode;// 标准状态代码
	private String curStateName;// 标准状态
	private String careflowStepCode;// 实际状态代码
	private String careflowStepName;// 实际状态
	private Date actionDatetime;// 执行时间
	private String performerCode;// 执行人代码
	private String performerName;// 执行人姓名
	private String performDeptCode;// 执行科室代码
	private String performDeptName;// 执行科室姓名
	private String memo;// 备注

	public BloodMatchingAction() {
		super();
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

	public String getBloodMatchingID() {
		return bloodMatchingID;
	}

	public void setBloodMatchingID(String bloodMatchingID) {
		this.bloodMatchingID = bloodMatchingID;
	}

	public String getBloodMatchingContent() {
		return bloodMatchingContent;
	}

	public void setBloodMatchingContent(String bloodMatchingContent) {
		this.bloodMatchingContent = bloodMatchingContent;
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

	public Date getActionDatetime() {
		return actionDatetime;
	}

	public void setActionDatetime(Date actionDatetime) {
		this.actionDatetime = actionDatetime;
	}

	public String getPerformerCode() {
		return performerCode;
	}

	public void setPerformerCode(String performerCode) {
		this.performerCode = performerCode;
	}

	public String getPerformerName() {
		return performerName;
	}

	public void setPerformerName(String performerName) {
		this.performerName = performerName;
	}

	public String getPerformDeptCode() {
		return performDeptCode;
	}

	public void setPerformDeptCode(String performDeptCode) {
		this.performDeptCode = performDeptCode;
	}

	public String getPerformDeptName() {
		return performDeptName;
	}

	public void setPerformDeptName(String performDeptName) {
		this.performDeptName = performDeptName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actionDatetime == null) ? 0 : actionDatetime.hashCode());
		result = prime
				* result
				+ ((bloodMatchingContent == null) ? 0 : bloodMatchingContent
						.hashCode());
		result = prime * result
				+ ((bloodMatchingID == null) ? 0 : bloodMatchingID.hashCode());
		result = prime
				* result
				+ ((careflowStepCode == null) ? 0 : careflowStepCode.hashCode());
		result = prime
				* result
				+ ((careflowStepName == null) ? 0 : careflowStepName.hashCode());
		result = prime * result
				+ ((curStateCode == null) ? 0 : curStateCode.hashCode());
		result = prime * result
				+ ((curStateName == null) ? 0 : curStateName.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((performDeptCode == null) ? 0 : performDeptCode.hashCode());
		result = prime * result
				+ ((performDeptName == null) ? 0 : performDeptName.hashCode());
		result = prime * result
				+ ((performerCode == null) ? 0 : performerCode.hashCode());
		result = prime * result
				+ ((performerName == null) ? 0 : performerName.hashCode());
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
		BloodMatchingAction other = (BloodMatchingAction) obj;
		if (actionDatetime == null) {
			if (other.actionDatetime != null)
				return false;
		} else if (!actionDatetime.equals(other.actionDatetime))
			return false;
		if (bloodMatchingContent == null) {
			if (other.bloodMatchingContent != null)
				return false;
		} else if (!bloodMatchingContent.equals(other.bloodMatchingContent))
			return false;
		if (bloodMatchingID == null) {
			if (other.bloodMatchingID != null)
				return false;
		} else if (!bloodMatchingID.equals(other.bloodMatchingID))
			return false;
		if (careflowStepCode == null) {
			if (other.careflowStepCode != null)
				return false;
		} else if (!careflowStepCode.equals(other.careflowStepCode))
			return false;
		if (careflowStepName == null) {
			if (other.careflowStepName != null)
				return false;
		} else if (!careflowStepName.equals(other.careflowStepName))
			return false;
		if (curStateCode == null) {
			if (other.curStateCode != null)
				return false;
		} else if (!curStateCode.equals(other.curStateCode))
			return false;
		if (curStateName == null) {
			if (other.curStateName != null)
				return false;
		} else if (!curStateName.equals(other.curStateName))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (performDeptCode == null) {
			if (other.performDeptCode != null)
				return false;
		} else if (!performDeptCode.equals(other.performDeptCode))
			return false;
		if (performDeptName == null) {
			if (other.performDeptName != null)
				return false;
		} else if (!performDeptName.equals(other.performDeptName))
			return false;
		if (performerCode == null) {
			if (other.performerCode != null)
				return false;
		} else if (!performerCode.equals(other.performerCode))
			return false;
		if (performerName == null) {
			if (other.performerName != null)
				return false;
		} else if (!performerName.equals(other.performerName))
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
		return "BloodMatchingAction [patientID=" + patientID + ", visitID="
				+ visitID + ", bloodMatchingID=" + bloodMatchingID
				+ ", bloodMatchingContent=" + bloodMatchingContent
				+ ", curStateCode=" + curStateCode + ", curStateName="
				+ curStateName + ", careflowStepCode=" + careflowStepCode
				+ ", careflowStepName=" + careflowStepName
				+ ", actionDatetime=" + actionDatetime + ", performerCode="
				+ performerCode + ", performerName=" + performerName
				+ ", performDeptCode=" + performDeptCode + ", performDeptName="
				+ performDeptName + ", memo=" + memo + "]";
	}

}
