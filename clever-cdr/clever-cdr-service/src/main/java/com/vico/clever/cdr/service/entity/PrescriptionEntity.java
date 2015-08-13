package com.vico.clever.cdr.service.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.PrescriptionDetail;
import com.vico.clever.cdr.service.model.PrescriptionInfo;
import com.vico.clever.cdr.service.model.PrescriptionStatus;
@XmlRootElement(name="PrescriptionEntity")
public class PrescriptionEntity {
	private PrescriptionInfo prescriptionInfo;
	private List<PrescriptionDetail> prescriptionDetailList;
	private PrescriptionStatus prescriptionStatus;
	public PrescriptionEntity() {
		super();
	}
	public PrescriptionEntity(PrescriptionInfo prescriptionInfo,
			List<PrescriptionDetail> prescriptionDetailList,
			PrescriptionStatus prescriptionStatus) {
		super();
		this.prescriptionInfo = prescriptionInfo;
		this.prescriptionDetailList = prescriptionDetailList;
		this.prescriptionStatus = prescriptionStatus;
	}
	public PrescriptionInfo getPrescriptionInfo() {
		return prescriptionInfo;
	}
	public void setPrescriptionInfo(PrescriptionInfo prescriptionInfo) {
		this.prescriptionInfo = prescriptionInfo;
	}
	public List<PrescriptionDetail> getPrescriptionDetailList() {
		return prescriptionDetailList;
	}
	public void setPrescriptionDetailList(
			List<PrescriptionDetail> prescriptionDetailList) {
		this.prescriptionDetailList = prescriptionDetailList;
	}
	public PrescriptionStatus getPrescriptionStatus() {
		return prescriptionStatus;
	}
	public void setPrescriptionStatus(PrescriptionStatus prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((prescriptionDetailList == null) ? 0
						: prescriptionDetailList.hashCode());
		result = prime
				* result
				+ ((prescriptionInfo == null) ? 0 : prescriptionInfo.hashCode());
		result = prime
				* result
				+ ((prescriptionStatus == null) ? 0 : prescriptionStatus
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
		PrescriptionEntity other = (PrescriptionEntity) obj;
		if (prescriptionDetailList == null) {
			if (other.prescriptionDetailList != null)
				return false;
		} else if (!prescriptionDetailList.equals(other.prescriptionDetailList))
			return false;
		if (prescriptionInfo == null) {
			if (other.prescriptionInfo != null)
				return false;
		} else if (!prescriptionInfo.equals(other.prescriptionInfo))
			return false;
		if (prescriptionStatus == null) {
			if (other.prescriptionStatus != null)
				return false;
		} else if (!prescriptionStatus.equals(other.prescriptionStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PrescriptionEntity [prescriptionInfo=" + prescriptionInfo
				+ ", prescriptionDetailList=" + prescriptionDetailList
				+ ", prescriptionStatus=" + prescriptionStatus + "]";
	}
	
}
