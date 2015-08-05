package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Consultation {
	public String consultRequestID;//会诊申请号(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String orderID;//医嘱ID
	public String consultGrade;//会诊级别,0-科间会诊；1-全院会诊
	public String consultComment;//会诊意见
	public String intendedConsultDeptCode;//拟请科室代码
	public String intendedConsultDeptName;//拟请科室名称
	public String intendedConsultDoctorCode;//拟请医生代码
	public String intendedConsultDoctorName;//拟请医生姓名
	public Date intendedConsultDatetime;//	拟定会诊时间
	public String intendedConsultPlace;//拟定会诊地点
	public String consultPurpose;//会诊目的
}
