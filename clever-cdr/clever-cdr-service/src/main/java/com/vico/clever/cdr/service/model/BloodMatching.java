package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="BloodMatching")
public class BloodMatching {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String bloodMatchingID;//配血医嘱申请号(*)
	public String bloodMatchingContent;//配血医嘱内容
	public Date planneExecDatetime;//计划执行时间
	public Date plannedStopDatetime;//计划停止时间
	public String dosage;//剂量
	public String dosageUnit;//剂量单位
	public String administrationCode;//配血途径代码
	public String administrationName;//配血途径名称
	public String memo;//备注

}
