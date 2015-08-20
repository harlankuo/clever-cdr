package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Diet;
import com.vico.clever.cdr.service.model.DietAction;
@XmlRootElement(name="DietInfoEntity")
public class DietInfoEntity {
	private Diet diet;
	private DietAction dietAction;

	public DietInfoEntity() {
		super();
	}

	public DietInfoEntity(Diet diet, DietAction dietAction) {
		super();
		this.diet = diet;
		this.dietAction = dietAction;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public DietAction getDietAction() {
		return dietAction;
	}

	public void setDietAction(DietAction dietAction) {
		this.dietAction = dietAction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diet == null) ? 0 : diet.hashCode());
		result = prime * result
				+ ((dietAction == null) ? 0 : dietAction.hashCode());
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
		DietInfoEntity other = (DietInfoEntity) obj;
		if (diet == null) {
			if (other.diet != null)
				return false;
		} else if (!diet.equals(other.diet))
			return false;
		if (dietAction == null) {
			if (other.dietAction != null)
				return false;
		} else if (!dietAction.equals(other.dietAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DietInfoEntity [diet=" + diet + ", dietAction=" + dietAction
				+ "]";
	}
}
