package com.vico.clever.cdr.service.model;

import java.util.Date;

public class DiagnosisMyeloma {
	public String diagnosisID;//诊断ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String heavyChain;//重链
	public String lightChain;//轻链
	public int nonSecretion;//不分泌
	public String DSStage;//D-S分期
	public String DSSubStage;//D-S亚分期
	public String aggressiveSite;//侵犯部位
	public String ISSStage;//SS分期
	public String ISSSubStage;//ISS亚分期
	public Date diagnosisDatetime;//确诊时间
	public Date recrudescentDatetime;//复发时间
	public int transplantFlag;//标志患者是否移植,0否 1是

}
