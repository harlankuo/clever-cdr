package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Consultation")
public class Consultation {
	private String consultRequestID;// 会诊申请号(*)
	private String patientID;// 病人ID(*)
	private String visitID;// 就诊ID(*)
	private String orderID;// 医嘱ID
	private String consultGrade;// 会诊级别,0-科间会诊；1-全院会诊
	private String consultComment;// 会诊意见
	private String intendedConsultDeptCode;// 拟请科室代码
	private String intendedConsultDeptName;// 拟请科室名称
	private String intendedConsultDoctorCode;// 拟请医生代码
	private String intendedConsultDoctorName;// 拟请医生姓名
	private Date intendedConsultDatetime;// 拟定会诊时间
	private String intendedConsultPlace;// 拟定会诊地点
	private String consultPurpose;// 会诊目的

	public Consultation() {
		super();
	}

	public String getConsultRequestID() {
		return consultRequestID;
	}

	public void setConsultRequestID(String consultRequestID) {
		this.consultRequestID = consultRequestID;
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

	public String getConsultGrade() {
		return consultGrade;
	}

	public void setConsultGrade(String consultGrade) {
		this.consultGrade = consultGrade;
	}

	public String getConsultComment() {
		return consultComment;
	}

	public void setConsultComment(String consultComment) {
		this.consultComment = consultComment;
	}

	public String getIntendedConsultDeptCode() {
		return intendedConsultDeptCode;
	}

	public void setIntendedConsultDeptCode(String intendedConsultDeptCode) {
		this.intendedConsultDeptCode = intendedConsultDeptCode;
	}

	public String getIntendedConsultDeptName() {
		return intendedConsultDeptName;
	}

	public void setIntendedConsultDeptName(String intendedConsultDeptName) {
		this.intendedConsultDeptName = intendedConsultDeptName;
	}

	public String getIntendedConsultDoctorCode() {
		return intendedConsultDoctorCode;
	}

	public void setIntendedConsultDoctorCode(String intendedConsultDoctorCode) {
		this.intendedConsultDoctorCode = intendedConsultDoctorCode;
	}

	public String getIntendedConsultDoctorName() {
		return intendedConsultDoctorName;
	}

	public void setIntendedConsultDoctorName(String intendedConsultDoctorName) {
		this.intendedConsultDoctorName = intendedConsultDoctorName;
	}

	public Date getIntendedConsultDatetime() {
		return intendedConsultDatetime;
	}

	public void setIntendedConsultDatetime(Date intendedConsultDatetime) {
		this.intendedConsultDatetime = intendedConsultDatetime;
	}

	public String getIntendedConsultPlace() {
		return intendedConsultPlace;
	}

	public void setIntendedConsultPlace(String intendedConsultPlace) {
		this.intendedConsultPlace = intendedConsultPlace;
	}

	public String getConsultPurpose() {
		return consultPurpose;
	}

	public void setConsultPurpose(String consultPurpose) {
		this.consultPurpose = consultPurpose;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((consultComment == null) ? 0 : consultComment.hashCode());
		result = prime * result
				+ ((consultGrade == null) ? 0 : consultGrade.hashCode());
		result = prime * result
				+ ((consultPurpose == null) ? 0 : consultPurpose.hashCode());
		result = prime
				* result
				+ ((consultRequestID == null) ? 0 : consultRequestID.hashCode());
		result = prime
				* result
				+ ((intendedConsultDatetime == null) ? 0
						: intendedConsultDatetime.hashCode());
		result = prime
				* result
				+ ((intendedConsultDeptCode == null) ? 0
						: intendedConsultDeptCode.hashCode());
		result = prime
				* result
				+ ((intendedConsultDeptName == null) ? 0
						: intendedConsultDeptName.hashCode());
		result = prime
				* result
				+ ((intendedConsultDoctorCode == null) ? 0
						: intendedConsultDoctorCode.hashCode());
		result = prime
				* result
				+ ((intendedConsultDoctorName == null) ? 0
						: intendedConsultDoctorName.hashCode());
		result = prime
				* result
				+ ((intendedConsultPlace == null) ? 0 : intendedConsultPlace
						.hashCode());
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
		Consultation other = (Consultation) obj;
		if (consultComment == null) {
			if (other.consultComment != null)
				return false;
		} else if (!consultComment.equals(other.consultComment))
			return false;
		if (consultGrade == null) {
			if (other.consultGrade != null)
				return false;
		} else if (!consultGrade.equals(other.consultGrade))
			return false;
		if (consultPurpose == null) {
			if (other.consultPurpose != null)
				return false;
		} else if (!consultPurpose.equals(other.consultPurpose))
			return false;
		if (consultRequestID == null) {
			if (other.consultRequestID != null)
				return false;
		} else if (!consultRequestID.equals(other.consultRequestID))
			return false;
		if (intendedConsultDatetime == null) {
			if (other.intendedConsultDatetime != null)
				return false;
		} else if (!intendedConsultDatetime
				.equals(other.intendedConsultDatetime))
			return false;
		if (intendedConsultDeptCode == null) {
			if (other.intendedConsultDeptCode != null)
				return false;
		} else if (!intendedConsultDeptCode
				.equals(other.intendedConsultDeptCode))
			return false;
		if (intendedConsultDeptName == null) {
			if (other.intendedConsultDeptName != null)
				return false;
		} else if (!intendedConsultDeptName
				.equals(other.intendedConsultDeptName))
			return false;
		if (intendedConsultDoctorCode == null) {
			if (other.intendedConsultDoctorCode != null)
				return false;
		} else if (!intendedConsultDoctorCode
				.equals(other.intendedConsultDoctorCode))
			return false;
		if (intendedConsultDoctorName == null) {
			if (other.intendedConsultDoctorName != null)
				return false;
		} else if (!intendedConsultDoctorName
				.equals(other.intendedConsultDoctorName))
			return false;
		if (intendedConsultPlace == null) {
			if (other.intendedConsultPlace != null)
				return false;
		} else if (!intendedConsultPlace.equals(other.intendedConsultPlace))
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
		return "Consultation [consultRequestID=" + consultRequestID
				+ ", patientID=" + patientID + ", visitID=" + visitID
				+ ", orderID=" + orderID + ", consultGrade=" + consultGrade
				+ ", consultComment=" + consultComment
				+ ", intendedConsultDeptCode=" + intendedConsultDeptCode
				+ ", intendedConsultDeptName=" + intendedConsultDeptName
				+ ", intendedConsultDoctorCode=" + intendedConsultDoctorCode
				+ ", intendedConsultDoctorName=" + intendedConsultDoctorName
				+ ", intendedConsultDatetime=" + intendedConsultDatetime
				+ ", intendedConsultPlace=" + intendedConsultPlace
				+ ", consultPurpose=" + consultPurpose + "]";
	}

}
