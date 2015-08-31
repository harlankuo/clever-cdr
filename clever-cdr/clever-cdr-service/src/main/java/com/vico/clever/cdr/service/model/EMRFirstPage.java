package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EMRFirstPage {
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String emrFirstPageID;//病案首页ID(*)
	private String templateID;//病案首页模板ID
	private String documentContentUri;//首页内容
	private String contentXMLUri;//首页中XML文件内容
	private String lastOperaterCode;//最后一次保存或提交的操作者ID
	private String lastOperaterName;//最后一次保存或提交的操作者名字
	private Date lastModifiedTime;//最后一次保存或提交的时间
	private Date firstCreateTime;//创建时间
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
	public String getEmrFirstPageID() {
		return emrFirstPageID;
	}
	public void setEmrFirstPageID(String emrFirstPageID) {
		this.emrFirstPageID = emrFirstPageID;
	}
	public String getTemplateID() {
		return templateID;
	}
	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}
	public String getDocumentContentUri() {
		return documentContentUri;
	}
	public void setDocumentContentUri(String documentContentUri) {
		this.documentContentUri = documentContentUri;
	}
	public String getContentXMLUri() {
		return contentXMLUri;
	}
	public void setContentXMLUri(String contentXMLUri) {
		this.contentXMLUri = contentXMLUri;
	}
	public String getLastOperaterCode() {
		return lastOperaterCode;
	}
	public void setLastOperaterCode(String lastOperaterCode) {
		this.lastOperaterCode = lastOperaterCode;
	}
	public String getLastOperaterName() {
		return lastOperaterName;
	}
	public void setLastOperaterName(String lastOperaterName) {
		this.lastOperaterName = lastOperaterName;
	}
	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	public Date getFirstCreateTime() {
		return firstCreateTime;
	}
	public void setFirstCreateTime(Date firstCreateTime) {
		this.firstCreateTime = firstCreateTime;
	}
	
}
