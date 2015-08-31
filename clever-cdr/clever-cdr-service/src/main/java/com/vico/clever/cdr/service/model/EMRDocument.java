package com.vico.clever.cdr.service.model;

public class EMRDocument {
	private String documentID;//病历文档ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String parentTypeID;//上级文书
	private String documentContentUri;//病历内容
	private String contentText;//病历内容（文本）
	private String contentXmlUri;//病历XML
	public String getDocumentID() {
		return documentID;
	}
	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getVisitID() {
		return visitID;
	}
	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}
	public String getParentTypeID() {
		return parentTypeID;
	}
	public void setParentTypeID(String parentTypeID) {
		this.parentTypeID = parentTypeID;
	}
	public String getDocumentContentUri() {
		return documentContentUri;
	}
	public void setDocumentContentUri(String documentContentUri) {
		this.documentContentUri = documentContentUri;
	}
	public String getContentText() {
		return contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}
	public String getContentXmlUri() {
		return contentXmlUri;
	}
	public void setContentXmlUri(String contentXmlUri) {
		this.contentXmlUri = contentXmlUri;
	}
   
}
