package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Diet {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String dietID;//饮食申请号(*)
	public String dietContent;//饮食内容
	public Date planneExecDatetime;//计划执行时间
	public Date plannedStopDatetime;//计划停止时间
	public String dosage;//剂量
	public String dosageUnit;//剂量单位
	public String administrationCode;//给药途径代码
	public String administrationName;//给药途径名称
	public String frequencyDescription;//频率描述
	public int frequencyCount;//频率次数
	public int frequencyInterval;//频率间隔
	public String frequencyIntervalUnit;//频率间隔单位
	public String memo;//备注

}
