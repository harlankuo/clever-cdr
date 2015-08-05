package com.vico.clever.cdr.service.model;

public class CellTherapy {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String requestID;//细胞治疗ID
	public String cellTherapyType;//细胞治疗种类
    public String perKgAmount;//输注量每千克多少数量
    public int infusionAmount;//输注总体数量数值
    public String infusionAmountUnit;//输注总体数量单位
    public String preprocessFlag;//预处理标志
    public String unburdingFlag;//减负标志,是否有减负
    public String cartTransfectionEfficiency;//Cart转染率
    public String cartAmount;//CART数量
    
}
