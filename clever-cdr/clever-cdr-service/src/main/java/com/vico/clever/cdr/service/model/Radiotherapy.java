package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Radiotherapy {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String radiotherapyID;//放疗ID
	public int radiotherapyCount;//放疗次数
	public String clinicalComment;//临床评估
	public Date startDatetime;//放疗开始时间
	public Date endDatetime;//放疗结束时间
	public String site;//放射部位
	public int totalDose;//放射总剂量
	public String totalDoseUnit;//放射总剂量单位
	public String adverseReaction;//不良反应
	public String adverseReationDegree;//不良反应程度
	public String otherInfomation;//其他信息

}
