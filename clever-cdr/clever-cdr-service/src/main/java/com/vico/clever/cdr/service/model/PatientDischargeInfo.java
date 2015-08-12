package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="PatientDischargeInfo")
public class PatientDischargeInfo {
	private String guid;//主键
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱ID
	private Date dateOfCharge;//离院日期时间
	private String disChargeWard;//出院病区
	private String dischargeDept;//离院科室
	private String dischargeDestinationType;//离院目的地类型
	private String dischargeDestination;//离院目的地
	private String dischargeDescripition;//离院概述
	public PatientDischargeInfo() {
		super();
	}
	public PatientDischargeInfo(String guid, String patientID, String visitID,
			String orderID, Date dateOfCharge, String disChargeWard,
			String dischargeDept, String dischargeDestinationType,
			String dischargeDestination, String dischargeDescripition) {
		super();
		this.guid = guid;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.dateOfCharge = dateOfCharge;
		this.disChargeWard = disChargeWard;
		this.dischargeDept = dischargeDept;
		this.dischargeDestinationType = dischargeDestinationType;
		this.dischargeDestination = dischargeDestination;
		this.dischargeDescripition = dischargeDescripition;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
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
	public Date getDateOfCharge() {
		return dateOfCharge;
	}
	public void setDateOfCharge(Date dateOfCharge) {
		this.dateOfCharge = dateOfCharge;
	}
	public String getDisChargeWard() {
		return disChargeWard;
	}
	public void setDisChargeWard(String disChargeWard) {
		this.disChargeWard = disChargeWard;
	}
	public String getDischargeDept() {
		return dischargeDept;
	}
	public void setDischargeDept(String dischargeDept) {
		this.dischargeDept = dischargeDept;
	}
	public String getDischargeDestinationType() {
		return dischargeDestinationType;
	}
	public void setDischargeDestinationType(String dischargeDestinationType) {
		this.dischargeDestinationType = dischargeDestinationType;
	}
	public String getDischargeDestination() {
		return dischargeDestination;
	}
	public void setDischargeDestination(String dischargeDestination) {
		this.dischargeDestination = dischargeDestination;
	}
	public String getDischargeDescripition() {
		return dischargeDescripition;
	}
	public void setDischargeDescripition(String dischargeDescripition) {
		this.dischargeDescripition = dischargeDescripition;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfCharge == null) ? 0 : dateOfCharge.hashCode());
		result = prime * result
				+ ((disChargeWard == null) ? 0 : disChargeWard.hashCode());
		result = prime * result
				+ ((dischargeDept == null) ? 0 : dischargeDept.hashCode());
		result = prime
				* result
				+ ((dischargeDescripition == null) ? 0 : dischargeDescripition
						.hashCode());
		result = prime
				* result
				+ ((dischargeDestination == null) ? 0 : dischargeDestination
						.hashCode());
		result = prime
				* result
				+ ((dischargeDestinationType == null) ? 0
						: dischargeDestinationType.hashCode());
		result = prime * result + ((guid == null) ? 0 : guid.hashCode());
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
		PatientDischargeInfo other = (PatientDischargeInfo) obj;
		if (dateOfCharge == null) {
			if (other.dateOfCharge != null)
				return false;
		} else if (!dateOfCharge.equals(other.dateOfCharge))
			return false;
		if (disChargeWard == null) {
			if (other.disChargeWard != null)
				return false;
		} else if (!disChargeWard.equals(other.disChargeWard))
			return false;
		if (dischargeDept == null) {
			if (other.dischargeDept != null)
				return false;
		} else if (!dischargeDept.equals(other.dischargeDept))
			return false;
		if (dischargeDescripition == null) {
			if (other.dischargeDescripition != null)
				return false;
		} else if (!dischargeDescripition.equals(other.dischargeDescripition))
			return false;
		if (dischargeDestination == null) {
			if (other.dischargeDestination != null)
				return false;
		} else if (!dischargeDestination.equals(other.dischargeDestination))
			return false;
		if (dischargeDestinationType == null) {
			if (other.dischargeDestinationType != null)
				return false;
		} else if (!dischargeDestinationType
				.equals(other.dischargeDestinationType))
			return false;
		if (guid == null) {
			if (other.guid != null)
				return false;
		} else if (!guid.equals(other.guid))
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
		return "PatientDischargeInfo [guid=" + guid + ", patientID="
				+ patientID + ", visitID=" + visitID + ", orderID=" + orderID
				+ ", dateOfCharge=" + dateOfCharge + ", disChargeWard="
				+ disChargeWard + ", dischargeDept=" + dischargeDept
				+ ", dischargeDestinationType=" + dischargeDestinationType
				+ ", dischargeDestination=" + dischargeDestination
				+ ", dischargeDescripition=" + dischargeDescripition + "]";
	}
	
}
