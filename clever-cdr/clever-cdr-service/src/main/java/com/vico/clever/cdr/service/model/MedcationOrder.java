package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="MedcationOrder")
public class MedcationOrder {
	private String medicationOrderID;//药嘱ID(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String orderID;//医嘱ID
	private int ownMedicine;//自带药属性,0-使用医院的药，1-使用自带药(*)
	private String stCode;//皮试属性代码,0-不需要皮试，1-需要皮试但结果未知，2-皮试结果阳性，3-皮试结果阴性(*)
	private String stName;//皮试属性
	private String medicationName;//药物名称
	private String medicationCode;//药嘱代码
	private int doseAmount;//剂量数
	private String doseUnitCode;//剂量单位代码
	private String doseUnit;//剂量单位
	private String medicineCompound;//药品规格
	private int dailyCount;//24小时用量
	private int numberAllOfMedicine;//药品使用总量
	private String administrationRouteCode;//给药途径代码
	private String administrationRouteName;//给药途径,如静脉注射、口服
	private Date startDate;//计划用药开始日期
    private Date stopDate;//计划用药停止日期
    private String durationOfTreat;//用药持续时间
    private String durationUnit;//持续时间单位
    private String frequencyUnit;//执行频率单位
    private int frequency;//频率次数
    private int frequencyInterval;//频率间隔
    private String frequencyIntervalUnit;//频率间隔单位
    private String comment;//备注
    private String formCode;//药物剂型代码
    private String formName;//药物剂型名称
	public MedcationOrder() {
		super();
	}
	public MedcationOrder(String medicationOrderID, String patientID,
			String visitID, String orderID, int ownMedicine, String stCode,
			String stName, String medicationName, String medicationCode,
			int doseAmount, String doseUnitCode, String doseUnit,
			String medicineCompound, int dailyCount, int numberAllOfMedicine,
			String administrationRouteCode, String administrationRouteName,
			Date startDate, Date stopDate, String durationOfTreat,
			String durationUnit, String frequencyUnit, int frequency,
			int frequencyInterval, String frequencyIntervalUnit,
			String comment, String formCode, String formName) {
		super();
		this.medicationOrderID = medicationOrderID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.ownMedicine = ownMedicine;
		this.stCode = stCode;
		this.stName = stName;
		this.medicationName = medicationName;
		this.medicationCode = medicationCode;
		this.doseAmount = doseAmount;
		this.doseUnitCode = doseUnitCode;
		this.doseUnit = doseUnit;
		this.medicineCompound = medicineCompound;
		this.dailyCount = dailyCount;
		this.numberAllOfMedicine = numberAllOfMedicine;
		this.administrationRouteCode = administrationRouteCode;
		this.administrationRouteName = administrationRouteName;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.durationOfTreat = durationOfTreat;
		this.durationUnit = durationUnit;
		this.frequencyUnit = frequencyUnit;
		this.frequency = frequency;
		this.frequencyInterval = frequencyInterval;
		this.frequencyIntervalUnit = frequencyIntervalUnit;
		this.comment = comment;
		this.formCode = formCode;
		this.formName = formName;
	}
	public String getMedicationOrderID() {
		return medicationOrderID;
	}
	public void setMedicationOrderID(String medicationOrderID) {
		this.medicationOrderID = medicationOrderID;
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
	public int getOwnMedicine() {
		return ownMedicine;
	}
	public void setOwnMedicine(int ownMedicine) {
		this.ownMedicine = ownMedicine;
	}
	public String getStCode() {
		return stCode;
	}
	public void setStCode(String stCode) {
		this.stCode = stCode;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public String getMedicationCode() {
		return medicationCode;
	}
	public void setMedicationCode(String medicationCode) {
		this.medicationCode = medicationCode;
	}
	public int getDoseAmount() {
		return doseAmount;
	}
	public void setDoseAmount(int doseAmount) {
		this.doseAmount = doseAmount;
	}
	public String getDoseUnitCode() {
		return doseUnitCode;
	}
	public void setDoseUnitCode(String doseUnitCode) {
		this.doseUnitCode = doseUnitCode;
	}
	public String getDoseUnit() {
		return doseUnit;
	}
	public void setDoseUnit(String doseUnit) {
		this.doseUnit = doseUnit;
	}
	public String getMedicineCompound() {
		return medicineCompound;
	}
	public void setMedicineCompound(String medicineCompound) {
		this.medicineCompound = medicineCompound;
	}
	public int getDailyCount() {
		return dailyCount;
	}
	public void setDailyCount(int dailyCount) {
		this.dailyCount = dailyCount;
	}
	public int getNumberAllOfMedicine() {
		return numberAllOfMedicine;
	}
	public void setNumberAllOfMedicine(int numberAllOfMedicine) {
		this.numberAllOfMedicine = numberAllOfMedicine;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStopDate() {
		return stopDate;
	}
	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}
	public String getDurationOfTreat() {
		return durationOfTreat;
	}
	public void setDurationOfTreat(String durationOfTreat) {
		this.durationOfTreat = durationOfTreat;
	}
	public String getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
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
	public String getFormCode() {
		return formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
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
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + dailyCount;
		result = prime * result + doseAmount;
		result = prime * result
				+ ((doseUnit == null) ? 0 : doseUnit.hashCode());
		result = prime * result
				+ ((doseUnitCode == null) ? 0 : doseUnitCode.hashCode());
		result = prime * result
				+ ((durationOfTreat == null) ? 0 : durationOfTreat.hashCode());
		result = prime * result
				+ ((durationUnit == null) ? 0 : durationUnit.hashCode());
		result = prime * result
				+ ((formCode == null) ? 0 : formCode.hashCode());
		result = prime * result
				+ ((formName == null) ? 0 : formName.hashCode());
		result = prime * result + frequency;
		result = prime * result + frequencyInterval;
		result = prime
				* result
				+ ((frequencyIntervalUnit == null) ? 0 : frequencyIntervalUnit
						.hashCode());
		result = prime * result
				+ ((frequencyUnit == null) ? 0 : frequencyUnit.hashCode());
		result = prime * result
				+ ((medicationCode == null) ? 0 : medicationCode.hashCode());
		result = prime * result
				+ ((medicationName == null) ? 0 : medicationName.hashCode());
		result = prime
				* result
				+ ((medicationOrderID == null) ? 0 : medicationOrderID
						.hashCode());
		result = prime
				* result
				+ ((medicineCompound == null) ? 0 : medicineCompound.hashCode());
		result = prime * result + numberAllOfMedicine;
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ownMedicine;
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + ((stCode == null) ? 0 : stCode.hashCode());
		result = prime * result + ((stName == null) ? 0 : stName.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result
				+ ((stopDate == null) ? 0 : stopDate.hashCode());
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
		MedcationOrder other = (MedcationOrder) obj;
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
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (dailyCount != other.dailyCount)
			return false;
		if (doseAmount != other.doseAmount)
			return false;
		if (doseUnit == null) {
			if (other.doseUnit != null)
				return false;
		} else if (!doseUnit.equals(other.doseUnit))
			return false;
		if (doseUnitCode == null) {
			if (other.doseUnitCode != null)
				return false;
		} else if (!doseUnitCode.equals(other.doseUnitCode))
			return false;
		if (durationOfTreat == null) {
			if (other.durationOfTreat != null)
				return false;
		} else if (!durationOfTreat.equals(other.durationOfTreat))
			return false;
		if (durationUnit == null) {
			if (other.durationUnit != null)
				return false;
		} else if (!durationUnit.equals(other.durationUnit))
			return false;
		if (formCode == null) {
			if (other.formCode != null)
				return false;
		} else if (!formCode.equals(other.formCode))
			return false;
		if (formName == null) {
			if (other.formName != null)
				return false;
		} else if (!formName.equals(other.formName))
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
		if (medicationCode == null) {
			if (other.medicationCode != null)
				return false;
		} else if (!medicationCode.equals(other.medicationCode))
			return false;
		if (medicationName == null) {
			if (other.medicationName != null)
				return false;
		} else if (!medicationName.equals(other.medicationName))
			return false;
		if (medicationOrderID == null) {
			if (other.medicationOrderID != null)
				return false;
		} else if (!medicationOrderID.equals(other.medicationOrderID))
			return false;
		if (medicineCompound == null) {
			if (other.medicineCompound != null)
				return false;
		} else if (!medicineCompound.equals(other.medicineCompound))
			return false;
		if (numberAllOfMedicine != other.numberAllOfMedicine)
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (ownMedicine != other.ownMedicine)
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (stCode == null) {
			if (other.stCode != null)
				return false;
		} else if (!stCode.equals(other.stCode))
			return false;
		if (stName == null) {
			if (other.stName != null)
				return false;
		} else if (!stName.equals(other.stName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (stopDate == null) {
			if (other.stopDate != null)
				return false;
		} else if (!stopDate.equals(other.stopDate))
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
		return "MedcationOrder [medicationOrderID=" + medicationOrderID
				+ ", patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", ownMedicine=" + ownMedicine
				+ ", stCode=" + stCode + ", stName=" + stName
				+ ", medicationName=" + medicationName + ", medicationCode="
				+ medicationCode + ", doseAmount=" + doseAmount
				+ ", doseUnitCode=" + doseUnitCode + ", doseUnit=" + doseUnit
				+ ", medicineCompound=" + medicineCompound + ", dailyCount="
				+ dailyCount + ", numberAllOfMedicine=" + numberAllOfMedicine
				+ ", administrationRouteCode=" + administrationRouteCode
				+ ", administrationRouteName=" + administrationRouteName
				+ ", startDate=" + startDate + ", stopDate=" + stopDate
				+ ", durationOfTreat=" + durationOfTreat + ", durationUnit="
				+ durationUnit + ", frequencyUnit=" + frequencyUnit
				+ ", frequency=" + frequency + ", frequencyInterval="
				+ frequencyInterval + ", frequencyIntervalUnit="
				+ frequencyIntervalUnit + ", comment=" + comment
				+ ", formCode=" + formCode + ", formName=" + formName + "]";
	}
	
	
}
