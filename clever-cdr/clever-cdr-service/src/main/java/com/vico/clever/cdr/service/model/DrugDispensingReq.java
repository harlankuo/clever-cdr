package com.vico.clever.cdr.service.model;

public class DrugDispensingReq {
	public String medicationID;// 药嘱ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String drugDispensingReqID;//摆药申请单号(*)
	public String emergency;//紧急摆药属性(*),0-普通，1-紧急，默认为0
	public String destinationPharmacyName;//发往药房名称
	public String destinationPharmacyCode;//发往药房代码
	public String reqDispensingAmount;//申请摆药量
	public String reqDispensingAmountUnit;//申请摆药量单位
	public String  receiveDispensingAmount;//实际摆药量
	public String receiveDispensingAmountUnit;//实际摆药量单位
	public String medicineTradeName;//所摆药品的商品名
	public String apprpvalNumber;//所摆药品的批准文号
	public String manufacturer;//所摆药品的生产厂家
	public String batchID;//所摆药品的生产批号
	public String reqDeptCode;//摆药申请科室代码
	public String reqDeptName;//摆药申请科室名称
	public String reqWardCode;//摆药申请病区代码
	public String reqWardName;//摆药申请病区名称
}
