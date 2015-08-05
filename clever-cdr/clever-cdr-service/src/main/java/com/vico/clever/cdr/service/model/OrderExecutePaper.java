package com.vico.clever.cdr.service.model;

import java.util.Date;

public class OrderExecutePaper {
	public String orderExcuteID;//执行单号码(*)
	public String orderID;//医嘱ID(*)
	public String orderNO;//医嘱序号(*)
	public String referenceID;//引用ID,对应各类医嘱主键，如检查申请号，检验申请号
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String performClassName;//执行单类别名称,例如检查单、检验单
	public String performClassCode;//执行单类别代码
	public String orderItem;//医嘱内容
	public Date scheduleDateTime;//计划执行日期时间
	public int performSerialNumber;//执行序号,本条项目在患者某天执行单中的序号，从1开始。
	public int performStepNumber;//执行步数,表示一条医嘱的第几步执行
	public int schemaPrint;//执行单打印标记,0-未打印 1-打印
	public int labelPrint;//标签打印标记,0-未打印 1-打印	

}
