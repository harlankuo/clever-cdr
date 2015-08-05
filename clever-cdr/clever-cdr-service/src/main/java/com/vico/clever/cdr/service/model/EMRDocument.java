package com.vico.clever.cdr.service.model;

public class EMRDocument {
	public String documentID;//病历文档ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String parentTypeID;//上级文书
	public byte[] documentContentUri;//病历内容
	public String contentText;//病历内容（文本）
	public byte[] contentXmlUri;//病历XML

}
