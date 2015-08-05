package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryStatus {
	
	public String surgeryReqID;//手术申请号
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String operationName;//手术名称
	public String curStateCode;//标准状态代码
	public String curStateName;//标准状态
	public String careflowStepCode;//实际状态代码
	public String careflowStepName;//实际状态
	public String comment;//手术备注
	public Date performDateTime;//执行时间
	public String performDoctorCode;//执行人员代码
	public String performDoctorName;//执行人员名称
}
