package com.vico.clever.cdr.service.entity;

import com.vico.clever.cdr.service.model.EMRFirstPage;
import com.vico.clever.cdr.service.model.EMRFirstPageAction;

public class EMRFirstPageEntity {
	private EMRFirstPage emrFirstPage;
	private EMRFirstPageAction emrFirstPageAction;
	public EMRFirstPage getEmrFirstPage() {
		return emrFirstPage;
	}
	public void setEmrFirstPage(EMRFirstPage emrFirstPage) {
		this.emrFirstPage = emrFirstPage;
	}
	public EMRFirstPageAction getEmrFirstPageAction() {
		return emrFirstPageAction;
	}
	public void setEmrFirstPageAction(EMRFirstPageAction emrFirstPageAction) {
		this.emrFirstPageAction = emrFirstPageAction;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emrFirstPage == null) ? 0 : emrFirstPage.hashCode());
		result = prime * result + ((emrFirstPageAction == null) ? 0 : emrFirstPageAction.hashCode());
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
		EMRFirstPageEntity other = (EMRFirstPageEntity) obj;
		if (emrFirstPage == null) {
			if (other.emrFirstPage != null)
				return false;
		} else if (!emrFirstPage.equals(other.emrFirstPage))
			return false;
		if (emrFirstPageAction == null) {
			if (other.emrFirstPageAction != null)
				return false;
		} else if (!emrFirstPageAction.equals(other.emrFirstPageAction))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EMRFirstPageEntity [emrFirstPage=" + emrFirstPage + ", emrFirstPageAction=" + emrFirstPageAction + "]";
	}
	
	
	

}
