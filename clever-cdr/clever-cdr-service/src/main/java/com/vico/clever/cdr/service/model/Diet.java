package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Diet")
public class Diet {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱ID
	private String dietID;// 饮食申请号(*)
	private String dietContent;// 饮食内容
	private Date plannedExecDatetime;// 计划执行时间
	private Date plannedStopDatetime;// 计划停止时间
	private String dosage;// 剂量
	private String dosageUnit;// 剂量单位
	private String administrationCode;// 给药途径代码
	private String administrationName;// 给药途径名称
	private String frequencyDescription;// 频率描述
	private int frequencyCount;// 频率次数
	private int frequencyInterval;// 频率间隔
	private String frequencyIntervalUnit;// 频率间隔单位
	private String memo;// 备注

	public Diet() {
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

	public String getDietID() {
		return dietID;
	}

	public void setDietID(String dietID) {
		this.dietID = dietID;
	}

	public String getDietContent() {
		return dietContent;
	}

	public void setDietContent(String dietContent) {
		this.dietContent = dietContent;
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

	public String getFrequencyDescription() {
		return frequencyDescription;
	}

	public void setFrequencyDescription(String frequencyDescription) {
		this.frequencyDescription = frequencyDescription;
	}

	public int getFrequencyCount() {
		return frequencyCount;
	}

	public void setFrequencyCount(int frequencyCount) {
		this.frequencyCount = frequencyCount;
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
		result = prime * result
				+ ((dietContent == null) ? 0 : dietContent.hashCode());
		result = prime * result + ((dietID == null) ? 0 : dietID.hashCode());
		result = prime * result + ((dosage == null) ? 0 : dosage.hashCode());
		result = prime * result
				+ ((dosageUnit == null) ? 0 : dosageUnit.hashCode());
		result = prime * result + frequencyCount;
		result = prime
				* result
				+ ((frequencyDescription == null) ? 0 : frequencyDescription
						.hashCode());
		result = prime * result + frequencyInterval;
		result = prime
				* result
				+ ((frequencyIntervalUnit == null) ? 0 : frequencyIntervalUnit
						.hashCode());
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
		Diet other = (Diet) obj;
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
		if (dietContent == null) {
			if (other.dietContent != null)
				return false;
		} else if (!dietContent.equals(other.dietContent))
			return false;
		if (dietID == null) {
			if (other.dietID != null)
				return false;
		} else if (!dietID.equals(other.dietID))
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
		if (frequencyCount != other.frequencyCount)
			return false;
		if (frequencyDescription == null) {
			if (other.frequencyDescription != null)
				return false;
		} else if (!frequencyDescription.equals(other.frequencyDescription))
			return false;
		if (frequencyInterval != other.frequencyInterval)
			return false;
		if (frequencyIntervalUnit == null) {
			if (other.frequencyIntervalUnit != null)
				return false;
		} else if (!frequencyIntervalUnit.equals(other.frequencyIntervalUnit))
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
		return "Diet [patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", dietID=" + dietID
				+ ", dietContent=" + dietContent + ", plannedExecDatetime="
				+ plannedExecDatetime + ", plannedStopDatetime="
				+ plannedStopDatetime + ", dosage=" + dosage + ", dosageUnit="
				+ dosageUnit + ", administrationCode=" + administrationCode
				+ ", administrationName=" + administrationName
				+ ", frequencyDescription=" + frequencyDescription
				+ ", frequencyCount=" + frequencyCount + ", frequencyInterval="
				+ frequencyInterval + ", frequencyIntervalUnit="
				+ frequencyIntervalUnit + ", memo=" + memo + "]";
	}

}
