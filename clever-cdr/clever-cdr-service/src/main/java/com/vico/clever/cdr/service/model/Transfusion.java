package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Transfusion {
	private String patientID;//病人号(*)
    private String visitID;//就诊号(*)
    private String orderID;//医嘱ID
    private String transfusionID;//输血号码(*)
    private String requestID;//手术申请号
    private String bloodType;//输血品种代码
    private Date startDatetime;//输血日期时间
    private String indication;//输血指征
    private String decription;//输血过程记录
    private String reactionFlag;//输血反应标志
    private String reasonCode;//输血原因代码
    private String reason;//输血原因
    private int count;//输血次数
    private int amountAll;//记录输血总量
    private int amountVolume;//输血量
    private String amountVolumeUnit;//输血单位
    private String administrationCode;//输血途径代码
    private String administrationName;//输血途径
    private String frequencyDec;//频率描述
    private int frequencyCount;//频率次数
    private int frequencyInterval;//频率间隔
    private String frequencyIntervalUnit;//频率间隔单位
    private String memo;//备注
    private String reactionType;//反应类型
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
	public String getTransfusionID() {
		return transfusionID;
	}
	public void setTransfusionID(String transfusionID) {
		this.transfusionID = transfusionID;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public Date getStartDatetime() {
		return startDatetime;
	}
	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}
	public String getIndication() {
		return indication;
	}
	public void setIndication(String indication) {
		this.indication = indication;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getReactionFlag() {
		return reactionFlag;
	}
	public void setReactionFlag(String reactionFlag) {
		this.reactionFlag = reactionFlag;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAmountAll() {
		return amountAll;
	}
	public void setAmountAll(int amountAll) {
		this.amountAll = amountAll;
	}
	public int getAmountVolume() {
		return amountVolume;
	}
	public void setAmountVolume(int amountVolume) {
		this.amountVolume = amountVolume;
	}
	public String getAmountVolumeUnit() {
		return amountVolumeUnit;
	}
	public void setAmountVolumeUnit(String amountVolumeUnit) {
		this.amountVolumeUnit = amountVolumeUnit;
	}
	public String getAdministrationCode() {
		return administrationCode;
	}
	public void setAdministrationCode(String administrationCode) {
		this.administrationCode = administrationCode;
	}
	public String getAdministrationName() {
		return administrationName;
	}
	public void setAdministrationName(String administrationName) {
		this.administrationName = administrationName;
	}
	public String getFrequencyDec() {
		return frequencyDec;
	}
	public void setFrequencyDec(String frequencyDec) {
		this.frequencyDec = frequencyDec;
	}
	public int getFrequencyCount() {
		return frequencyCount;
	}
	public void setFrequencyCount(int frequencyCount) {
		this.frequencyCount = frequencyCount;
	}
	public int getFrequencyInterval() {
		return frequencyInterval;
	}
	public void setFrequencyInterval(int frequencyInterval) {
		this.frequencyInterval = frequencyInterval;
	}
	public String getFrequencyIntervalUnit() {
		return frequencyIntervalUnit;
	}
	public void setFrequencyIntervalUnit(String frequencyIntervalUnit) {
		this.frequencyIntervalUnit = frequencyIntervalUnit;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getReactionType() {
		return reactionType;
	}
	public void setReactionType(String reactionType) {
		this.reactionType = reactionType;
	}
	@Override
	public String toString() {
		return "Transfusion [patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", transfusionID=" + transfusionID
				+ ", requestID=" + requestID + ", bloodType=" + bloodType
				+ ", startDatetime=" + startDatetime + ", indication="
				+ indication + ", decription=" + decription + ", reactionFlag="
				+ reactionFlag + ", reasonCode=" + reasonCode + ", reason="
				+ reason + ", count=" + count + ", amountAll=" + amountAll
				+ ", amountVolume=" + amountVolume + ", amountVolumeUnit="
				+ amountVolumeUnit + ", administrationCode="
				+ administrationCode + ", administrationName="
				+ administrationName + ", frequencyDec=" + frequencyDec
				+ ", frequencyCount=" + frequencyCount + ", frequencyInterval="
				+ frequencyInterval + ", frequencyIntervalUnit="
				+ frequencyIntervalUnit + ", memo=" + memo + ", reactionType="
				+ reactionType + "]";
	}
}
