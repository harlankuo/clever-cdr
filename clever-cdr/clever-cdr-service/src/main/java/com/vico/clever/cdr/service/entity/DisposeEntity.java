package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Dispose;
import com.vico.clever.cdr.service.model.DisposeAction;

@XmlRootElement(name = "DisposeEntity")
public class DisposeEntity {
	private Dispose dispose;
	private DisposeAction disposeAction;

	public DisposeEntity() {
		super();
	}

	public Dispose getDispose() {
		return dispose;
	}

	public void setDispose(Dispose dispose) {
		this.dispose = dispose;
	}

	public DisposeAction getDisposeAction() {
		return disposeAction;
	}

	public void setDisposeAction(DisposeAction disposeAction) {
		this.disposeAction = disposeAction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dispose == null) ? 0 : dispose.hashCode());
		result = prime * result
				+ ((disposeAction == null) ? 0 : disposeAction.hashCode());
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
		DisposeEntity other = (DisposeEntity) obj;
		if (dispose == null) {
			if (other.dispose != null)
				return false;
		} else if (!dispose.equals(other.dispose))
			return false;
		if (disposeAction == null) {
			if (other.disposeAction != null)
				return false;
		} else if (!disposeAction.equals(other.disposeAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DisposeEntity [dispose=" + dispose + ", disposeAction="
				+ disposeAction + "]";
	}
}
