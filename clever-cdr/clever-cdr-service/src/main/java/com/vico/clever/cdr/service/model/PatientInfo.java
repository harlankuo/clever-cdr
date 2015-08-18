package com.vico.clever.cdr.service.model;

import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PatientInfo")
public class PatientInfo {
	private String guid;// 主键自增
	private String patientID;// 病人号（*）
	private String patientName;// 病人姓名（*）
	private String patientSexCode;// 病人性别，M：男、F:女、U：未知、O：未说明(*)
	private String patientSexName;// 性别名称
	private Date dateOfBirth;// 出生日期
	private String nationality;// 国籍
	private String ethnicCode;// 民族代码
	private String ethnic;// 民族
	private String maritalStatusCode;// 婚姻状况代码
	private String maritalStatus;// 婚姻状况
	private String profession;// 职业
	private String educationBackground;// 文化程度
	private String bloodTypeABO;// ABO血型
	private String bloodTypeRH;// RH血型
	private String patientIdNO;// 居民身份证号码
	private String healthNO;// 居民健康卡号码
	private String birthPlace;// 出生详细地址
	private String birthPlaceCountryCode;// 出生地址-国代码
	private String birthPlaceCountry;// 出生地址-国
	private String birthPlaceProvinceCode;// 出生地址-省代码
	private String birthPlaceProvince;// 出生地址-省
	private String birthPlaceCityCode;// 出生地址-市）镇代码
	private String birthPlaceCity;// 出生地址-市）镇
	private Date dateOfDeath;// 患者死亡时间
	private String deathCountryCode;// 死亡地址-国代码
	private String deathCountry;// 死亡地址-国
	private String deathProvinceCode;// 死亡地址-省代码
	private String deathProvince;// 死亡地址-省
	private String deathCityCode;// 死亡地址-市代码
	private String deathCity;// 死亡地址-市

	public PatientInfo() {
		super();
	}

	public PatientInfo(String guid, String patientID, String patientName,
			String patientSexCode, String patientSexName, Date dateOfBirth,
			String nationality, String ethnicCode, String ethnic,
			String maritalStatusCode, String maritalStatus, String profession,
			String educationBackground, String bloodTypeABO,
			String bloodTypeRH, String patientIdNO, String healthNO,
			String birthPlace, String birthPlaceCountryCode,
			String birthPlaceCountry, String birthPlaceProvinceCode,
			String birthPlaceProvince, String birthPlaceCityCode,
			String birthPlaceCity, Date dateOfDeath, String deathCountryCode,
			String deathCountry, String deathProvinceCode,
			String deathProvince, String deathCityCode, String deathCity) {
		super();
		this.guid = guid;
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientSexCode = patientSexCode;
		this.patientSexName = patientSexName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.ethnicCode = ethnicCode;
		this.ethnic = ethnic;
		this.maritalStatusCode = maritalStatusCode;
		this.maritalStatus = maritalStatus;
		this.profession = profession;
		this.educationBackground = educationBackground;
		this.bloodTypeABO = bloodTypeABO;
		this.bloodTypeRH = bloodTypeRH;
		this.patientIdNO = patientIdNO;
		this.healthNO = healthNO;
		this.birthPlace = birthPlace;
		this.birthPlaceCountryCode = birthPlaceCountryCode;
		this.birthPlaceCountry = birthPlaceCountry;
		this.birthPlaceProvinceCode = birthPlaceProvinceCode;
		this.birthPlaceProvince = birthPlaceProvince;
		this.birthPlaceCityCode = birthPlaceCityCode;
		this.birthPlaceCity = birthPlaceCity;
		this.dateOfDeath = dateOfDeath;
		this.deathCountryCode = deathCountryCode;
		this.deathCountry = deathCountry;
		this.deathProvinceCode = deathProvinceCode;
		this.deathProvince = deathProvince;
		this.deathCityCode = deathCityCode;
		this.deathCity = deathCity;
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

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSexCode() {
		return patientSexCode;
	}

	public void setPatientSexCode(String patientSexCode) {
		this.patientSexCode = patientSexCode;
	}

	public String getPatientSexName() {
		return patientSexName;
	}

	public void setPatientSexName(String patientSexName) {
		this.patientSexName = patientSexName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnicCode() {
		return ethnicCode;
	}

	public void setEthnicCode(String ethnicCode) {
		this.ethnicCode = ethnicCode;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getMaritalStatusCode() {
		return maritalStatusCode;
	}

	public void setMaritalStatusCode(String maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEducationBackground() {
		return educationBackground;
	}

	public void setEducationBackground(String educationBackground) {
		this.educationBackground = educationBackground;
	}

	public String getBloodTypeABO() {
		return bloodTypeABO;
	}

	public void setBloodTypeABO(String bloodTypeABO) {
		this.bloodTypeABO = bloodTypeABO;
	}

	public String getBloodTypeRH() {
		return bloodTypeRH;
	}

	public void setBloodTypeRH(String bloodTypeRH) {
		this.bloodTypeRH = bloodTypeRH;
	}

	public String getPatientIdNO() {
		return patientIdNO;
	}

	public void setPatientIdNO(String patientIdNO) {
		this.patientIdNO = patientIdNO;
	}

	public String getHealthNO() {
		return healthNO;
	}

	public void setHealthNO(String healthNO) {
		this.healthNO = healthNO;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBirthPlaceCountryCode() {
		return birthPlaceCountryCode;
	}

	public void setBirthPlaceCountryCode(String birthPlaceCountryCode) {
		this.birthPlaceCountryCode = birthPlaceCountryCode;
	}

	public String getBirthPlaceCountry() {
		return birthPlaceCountry;
	}

	public void setBirthPlaceCountry(String birthPlaceCountry) {
		this.birthPlaceCountry = birthPlaceCountry;
	}

	public String getBirthPlaceProvinceCode() {
		return birthPlaceProvinceCode;
	}

	public void setBirthPlaceProvinceCode(String birthPlaceProvinceCode) {
		this.birthPlaceProvinceCode = birthPlaceProvinceCode;
	}

	public String getBirthPlaceProvince() {
		return birthPlaceProvince;
	}

	public void setBirthPlaceProvince(String birthPlaceProvince) {
		this.birthPlaceProvince = birthPlaceProvince;
	}

	public String getBirthPlaceCityCode() {
		return birthPlaceCityCode;
	}

	public void setBirthPlaceCityCode(String birthPlaceCityCode) {
		this.birthPlaceCityCode = birthPlaceCityCode;
	}

	public String getBirthPlaceCity() {
		return birthPlaceCity;
	}

	public void setBirthPlaceCity(String birthPlaceCity) {
		this.birthPlaceCity = birthPlaceCity;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public String getDeathCountryCode() {
		return deathCountryCode;
	}

	public void setDeathCountryCode(String deathCountryCode) {
		this.deathCountryCode = deathCountryCode;
	}

	public String getDeathCountry() {
		return deathCountry;
	}

	public void setDeathCountry(String deathCountry) {
		this.deathCountry = deathCountry;
	}

	public String getDeathProvinceCode() {
		return deathProvinceCode;
	}

	public void setDeathProvinceCode(String deathProvinceCode) {
		this.deathProvinceCode = deathProvinceCode;
	}

	public String getDeathProvince() {
		return deathProvince;
	}

	public void setDeathProvince(String deathProvince) {
		this.deathProvince = deathProvince;
	}

	public String getDeathCityCode() {
		return deathCityCode;
	}

	public void setDeathCityCode(String deathCityCode) {
		this.deathCityCode = deathCityCode;
	}

	public String getDeathCity() {
		return deathCity;
	}

	public void setDeathCity(String deathCity) {
		this.deathCity = deathCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result
				+ ((birthPlaceCity == null) ? 0 : birthPlaceCity.hashCode());
		result = prime
				* result
				+ ((birthPlaceCityCode == null) ? 0 : birthPlaceCityCode
						.hashCode());
		result = prime
				* result
				+ ((birthPlaceCountry == null) ? 0 : birthPlaceCountry
						.hashCode());
		result = prime
				* result
				+ ((birthPlaceCountryCode == null) ? 0 : birthPlaceCountryCode
						.hashCode());
		result = prime
				* result
				+ ((birthPlaceProvince == null) ? 0 : birthPlaceProvince
						.hashCode());
		result = prime
				* result
				+ ((birthPlaceProvinceCode == null) ? 0
						: birthPlaceProvinceCode.hashCode());
		result = prime * result
				+ ((bloodTypeABO == null) ? 0 : bloodTypeABO.hashCode());
		result = prime * result
				+ ((bloodTypeRH == null) ? 0 : bloodTypeRH.hashCode());
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result
				+ ((dateOfDeath == null) ? 0 : dateOfDeath.hashCode());
		result = prime * result
				+ ((deathCity == null) ? 0 : deathCity.hashCode());
		result = prime * result
				+ ((deathCityCode == null) ? 0 : deathCityCode.hashCode());
		result = prime * result
				+ ((deathCountry == null) ? 0 : deathCountry.hashCode());
		result = prime
				* result
				+ ((deathCountryCode == null) ? 0 : deathCountryCode.hashCode());
		result = prime * result
				+ ((deathProvince == null) ? 0 : deathProvince.hashCode());
		result = prime
				* result
				+ ((deathProvinceCode == null) ? 0 : deathProvinceCode
						.hashCode());
		result = prime
				* result
				+ ((educationBackground == null) ? 0 : educationBackground
						.hashCode());
		result = prime * result + ((ethnic == null) ? 0 : ethnic.hashCode());
		result = prime * result
				+ ((ethnicCode == null) ? 0 : ethnicCode.hashCode());
		result = prime * result + ((guid == null) ? 0 : guid.hashCode());
		result = prime * result
				+ ((healthNO == null) ? 0 : healthNO.hashCode());
		result = prime * result
				+ ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime
				* result
				+ ((maritalStatusCode == null) ? 0 : maritalStatusCode
						.hashCode());
		result = prime * result
				+ ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((patientIdNO == null) ? 0 : patientIdNO.hashCode());
		result = prime * result
				+ ((patientName == null) ? 0 : patientName.hashCode());
		result = prime * result
				+ ((patientSexCode == null) ? 0 : patientSexCode.hashCode());
		result = prime * result
				+ ((patientSexName == null) ? 0 : patientSexName.hashCode());
		result = prime * result
				+ ((profession == null) ? 0 : profession.hashCode());
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
		PatientInfo other = (PatientInfo) obj;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (birthPlaceCity == null) {
			if (other.birthPlaceCity != null)
				return false;
		} else if (!birthPlaceCity.equals(other.birthPlaceCity))
			return false;
		if (birthPlaceCityCode == null) {
			if (other.birthPlaceCityCode != null)
				return false;
		} else if (!birthPlaceCityCode.equals(other.birthPlaceCityCode))
			return false;
		if (birthPlaceCountry == null) {
			if (other.birthPlaceCountry != null)
				return false;
		} else if (!birthPlaceCountry.equals(other.birthPlaceCountry))
			return false;
		if (birthPlaceCountryCode == null) {
			if (other.birthPlaceCountryCode != null)
				return false;
		} else if (!birthPlaceCountryCode.equals(other.birthPlaceCountryCode))
			return false;
		if (birthPlaceProvince == null) {
			if (other.birthPlaceProvince != null)
				return false;
		} else if (!birthPlaceProvince.equals(other.birthPlaceProvince))
			return false;
		if (birthPlaceProvinceCode == null) {
			if (other.birthPlaceProvinceCode != null)
				return false;
		} else if (!birthPlaceProvinceCode.equals(other.birthPlaceProvinceCode))
			return false;
		if (bloodTypeABO == null) {
			if (other.bloodTypeABO != null)
				return false;
		} else if (!bloodTypeABO.equals(other.bloodTypeABO))
			return false;
		if (bloodTypeRH == null) {
			if (other.bloodTypeRH != null)
				return false;
		} else if (!bloodTypeRH.equals(other.bloodTypeRH))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dateOfDeath == null) {
			if (other.dateOfDeath != null)
				return false;
		} else if (!dateOfDeath.equals(other.dateOfDeath))
			return false;
		if (deathCity == null) {
			if (other.deathCity != null)
				return false;
		} else if (!deathCity.equals(other.deathCity))
			return false;
		if (deathCityCode == null) {
			if (other.deathCityCode != null)
				return false;
		} else if (!deathCityCode.equals(other.deathCityCode))
			return false;
		if (deathCountry == null) {
			if (other.deathCountry != null)
				return false;
		} else if (!deathCountry.equals(other.deathCountry))
			return false;
		if (deathCountryCode == null) {
			if (other.deathCountryCode != null)
				return false;
		} else if (!deathCountryCode.equals(other.deathCountryCode))
			return false;
		if (deathProvince == null) {
			if (other.deathProvince != null)
				return false;
		} else if (!deathProvince.equals(other.deathProvince))
			return false;
		if (deathProvinceCode == null) {
			if (other.deathProvinceCode != null)
				return false;
		} else if (!deathProvinceCode.equals(other.deathProvinceCode))
			return false;
		if (educationBackground == null) {
			if (other.educationBackground != null)
				return false;
		} else if (!educationBackground.equals(other.educationBackground))
			return false;
		if (ethnic == null) {
			if (other.ethnic != null)
				return false;
		} else if (!ethnic.equals(other.ethnic))
			return false;
		if (ethnicCode == null) {
			if (other.ethnicCode != null)
				return false;
		} else if (!ethnicCode.equals(other.ethnicCode))
			return false;
		if (guid == null) {
			if (other.guid != null)
				return false;
		} else if (!guid.equals(other.guid))
			return false;
		if (healthNO == null) {
			if (other.healthNO != null)
				return false;
		} else if (!healthNO.equals(other.healthNO))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (maritalStatusCode == null) {
			if (other.maritalStatusCode != null)
				return false;
		} else if (!maritalStatusCode.equals(other.maritalStatusCode))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (patientIdNO == null) {
			if (other.patientIdNO != null)
				return false;
		} else if (!patientIdNO.equals(other.patientIdNO))
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		if (patientSexCode == null) {
			if (other.patientSexCode != null)
				return false;
		} else if (!patientSexCode.equals(other.patientSexCode))
			return false;
		if (patientSexName == null) {
			if (other.patientSexName != null)
				return false;
		} else if (!patientSexName.equals(other.patientSexName))
			return false;
		if (profession == null) {
			if (other.profession != null)
				return false;
		} else if (!profession.equals(other.profession))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfo [guid=").append(guid)
				.append(", patientID=").append(patientID)
				.append(", patientName=").append(patientName)
				.append(", patientSexCode=").append(patientSexCode)
				.append(", patientSexName=").append(patientSexName)
				.append(", dateOfBirth=").append(dateOfBirth)
				.append(", nationality=").append(nationality)
				.append(", ethnicCode=").append(ethnicCode).append(", ethnic=")
				.append(ethnic).append(", maritalStatusCode=")
				.append(maritalStatusCode).append(", maritalStatus=")
				.append(maritalStatus).append(", profession=")
				.append(profession).append(", educationBackground=")
				.append(educationBackground).append(", bloodTypeABO=")
				.append(bloodTypeABO).append(", bloodTypeRH=")
				.append(bloodTypeRH).append(", patientIdNO=")
				.append(patientIdNO).append(", healthNO=").append(healthNO)
				.append(", birthPlace=").append(birthPlace)
				.append(", birthPlaceCountryCode=")
				.append(birthPlaceCountryCode).append(", birthPlaceCountry=")
				.append(birthPlaceCountry).append(", birthPlaceProvinceCode=")
				.append(birthPlaceProvinceCode).append(", birthPlaceProvince=")
				.append(birthPlaceProvince).append(", birthPlaceCityCode=")
				.append(birthPlaceCityCode).append(", birthPlaceCity=")
				.append(birthPlaceCity).append(", dateOfDeath=")
				.append(dateOfDeath).append(", deathCountryCode=")
				.append(deathCountryCode).append(", deathCountry=")
				.append(deathCountry).append(", deathProvinceCode=")
				.append(deathProvinceCode).append(", deathProvince=")
				.append(deathProvince).append(", deathCityCode=")
				.append(deathCityCode).append(", deathCity=").append(deathCity)
				.append("]");
		return builder.toString();
	}

}
