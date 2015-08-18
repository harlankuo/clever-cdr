package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FareInfo")
public class FareInfo {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱ID
	private String feeID;// 费用申请号(*)
	private String feeContent;// 费用内容
	private String dosage;// 收费数量
	private String dosageUnit;// 数量单位
	private String administration;// 费用途径
	private String administrationCode;// 费用途径代码
	private String memo;// 备注

	public FareInfo() {
		super();
	}

	public FareInfo(String patientID, String visitID, String orderID,
			String feeID, String feeContent, String dosage, String dosageUnit,
			String administration, String administrationCode, String memo) {
		super();
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.feeID = feeID;
		this.feeContent = feeContent;
		this.dosage = dosage;
		this.dosageUnit = dosageUnit;
		this.administration = administration;
		this.administrationCode = administrationCode;
		this.memo = memo;
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

	public String getFeeID() {
		return feeID;
	}

	public void setFeeID(String feeID) {
		this.feeID = feeID;
	}

	public String getFeeContent() {
		return feeContent;
	}

	public void setFeeContent(String feeContent) {
		this.feeContent = feeContent;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDosageUnit() {
		return dosageUnit;
	}

	public void setDosageUnit(String dosageUnit) {
		this.dosageUnit = dosageUnit;
	}

	public String getAdministration() {
		return administration;
	}

	public void setAdministration(String administration) {
		this.administration = administration;
	}

	public String getAdministrationCode() {
		return administrationCode;
	}

	public void setAdministrationCode(String administrationCode) {
		this.administrationCode = administrationCode;
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
		result = prime * result
				+ ((administration == null) ? 0 : administration.hashCode());
		result = prime
				* result
				+ ((administrationCode == null) ? 0 : administrationCode
						.hashCode());
		result = prime * result + ((dosage == null) ? 0 : dosage.hashCode());
		result = prime * result
				+ ((dosageUnit == null) ? 0 : dosageUnit.hashCode());
		result = prime * result
				+ ((feeContent == null) ? 0 : feeContent.hashCode());
		result = prime * result + ((feeID == null) ? 0 : feeID.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
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
		FareInfo other = (FareInfo) obj;
		if (administration == null) {
			if (other.administration != null)
				return false;
		} else if (!administration.equals(other.administration))
			return false;
		if (administrationCode == null) {
			if (other.administrationCode != null)
				return false;
		} else if (!administrationCode.equals(other.administrationCode))
			return false;
		if (dosage == null) {
			if (other.dosage != null)
				return false;
		} else if (!dosage.equals(other.dosage))
			return false;
		if (dosageUnit == null) {
			if (other.dosageUnit != null)
				return false;
		} else if (!dosageUnit.equals(other.dosageUnit))
			return false;
		if (feeContent == null) {
			if (other.feeContent != null)
				return false;
		} else if (!feeContent.equals(other.feeContent))
			return false;
		if (feeID == null) {
			if (other.feeID != null)
				return false;
		} else if (!feeID.equals(other.feeID))
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
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FareInfo [patientID=").append(patientID)
				.append(", visitID=").append(visitID).append(", orderID=")
				.append(orderID).append(", feeID=").append(feeID)
				.append(", feeContent=").append(feeContent).append(", dosage=")
				.append(dosage).append(", dosageUnit=").append(dosageUnit)
				.append(", administration=").append(administration)
				.append(", administrationCode=").append(administrationCode)
				.append(", memo=").append(memo).append("]");
		return builder.toString();
	}

}
