package com.vico.clever.cdr.service.model;

import java.util.Date;

public class LabTestStatus {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String testReqID;//检验申请号
	public String testItemName;//检验项目名称
	public String curStateCode;//标准状态代码
	public String curStateName;//标准状态
	public String careflowStepCode;//实际状态代码
	public String careflowStepName;//实际状态
	public Date performDateTime;//执行时间
	public String performDoctorCode;//执行人员代码
	public String performDoctorName;//执行人员名称
	public String memo;//备注

}
