package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.MedcationOrder;
import com.vico.clever.cdr.service.model.MedcationOrderStatus;
@XmlRootElement(name="MedicationOrderEntity")
public class MedicationOrderEntity {
	private MedcationOrder medicationOrder;
	private MedcationOrderStatus medicationOrderStatus;
	/**
	 * 
	 */
	public MedicationOrderEntity() {
		super();
	}
	public MedicationOrderEntity(MedcationOrder medicationOrder,
			MedcationOrderStatus medicationOrderStatus) {
		super();
		this.medicationOrder = medicationOrder;
		this.medicationOrderStatus = medicationOrderStatus;
	}
	public MedcationOrder getMedicationOrder() {
		return medicationOrder;
	}
	public void setMedicationOrder(MedcationOrder medicationOrder) {
		this.medicationOrder = medicationOrder;
	}
	public MedcationOrderStatus getMedicationOrderStatus() {
		return medicationOrderStatus;
	}
	public void setMedicationOrderStatus(MedcationOrderStatus medicationOrderStatus) {
		this.medicationOrderStatus = medicationOrderStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((medicationOrder == null) ? 0 : medicationOrder.hashCode());
		result = prime
				* result
				+ ((medicationOrderStatus == null) ? 0 : medicationOrderStatus
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
		MedicationOrderEntity other = (MedicationOrderEntity) obj;
		if (medicationOrder == null) {
			if (other.medicationOrder != null)
				return false;
		} else if (!medicationOrder.equals(other.medicationOrder))
			return false;
		if (medicationOrderStatus == null) {
			if (other.medicationOrderStatus != null)
				return false;
		} else if (!medicationOrderStatus.equals(other.medicationOrderStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MedicationOrderEntity [medicationOrder=" + medicationOrder
				+ ", medicationOrderStatus=" + medicationOrderStatus + "]";
	}
}
