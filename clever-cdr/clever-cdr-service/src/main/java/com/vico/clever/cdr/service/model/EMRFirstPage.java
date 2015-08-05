package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EMRFirstPage {
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String emrFirstPageID;//病案首页ID(*)
	public String templateID;//病案首页模板ID
	public byte[] documentContentID;//首页内容
	public byte[] contentXMLUri;//首页中XML文件内容
	public String lastOperaterCode;//最后一次保存或提交的操作者ID
	public String lastOperaterName;//最后一次保存或提交的操作者名字
	public Date lastModifiedTime;//最后一次保存或提交的时间
	public Date firstCreateTime;//创建时间
}
