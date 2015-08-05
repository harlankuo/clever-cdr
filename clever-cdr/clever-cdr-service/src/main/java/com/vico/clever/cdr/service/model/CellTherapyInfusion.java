package com.vico.clever.cdr.service.model;

import java.util.Date;

public class CellTherapyInfusion {
	public String requestID;//细胞治疗ID
	public int sequencyOfDay;//输注天序,标志是第几天进行输注
	public Date Datetime;//输注日期
	public String amount;//细胞输注的数量
	public String amountUnit;//输注单位
	public String reaction;//不良反应
	public String classification;//不良反应级别
	

}
