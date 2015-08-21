package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BloodMatching")
public class BloodMatching {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱ID
	private String bloodMatchingID;// 配血医嘱申请号(*)
	private String bloodMatchingContent;// 配血医嘱内容
	private Date plannedExecDatetime;// 计划执行时间
	private Date plannedStopDatetime;// 计划停止时间
	private String dosage;// 剂量
	private String dosageUnit;// 剂量单位
	private String administrationCode;// 配血途径代码
	private String administrationName;// 配血途径名称
	private String memo;// 备注

	public BloodMatching() {
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

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
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

	public Date getPlannedExecDatetime() {
		return plannedExecDatetime;
	}

	public void setPlannedExecDatetime(Date plannedExecDatetime) {
		this.plannedExecDatetime = plannedExecDatetime;
	}

	public Date getPlannedStopDatetime() {
		return plannedStopDatetime;
	}

	public void setPlannedStopDatetime(Date plannedStopDatetime) {
		this.plannedStopDatetime = plannedStopDatetime;
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
		result = prime
				* result
				+ ((administrationCode == null) ? 0 : administrationCode
						.hashCode());
		result = prime
				* result
				+ ((administrationName == null) ? 0 : administrationName
						.hashCode());
		result = prime
				* result
				+ ((bloodMatchingContent == null) ? 0 : bloodMatchingContent
						.hashCode());
		result = prime * result
				+ ((bloodMatchingID == null) ? 0 : bloodMatchingID.hashCode());
		result = prime * result + ((dosage == null) ? 0 : dosage.hashCode());
		result = prime * result
				+ ((dosageUnit == null) ? 0 : dosageUnit.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((plannedExecDatetime == null) ? 0 : plannedExecDatetime
						.hashCode());
		result = prime
				* result
				+ ((plannedStopDatetime == null) ? 0 : plannedStopDatetime
						.hashCode());
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
		BloodMatching other = (BloodMatching) obj;
		if (administrationCode == null) {
			if (other.administrationCode != null)
				return false;
		} else if (!administrationCode.equals(other.administrationCode))
			return false;
		if (administrationName == null) {
			if (other.administrationName != null)
				return false;
		} else if (!administrationName.equals(other.administrationName))
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
		if (dosage == null) {
			if (other.dosage != null)
				return false;
		} else if (!dosage.equals(other.dosage))
			return false;
		if (dosageUnit == null) {
			if (other.dosageUnit != null)
				return false;
		} else if (!dosageUnit.equals(other.dosageUnit))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
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
		if (plannedExecDatetime == null) {
			if (other.plannedExecDatetime != null)
				return false;
		} else if (!plannedExecDatetime.equals(other.plannedExecDatetime))
			return false;
		if (plannedStopDatetime == null) {
			if (other.plannedStopDatetime != null)
				return false;
		} else if (!plannedStopDatetime.equals(other.plannedStopDatetime))
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
		return "BloodMatching [patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", bloodMatchingID="
				+ bloodMatchingID + ", bloodMatchingContent="
				+ bloodMatchingContent + ", plannedExecDatetime="
				+ plannedExecDatetime + ", plannedStopDatetime="
				+ plannedStopDatetime + ", dosage=" + dosage + ", dosageUnit="
				+ dosageUnit + ", administrationCode=" + administrationCode
				+ ", administrationName=" + administrationName + ", memo="
				+ memo + "]";
	}

}
