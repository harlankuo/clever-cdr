package com.vico.clever.cdr.service.model;

import java.util.Date;

public class LabTestData {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String testReqID;//检验申请号(*)
	public String reportID;//检验报告号
	public String deviceID;//检验设备号
	public String itemNO;//项目序号
	public String itemName;//项目名称
	public Date executeDate;//检验日期时间
	public String result;//项目结果值
	public String resultUnit;//项目结果单位
	public String normallIndicator;//项目结果正常标志,N-正常 L-低 H-高
	public String referenceValue;//正常参考值
	public Date resultDate;//检验报告日期及时间
	public String overallInterpretation;//检验报告结果
	public String receiverDoctorID;//检验医师代码
	public String receiverDoctorName;//检验医师名称
	public String reporterID;//报告医师代码
	public String reporterName;//报告医师姓名
	public String auditingPhysicianID;//审核医师代码
	public String auditingPhysicianName;//审核医师姓名
	public String receiverDeptID;//报告科室代码
	public String receiverDeptName;//报告科室名称
	public String memo;//报告备注
    
}
