package com.vico.clever.cdr.service.model;

import java.util.Date;

public class MedcationOrderStatus {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String medcationOrderID;//药嘱ID
	public String medication;//药物名称
	public String medicationCOde;//药物代码
	public String curStateCode;//标准状态代码
	public String curStateName;//标准状态
	public String careflowStepCode;//实际状态代码
	public String careflowStepName;//实际状态
	public Date performDateTime;//执行时间
	public String performDoctorCode;//执行人员代码
	public String performDoctorName;//执行人员名称

}
