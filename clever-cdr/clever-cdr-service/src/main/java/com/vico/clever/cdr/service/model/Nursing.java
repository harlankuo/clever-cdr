package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Nursing")
public class Nursing {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱ID
	private String nursingID;// 护理申请号(*)
	private String nursingLevel;// 护理等级
	private String nursingCategoryCode;// 护理种类代码
	private String nursingCategoryName;// 护理种类名称
	private String nursingOperation;// 护理操作
	private String nursingItemType;// 项目类型
	private String nursingResult;// 护理结果
	private String nursingObservationItem;// 观察项目
	private String nursingObservationResult;// 观察项目结果
	private String issues;// 护理问题
	private String suggest;// 护理意见
	private String dosage;// 剂量
	private String dosageUnit;// 剂量单位
	private String administrationCode;// 给药途径代码
	private String administrationName;// 给药途径名称
	private String frequencyDescription;// 频率描述
	private int frequencyCount;// 频率次数
	private int frequencyInterval;// 频率间隔
	private String frequencyIntervalUnit;// 频率间隔单位
	private String comment;// 备注

	public Nursing() {
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

	public String getNursingID() {
		return nursingID;
	}

	public void setNursingID(String nursingID) {
		this.nursingID = nursingID;
	}

	public String getNursingLevel() {
		return nursingLevel;
	}

	public void setNursingLevel(String nursingLevel) {
		this.nursingLevel = nursingLevel;
	}

	public String getNursingCategoryCode() {
		return nursingCategoryCode;
	}

	public void setNursingCategoryCode(String nursingCategoryCode) {
		this.nursingCategoryCode = nursingCategoryCode;
	}

	public String getNursingCategoryName() {
		return nursingCategoryName;
	}

	public void setNursingCategoryName(String nursingCategoryName) {
		this.nursingCategoryName = nursingCategoryName;
	}

	public String getNursingOperation() {
		return nursingOperation;
	}

	public void setNursingOperation(String nursingOperation) {
		this.nursingOperation = nursingOperation;
	}

	public String getNursingItemType() {
		return nursingItemType;
	}

	public void setNursingItemType(String nursingItemType) {
		this.nursingItemType = nursingItemType;
	}

	public String getNursingResult() {
		return nursingResult;
	}

	public void setNursingResult(String nursingResult) {
		this.nursingResult = nursingResult;
	}

	public String getNursingObservationItem() {
		return nursingObservationItem;
	}

	public void setNursingObservationItem(String nursingObservationItem) {
		this.nursingObservationItem = nursingObservationItem;
	}

	public String getNursingObservationResult() {
		return nursingObservationResult;
	}

	public void setNursingObservationResult(String nursingObservationResult) {
		this.nursingObservationResult = nursingObservationResult;
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
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
		result = prime * result + ((issues == null) ? 0 : issues.hashCode());
		result = prime
				* result
				+ ((nursingCategoryCode == null) ? 0 : nursingCategoryCode
						.hashCode());
		result = prime
				* result
				+ ((nursingCategoryName == null) ? 0 : nursingCategoryName
						.hashCode());
		result = prime * result
				+ ((nursingID == null) ? 0 : nursingID.hashCode());
		result = prime * result
				+ ((nursingItemType == null) ? 0 : nursingItemType.hashCode());
		result = prime * result
				+ ((nursingLevel == null) ? 0 : nursingLevel.hashCode());
		result = prime
				* result
				+ ((nursingObservationItem == null) ? 0
						: nursingObservationItem.hashCode());
		result = prime
				* result
				+ ((nursingObservationResult == null) ? 0
						: nursingObservationResult.hashCode());
		result = prime
				* result
				+ ((nursingOperation == null) ? 0 : nursingOperation.hashCode());
		result = prime * result
				+ ((nursingResult == null) ? 0 : nursingResult.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + ((suggest == null) ? 0 : suggest.hashCode());
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
		Nursing other = (Nursing) obj;
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
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
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
		if (issues == null) {
			if (other.issues != null)
				return false;
		} else if (!issues.equals(other.issues))
			return false;
		if (nursingCategoryCode == null) {
			if (other.nursingCategoryCode != null)
				return false;
		} else if (!nursingCategoryCode.equals(other.nursingCategoryCode))
			return false;
		if (nursingCategoryName == null) {
			if (other.nursingCategoryName != null)
				return false;
		} else if (!nursingCategoryName.equals(other.nursingCategoryName))
			return false;
		if (nursingID == null) {
			if (other.nursingID != null)
				return false;
		} else if (!nursingID.equals(other.nursingID))
			return false;
		if (nursingItemType == null) {
			if (other.nursingItemType != null)
				return false;
		} else if (!nursingItemType.equals(other.nursingItemType))
			return false;
		if (nursingLevel == null) {
			if (other.nursingLevel != null)
				return false;
		} else if (!nursingLevel.equals(other.nursingLevel))
			return false;
		if (nursingObservationItem == null) {
			if (other.nursingObservationItem != null)
				return false;
		} else if (!nursingObservationItem.equals(other.nursingObservationItem))
			return false;
		if (nursingObservationResult == null) {
			if (other.nursingObservationResult != null)
				return false;
		} else if (!nursingObservationResult
				.equals(other.nursingObservationResult))
			return false;
		if (nursingOperation == null) {
			if (other.nursingOperation != null)
				return false;
		} else if (!nursingOperation.equals(other.nursingOperation))
			return false;
		if (nursingResult == null) {
			if (other.nursingResult != null)
				return false;
		} else if (!nursingResult.equals(other.nursingResult))
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
		if (suggest == null) {
			if (other.suggest != null)
				return false;
		} else if (!suggest.equals(other.suggest))
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
		return "Nursing [patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", nursingID=" + nursingID
				+ ", nursingLevel=" + nursingLevel + ", nursingCategoryCode="
				+ nursingCategoryCode + ", nursingCategoryName="
				+ nursingCategoryName + ", nursingOperation="
				+ nursingOperation + ", nursingItemType=" + nursingItemType
				+ ", nursingResult=" + nursingResult
				+ ", nursingObservationItem=" + nursingObservationItem
				+ ", nursingObservationResult=" + nursingObservationResult
				+ ", issues=" + issues + ", suggest=" + suggest + ", dosage="
				+ dosage + ", dosageUnit=" + dosageUnit
				+ ", administrationCode=" + administrationCode
				+ ", administrationName=" + administrationName
				+ ", frequencyDescription=" + frequencyDescription
				+ ", frequencyCount=" + frequencyCount + ", frequencyInterval="
				+ frequencyInterval + ", frequencyIntervalUnit="
				+ frequencyIntervalUnit + ", comment=" + comment + "]";
	}

}
