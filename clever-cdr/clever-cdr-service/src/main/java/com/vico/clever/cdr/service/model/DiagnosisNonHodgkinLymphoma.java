package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisNonHodgkinLymphoma {
	public String diagnosisID;//诊断ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String sampleType;//样本类型
	public String pathologicalType;//病理类型
	public String pathologicalSubType;//病理亚型
	public String stage;//分期
	public String aggressiveSite;//侵犯部位
	public String tumorSize;//瘤灶大小
	public String Bsymptom;//B症状
	public String IPSScore;//IPS评分
	public String AaIPIScore;//aaIPI评分
	public String riskAssessmentDegree;//危险度分级
	public Date diagnosisDatetime;//确诊时间
	public Date recrudescentDatetime;//复发时间
	public int transplantFlag;//标志患者是否移植,0否 1是
	public int HBV;//标记患者是否有乙肝,0否 1是

}
