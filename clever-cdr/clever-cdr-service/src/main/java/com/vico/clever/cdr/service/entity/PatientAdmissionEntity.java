package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.PatientADTInfo;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

@XmlRootElement(name="PatientAdmissionEntity")
public class PatientAdmissionEntity {
	private PatientInfo patientInfo;
	private PatientAdmission patientAdmission;
	private PatientADTInfo patientADTInfo;
	public PatientAdmissionEntity() {
		super();
	}
	public PatientAdmissionEntity(PatientInfo patientInfo,
			PatientAdmission patientAdmission, PatientADTInfo patientADTInfo) {
		super();
		this.patientInfo = patientInfo;
		this.patientAdmission = patientAdmission;
		this.patientADTInfo = patientADTInfo;
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
	public PatientADTInfo getPatientADTInfo() {
		return patientADTInfo;
	}
	public void setPatientADTInfo(PatientADTInfo patientADTInfo) {
		this.patientADTInfo = patientADTInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((patientADTInfo == null) ? 0 : patientADTInfo.hashCode());
		result = prime
				* result
				+ ((patientAdmission == null) ? 0 : patientAdmission.hashCode());
		result = prime * result
				+ ((patientInfo == null) ? 0 : patientInfo.hashCode());
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
		PatientAdmissionEntity other = (PatientAdmissionEntity) obj;
		if (patientADTInfo == null) {
			if (other.patientADTInfo != null)
				return false;
		} else if (!patientADTInfo.equals(other.patientADTInfo))
			return false;
		if (patientAdmission == null) {
			if (other.patientAdmission != null)
				return false;
		} else if (!patientAdmission.equals(other.patientAdmission))
			return false;
		if (patientInfo == null) {
			if (other.patientInfo != null)
				return false;
		} else if (!patientInfo.equals(other.patientInfo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PatientAdmissionEntity [patientInfo=" + patientInfo
				+ ", patientAdmission=" + patientAdmission
				+ ", patientADTInfo=" + patientADTInfo + "]";
	}
	
}
