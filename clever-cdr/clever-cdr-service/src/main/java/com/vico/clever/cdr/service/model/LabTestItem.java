package com.vico.clever.cdr.service.model;

import java.util.Date;

public class LabTestItem {
	public String tetReqID;//检验申请号(*)
	public String itemNO;//项目序号(*)
	public String itemClassCode;//检验类别代码
	public String itemClassName;//检验类别名称
	public String itemCode;//检验项目代码
	public String itemName;//检验项目名称
	public String specimenID;//检验标本号
	public String specimenTypeCode;//检验样本类别代码
	public String specimenTypeName;//检验样本类别名称
	public Date specimenCollectionDate;//样本采样日期时间
	public Date specimenReceiptDate;//样本收到日期时间
	public String specimenStatus;//标本状态
	public String transportMediumCode;//试管种类代码
	public String transportMediumName;//试管种类名称

}
