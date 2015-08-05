package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ConsultationAction {
	public String consultRequestID;//会诊申请号(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String consultContent;//会诊内容
	public String curStateCode;//标准状态代码
	public String curStateName;//标准状态
	public String careflowStepCode;//实际状态代码
	public String careflowStepName;//实际状态
	public Date actionDatetime;//执行时间
	public String performerCode;//执行人代码
	public String performerName;//执行人姓名
	public String performDeptCode;//执行科室代码
	public String performDeptName;//执行科室姓名
	public String memo;//备注
	

}
