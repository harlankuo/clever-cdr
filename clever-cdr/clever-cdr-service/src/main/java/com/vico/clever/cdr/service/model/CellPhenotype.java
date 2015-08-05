package com.vico.clever.cdr.service.model;

import java.util.Date;

public class CellPhenotype {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String cellPhenotypeID;//细胞表型ID(*)
	public String classification;//类别
	public String testSample;//检测标本
	public String items;//检测项目
	public Date testDatetime;//检测时间

}
