package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ProblemDiagnosis {
	public String diagnosisID;//诊断ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String condition;//入院病情
	public int dayOfTreatment;//治疗天数
	public String result;//治疗结果
	public String flagOfOperation;//是否手术治疗,0-否；1-是。
	public String doctor;//诊断医生
	public String classOfDiagnosisCode;//诊断类别ID
	public String classOfDiagnosisName;//类别名称
	public String diagnosisNO;//诊断序号(*)
	public String problemDiagnosis;//诊断项目代码
	public String description;//诊断项目名称
	public Date dateOfDiagnosis;//诊断日期和时间
}
