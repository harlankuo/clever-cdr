package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Chemotherapy {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String chemotherapyID;//放疗ID(*)
	public String solutionName;//化疗方案名称
	public Date startDatetime;//化疗开始时间
	public Date endDatetime;//化疗结束时间
	public int period;//周期数
	public int commentCount;//评估次数
	public String comment;//评估
	public byte doseAdjustmentFlag;//剂量调整标志
	public String doseAdjustmentReason;//剂量调整原因
	public byte modifiedSolutionFlag;//方案更改标志
	public String modifiedReason;//方案更改原因
	public String adverseReaction;//不良反应
	public String adverseReactionDegree;//不良反应程度
	public String otherInfomation;//其他信息
	
}
