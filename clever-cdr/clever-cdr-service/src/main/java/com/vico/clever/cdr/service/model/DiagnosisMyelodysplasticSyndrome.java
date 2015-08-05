package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisMyelodysplasticSyndrome {
	public String diagnosisID;//诊断ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String classification;//分型
	public String IPSScore;//IPS评分
	public String WPSSScore;//WPSS评分
	public String riskAssessmentDegree;//危险度分级
	public Date diagnosisDatetime;//确诊时间
	public int transplantFlag;//标志患者是否移植,0否 1是
	public int HBV;//标记患者是否有乙肝,0否 1是

}
