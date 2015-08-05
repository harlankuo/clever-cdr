package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EMRDocumentDetails {
	public String documentID;//病历文档ID(*)
	public String emrTypeID;//文书类型编号
	public String parentTypeID;//上级文书
	public String templateID;//文档模板ID
	public String titleName;//标题名称
	public Date showTime;//病历显示时间
	public String additionInformation;//添加标题、时间、签名
	public String sectionStartFlag;//段落开始标识
	public String sectionEndFlag;//段落结束标识
	public Date lastOperateTime;//最新一次操作
	public int printNO;//打印序号
	public String contentText;//文档内容
}
