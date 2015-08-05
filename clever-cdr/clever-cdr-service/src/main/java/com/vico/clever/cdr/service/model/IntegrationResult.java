package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IntegrationResult")
public class IntegrationResult {
	public static final int SUCCESSCODE=0;
	public static final String SUCCESSDESC="成功";
	public static final int INTERNALERROR=-500;
	public static final String INTERNALDESC="服务内部错误";
	private int resultCode;
	private String resultDesc;
	public IntegrationResult() {
		super();
	}
	public IntegrationResult(int resultCode, String resultDesc) {
		super();
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDesc() {
		if(resultDesc==null){
			resultDesc="";
		}
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
}
