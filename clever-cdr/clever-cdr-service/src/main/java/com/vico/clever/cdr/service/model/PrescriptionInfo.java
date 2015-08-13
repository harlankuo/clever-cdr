package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PrescriptionInfo")
public class PrescriptionInfo {
	private String presciptionID;//处方ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String orderID;//医嘱ID
	private String mandatorName;//委托人姓名
	private String mandatorIDCard;//委托人证件号
	private String drugType;//药物类别,非空，0-西药，1-中成药，2-中药饮片，3-中药配方(*)
	private String prescriptionType;//处方类型,0-普通处方，1-儿科处方，2-麻醉药品处方，3-一类精神药品处方，4-二类精神药品处方(*)
	private String presciptionSource;//处方来源,0-门诊，1-住院，2-其他
	private String destinationPharmacyCode;//发送药房代码
	private String destinationPharmacyName;//发送药房名称
	private String doseCount;//剂数
	private String costs;//费用
	private String memo;//备忘	
	public PrescriptionInfo() {
		super();
	}
	public String getPresciptionID() {
		return presciptionID;
	}
	public void setPresciptionID(String presciptionID) {
		this.presciptionID = presciptionID;
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
	public String getMandatorName() {
		return mandatorName;
	}
	public void setMandatorName(String mandatorName) {
		this.mandatorName = mandatorName;
	}
	public String getMandatorIDCard() {
		return mandatorIDCard;
	}
	public void setMandatorIDCard(String mandatorIDCard) {
		this.mandatorIDCard = mandatorIDCard;
	}
	public String getDrugType() {
		return drugType;
	}
	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}
	public String getPrescriptionType() {
		return prescriptionType;
	}
	public void setPrescriptionType(String prescriptionType) {
		this.prescriptionType = prescriptionType;
	}
	public String getPresciptionSource() {
		return presciptionSource;
	}
	public void setPresciptionSource(String presciptionSource) {
		this.presciptionSource = presciptionSource;
	}
	public String getDestinationPharmacyCode() {
		return destinationPharmacyCode;
	}
	public void setDestinationPharmacyCode(String destinationPharmacyCode) {
		this.destinationPharmacyCode = destinationPharmacyCode;
	}
	public String getDestinationPharmacyName() {
		return destinationPharmacyName;
	}
	public void setDestinationPharmacyName(String destinationPharmacyName) {
		this.destinationPharmacyName = destinationPharmacyName;
	}
	public String getDoseCount() {
		return doseCount;
	}
	public void setDoseCount(String doseCount) {
		this.doseCount = doseCount;
	}
	public String getCosts() {
		return costs;
	}
	public void setCosts(String costs) {
		this.costs = costs;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costs == null) ? 0 : costs.hashCode());
		result = prime
				* result
				+ ((destinationPharmacyCode == null) ? 0
						: destinationPharmacyCode.hashCode());
		result = prime
				* result
				+ ((destinationPharmacyName == null) ? 0
						: destinationPharmacyName.hashCode());
		result = prime * result
				+ ((doseCount == null) ? 0 : doseCount.hashCode());
		result = prime * result
				+ ((drugType == null) ? 0 : drugType.hashCode());
		result = prime * result
				+ ((mandatorIDCard == null) ? 0 : mandatorIDCard.hashCode());
		result = prime * result
				+ ((mandatorName == null) ? 0 : mandatorName.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((presciptionID == null) ? 0 : presciptionID.hashCode());
		result = prime
				* result
				+ ((presciptionSource == null) ? 0 : presciptionSource
						.hashCode());
		result = prime
				* result
				+ ((prescriptionType == null) ? 0 : prescriptionType.hashCode());
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
		PrescriptionInfo other = (PrescriptionInfo) obj;
		if (costs == null) {
			if (other.costs != null)
				return false;
		} else if (!costs.equals(other.costs))
			return false;
		if (destinationPharmacyCode == null) {
			if (other.destinationPharmacyCode != null)
				return false;
		} else if (!destinationPharmacyCode
				.equals(other.destinationPharmacyCode))
			return false;
		if (destinationPharmacyName == null) {
			if (other.destinationPharmacyName != null)
				return false;
		} else if (!destinationPharmacyName
				.equals(other.destinationPharmacyName))
			return false;
		if (doseCount == null) {
			if (other.doseCount != null)
				return false;
		} else if (!doseCount.equals(other.doseCount))
			return false;
		if (drugType == null) {
			if (other.drugType != null)
				return false;
		} else if (!drugType.equals(other.drugType))
			return false;
		if (mandatorIDCard == null) {
			if (other.mandatorIDCard != null)
				return false;
		} else if (!mandatorIDCard.equals(other.mandatorIDCard))
			return false;
		if (mandatorName == null) {
			if (other.mandatorName != null)
				return false;
		} else if (!mandatorName.equals(other.mandatorName))
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
		if (presciptionID == null) {
			if (other.presciptionID != null)
				return false;
		} else if (!presciptionID.equals(other.presciptionID))
			return false;
		if (presciptionSource == null) {
			if (other.presciptionSource != null)
				return false;
		} else if (!presciptionSource.equals(other.presciptionSource))
			return false;
		if (prescriptionType == null) {
			if (other.prescriptionType != null)
				return false;
		} else if (!prescriptionType.equals(other.prescriptionType))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PrescriptionInfo [presciptionID=" + presciptionID
				+ ", patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", mandatorName=" + mandatorName
				+ ", mandatorIDCard=" + mandatorIDCard + ", drugType="
				+ drugType + ", prescriptionType=" + prescriptionType
				+ ", presciptionSource=" + presciptionSource
				+ ", destinationPharmacyCode=" + destinationPharmacyCode
				+ ", destinationPharmacyName=" + destinationPharmacyName
				+ ", doseCount=" + doseCount + ", costs=" + costs + ", memo="
				+ memo + "]";
	}

}
