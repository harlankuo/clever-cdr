package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.DrugDispenseReqStatus;
import com.vico.clever.cdr.service.model.DrugDispensingReq;
@XmlRootElement(name="DrugsDispenseEntity")
public class DrugsDispenseEntity {
	private DrugDispensingReq drugDispensingReq;
	private DrugDispenseReqStatus drugDispenseReqStatus;
	public DrugsDispenseEntity() {
		super();
	}
	public DrugsDispenseEntity(DrugDispensingReq drugDispensingReq,
			DrugDispenseReqStatus drugDispenseReqStatus) {
		super();
		this.drugDispensingReq = drugDispensingReq;
		this.drugDispenseReqStatus = drugDispenseReqStatus;
	}
	public DrugDispensingReq getDrugDispensingReq() {
		return drugDispensingReq;
	}
	public void setDrugDispensingReq(DrugDispensingReq drugDispensingReq) {
		this.drugDispensingReq = drugDispensingReq;
	}
	public DrugDispenseReqStatus getDrugDispenseReqStatus() {
		return drugDispenseReqStatus;
	}
	public void setDrugDispenseReqStatus(DrugDispenseReqStatus drugDispenseReqStatus) {
		this.drugDispenseReqStatus = drugDispenseReqStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((drugDispenseReqStatus == null) ? 0 : drugDispenseReqStatus
						.hashCode());
		result = prime
				* result
				+ ((drugDispensingReq == null) ? 0 : drugDispensingReq
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
		DrugsDispenseEntity other = (DrugsDispenseEntity) obj;
		if (drugDispenseReqStatus == null) {
			if (other.drugDispenseReqStatus != null)
				return false;
		} else if (!drugDispenseReqStatus.equals(other.drugDispenseReqStatus))
			return false;
		if (drugDispensingReq == null) {
			if (other.drugDispensingReq != null)
				return false;
		} else if (!drugDispensingReq.equals(other.drugDispensingReq))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DrugsDispenseEntity [drugDispensingReq=" + drugDispensingReq
				+ ", drugDispenseReqStatus=" + drugDispenseReqStatus + "]";
	}
}
