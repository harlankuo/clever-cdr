package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ExamReqInfo {
	public String examReqID;//检查申请号(*)
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderNO;//医嘱序号
	public String urgencyCode;//优先级0-普通 1-紧急
	public String urgencyName;//优先级
	public Date reqDate;//申请日期时间
	public String reqHospitalName;//申请机构名称
	public String reqHospitalID;//申请机构代码
	public String reqDeptName;//申请科室名称
	public String reqDeptCode;//申请科室代码
	public String reqDoctorName;//申请医生姓名
	public String reqDoctorID;//申请医生代码
	public String intent;//检查目的
	public String syndrom;//临床症状
	public String bodySign;//体征
	public String relevantTest;//相关化验结果
	public String memo;//申请备注
	public String patientRequirement;//说明患者检查时注意事项
	public String receiverDeptName;//检查科室名称
	public String receiverDeptID;//检查科室代码
	public String receiverDoctorName;//检查医师姓名
	public String receiverDoctorID;//检查医师代码
	public String receiverOrganizationName;//检查组织
	public String receiverOrganizationCode;//检查组织代码
	public Date latestDateServiceReq;//最迟的日期是可以接受的服务完成

}
