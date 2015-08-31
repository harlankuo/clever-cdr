package com.vico.clever.cdr.service.entity;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.EMRDocument;
import com.vico.clever.cdr.service.model.EMRDocumentAction;
import com.vico.clever.cdr.service.model.EMRDocumentDetails;

@XmlRootElement(name="EMRDocumentEntity")
public class EMRDocumentEntity {
	private EMRDocument emrDocument;
	private List<EMRDocumentDetails> emrDocumentDetailList;
	private EMRDocumentAction emrDocumentAction;
	public EMRDocument getEmrDocument() {
		return emrDocument;
	}
	public void setEmrDocument(EMRDocument emrDocument) {
		this.emrDocument = emrDocument;
	}
	public List<EMRDocumentDetails> getEmrDocumentDetailList() {
		return emrDocumentDetailList;
	}
	public void setEmrDocumentDetailList(List<EMRDocumentDetails> emrDocumentDetailList) {
		this.emrDocumentDetailList = emrDocumentDetailList;
	}
	public EMRDocumentAction getEmrDocumentAction() {
		return emrDocumentAction;
	}
	public void setEmrDocumentAction(EMRDocumentAction emrDocumentSction) {
		this.emrDocumentAction = emrDocumentSction;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emrDocument == null) ? 0 : emrDocument.hashCode());
		result = prime * result + ((emrDocumentDetailList == null) ? 0 : emrDocumentDetailList.hashCode());
		result = prime * result + ((emrDocumentAction == null) ? 0 : emrDocumentAction.hashCode());
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
		EMRDocumentEntity other = (EMRDocumentEntity) obj;
		if (emrDocument == null) {
			if (other.emrDocument != null)
				return false;
		} else if (!emrDocument.equals(other.emrDocument))
			return false;
		if (emrDocumentDetailList == null) {
			if (other.emrDocumentDetailList != null)
				return false;
		} else if (!emrDocumentDetailList.equals(other.emrDocumentDetailList))
			return false;
		if (emrDocumentAction == null) {
			if (other.emrDocumentAction != null)
				return false;
		} else if (!emrDocumentAction.equals(other.emrDocumentAction))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EMRDocumentEntity [emrDocument=" + emrDocument + ", emrDocumentDetailList=" + emrDocumentDetailList
				+ ", emrDocumentSction=" + emrDocumentAction + "]";
	}
	
   
}
