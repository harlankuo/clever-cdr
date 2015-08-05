package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EMRDocumentAction {
	public String documentID;//病历文档ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String titleName;//病历标题名称(*)
	public String curStateCode;//标准状态代码
	public String curStateName;//标准状态
	public String careflowStepCode;//实际状态代码
	public String careflowStepName;//实际状态
	public String comment;//病历文档状态备注
	public Date actionDatetime;//执行时间
	public String performerCode;//执行人代码
	public String performerName;//执行人姓名
	public String performDeptCode;//执行科室代码
	public String performDeptName;//执行科室姓名

}
