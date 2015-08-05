package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ExamItem {
	public String examReqID;//检查申请号(*)
	public int itemNO;//项目序号
	public String examClass;//检查类别
	public String examClassCode;//检查类别代码
	public String examSubClass;//检查子类
	public String examSubClassCode;//检查子类代码
	public String itemName;//检查项目名称
	public String itemCode;//检查项目代码
	public Date scheduleDate;//预约时间
	public String scheduleDeptCode;//预约科室代码
	public String scheduleDeptName;//预约科室名称
	public String scheduleDoctorCode;//预约医生代码
	public String scheduleDoctorName;//预约医生名称

}
