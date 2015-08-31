package com.vico.clever.cdr.service.model;

public class CellPhenotypeValue {
	private String cellPhenotypeID;//细胞表型ID(*)
	private String name;//项目名称
	private String absoluteNO;//绝对数
	private String accountLymphocytesPercentage;//占淋巴细胞百分比

	public String getCellPhenotypeID() {
		return cellPhenotypeID;
	}
	public void setCellPhenotypeID(String cellPhenotypeID) {
		this.cellPhenotypeID = cellPhenotypeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbsoluteNO() {
		return absoluteNO;
	}
	public void setAbsoluteNO(String absoluteNO) {
		this.absoluteNO = absoluteNO;
	}
	public String getAccountLymphocytesPercentage() {
		return accountLymphocytesPercentage;
	}
	public void setAccountLymphocytesPercentage(String accountLymphocytesPercentage) {
		this.accountLymphocytesPercentage = accountLymphocytesPercentage;
	}
	
	
}
