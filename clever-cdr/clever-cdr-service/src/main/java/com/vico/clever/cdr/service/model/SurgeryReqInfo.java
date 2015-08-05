package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryReqInfo {
	public String surgeryReqID;//手术申请号(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String orderID;//医嘱ID
	public String diagnosisBefore;//术前诊断
	public String operativeDoctorID;//手术医生代码
	public String operativeDoctorName;//手术医生名称
	public Date scheduleDate;//拟定手术日期时间
	public String urgencyCode;//用于标识是否是急诊手术，0-择期；1-急诊。
	public String urgencyName;//急诊标志
	public String isolationIndicatorCode;//隔离标志名称，例如正常、隔离、放射等
	public String isolationIndicator;//隔离标志名称，例如正常、隔离、放射等
	public String relevantLabTest;//相关化验结果
	public String operativeDeptCode;//手术室代码
	public String operativeDeptName;//手术室名称
	public String comments;//备注
	public String reqDeptcode;//手术申请科室代码
	public String reqDeptName;//手术申请科室名称
	public String reqDoctorID;//申请医生工号
	public String reqDoctorName;//申请医生姓名
	public Date reqDate;//申请日期及时间
	public String requestStatus;//手术申请状态
	public String dosage;//记录手术过程中用药剂量
	public String dosageUnit;//记录手术过程中用药剂量单位
	public String administrationCode;//记录手术过程中用药剂量给药途径代码
	public String administrationName;//记录手术过程中用药剂量给药途径
	public int frequency;//频率描述
	public String frequencyUnit;//频率描述单位
	public int frequencyInterval;//记录手术过程中用药剂量频率间隔
	public String frequencyIntervalUnit;//记录手术过程中用药剂量频率间隔单位

}
