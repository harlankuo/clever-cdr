package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.PatientDischargeInfo;
import com.vico.clever.cdr.service.model.PatientTransferInfo;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

@XmlRootElement(name="PatientAdtEntity")
public class PatientAdtEntity {
	private PatientInfo patientInfo;
	private PatientAdmission patientAdmission;
	private PatientTransferInfo patientTransferInfo;
	private PatientDischargeInfo patientDischargeInfo;
	public PatientAdtEntity() {
		super();
	}
	public PatientAdtEntity(PatientInfo patientInfo,
			PatientAdmission patientAdmission,
			PatientTransferInfo patientTransferInfo,
			PatientDischargeInfo patientDischargeInfo) {
		super();
		this.patientInfo = patientInfo;
		this.patientAdmission = patientAdmission;
		this.patientTransferInfo = patientTransferInfo;
		this.patientDischargeInfo = patientDischargeInfo;
	}
	public PatientInfo getPatientInfo() {
		return patientInfo;
	}
	public void setPatientInfo(PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}
	public PatientAdmission getPatientAdmission() {
		return patientAdmission;
	}
	public void setPatientAdmission(PatientAdmission patientAdmission) {
		this.patientAdmission = patientAdmission;
	}
	public PatientTransferInfo getPatientTransferInfo() {
		return patientTransferInfo;
	}
	public void setPatientTransferInfo(PatientTransferInfo patientTransferInfo) {
		this.patientTransferInfo = patientTransferInfo;
	}
	public PatientDischargeInfo getPatientDischargeInfo() {
		return patientDischargeInfo;
	}
	public void setPatientDischargeInfo(PatientDischargeInfo patientDischargeInfo) {
		this.patientDischargeInfo = patientDischargeInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((patientAdmission == null) ? 0 : patientAdmission.hashCode());
		result = prime
				* result
				+ ((patientDischargeInfo == null) ? 0 : patientDischargeInfo
						.hashCode());
		result = prime * result
				+ ((patientInfo == null) ? 0 : patientInfo.hashCode());
		result = prime
				* result
				+ ((patientTransferInfo == null) ? 0 : patientTransferInfo
						.hashCode());
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
		PatientAdtEntity other = (PatientAdtEntity) obj;
		if (patientAdmission == null) {
			if (other.patientAdmission != null)
				return false;
		} else if (!patientAdmission.equals(other.patientAdmission))
			return false;
		if (patientDischargeInfo == null) {
			if (other.patientDischargeInfo != null)
				return false;
		} else if (!patientDischargeInfo.equals(other.patientDischargeInfo))
			return false;
		if (patientInfo == null) {
			if (other.patientInfo != null)
				return false;
		} else if (!patientInfo.equals(other.patientInfo))
			return false;
		if (patientTransferInfo == null) {
			if (other.patientTransferInfo != null)
				return false;
		} else if (!patientTransferInfo.equals(other.patientTransferInfo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PatientAdtEntity [patientInfo=" + patientInfo
				+ ", patientAdmission=" + patientAdmission
				+ ", patientTransferInfo=" + patientTransferInfo
				+ ", patientDischargeInfo=" + patientDischargeInfo + "]";
	}
	
	
}
