package com.vico.clever.cdr.service.model;

import java.util.Date;

public class PrescriptionDetail {
	public String prescriptionID;//处方ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String itemNO;//处方项目号(*)
	public String itemSubNO;//处方项目子号
	public String STAttribute;//皮试属性,0-不需要皮试，1-需要皮试但结果未知，2-皮试结果阳性，3-皮试结果阴性(*)
	public String ownDrugAttribute;//自带药属性,0医院用药，1自带药
	public String drugName;//药物名称(*)
	public String drugCode;//药嘱代码
	public int dosage;//剂量
	public String doseUnit;//剂量单位
	public String drugSpecification;//药品规格
	public String manufaturer;//厂家
	public String administrationRouteCode;//给药途径代码
	public String administrationRouteName;//给药途径,如静脉注射、口服
	public Date startDate;//计划用药开始日期
    public Date stopDate;//计划用药停止日期
    public int quantity;//数量
    public String quantityUnit;//数量单位
    public String amount;//总量
    public String frequencyUnit;//频率单位
    public int frequency;//频率次数
    public int frequencyInterval;//频率间隔
    public String frequencyIntervalUnit;//频率间隔单位
    public String comment;//备注
    public String costs;//费用
}
