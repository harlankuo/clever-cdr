package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PrescriptionDetail")
public class PrescriptionDetail {
	private String prescriptionID;//处方ID(*)
	//private String patientID;//病人ID(*)
	//private String visitID;//就诊ID(*)
	private String itemNO;//处方项目号(*)
	private String itemSubNO;//处方项目子号
	private String stAttribute;//皮试属性,0-不需要皮试，1-需要皮试但结果未知，2-皮试结果阳性，3-皮试结果阴性(*)
	private String ownDrugAttribute;//自带药属性,0医院用药，1自带药
	private String drugName;//药物名称(*)
	private String drugCode;//药嘱代码
	private int dosage;//剂量
	private String doseUnit;//剂量单位
	private String drugSpecification;//药品规格
	private String manufaturer;//厂家
	private String administrationRouteCode;//给药途径代码
	private String administrationRouteName;//给药途径,如静脉注射、口服
	//private Date startDate;//计划用药开始日期
    //private Date stopDate;//计划用药停止日期
    private int quantity;//数量
    private String quantityUnit;//数量单位
    private String amount;//总量
    private String frequencyUnit;//频率单位
    private int frequency;//频率次数
    private int frequencyInterval;//频率间隔
    private String frequencyIntervalUnit;//频率间隔单位
    private String comment;//备注
    private String costs;//费用
	public PrescriptionDetail() {
		super();
	}
	public PrescriptionDetail(String prescriptionID, String itemNO,
			String itemSubNO, String stAttribute, String ownDrugAttribute,
			String drugName, String drugCode, int dosage, String doseUnit,
			String drugSpecification, String manufaturer,
			String administrationRouteCode, String administrationRouteName,
			int quantity, String quantityUnit, String amount,
			String frequencyUnit, int frequency, int frequencyInterval,
			String frequencyIntervalUnit, String comment, String costs) {
		super();
		this.prescriptionID = prescriptionID;
		this.itemNO = itemNO;
		this.itemSubNO = itemSubNO;
		this.stAttribute = stAttribute;
		this.ownDrugAttribute = ownDrugAttribute;
		this.drugName = drugName;
		this.drugCode = drugCode;
		this.dosage = dosage;
		this.doseUnit = doseUnit;
		this.drugSpecification = drugSpecification;
		this.manufaturer = manufaturer;
		this.administrationRouteCode = administrationRouteCode;
		this.administrationRouteName = administrationRouteName;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.amount = amount;
		this.frequencyUnit = frequencyUnit;
		this.frequency = frequency;
		this.frequencyInterval = frequencyInterval;
		this.frequencyIntervalUnit = frequencyIntervalUnit;
		this.comment = comment;
		this.costs = costs;
	}
	public String getPrescriptionID() {
		return prescriptionID;
	}
	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
	}
	public String getItemNO() {
		return itemNO;
	}
	public void setItemNO(String itemNO) {
		this.itemNO = itemNO;
	}
	public String getItemSubNO() {
		return itemSubNO;
	}
	public void setItemSubNO(String itemSubNO) {
		this.itemSubNO = itemSubNO;
	}
	public String getStAttribute() {
		return stAttribute;
	}
	public void setStAttribute(String stAttribute) {
		this.stAttribute = stAttribute;
	}
	public String getOwnDrugAttribute() {
		return ownDrugAttribute;
	}
	public void setOwnDrugAttribute(String ownDrugAttribute) {
		this.ownDrugAttribute = ownDrugAttribute;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugCode() {
		return drugCode;
	}
	public void setDrugCode(String drugCode) {
		this.drugCode = drugCode;
	}
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	public String getDoseUnit() {
		return doseUnit;
	}
	public void setDoseUnit(String doseUnit) {
		this.doseUnit = doseUnit;
	}
	public String getDrugSpecification() {
		return drugSpecification;
	}
	public void setDrugSpecification(String drugSpecification) {
		this.drugSpecification = drugSpecification;
	}
	public String getManufaturer() {
		return manufaturer;
	}
	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}
	public String getAdministrationRouteCode() {
		return administrationRouteCode;
	}
	public void setAdministrationRouteCode(String administrationRouteCode) {
		this.administrationRouteCode = administrationRouteCode;
	}
	public String getAdministrationRouteName() {
		return administrationRouteName;
	}
	public void setAdministrationRouteName(String administrationRouteName) {
		this.administrationRouteName = administrationRouteName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFrequencyUnit() {
		return frequencyUnit;
	}
	public void setFrequencyUnit(String frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCosts() {
		return costs;
	}
	public void setCosts(String costs) {
		this.costs = costs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((administrationRouteCode == null) ? 0
						: administrationRouteCode.hashCode());
		result = prime
				* result
				+ ((administrationRouteName == null) ? 0
						: administrationRouteName.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((costs == null) ? 0 : costs.hashCode());
		result = prime * result + dosage;
		result = prime * result
				+ ((doseUnit == null) ? 0 : doseUnit.hashCode());
		result = prime * result
				+ ((drugCode == null) ? 0 : drugCode.hashCode());
		result = prime * result
				+ ((drugName == null) ? 0 : drugName.hashCode());
		result = prime
				* result
				+ ((drugSpecification == null) ? 0 : drugSpecification
						.hashCode());
		result = prime * result + frequency;
		result = prime * result + frequencyInterval;
		result = prime
				* result
				+ ((frequencyIntervalUnit == null) ? 0 : frequencyIntervalUnit
						.hashCode());
		result = prime * result
				+ ((frequencyUnit == null) ? 0 : frequencyUnit.hashCode());
		result = prime * result + ((itemNO == null) ? 0 : itemNO.hashCode());
		result = prime * result
				+ ((itemSubNO == null) ? 0 : itemSubNO.hashCode());
		result = prime * result
				+ ((manufaturer == null) ? 0 : manufaturer.hashCode());
		result = prime
				* result
				+ ((ownDrugAttribute == null) ? 0 : ownDrugAttribute.hashCode());
		result = prime * result
				+ ((prescriptionID == null) ? 0 : prescriptionID.hashCode());
		result = prime * result + quantity;
		result = prime * result
				+ ((quantityUnit == null) ? 0 : quantityUnit.hashCode());
		result = prime * result
				+ ((stAttribute == null) ? 0 : stAttribute.hashCode());
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
		PrescriptionDetail other = (PrescriptionDetail) obj;
		if (administrationRouteCode == null) {
			if (other.administrationRouteCode != null)
				return false;
		} else if (!administrationRouteCode
				.equals(other.administrationRouteCode))
			return false;
		if (administrationRouteName == null) {
			if (other.administrationRouteName != null)
				return false;
		} else if (!administrationRouteName
				.equals(other.administrationRouteName))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (costs == null) {
			if (other.costs != null)
				return false;
		} else if (!costs.equals(other.costs))
			return false;
		if (dosage != other.dosage)
			return false;
		if (doseUnit == null) {
			if (other.doseUnit != null)
				return false;
		} else if (!doseUnit.equals(other.doseUnit))
			return false;
		if (drugCode == null) {
			if (other.drugCode != null)
				return false;
		} else if (!drugCode.equals(other.drugCode))
			return false;
		if (drugName == null) {
			if (other.drugName != null)
				return false;
		} else if (!drugName.equals(other.drugName))
			return false;
		if (drugSpecification == null) {
			if (other.drugSpecification != null)
				return false;
		} else if (!drugSpecification.equals(other.drugSpecification))
			return false;
		if (frequency != other.frequency)
			return false;
		if (frequencyInterval != other.frequencyInterval)
			return false;
		if (frequencyIntervalUnit == null) {
			if (other.frequencyIntervalUnit != null)
				return false;
		} else if (!frequencyIntervalUnit.equals(other.frequencyIntervalUnit))
			return false;
		if (frequencyUnit == null) {
			if (other.frequencyUnit != null)
				return false;
		} else if (!frequencyUnit.equals(other.frequencyUnit))
			return false;
		if (itemNO == null) {
			if (other.itemNO != null)
				return false;
		} else if (!itemNO.equals(other.itemNO))
			return false;
		if (itemSubNO == null) {
			if (other.itemSubNO != null)
				return false;
		} else if (!itemSubNO.equals(other.itemSubNO))
			return false;
		if (manufaturer == null) {
			if (other.manufaturer != null)
				return false;
		} else if (!manufaturer.equals(other.manufaturer))
			return false;
		if (ownDrugAttribute == null) {
			if (other.ownDrugAttribute != null)
				return false;
		} else if (!ownDrugAttribute.equals(other.ownDrugAttribute))
			return false;
		if (prescriptionID == null) {
			if (other.prescriptionID != null)
				return false;
		} else if (!prescriptionID.equals(other.prescriptionID))
			return false;
		if (quantity != other.quantity)
			return false;
		if (quantityUnit == null) {
			if (other.quantityUnit != null)
				return false;
		} else if (!quantityUnit.equals(other.quantityUnit))
			return false;
		if (stAttribute == null) {
			if (other.stAttribute != null)
				return false;
		} else if (!stAttribute.equals(other.stAttribute))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PrescriptionDetail [prescriptionID=" + prescriptionID
				+ ", itemNO=" + itemNO + ", itemSubNO=" + itemSubNO
				+ ", stAttribute=" + stAttribute + ", ownDrugAttribute="
				+ ownDrugAttribute + ", drugName=" + drugName + ", drugCode="
				+ drugCode + ", dosage=" + dosage + ", doseUnit=" + doseUnit
				+ ", drugSpecification=" + drugSpecification + ", manufaturer="
				+ manufaturer + ", administrationRouteCode="
				+ administrationRouteCode + ", administrationRouteName="
				+ administrationRouteName + ", quantity=" + quantity
				+ ", quantityUnit=" + quantityUnit + ", amount=" + amount
				+ ", frequencyUnit=" + frequencyUnit + ", frequency="
				+ frequency + ", frequencyInterval=" + frequencyInterval
				+ ", frequencyIntervalUnit=" + frequencyIntervalUnit
				+ ", comment=" + comment + ", costs=" + costs + "]";
	}
}
