package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DrugDispensingReq")
public class DrugDispensingReq {
	public String medicationID;// 药嘱ID(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String drugDispensingReqID;//摆药申请单号(*)
	public String emergency;//紧急摆药属性(*),0-普通，1-紧急，默认为0
	public String destinationPharmacyName;//发往药房名称
	public String destinationPharmacyCode;//发往药房代码
	public String reqDispensingAmount;//申请摆药量
	public String reqDispensingAmountUnit;//申请摆药量单位
	public String receiveDispensingAmount;//实际摆药量
	public String receiveDispensingAmountUnit;//实际摆药量单位
	public String medicineTradeName;//所摆药品的商品名
	public String apprpvalNumber;//所摆药品的批准文号
	public String manufacturer;//所摆药品的生产厂家
	public String batchID;//所摆药品的生产批号
	public String reqDeptCode;//摆药申请科室代码
	public String reqDeptName;//摆药申请科室名称
	public String reqWardCode;//摆药申请病区代码
	public String reqWardName;//摆药申请病区名称
	public DrugDispensingReq() {
		super();
	}
	public DrugDispensingReq(String medicationID, String patientID,
			String visitID, String drugDispensingReqID, String emergency,
			String destinationPharmacyName, String destinationPharmacyCode,
			String reqDispensingAmount, String reqDispensingAmountUnit,
			String receiveDispensingAmount, String receiveDispensingAmountUnit,
			String medicineTradeName, String apprpvalNumber,
			String manufacturer, String batchID, String reqDeptCode,
			String reqDeptName, String reqWardCode, String reqWardName) {
		super();
		this.medicationID = medicationID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.drugDispensingReqID = drugDispensingReqID;
		this.emergency = emergency;
		this.destinationPharmacyName = destinationPharmacyName;
		this.destinationPharmacyCode = destinationPharmacyCode;
		this.reqDispensingAmount = reqDispensingAmount;
		this.reqDispensingAmountUnit = reqDispensingAmountUnit;
		this.receiveDispensingAmount = receiveDispensingAmount;
		this.receiveDispensingAmountUnit = receiveDispensingAmountUnit;
		this.medicineTradeName = medicineTradeName;
		this.apprpvalNumber = apprpvalNumber;
		this.manufacturer = manufacturer;
		this.batchID = batchID;
		this.reqDeptCode = reqDeptCode;
		this.reqDeptName = reqDeptName;
		this.reqWardCode = reqWardCode;
		this.reqWardName = reqWardName;
	}
	public String getMedicationID() {
		return medicationID;
	}
	public void setMedicationID(String medicationID) {
		this.medicationID = medicationID;
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
	public String getDrugDispensingReqID() {
		return drugDispensingReqID;
	}
	public void setDrugDispensingReqID(String drugDispensingReqID) {
		this.drugDispensingReqID = drugDispensingReqID;
	}
	public String getEmergency() {
		return emergency;
	}
	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}
	public String getDestinationPharmacyName() {
		return destinationPharmacyName;
	}
	public void setDestinationPharmacyName(String destinationPharmacyName) {
		this.destinationPharmacyName = destinationPharmacyName;
	}
	public String getDestinationPharmacyCode() {
		return destinationPharmacyCode;
	}
	public void setDestinationPharmacyCode(String destinationPharmacyCode) {
		this.destinationPharmacyCode = destinationPharmacyCode;
	}
	public String getReqDispensingAmount() {
		return reqDispensingAmount;
	}
	public void setReqDispensingAmount(String reqDispensingAmount) {
		this.reqDispensingAmount = reqDispensingAmount;
	}
	public String getReqDispensingAmountUnit() {
		return reqDispensingAmountUnit;
	}
	public void setReqDispensingAmountUnit(String reqDispensingAmountUnit) {
		this.reqDispensingAmountUnit = reqDispensingAmountUnit;
	}
	public String getReceiveDispensingAmount() {
		return receiveDispensingAmount;
	}
	public void setReceiveDispensingAmount(String receiveDispensingAmount) {
		this.receiveDispensingAmount = receiveDispensingAmount;
	}
	public String getReceiveDispensingAmountUnit() {
		return receiveDispensingAmountUnit;
	}
	public void setReceiveDispensingAmountUnit(String receiveDispensingAmountUnit) {
		this.receiveDispensingAmountUnit = receiveDispensingAmountUnit;
	}
	public String getMedicineTradeName() {
		return medicineTradeName;
	}
	public void setMedicineTradeName(String medicineTradeName) {
		this.medicineTradeName = medicineTradeName;
	}
	public String getApprpvalNumber() {
		return apprpvalNumber;
	}
	public void setApprpvalNumber(String apprpvalNumber) {
		this.apprpvalNumber = apprpvalNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getBatchID() {
		return batchID;
	}
	public void setBatchID(String batchID) {
		this.batchID = batchID;
	}
	public String getReqDeptCode() {
		return reqDeptCode;
	}
	public void setReqDeptCode(String reqDeptCode) {
		this.reqDeptCode = reqDeptCode;
	}
	public String getReqDeptName() {
		return reqDeptName;
	}
	public void setReqDeptName(String reqDeptName) {
		this.reqDeptName = reqDeptName;
	}
	public String getReqWardCode() {
		return reqWardCode;
	}
	public void setReqWardCode(String reqWardCode) {
		this.reqWardCode = reqWardCode;
	}
	public String getReqWardName() {
		return reqWardName;
	}
	public void setReqWardName(String reqWardName) {
		this.reqWardName = reqWardName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apprpvalNumber == null) ? 0 : apprpvalNumber.hashCode());
		result = prime * result + ((batchID == null) ? 0 : batchID.hashCode());
		result = prime
				* result
				+ ((destinationPharmacyCode == null) ? 0
						: destinationPharmacyCode.hashCode());
		result = prime
				* result
				+ ((destinationPharmacyName == null) ? 0
						: destinationPharmacyName.hashCode());
		result = prime
				* result
				+ ((drugDispensingReqID == null) ? 0 : drugDispensingReqID
						.hashCode());
		result = prime * result
				+ ((emergency == null) ? 0 : emergency.hashCode());
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result
				+ ((medicationID == null) ? 0 : medicationID.hashCode());
		result = prime
				* result
				+ ((medicineTradeName == null) ? 0 : medicineTradeName
						.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((receiveDispensingAmount == null) ? 0
						: receiveDispensingAmount.hashCode());
		result = prime
				* result
				+ ((receiveDispensingAmountUnit == null) ? 0
						: receiveDispensingAmountUnit.hashCode());
		result = prime * result
				+ ((reqDeptCode == null) ? 0 : reqDeptCode.hashCode());
		result = prime * result
				+ ((reqDeptName == null) ? 0 : reqDeptName.hashCode());
		result = prime
				* result
				+ ((reqDispensingAmount == null) ? 0 : reqDispensingAmount
						.hashCode());
		result = prime
				* result
				+ ((reqDispensingAmountUnit == null) ? 0
						: reqDispensingAmountUnit.hashCode());
		result = prime * result
				+ ((reqWardCode == null) ? 0 : reqWardCode.hashCode());
		result = prime * result
				+ ((reqWardName == null) ? 0 : reqWardName.hashCode());
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
		DrugDispensingReq other = (DrugDispensingReq) obj;
		if (apprpvalNumber == null) {
			if (other.apprpvalNumber != null)
				return false;
		} else if (!apprpvalNumber.equals(other.apprpvalNumber))
			return false;
		if (batchID == null) {
			if (other.batchID != null)
				return false;
		} else if (!batchID.equals(other.batchID))
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
		if (drugDispensingReqID == null) {
			if (other.drugDispensingReqID != null)
				return false;
		} else if (!drugDispensingReqID.equals(other.drugDispensingReqID))
			return false;
		if (emergency == null) {
			if (other.emergency != null)
				return false;
		} else if (!emergency.equals(other.emergency))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (medicationID == null) {
			if (other.medicationID != null)
				return false;
		} else if (!medicationID.equals(other.medicationID))
			return false;
		if (medicineTradeName == null) {
			if (other.medicineTradeName != null)
				return false;
		} else if (!medicineTradeName.equals(other.medicineTradeName))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (receiveDispensingAmount == null) {
			if (other.receiveDispensingAmount != null)
				return false;
		} else if (!receiveDispensingAmount
				.equals(other.receiveDispensingAmount))
			return false;
		if (receiveDispensingAmountUnit == null) {
			if (other.receiveDispensingAmountUnit != null)
				return false;
		} else if (!receiveDispensingAmountUnit
				.equals(other.receiveDispensingAmountUnit))
			return false;
		if (reqDeptCode == null) {
			if (other.reqDeptCode != null)
				return false;
		} else if (!reqDeptCode.equals(other.reqDeptCode))
			return false;
		if (reqDeptName == null) {
			if (other.reqDeptName != null)
				return false;
		} else if (!reqDeptName.equals(other.reqDeptName))
			return false;
		if (reqDispensingAmount == null) {
			if (other.reqDispensingAmount != null)
				return false;
		} else if (!reqDispensingAmount.equals(other.reqDispensingAmount))
			return false;
		if (reqDispensingAmountUnit == null) {
			if (other.reqDispensingAmountUnit != null)
				return false;
		} else if (!reqDispensingAmountUnit
				.equals(other.reqDispensingAmountUnit))
			return false;
		if (reqWardCode == null) {
			if (other.reqWardCode != null)
				return false;
		} else if (!reqWardCode.equals(other.reqWardCode))
			return false;
		if (reqWardName == null) {
			if (other.reqWardName != null)
				return false;
		} else if (!reqWardName.equals(other.reqWardName))
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
		return "DrugDispensingReq [medicationID=" + medicationID
				+ ", patientID=" + patientID + ", visitID=" + visitID
				+ ", drugDispensingReqID=" + drugDispensingReqID
				+ ", emergency=" + emergency + ", destinationPharmacyName="
				+ destinationPharmacyName + ", destinationPharmacyCode="
				+ destinationPharmacyCode + ", reqDispensingAmount="
				+ reqDispensingAmount + ", reqDispensingAmountUnit="
				+ reqDispensingAmountUnit + ", receiveDispensingAmount="
				+ receiveDispensingAmount + ", receiveDispensingAmountUnit="
				+ receiveDispensingAmountUnit + ", medicineTradeName="
				+ medicineTradeName + ", apprpvalNumber=" + apprpvalNumber
				+ ", manufacturer=" + manufacturer + ", batchID=" + batchID
				+ ", reqDeptCode=" + reqDeptCode + ", reqDeptName="
				+ reqDeptName + ", reqWardCode=" + reqWardCode
				+ ", reqWardName=" + reqWardName + "]";
	}
}
