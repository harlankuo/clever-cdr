package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="MedcationOrderStatus")
public class MedcationOrderStatus {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String medcationOrderID;//药嘱ID
	private String medication;//药物名称
	private String medicationCode;//药物代码
	private String curStateCode;//标准状态代码
	private String curStateName;//标准状态
	private String careflowStepCode;//实际状态代码
	private String careflowStepName;//实际状态
	private Date performDateTime;//执行时间
	private String performDoctorCode;//执行人员代码
	private String performDoctorName;//执行人员名称
	
	public MedcationOrderStatus() {
		super();
	}

	/**
	 * @param patientID
	 * @param visitID
	 * @param medcationOrderID
	 * @param medication
	 * @param medicationCode
	 * @param curStateCode
	 * @param curStateName
	 * @param careflowStepCode
	 * @param careflowStepName
	 * @param performDateTime
	 * @param performDoctorCode
	 * @param performDoctorName
	 */
	public MedcationOrderStatus(String patientID, String visitID,
			String medcationOrderID, String medication, String medicationCode,
			String curStateCode, String curStateName, String careflowStepCode,
			String careflowStepName, Date performDateTime,
			String performDoctorCode, String performDoctorName) {
		super();
		this.patientID = patientID;
		this.visitID = visitID;
		this.medcationOrderID = medcationOrderID;
		this.medication = medication;
		this.medicationCode = medicationCode;
		this.curStateCode = curStateCode;
		this.curStateName = curStateName;
		this.careflowStepCode = careflowStepCode;
		this.careflowStepName = careflowStepName;
		this.performDateTime = performDateTime;
		this.performDoctorCode = performDoctorCode;
		this.performDoctorName = performDoctorName;
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

	public String getMedcationOrderID() {
		return medcationOrderID;
	}

	public void setMedcationOrderID(String medcationOrderID) {
		this.medcationOrderID = medcationOrderID;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getMedicationCode() {
		return medicationCode;
	}

	public void setMedicationCode(String medicationCode) {
		this.medicationCode = medicationCode;
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
		final int prime = 31;
		int result = 1;
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
		result = prime
				* result
				+ ((medcationOrderID == null) ? 0 : medcationOrderID.hashCode());
		result = prime * result
				+ ((medication == null) ? 0 : medication.hashCode());
		result = prime * result
				+ ((medicationCode == null) ? 0 : medicationCode.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((performDateTime == null) ? 0 : performDateTime.hashCode());
		result = prime
				* result
				+ ((performDoctorCode == null) ? 0 : performDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((performDoctorName == null) ? 0 : performDoctorName
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
		MedcationOrderStatus other = (MedcationOrderStatus) obj;
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
		if (medcationOrderID == null) {
			if (other.medcationOrderID != null)
				return false;
		} else if (!medcationOrderID.equals(other.medcationOrderID))
			return false;
		if (medication == null) {
			if (other.medication != null)
				return false;
		} else if (!medication.equals(other.medication))
			return false;
		if (medicationCode == null) {
			if (other.medicationCode != null)
				return false;
		} else if (!medicationCode.equals(other.medicationCode))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (performDateTime == null) {
			if (other.performDateTime != null)
				return false;
		} else if (!performDateTime.equals(other.performDateTime))
			return false;
		if (performDoctorCode == null) {
			if (other.performDoctorCode != null)
				return false;
		} else if (!performDoctorCode.equals(other.performDoctorCode))
			return false;
		if (performDoctorName == null) {
			if (other.performDoctorName != null)
				return false;
		} else if (!performDoctorName.equals(other.performDoctorName))
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
		return "MedcationOrderStatus [patientID=" + patientID + ", visitID="
				+ visitID + ", medcationOrderID=" + medcationOrderID
				+ ", medication=" + medication + ", medicationCode="
				+ medicationCode + ", curStateCode=" + curStateCode
				+ ", curStateName=" + curStateName + ", careflowStepCode="
				+ careflowStepCode + ", careflowStepName=" + careflowStepName
				+ ", performDateTime=" + performDateTime
				+ ", performDoctorCode=" + performDoctorCode
				+ ", performDoctorName=" + performDoctorName + "]";
	}

}
