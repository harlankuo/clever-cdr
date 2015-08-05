package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="PatientAdmission")
public class PatientAdmission {
	private long uid;//主键自增
	private String patientID;//病人号(*)
	private String patientClassCode;//病人类型,I代表住院，O代表门诊，E代表急诊，P代表体检(*)
	private String patientClassName;//病人类型
	private String visitID;//就诊号(*)
	private String deptCode;//科室代码
	private String deptName;//科室名称
	private String wardCode;//病区编号,即护理站编号
	private String wardName;//病区名称,即护理站名称
	private String roomCode;//病房号
	private String roomName;//病房名称
	private String bedCode;//病床号
	private String bedName;//病床名称
	private Date  admitDateTime;//就诊时间(*)
    private String admitIntent;//就诊目的
    private String admitDoctorID;//门诊的接诊医生编码
    private String admitDoctorName;//门诊的接诊医生姓名
    private String residentDoctorID;//住院医师编码
    private String residentDoctorName;//住院医师姓名
    private String attendingDoctorID;//主治医师编码
    private String attendingDoctorName;//主治医师姓名
    private String direcotrID;//主任医师编码
    private String direcotrName;//主任医师姓名
    private String deputyDoctorID;//副主任医师编码
    private String deputyDoctorName;//副主任医师姓名
    private String admitSource;//入院来源
    private String patientCondition;//入院病情
    private String admissionTypeCode;//入院途径代码
    private String admissionType;//入院途径
    private String financialClassCode;//费别代码
    private String financialClass;//费别
    private String nursingClass;//护理等级
    private String doctorGroupID;//医生组ID
    private String nursingGroupID;//护理组ID
    private String firstAdmissionIndicator;//首次入院标志
    private String specialDepartmentCode;//特殊科室代码
    private String specialDepartment;//特殊科室
    private String insuranceID;//医疗保险证号码
    private String insuranceType;//医疗保险类型
    private String insuranceTypeCode;//医疗保险类型代码
    private String insuranceInformation;//医疗保险信息内容
    private String insurancePropety;//医疗保险属性
    private String insurancePropetyCode;//医疗保险属性代码
    private String emailAdress;//电子邮件地址
    private String mailingAdress;//通讯地址
    private String maillingAdressProvince;//通信地址(省、自治区、直辖市)
    private String maillingAdressCity;//通信地址市（地区）
    private String maillingAdressDistrict;//通信地址县（地区）
    private String maillingAdressTownLocality;//通信地址乡（镇、街道办事处）
    private String maillingAdressStreetName;//通信地址村（街、路、弄等）
    private String maillingAdressNumber;//通信地址-门牌号码
    private String maillingAdressPostalCode;//邮政编码
    private String mobelPhone;//移动电话号码
    private String homePhone;//家庭电话号码
    private String businessPhone;//单位电话号码 
	public PatientAdmission() {
		super();
	}
	public PatientAdmission(long uid, String patientID,
			String patientClassCode, String patientClassName, String visitID,
			String deptCode, String deptName, String wardCode, String wardName,
			String roomCode, String roomName, String bedCode, String bedName,
			Date admitDateTime, String admitIntent, String admitDoctorID,
			String admitDoctorName, String residentDoctorID,
			String residentDoctorName, String attendingDoctorID,
			String attendingDoctorName, String direcotrID, String direcotrName,
			String deputyDoctorID, String deputyDoctorName, String admitSource,
			String patientCondition, String admissionTypeCode,
			String admissionType, String financialClassCode,
			String financialClass, String nursingClass, String doctorGroupID,
			String nursingGroupID, String firstAdmissionIndicator,
			String specialDepartmentCode, String specialDepartment,
			String insuranceID, String insuranceType, String insuranceTypeCode,
			String insuranceInformation, String insurancePropety,
			String insurancePropetyCode, String emailAdress,
			String mailingAdress, String maillingAdressProvince,
			String maillingAdressCity, String maillingAdressDistrict,
			String maillingAdressTownLocality, String maillingAdressStreetName,
			String maillingAdressNumber, String maillingAdressPostalCode,
			String mobelPhone, String homePhone, String businessPhone) {
		super();
		this.uid = uid;
		this.patientID = patientID;
		this.patientClassCode = patientClassCode;
		this.patientClassName = patientClassName;
		this.visitID = visitID;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.wardCode = wardCode;
		this.wardName = wardName;
		this.roomCode = roomCode;
		this.roomName = roomName;
		this.bedCode = bedCode;
		this.bedName = bedName;
		this.admitDateTime = admitDateTime;
		this.admitIntent = admitIntent;
		this.admitDoctorID = admitDoctorID;
		this.admitDoctorName = admitDoctorName;
		this.residentDoctorID = residentDoctorID;
		this.residentDoctorName = residentDoctorName;
		this.attendingDoctorID = attendingDoctorID;
		this.attendingDoctorName = attendingDoctorName;
		this.direcotrID = direcotrID;
		this.direcotrName = direcotrName;
		this.deputyDoctorID = deputyDoctorID;
		this.deputyDoctorName = deputyDoctorName;
		this.admitSource = admitSource;
		this.patientCondition = patientCondition;
		this.admissionTypeCode = admissionTypeCode;
		this.admissionType = admissionType;
		this.financialClassCode = financialClassCode;
		this.financialClass = financialClass;
		this.nursingClass = nursingClass;
		this.doctorGroupID = doctorGroupID;
		this.nursingGroupID = nursingGroupID;
		this.firstAdmissionIndicator = firstAdmissionIndicator;
		this.specialDepartmentCode = specialDepartmentCode;
		this.specialDepartment = specialDepartment;
		this.insuranceID = insuranceID;
		this.insuranceType = insuranceType;
		this.insuranceTypeCode = insuranceTypeCode;
		this.insuranceInformation = insuranceInformation;
		this.insurancePropety = insurancePropety;
		this.insurancePropetyCode = insurancePropetyCode;
		this.emailAdress = emailAdress;
		this.mailingAdress = mailingAdress;
		this.maillingAdressProvince = maillingAdressProvince;
		this.maillingAdressCity = maillingAdressCity;
		this.maillingAdressDistrict = maillingAdressDistrict;
		this.maillingAdressTownLocality = maillingAdressTownLocality;
		this.maillingAdressStreetName = maillingAdressStreetName;
		this.maillingAdressNumber = maillingAdressNumber;
		this.maillingAdressPostalCode = maillingAdressPostalCode;
		this.mobelPhone = mobelPhone;
		this.homePhone = homePhone;
		this.businessPhone = businessPhone;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getPatientClassCode() {
		return patientClassCode;
	}
	public void setPatientClassCode(String patientClassCode) {
		this.patientClassCode = patientClassCode;
	}
	public String getPatientClassName() {
		return patientClassName;
	}
	public void setPatientClassName(String patientClassName) {
		this.patientClassName = patientClassName;
	}
	public String getVisitID() {
		return visitID;
	}
	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getWardCode() {
		return wardCode;
	}
	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getBedCode() {
		return bedCode;
	}
	public void setBedCode(String bedCode) {
		this.bedCode = bedCode;
	}
	public String getBedName() {
		return bedName;
	}
	public void setBedName(String bedName) {
		this.bedName = bedName;
	}
	public Date getAdmitDateTime() {
		return admitDateTime;
	}
	public void setAdmitDateTime(Date admitDateTime) {
		this.admitDateTime = admitDateTime;
	}
	public String getAdmitIntent() {
		return admitIntent;
	}
	public void setAdmitIntent(String admitIntent) {
		this.admitIntent = admitIntent;
	}
	public String getAdmitDoctorID() {
		return admitDoctorID;
	}
	public void setAdmitDoctorID(String admitDoctorID) {
		this.admitDoctorID = admitDoctorID;
	}
	public String getAdmitDoctorName() {
		return admitDoctorName;
	}
	public void setAdmitDoctorName(String admitDoctorName) {
		this.admitDoctorName = admitDoctorName;
	}
	public String getResidentDoctorID() {
		return residentDoctorID;
	}
	public void setResidentDoctorID(String residentDoctorID) {
		this.residentDoctorID = residentDoctorID;
	}
	public String getResidentDoctorName() {
		return residentDoctorName;
	}
	public void setResidentDoctorName(String residentDoctorName) {
		this.residentDoctorName = residentDoctorName;
	}
	public String getAttendingDoctorID() {
		return attendingDoctorID;
	}
	public void setAttendingDoctorID(String attendingDoctorID) {
		this.attendingDoctorID = attendingDoctorID;
	}
	public String getAttendingDoctorName() {
		return attendingDoctorName;
	}
	public void setAttendingDoctorName(String attendingDoctorName) {
		this.attendingDoctorName = attendingDoctorName;
	}
	public String getDirecotrID() {
		return direcotrID;
	}
	public void setDirecotrID(String direcotrID) {
		this.direcotrID = direcotrID;
	}
	public String getDirecotrName() {
		return direcotrName;
	}
	public void setDirecotrName(String direcotrName) {
		this.direcotrName = direcotrName;
	}
	public String getDeputyDoctorID() {
		return deputyDoctorID;
	}
	public void setDeputyDoctorID(String deputyDoctorID) {
		this.deputyDoctorID = deputyDoctorID;
	}
	public String getDeputyDoctorName() {
		return deputyDoctorName;
	}
	public void setDeputyDoctorName(String deputyDoctorName) {
		this.deputyDoctorName = deputyDoctorName;
	}
	public String getAdmitSource() {
		return admitSource;
	}
	public void setAdmitSource(String admitSource) {
		this.admitSource = admitSource;
	}
	public String getPatientCondition() {
		return patientCondition;
	}
	public void setPatientCondition(String patientCondition) {
		this.patientCondition = patientCondition;
	}
	public String getAdmissionTypeCode() {
		return admissionTypeCode;
	}
	public void setAdmissionTypeCode(String admissionTypeCode) {
		this.admissionTypeCode = admissionTypeCode;
	}
	public String getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}
	public String getFinancialClassCode() {
		return financialClassCode;
	}
	public void setFinancialClassCode(String financialClassCode) {
		this.financialClassCode = financialClassCode;
	}
	public String getFinancialClass() {
		return financialClass;
	}
	public void setFinancialClass(String financialClass) {
		this.financialClass = financialClass;
	}
	public String getNursingClass() {
		return nursingClass;
	}
	public void setNursingClass(String nursingClass) {
		this.nursingClass = nursingClass;
	}
	public String getDoctorGroupID() {
		return doctorGroupID;
	}
	public void setDoctorGroupID(String doctorGroupID) {
		this.doctorGroupID = doctorGroupID;
	}
	public String getNursingGroupID() {
		return nursingGroupID;
	}
	public void setNursingGroupID(String nursingGroupID) {
		this.nursingGroupID = nursingGroupID;
	}
	public String getFirstAdmissionIndicator() {
		return firstAdmissionIndicator;
	}
	public void setFirstAdmissionIndicator(String firstAdmissionIndicator) {
		this.firstAdmissionIndicator = firstAdmissionIndicator;
	}
	public String getSpecialDepartmentCode() {
		return specialDepartmentCode;
	}
	public void setSpecialDepartmentCode(String specialDepartmentCode) {
		this.specialDepartmentCode = specialDepartmentCode;
	}
	public String getSpecialDepartment() {
		return specialDepartment;
	}
	public void setSpecialDepartment(String specialDepartment) {
		this.specialDepartment = specialDepartment;
	}
	public String getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(String insuranceID) {
		this.insuranceID = insuranceID;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getInsuranceTypeCode() {
		return insuranceTypeCode;
	}
	public void setInsuranceTypeCode(String insuranceTypeCode) {
		this.insuranceTypeCode = insuranceTypeCode;
	}
	public String getInsuranceInformation() {
		return insuranceInformation;
	}
	public void setInsuranceInformation(String insuranceInformation) {
		this.insuranceInformation = insuranceInformation;
	}
	public String getInsurancePropety() {
		return insurancePropety;
	}
	public void setInsurancePropety(String insurancePropety) {
		this.insurancePropety = insurancePropety;
	}
	public String getInsurancePropetyCode() {
		return insurancePropetyCode;
	}
	public void setInsurancePropetyCode(String insurancePropetyCode) {
		this.insurancePropetyCode = insurancePropetyCode;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getMailingAdress() {
		return mailingAdress;
	}
	public void setMailingAdress(String mailingAdress) {
		this.mailingAdress = mailingAdress;
	}
	public String getMaillingAdressProvince() {
		return maillingAdressProvince;
	}
	public void setMaillingAdressProvince(String maillingAdressProvince) {
		this.maillingAdressProvince = maillingAdressProvince;
	}
	public String getMaillingAdressCity() {
		return maillingAdressCity;
	}
	public void setMaillingAdressCity(String maillingAdressCity) {
		this.maillingAdressCity = maillingAdressCity;
	}
	public String getMaillingAdressDistrict() {
		return maillingAdressDistrict;
	}
	public void setMaillingAdressDistrict(String maillingAdressDistrict) {
		this.maillingAdressDistrict = maillingAdressDistrict;
	}
	public String getMaillingAdressTownLocality() {
		return maillingAdressTownLocality;
	}
	public void setMaillingAdressTownLocality(String maillingAdressTownLocality) {
		this.maillingAdressTownLocality = maillingAdressTownLocality;
	}
	public String getMaillingAdressStreetName() {
		return maillingAdressStreetName;
	}
	public void setMaillingAdressStreetName(String maillingAdressStreetName) {
		this.maillingAdressStreetName = maillingAdressStreetName;
	}
	public String getMaillingAdressNumber() {
		return maillingAdressNumber;
	}
	public void setMaillingAdressNumber(String maillingAdressNumber) {
		this.maillingAdressNumber = maillingAdressNumber;
	}
	public String getMaillingAdressPostalCode() {
		return maillingAdressPostalCode;
	}
	public void setMaillingAdressPostalCode(String maillingAdressPostalCode) {
		this.maillingAdressPostalCode = maillingAdressPostalCode;
	}
	public String getMobelPhone() {
		return mobelPhone;
	}
	public void setMobelPhone(String mobelPhone) {
		this.mobelPhone = mobelPhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getBusinessPhone() {
		return businessPhone;
	}
	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((admissionType == null) ? 0 : admissionType.hashCode());
		result = prime
				* result
				+ ((admissionTypeCode == null) ? 0 : admissionTypeCode
						.hashCode());
		result = prime * result
				+ ((admitDateTime == null) ? 0 : admitDateTime.hashCode());
		result = prime * result
				+ ((admitDoctorID == null) ? 0 : admitDoctorID.hashCode());
		result = prime * result
				+ ((admitDoctorName == null) ? 0 : admitDoctorName.hashCode());
		result = prime * result
				+ ((admitIntent == null) ? 0 : admitIntent.hashCode());
		result = prime * result
				+ ((admitSource == null) ? 0 : admitSource.hashCode());
		result = prime
				* result
				+ ((attendingDoctorID == null) ? 0 : attendingDoctorID
						.hashCode());
		result = prime
				* result
				+ ((attendingDoctorName == null) ? 0 : attendingDoctorName
						.hashCode());
		result = prime * result + ((bedCode == null) ? 0 : bedCode.hashCode());
		result = prime * result + ((bedName == null) ? 0 : bedName.hashCode());
		result = prime * result
				+ ((businessPhone == null) ? 0 : businessPhone.hashCode());
		result = prime * result
				+ ((deptCode == null) ? 0 : deptCode.hashCode());
		result = prime * result
				+ ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result
				+ ((deputyDoctorID == null) ? 0 : deputyDoctorID.hashCode());
		result = prime
				* result
				+ ((deputyDoctorName == null) ? 0 : deputyDoctorName.hashCode());
		result = prime * result
				+ ((direcotrID == null) ? 0 : direcotrID.hashCode());
		result = prime * result
				+ ((direcotrName == null) ? 0 : direcotrName.hashCode());
		result = prime * result
				+ ((doctorGroupID == null) ? 0 : doctorGroupID.hashCode());
		result = prime * result
				+ ((emailAdress == null) ? 0 : emailAdress.hashCode());
		result = prime * result
				+ ((financialClass == null) ? 0 : financialClass.hashCode());
		result = prime
				* result
				+ ((financialClassCode == null) ? 0 : financialClassCode
						.hashCode());
		result = prime
				* result
				+ ((firstAdmissionIndicator == null) ? 0
						: firstAdmissionIndicator.hashCode());
		result = prime * result
				+ ((homePhone == null) ? 0 : homePhone.hashCode());
		result = prime * result
				+ ((insuranceID == null) ? 0 : insuranceID.hashCode());
		result = prime
				* result
				+ ((insuranceInformation == null) ? 0 : insuranceInformation
						.hashCode());
		result = prime
				* result
				+ ((insurancePropety == null) ? 0 : insurancePropety.hashCode());
		result = prime
				* result
				+ ((insurancePropetyCode == null) ? 0 : insurancePropetyCode
						.hashCode());
		result = prime * result
				+ ((insuranceType == null) ? 0 : insuranceType.hashCode());
		result = prime
				* result
				+ ((insuranceTypeCode == null) ? 0 : insuranceTypeCode
						.hashCode());
		result = prime * result
				+ ((mailingAdress == null) ? 0 : mailingAdress.hashCode());
		result = prime
				* result
				+ ((maillingAdressCity == null) ? 0 : maillingAdressCity
						.hashCode());
		result = prime
				* result
				+ ((maillingAdressDistrict == null) ? 0
						: maillingAdressDistrict.hashCode());
		result = prime
				* result
				+ ((maillingAdressNumber == null) ? 0 : maillingAdressNumber
						.hashCode());
		result = prime
				* result
				+ ((maillingAdressPostalCode == null) ? 0
						: maillingAdressPostalCode.hashCode());
		result = prime
				* result
				+ ((maillingAdressProvince == null) ? 0
						: maillingAdressProvince.hashCode());
		result = prime
				* result
				+ ((maillingAdressStreetName == null) ? 0
						: maillingAdressStreetName.hashCode());
		result = prime
				* result
				+ ((maillingAdressTownLocality == null) ? 0
						: maillingAdressTownLocality.hashCode());
		result = prime * result
				+ ((mobelPhone == null) ? 0 : mobelPhone.hashCode());
		result = prime * result
				+ ((nursingClass == null) ? 0 : nursingClass.hashCode());
		result = prime * result
				+ ((nursingGroupID == null) ? 0 : nursingGroupID.hashCode());
		result = prime
				* result
				+ ((patientClassCode == null) ? 0 : patientClassCode.hashCode());
		result = prime
				* result
				+ ((patientClassName == null) ? 0 : patientClassName.hashCode());
		result = prime
				* result
				+ ((patientCondition == null) ? 0 : patientCondition.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((residentDoctorID == null) ? 0 : residentDoctorID.hashCode());
		result = prime
				* result
				+ ((residentDoctorName == null) ? 0 : residentDoctorName
						.hashCode());
		result = prime * result
				+ ((roomCode == null) ? 0 : roomCode.hashCode());
		result = prime * result
				+ ((roomName == null) ? 0 : roomName.hashCode());
		result = prime
				* result
				+ ((specialDepartment == null) ? 0 : specialDepartment
						.hashCode());
		result = prime
				* result
				+ ((specialDepartmentCode == null) ? 0 : specialDepartmentCode
						.hashCode());
		result = prime * result + (int) (uid ^ (uid >>> 32));
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
		result = prime * result
				+ ((wardCode == null) ? 0 : wardCode.hashCode());
		result = prime * result
				+ ((wardName == null) ? 0 : wardName.hashCode());
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
		PatientAdmission other = (PatientAdmission) obj;
		if (admissionType == null) {
			if (other.admissionType != null)
				return false;
		} else if (!admissionType.equals(other.admissionType))
			return false;
		if (admissionTypeCode == null) {
			if (other.admissionTypeCode != null)
				return false;
		} else if (!admissionTypeCode.equals(other.admissionTypeCode))
			return false;
		if (admitDateTime == null) {
			if (other.admitDateTime != null)
				return false;
		} else if (!admitDateTime.equals(other.admitDateTime))
			return false;
		if (admitDoctorID == null) {
			if (other.admitDoctorID != null)
				return false;
		} else if (!admitDoctorID.equals(other.admitDoctorID))
			return false;
		if (admitDoctorName == null) {
			if (other.admitDoctorName != null)
				return false;
		} else if (!admitDoctorName.equals(other.admitDoctorName))
			return false;
		if (admitIntent == null) {
			if (other.admitIntent != null)
				return false;
		} else if (!admitIntent.equals(other.admitIntent))
			return false;
		if (admitSource == null) {
			if (other.admitSource != null)
				return false;
		} else if (!admitSource.equals(other.admitSource))
			return false;
		if (attendingDoctorID == null) {
			if (other.attendingDoctorID != null)
				return false;
		} else if (!attendingDoctorID.equals(other.attendingDoctorID))
			return false;
		if (attendingDoctorName == null) {
			if (other.attendingDoctorName != null)
				return false;
		} else if (!attendingDoctorName.equals(other.attendingDoctorName))
			return false;
		if (bedCode == null) {
			if (other.bedCode != null)
				return false;
		} else if (!bedCode.equals(other.bedCode))
			return false;
		if (bedName == null) {
			if (other.bedName != null)
				return false;
		} else if (!bedName.equals(other.bedName))
			return false;
		if (businessPhone == null) {
			if (other.businessPhone != null)
				return false;
		} else if (!businessPhone.equals(other.businessPhone))
			return false;
		if (deptCode == null) {
			if (other.deptCode != null)
				return false;
		} else if (!deptCode.equals(other.deptCode))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (deputyDoctorID == null) {
			if (other.deputyDoctorID != null)
				return false;
		} else if (!deputyDoctorID.equals(other.deputyDoctorID))
			return false;
		if (deputyDoctorName == null) {
			if (other.deputyDoctorName != null)
				return false;
		} else if (!deputyDoctorName.equals(other.deputyDoctorName))
			return false;
		if (direcotrID == null) {
			if (other.direcotrID != null)
				return false;
		} else if (!direcotrID.equals(other.direcotrID))
			return false;
		if (direcotrName == null) {
			if (other.direcotrName != null)
				return false;
		} else if (!direcotrName.equals(other.direcotrName))
			return false;
		if (doctorGroupID == null) {
			if (other.doctorGroupID != null)
				return false;
		} else if (!doctorGroupID.equals(other.doctorGroupID))
			return false;
		if (emailAdress == null) {
			if (other.emailAdress != null)
				return false;
		} else if (!emailAdress.equals(other.emailAdress))
			return false;
		if (financialClass == null) {
			if (other.financialClass != null)
				return false;
		} else if (!financialClass.equals(other.financialClass))
			return false;
		if (financialClassCode == null) {
			if (other.financialClassCode != null)
				return false;
		} else if (!financialClassCode.equals(other.financialClassCode))
			return false;
		if (firstAdmissionIndicator == null) {
			if (other.firstAdmissionIndicator != null)
				return false;
		} else if (!firstAdmissionIndicator
				.equals(other.firstAdmissionIndicator))
			return false;
		if (homePhone == null) {
			if (other.homePhone != null)
				return false;
		} else if (!homePhone.equals(other.homePhone))
			return false;
		if (insuranceID == null) {
			if (other.insuranceID != null)
				return false;
		} else if (!insuranceID.equals(other.insuranceID))
			return false;
		if (insuranceInformation == null) {
			if (other.insuranceInformation != null)
				return false;
		} else if (!insuranceInformation.equals(other.insuranceInformation))
			return false;
		if (insurancePropety == null) {
			if (other.insurancePropety != null)
				return false;
		} else if (!insurancePropety.equals(other.insurancePropety))
			return false;
		if (insurancePropetyCode == null) {
			if (other.insurancePropetyCode != null)
				return false;
		} else if (!insurancePropetyCode.equals(other.insurancePropetyCode))
			return false;
		if (insuranceType == null) {
			if (other.insuranceType != null)
				return false;
		} else if (!insuranceType.equals(other.insuranceType))
			return false;
		if (insuranceTypeCode == null) {
			if (other.insuranceTypeCode != null)
				return false;
		} else if (!insuranceTypeCode.equals(other.insuranceTypeCode))
			return false;
		if (mailingAdress == null) {
			if (other.mailingAdress != null)
				return false;
		} else if (!mailingAdress.equals(other.mailingAdress))
			return false;
		if (maillingAdressCity == null) {
			if (other.maillingAdressCity != null)
				return false;
		} else if (!maillingAdressCity.equals(other.maillingAdressCity))
			return false;
		if (maillingAdressDistrict == null) {
			if (other.maillingAdressDistrict != null)
				return false;
		} else if (!maillingAdressDistrict.equals(other.maillingAdressDistrict))
			return false;
		if (maillingAdressNumber == null) {
			if (other.maillingAdressNumber != null)
				return false;
		} else if (!maillingAdressNumber.equals(other.maillingAdressNumber))
			return false;
		if (maillingAdressPostalCode == null) {
			if (other.maillingAdressPostalCode != null)
				return false;
		} else if (!maillingAdressPostalCode
				.equals(other.maillingAdressPostalCode))
			return false;
		if (maillingAdressProvince == null) {
			if (other.maillingAdressProvince != null)
				return false;
		} else if (!maillingAdressProvince.equals(other.maillingAdressProvince))
			return false;
		if (maillingAdressStreetName == null) {
			if (other.maillingAdressStreetName != null)
				return false;
		} else if (!maillingAdressStreetName
				.equals(other.maillingAdressStreetName))
			return false;
		if (maillingAdressTownLocality == null) {
			if (other.maillingAdressTownLocality != null)
				return false;
		} else if (!maillingAdressTownLocality
				.equals(other.maillingAdressTownLocality))
			return false;
		if (mobelPhone == null) {
			if (other.mobelPhone != null)
				return false;
		} else if (!mobelPhone.equals(other.mobelPhone))
			return false;
		if (nursingClass == null) {
			if (other.nursingClass != null)
				return false;
		} else if (!nursingClass.equals(other.nursingClass))
			return false;
		if (nursingGroupID == null) {
			if (other.nursingGroupID != null)
				return false;
		} else if (!nursingGroupID.equals(other.nursingGroupID))
			return false;
		if (patientClassCode == null) {
			if (other.patientClassCode != null)
				return false;
		} else if (!patientClassCode.equals(other.patientClassCode))
			return false;
		if (patientClassName == null) {
			if (other.patientClassName != null)
				return false;
		} else if (!patientClassName.equals(other.patientClassName))
			return false;
		if (patientCondition == null) {
			if (other.patientCondition != null)
				return false;
		} else if (!patientCondition.equals(other.patientCondition))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (residentDoctorID == null) {
			if (other.residentDoctorID != null)
				return false;
		} else if (!residentDoctorID.equals(other.residentDoctorID))
			return false;
		if (residentDoctorName == null) {
			if (other.residentDoctorName != null)
				return false;
		} else if (!residentDoctorName.equals(other.residentDoctorName))
			return false;
		if (roomCode == null) {
			if (other.roomCode != null)
				return false;
		} else if (!roomCode.equals(other.roomCode))
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		if (specialDepartment == null) {
			if (other.specialDepartment != null)
				return false;
		} else if (!specialDepartment.equals(other.specialDepartment))
			return false;
		if (specialDepartmentCode == null) {
			if (other.specialDepartmentCode != null)
				return false;
		} else if (!specialDepartmentCode.equals(other.specialDepartmentCode))
			return false;
		if (uid != other.uid)
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		if (wardCode == null) {
			if (other.wardCode != null)
				return false;
		} else if (!wardCode.equals(other.wardCode))
			return false;
		if (wardName == null) {
			if (other.wardName != null)
				return false;
		} else if (!wardName.equals(other.wardName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientAdmission [uid=").append(uid)
				.append(", patientID=").append(patientID)
				.append(", patientClassCode=").append(patientClassCode)
				.append(", patientClassName=").append(patientClassName)
				.append(", visitID=").append(visitID).append(", deptCode=")
				.append(deptCode).append(", deptName=").append(deptName)
				.append(", wardCode=").append(wardCode).append(", wardName=")
				.append(wardName).append(", roomCode=").append(roomCode)
				.append(", roomName=").append(roomName).append(", bedCode=")
				.append(bedCode).append(", bedName=").append(bedName)
				.append(", admitDateTime=").append(admitDateTime)
				.append(", admitIntent=").append(admitIntent)
				.append(", admitDoctorID=").append(admitDoctorID)
				.append(", admitDoctorName=").append(admitDoctorName)
				.append(", residentDoctorID=").append(residentDoctorID)
				.append(", residentDoctorName=").append(residentDoctorName)
				.append(", attendingDoctorID=").append(attendingDoctorID)
				.append(", attendingDoctorName=").append(attendingDoctorName)
				.append(", direcotrID=").append(direcotrID)
				.append(", direcotrName=").append(direcotrName)
				.append(", deputyDoctorID=").append(deputyDoctorID)
				.append(", deputyDoctorName=").append(deputyDoctorName)
				.append(", admitSource=").append(admitSource)
				.append(", patientCondition=").append(patientCondition)
				.append(", admissionTypeCode=").append(admissionTypeCode)
				.append(", admissionType=").append(admissionType)
				.append(", financialClassCode=").append(financialClassCode)
				.append(", financialClass=").append(financialClass)
				.append(", nursingClass=").append(nursingClass)
				.append(", doctorGroupID=").append(doctorGroupID)
				.append(", nursingGroupID=").append(nursingGroupID)
				.append(", firstAdmissionIndicator=")
				.append(firstAdmissionIndicator)
				.append(", specialDepartmentCode=")
				.append(specialDepartmentCode).append(", specialDepartment=")
				.append(specialDepartment).append(", insuranceID=")
				.append(insuranceID).append(", insuranceType=")
				.append(insuranceType).append(", insuranceTypeCode=")
				.append(insuranceTypeCode).append(", insuranceInformation=")
				.append(insuranceInformation).append(", insurancePropety=")
				.append(insurancePropety).append(", insurancePropetyCode=")
				.append(insurancePropetyCode).append(", emailAdress=")
				.append(emailAdress).append(", mailingAdress=")
				.append(mailingAdress).append(", maillingAdressProvince=")
				.append(maillingAdressProvince).append(", maillingAdressCity=")
				.append(maillingAdressCity).append(", maillingAdressDistrict=")
				.append(maillingAdressDistrict)
				.append(", maillingAdressTownLocality=")
				.append(maillingAdressTownLocality)
				.append(", maillingAdressStreetName=")
				.append(maillingAdressStreetName)
				.append(", maillingAdressNumber=").append(maillingAdressNumber)
				.append(", maillingAdressPostalCode=")
				.append(maillingAdressPostalCode).append(", mobelPhone=")
				.append(mobelPhone).append(", homePhone=").append(homePhone)
				.append(", businessPhone=").append(businessPhone).append("]");
		return builder.toString();
	}
}
