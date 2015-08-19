package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Therapy;
import com.vico.clever.cdr.service.model.TherapyAction;

@XmlRootElement(name = "TherapyEntity")
public class TherapyEntity {
	private Therapy therapy;
	private TherapyAction therapyAction;

	public TherapyEntity() {
		super();
	}

	public TherapyEntity(Therapy therapy, TherapyAction therapyAction) {
		super();
		this.therapy = therapy;
		this.therapyAction = therapyAction;
	}

	public Therapy getTherapy() {
		return therapy;
	}

	public void setTherapy(Therapy therapy) {
		this.therapy = therapy;
	}

	public TherapyAction getTherapyAction() {
		return therapyAction;
	}

	public void setTherapyAction(TherapyAction therapyAction) {
		this.therapyAction = therapyAction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((therapy == null) ? 0 : therapy.hashCode());
		result = prime * result
				+ ((therapyAction == null) ? 0 : therapyAction.hashCode());
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
		TherapyEntity other = (TherapyEntity) obj;
		if (therapy == null) {
			if (other.therapy != null)
				return false;
		} else if (!therapy.equals(other.therapy))
			return false;
		if (therapyAction == null) {
			if (other.therapyAction != null)
				return false;
		} else if (!therapyAction.equals(other.therapyAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TherapyEntity [therapy=" + therapy + ", therapyAction="
				+ therapyAction + "]";
	}
}
