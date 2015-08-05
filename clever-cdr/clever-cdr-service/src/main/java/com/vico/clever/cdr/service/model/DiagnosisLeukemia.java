package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisLeukemia {
	public String diagnosisID;//诊断ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String sampleType;//样本类型
	public String leukemiaType;//白血病种类
	public String FABMorphology;//FAB形态学
	public String immumologyClassification;//免疫学分型
	public String aggressiveSite;//侵犯部位
	public Date diagnosisDatetime;//确诊时间
	public Date recrudescentDatetime;//首次复发时间
	public int transplantFlag;//标志患者是否移植
	public int HBV;//标记患者是否有乙肝

}
