package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Transfusion")
public class Transfusion {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱ID
	private String transfusionID;// 输血号码(*)
	private String requestID;// 手术申请号
	private String bloodType;// 输血品种代码
	private Date startDatetime;// 输血日期时间
	private String indication;// 输血指征
	private String decription;// 输血过程记录
	private String reactionFlag;// 输血反应标志
	private String reasonCode;// 输血原因代码
	private String reason;// 输血原因
	private int count;// 输血次数
	private int amountAll;// 记录输血总量
	private int amountVolume;// 输血量
	private String amountVolumeUnit;// 输血单位
	private String administrationCode;// 输血途径代码
	private String administrationName;// 输血途径
	private String frequencyDec;// 频率描述
	private int frequencyCount;// 频率次数
	private int frequencyInterval;// 频率间隔
	private String frequencyIntervalUnit;// 频率间隔单位
	private String memo;// 备注
	private String reactionType;// 反应类型

	public Transfusion() {
		super();
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((administrationCode == null) ? 0 : administrationCode
						.hashCode());
		result = prime
				* result
				+ ((administrationName == null) ? 0 : administrationName
						.hashCode());
		result = prime * result + amountAll;
		result = prime * result + amountVolume;
		result = prime
				* result
				+ ((amountVolumeUnit == null) ? 0 : amountVolumeUnit.hashCode());
		result = prime * result
				+ ((bloodType == null) ? 0 : bloodType.hashCode());
		result = prime * result + count;
		result = prime * result
				+ ((decription == null) ? 0 : decription.hashCode());
		result = prime * result + frequencyCount;
		result = prime * result
				+ ((frequencyDec == null) ? 0 : frequencyDec.hashCode());
		result = prime * result + frequencyInterval;
		result = prime
				* result
				+ ((frequencyIntervalUnit == null) ? 0 : frequencyIntervalUnit
						.hashCode());
		result = prime * result
				+ ((indication == null) ? 0 : indication.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((reactionFlag == null) ? 0 : reactionFlag.hashCode());
		result = prime * result
				+ ((reactionType == null) ? 0 : reactionType.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result
				+ ((reasonCode == null) ? 0 : reasonCode.hashCode());
		result = prime * result
				+ ((requestID == null) ? 0 : requestID.hashCode());
		result = prime * result
				+ ((startDatetime == null) ? 0 : startDatetime.hashCode());
		result = prime * result
				+ ((transfusionID == null) ? 0 : transfusionID.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transfusion other = (Transfusion) obj;
		if (administrationCode == null) {
			if (other.administrationCode != null)
				return false;
		} else if (!administrationCode.equals(other.administrationCode))
			return false;
		if (administrationName == null) {
			if (other.administrationName != null)
				return false;
		} else if (!administrationName.equals(other.administrationName))
			return false;
		if (amountAll != other.amountAll)
			return false;
		if (amountVolume != other.amountVolume)
			return false;
		if (amountVolumeUnit == null) {
			if (other.amountVolumeUnit != null)
				return false;
		} else if (!amountVolumeUnit.equals(other.amountVolumeUnit))
			return false;
		if (bloodType == null) {
			if (other.bloodType != null)
				return false;
		} else if (!bloodType.equals(other.bloodType))
			return false;
		if (count != other.count)
			return false;
		if (decription == null) {
			if (other.decription != null)
				return false;
		} else if (!decription.equals(other.decription))
			return false;
		if (frequencyCount != other.frequencyCount)
			return false;
		if (frequencyDec == null) {
			if (other.frequencyDec != null)
				return false;
		} else if (!frequencyDec.equals(other.frequencyDec))
			return false;
		if (frequencyInterval != other.frequencyInterval)
			return false;
		if (frequencyIntervalUnit == null) {
			if (other.frequencyIntervalUnit != null)
				return false;
		} else if (!frequencyIntervalUnit.equals(other.frequencyIntervalUnit))
			return false;
		if (indication == null) {
			if (other.indication != null)
				return false;
		} else if (!indication.equals(other.indication))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (reactionFlag == null) {
			if (other.reactionFlag != null)
				return false;
		} else if (!reactionFlag.equals(other.reactionFlag))
			return false;
		if (reactionType == null) {
			if (other.reactionType != null)
				return false;
		} else if (!reactionType.equals(other.reactionType))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (reasonCode == null) {
			if (other.reasonCode != null)
				return false;
		} else if (!reasonCode.equals(other.reasonCode))
			return false;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		if (startDatetime == null) {
			if (other.startDatetime != null)
				return false;
		} else if (!startDatetime.equals(other.startDatetime))
			return false;
		if (transfusionID == null) {
			if (other.transfusionID != null)
				return false;
		} else if (!transfusionID.equals(other.transfusionID))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}
}
