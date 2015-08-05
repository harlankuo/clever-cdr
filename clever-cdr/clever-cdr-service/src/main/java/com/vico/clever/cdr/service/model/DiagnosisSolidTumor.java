package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisSolidTumor {
	public String diagnosisID;//诊断ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String sampleType;//样本类型
	public String pathologicalType;//病理类型
	public String differentiatedDegree;//分化程度
	public String system;//系统
	public String site;//部位
	public String tumorSize;//肿瘤大小
	public String Tstage;//T分期
	public String NStage;//N分期
	public String MStage;//M分期
	public String coprehensiveStage;//综合分期
	public String transferSite;//转移部位
	public Date diagnosisDatetime;//确诊时间
	public Date recrudescentDatetime;//复发时间
	public Date transferDatetime;//转移时间
	public int operationFlag;//标志患者是否手术 0否 1是

}
