package com.vico.clever.cdr.service.model;

import java.util.Date;

public class NewBirthProcess {
	public String newBornID;//新生儿ID
	public int gestationalWeeks;//孕周
	public int gestationalDay;//天数,比整周多出的天，值范围为0到6
	public String deliveryClass;//产别
	public String fetalLie;//胎产式
	public String fetalPresentation;//胎先露
	public String fetalPosition;//胎方位
	public String deliveryType;//分娩方式
	public String doctorOneName;//接生医生1姓名
	public String doctorOneCode;//接生医生1代码
	public String doctorTwoName;//接生医生2姓名
	public String doctorTwoCode;//接生医生2代码
	public String nurseOneName;//接生护士1姓名
	public String nurseOneCode;//接生护士1代码
	public String nurseTwoName;//接生护士2姓名
	public String nurseTwoCode;//接生护士2代码
	public Date createDate;//录入日期
	public String creator;//录入人姓名
	public String creatorID;//录入人ID
	public Date lastModifiedDate;//最后修改日期
	public String lastModifierName;//最后修改人姓名
	public String lastModifierCode;//最后修改人ID
}
