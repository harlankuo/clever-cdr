package com.vico.clever.cdr.service.model;

import java.util.Date;

public class PhysicalExamination {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String requestID;//体检ID(*)
	public String examItemCode;//项目代码
	public String examItemName;//项目
	public String examResultCode;//项目结果代码
	public String examResultName;//项目结果
	public String performerCode;//检查人员代码
	public String performerName;//检查人员名称
	public Date recordDatetime;//记录时间
	public String recorderCode;//记录员代码
	public String recorderName;//记录员姓名

}
