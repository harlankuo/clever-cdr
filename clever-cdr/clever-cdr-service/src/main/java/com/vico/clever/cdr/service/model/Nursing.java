package com.vico.clever.cdr.service.model;

public class Nursing {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String nursingID;//护理申请号(*)
	public String nursingLevel;//护理等级
	public String nursingCategoryCode;//护理种类代码
	public String nursingCategoryName;//护理种类名称
	public String nursingOperation;//护理操作
	public String nursingItemType;//项目类型
	public String nursingResult;//护理结果
	public String nursingObservationItem;//观察项目
	public String nursingObservationResult;//观察项目结果
	public String issues;//护理问题
	public String suggest;//护理意见
	public String dosage;//剂量
	public String dosageUnit;//剂量单位
	public String administrationCode;//给药途径代码
	public String administrationName;//给药途径名称
	public String frequencyDescription;//频率描述
	public int frequencyCount;//频率次数
	public int frequencyInterval;//频率间隔
	public String frequencyIntervalUnit;//频率间隔单位
	public String comment;//备注

}
