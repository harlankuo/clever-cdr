package com.vico.clever.cdr.service.model;

import java.util.Date;

public class LabTestReqInfo {
	public String testReqID;//检验申请号,(*)
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public Date reqDate;//申请日期时间
	public String reqDeptName;//申请科室名称
	public String reqDeptCode;//申请科室代码
	public String reqDoctorName;//申请医生姓名
	public String reqDoctorID;//申请医生代码
	public String intent;//检验目的
	public String patientRequirement;//患者准备
	public String diagnosis;//临床诊断
	public String receiverDeptCOde;//执行科室代码
	public String receiverDeptName;//执行科室名称
	public String comment;//标本说明
	public String urgency;//优先级
	public String urgencyCode;//优先级代码0-普通 1-紧急

}
