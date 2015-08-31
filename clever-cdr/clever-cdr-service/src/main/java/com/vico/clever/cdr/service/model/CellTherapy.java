package com.vico.clever.cdr.service.model;

public class CellTherapy {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱ID
	private String requestID;//细胞治疗ID
	private String cellTherapyType;//细胞治疗种类
    private String perKgAmount;//输注量每千克多少数量
    private int infusionAmount;//输注总体数量数值
    private String infusionAmountUnit;//输注总体数量单位
    private String preprocessFlag;//预处理标志
    private String unburdingFlag;//减负标志,是否有减负
    private String cartTransfectionEfficiency;//Cart转染率
    private String cartAmount;//CART数量
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getVisitID() {
		return visitID;
	}
	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getCellTherapyType() {
		return cellTherapyType;
	}
	public void setCellTherapyType(String cellTherapyType) {
		this.cellTherapyType = cellTherapyType;
	}
	public String getPerKgAmount() {
		return perKgAmount;
	}
	public void setPerKgAmount(String perKgAmount) {
		this.perKgAmount = perKgAmount;
	}
	public int getInfusionAmount() {
		return infusionAmount;
	}
	public void setInfusionAmount(int infusionAmount) {
		this.infusionAmount = infusionAmount;
	}
	public String getInfusionAmountUnit() {
		return infusionAmountUnit;
	}
	public void setInfusionAmountUnit(String infusionAmountUnit) {
		this.infusionAmountUnit = infusionAmountUnit;
	}
	public String getPreprocessFlag() {
		return preprocessFlag;
	}
	public void setPreprocessFlag(String preprocessFlag) {
		this.preprocessFlag = preprocessFlag;
	}
	public String getUnburdingFlag() {
		return unburdingFlag;
	}
	public void setUnburdingFlag(String unburdingFlag) {
		this.unburdingFlag = unburdingFlag;
	}
	public String getCartTransfectionEfficiency() {
		return cartTransfectionEfficiency;
	}
	public void setCartTransfectionEfficiency(String cartTransfectionEfficiency) {
		this.cartTransfectionEfficiency = cartTransfectionEfficiency;
	}
	public String getCartAmount() {
		return cartAmount;
	}
	public void setCartAmount(String cartAmount) {
		this.cartAmount = cartAmount;
	}
    
}
