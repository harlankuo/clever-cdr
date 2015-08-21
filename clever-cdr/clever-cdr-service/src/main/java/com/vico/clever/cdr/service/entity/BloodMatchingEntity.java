package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.BloodMatching;
import com.vico.clever.cdr.service.model.BloodMatchingAction;
@XmlRootElement(name="BloodMatchingEntity")
public class BloodMatchingEntity {
	private BloodMatching bloodMatching;
	private BloodMatchingAction bloodMatchingAction;
	public BloodMatchingEntity() {
		super();
	}
	public BloodMatching getBloodMatching() {
		return bloodMatching;
	}
	public void setBloodMatching(BloodMatching bloodMatching) {
		this.bloodMatching = bloodMatching;
	}
	public BloodMatchingAction getBloodMatchingAction() {
		return bloodMatchingAction;
	}
	public void setBloodMatchingAction(BloodMatchingAction bloodMatchingAction) {
		this.bloodMatchingAction = bloodMatchingAction;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bloodMatching == null) ? 0 : bloodMatching.hashCode());
		result = prime
				* result
				+ ((bloodMatchingAction == null) ? 0 : bloodMatchingAction
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
		BloodMatchingEntity other = (BloodMatchingEntity) obj;
		if (bloodMatching == null) {
			if (other.bloodMatching != null)
				return false;
		} else if (!bloodMatching.equals(other.bloodMatching))
			return false;
		if (bloodMatchingAction == null) {
			if (other.bloodMatchingAction != null)
				return false;
		} else if (!bloodMatchingAction.equals(other.bloodMatchingAction))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BloodMatchingEntity [bloodMatching=" + bloodMatching
				+ ", bloodMatchingAction=" + bloodMatchingAction + "]";
	}
}
