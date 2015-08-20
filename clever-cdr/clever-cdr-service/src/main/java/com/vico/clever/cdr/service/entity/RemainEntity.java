package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;

@XmlRootElement(name = "RemainEntity")
public class RemainEntity {
	private Remain remain;
	private RemainAction remainAction;

	public RemainEntity() {
		super();
	}

	public Remain getRemain() {
		return remain;
	}

	public void setRemain(Remain remain) {
		this.remain = remain;
	}

	public RemainAction getRemainAction() {
		return remainAction;
	}

	public void setRemainAction(RemainAction remainAction) {
		this.remainAction = remainAction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((remain == null) ? 0 : remain.hashCode());
		result = prime * result
				+ ((remainAction == null) ? 0 : remainAction.hashCode());
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
		RemainEntity other = (RemainEntity) obj;
		if (remain == null) {
			if (other.remain != null)
				return false;
		} else if (!remain.equals(other.remain))
			return false;
		if (remainAction == null) {
			if (other.remainAction != null)
				return false;
		} else if (!remainAction.equals(other.remainAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RemainEntity [remain=" + remain + ", remainAction="
				+ remainAction + "]";
	}
}
