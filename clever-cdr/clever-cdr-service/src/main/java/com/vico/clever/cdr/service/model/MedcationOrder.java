package com.vico.clever.cdr.service.model;

import java.util.Date;

public class MedcationOrder {
	public String medicationOrderID;//药嘱ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String orderID;//医嘱ID
	public byte ownMedicine;//自带药属性,0-使用医院的药，1-使用自带药(*)
	public String STCode;//皮试属性代码,0-不需要皮试，1-需要皮试但结果未知，2-皮试结果阳性，3-皮试结果阴性(*)
	public String STName;//皮试属性
	public String medicationName;//药物名称
	public String medicationCode;//药嘱代码
	public int doseAmount;//剂量数
	public String doseUnitCode;//剂量单位代码
	public String doseUnit;//剂量单位
	public String medicineCompound;//药品规格
	public int dailyCount;//24小时用量
	public int numberAllOfMedicine;//药品使用总量
	public String administrationRouteCode;//给药途径代码
	public String administrationRouteName;//给药途径,如静脉注射、口服
	public Date startDate;//计划用药开始日期
    public Date stopDate;//计划用药停止日期
    public int durationOfTreat;//用药持续时间
    public String durationUnit;//持续时间单位
    public String frequencyUnit;//执行频率单位
    public int frequency;//频率次数
    public int frequencyInterval;//频率间隔
    public String frequencyIntervalUnit;//频率间隔单位
    public String comment;//备注
    public String formCode;//药物剂型代码
    public String formName;//药物剂型名称
}
