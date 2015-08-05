package com.vico.clever.cdr.service.model;

import java.util.Date;

public class EpigeneticTyerapy {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String epigeneticTherapyID;//表观治疗ID(*)
	public String clinicalComment;//临床评估
	public Date startDatetime;//开始时间
	public Date endDatetime;//结束时间
	public int continuousDays;//持续天数
	public String adverseReaction;//不良反应
	public String adverseReationDegree;//不良反应程度
	public String otherInfomation;//其他信息
}
