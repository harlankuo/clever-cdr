package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EMRDocumentDetails {
	private String documentID;//病历文档ID(*)
	private String emrTypeID;//文书类型编号
	private String parentTypeID;//上级文书
	private String templateID;//文档模板ID
	private String titleName;//标题名称
	private Date showTime;//病历显示时间
	private String additionInformation;//添加标题、时间、签名
	private String sectionStartFlag;//段落开始标识
	private String sectionEndFlag;//段落结束标识
	private Date lastOperateTime;//最新一次操作
	private String lineAlign;//标题、时间、签名对齐方式
	private int printNO;//打印序号
	private String contentText;//文档内容
	public String getDocumentID() {
		return documentID;
	}
	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}
	public String getEmrTypeID() {
		return emrTypeID;
	}
	public void setEmrTypeID(String emrTypeID) {
		this.emrTypeID = emrTypeID;
	}
	public String getParentTypeID() {
		return parentTypeID;
	}
	public void setParentTypeID(String parentTypeID) {
		this.parentTypeID = parentTypeID;
	}
	public String getTemplateID() {
		return templateID;
	}
	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public Date getShowTime() {
		return showTime;
	}
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	public String getAdditionInformation() {
		return additionInformation;
	}
	public void setAdditionInformation(String additionInformation) {
		this.additionInformation = additionInformation;
	}
	public String getSectionStartFlag() {
		return sectionStartFlag;
	}
	public void setSectionStartFlag(String sectionStartFlag) {
		this.sectionStartFlag = sectionStartFlag;
	}
	public String getSectionEndFlag() {
		return sectionEndFlag;
	}
	public void setSectionEndFlag(String sectionEndFlag) {
		this.sectionEndFlag = sectionEndFlag;
	}
	public Date getLastOperateTime() {
		return lastOperateTime;
	}
	public void setLastOperateTime(Date lastOperateTime) {
		this.lastOperateTime = lastOperateTime;
	}
	public String getLineAlign() {
		return lineAlign;
	}
	public void setLineAlign(String lineAlign) {
		this.lineAlign = lineAlign;
	}
	public int getPrintNO() {
		return printNO;
	}
	public void setPrintNO(int printNO) {
		this.printNO = printNO;
	}
	public String getContentText() {
		return contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}
	
}
