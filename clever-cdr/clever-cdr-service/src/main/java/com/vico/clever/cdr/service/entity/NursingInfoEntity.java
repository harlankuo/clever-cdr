package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Nursing;
import com.vico.clever.cdr.service.model.NursingAction;
@XmlRootElement(name="NursingInfoEntity")
public class NursingInfoEntity {
	private Nursing nursing;
	private NursingAction nursingAction;

	public NursingInfoEntity() {
		super();
	}

	public Nursing getNursing() {
		return nursing;
	}

	public void setNursing(Nursing nursing) {
		this.nursing = nursing;
	}

	public NursingAction getNursingAction() {
		return nursingAction;
	}

	public void setNursingAction(NursingAction nursingAction) {
		this.nursingAction = nursingAction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nursing == null) ? 0 : nursing.hashCode());
		result = prime * result
				+ ((nursingAction == null) ? 0 : nursingAction.hashCode());
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
		NursingInfoEntity other = (NursingInfoEntity) obj;
		if (nursing == null) {
			if (other.nursing != null)
				return false;
		} else if (!nursing.equals(other.nursing))
			return false;
		if (nursingAction == null) {
			if (other.nursingAction != null)
				return false;
		} else if (!nursingAction.equals(other.nursingAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NursingInfoEntity [nursing=" + nursing + ", nursingAction="
				+ nursingAction + "]";
	}
}
