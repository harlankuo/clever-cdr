package com.vico.clever.cdr.service.model;

import java.util.Date;

public class PhysicalSign {
	public String recordID;//体征记录表主键(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public Date timePoint;//体征数值对应时间点
	public String vitalItem;//体征项
	public String value;//体征值
	public String unit;//体征值的单位
	public String recorderCode;//记录者代码
	public String recorderName;//记录者姓名
	public Date recordDatetime;//记录的日期时间
	public String measuringMode;//测量方式
	public String memo;//备注
	
	

}
