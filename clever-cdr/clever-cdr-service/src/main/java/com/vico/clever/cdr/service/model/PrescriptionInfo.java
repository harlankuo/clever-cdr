package com.vico.clever.cdr.service.model;

public class PrescriptionInfo {
	public String presciptionID;//处方ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String orderID;//医嘱ID
	public String mandatorName;//委托人姓名
	public String mandatorIDCard;//委托人证件号
	public String drugType;//药物类别,非空，0-西药，1-中成药，2-中药饮片，3-中药配方(*)
	public String prescriptionType;//处方类型,0-普通处方，1-儿科处方，2-麻醉药品处方，3-一类精神药品处方，4-二类精神药品处方(*)
	public String presciptionSource;//处方来源,0-门诊，1-住院，2-其他
	public String destinationPharmacyCode;//发送药房代码
	public String destinationPharmacyName;//发送药房名称
	public String doseCount;//剂数
	public String costs;//费用
	public String memo;//备忘	

}
