package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBornMaster")
public class NewBornMaster {
	private String newBornID;// 新生儿ID(*)
	private String patientID;// 母亲病人号(*)
	private String visitID;// 母亲就诊号(*)
	private Date birthDate;// 出生时间
	private String gender;// 性别
	private String name;// 姓名
	private String healthState;// 健康状况,0-良好；1-一般；2-差
	private int height;// 身长数值
	private String heightUnit;// 身长单位
	private int weight;// 体重数值
	private String weightUnit;// 体重单位
	private String fatherName;// 父亲姓名
	private String fatherNation;// 父亲国籍
	private String fatherEthnicGroup;// 父亲民族
	private String fatherIDType;// 父亲证件类型
	private String fatherID;// 父亲证件号码
	private String motherName;// 母亲姓名
	private String motherNation;// 母亲国籍
	private String motherEthnicGroup;// 母亲民族
	private String motherIDType;// 母亲证件类型
	private String motherID;// 母亲证件号码
	private String birthPlace;// 出生地
	private int birthPlaceType;// 出生地点类型
	private String deliveringInstitutions;// 接生机构名称
	private Date createDate;// 建档日期
	private String creator;// 建档人姓名
	private String creatorID;// 建档人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID
	private String status;// 状态,0-有效；1-已作废

	public NewBornMaster() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHealthState() {
		return healthState;
	}

	public void setHealthState(String healthState) {
		this.healthState = healthState;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getHeightUnit() {
		return heightUnit;
	}

	public void setHeightUnit(String heightUnit) {
		this.heightUnit = heightUnit;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherNation() {
		return fatherNation;
	}

	public void setFatherNation(String fatherNation) {
		this.fatherNation = fatherNation;
	}

	public String getFatherEthnicGroup() {
		return fatherEthnicGroup;
	}

	public void setFatherEthnicGroup(String fatherEthnicGroup) {
		this.fatherEthnicGroup = fatherEthnicGroup;
	}

	public String getFatherIDType() {
		return fatherIDType;
	}

	public void setFatherIDType(String fatherIDType) {
		this.fatherIDType = fatherIDType;
	}

	public String getFatherID() {
		return fatherID;
	}

	public void setFatherID(String fatherID) {
		this.fatherID = fatherID;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherNation() {
		return motherNation;
	}

	public void setMotherNation(String motherNation) {
		this.motherNation = motherNation;
	}

	public String getMotherEthnicGroup() {
		return motherEthnicGroup;
	}

	public void setMotherEthnicGroup(String motherEthnicGroup) {
		this.motherEthnicGroup = motherEthnicGroup;
	}

	public String getMotherIDType() {
		return motherIDType;
	}

	public void setMotherIDType(String motherIDType) {
		this.motherIDType = motherIDType;
	}

	public String getMotherID() {
		return motherID;
	}

	public void setMotherID(String motherID) {
		this.motherID = motherID;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getBirthPlaceType() {
		return birthPlaceType;
	}

	public void setBirthPlaceType(int birthPlaceType) {
		this.birthPlaceType = birthPlaceType;
	}

	public String getDeliveringInstitutions() {
		return deliveringInstitutions;
	}

	public void setDeliveringInstitutions(String deliveringInstitutions) {
		this.deliveringInstitutions = deliveringInstitutions;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(String creatorID) {
		this.creatorID = creatorID;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifierName() {
		return lastModifierName;
	}

	public void setLastModifierName(String lastModifierName) {
		this.lastModifierName = lastModifierName;
	}

	public String getLastModifierCode() {
		return lastModifierCode;
	}

	public void setLastModifierCode(String lastModifierCode) {
		this.lastModifierCode = lastModifierCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result
				+ ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result + birthPlaceType;
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result
				+ ((creatorID == null) ? 0 : creatorID.hashCode());
		result = prime
				* result
				+ ((deliveringInstitutions == null) ? 0
						: deliveringInstitutions.hashCode());
		result = prime
				* result
				+ ((fatherEthnicGroup == null) ? 0 : fatherEthnicGroup
						.hashCode());
		result = prime * result
				+ ((fatherID == null) ? 0 : fatherID.hashCode());
		result = prime * result
				+ ((fatherIDType == null) ? 0 : fatherIDType.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((fatherNation == null) ? 0 : fatherNation.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((healthState == null) ? 0 : healthState.hashCode());
		result = prime * result + height;
		result = prime * result
				+ ((heightUnit == null) ? 0 : heightUnit.hashCode());
		result = prime
				* result
				+ ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime
				* result
				+ ((lastModifierCode == null) ? 0 : lastModifierCode.hashCode());
		result = prime
				* result
				+ ((lastModifierName == null) ? 0 : lastModifierName.hashCode());
		result = prime
				* result
				+ ((motherEthnicGroup == null) ? 0 : motherEthnicGroup
						.hashCode());
		result = prime * result
				+ ((motherID == null) ? 0 : motherID.hashCode());
		result = prime * result
				+ ((motherIDType == null) ? 0 : motherIDType.hashCode());
		result = prime * result
				+ ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result
				+ ((motherNation == null) ? 0 : motherNation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((newBornID == null) ? 0 : newBornID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
		result = prime * result + weight;
		result = prime * result
				+ ((weightUnit == null) ? 0 : weightUnit.hashCode());
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
		NewBornMaster other = (NewBornMaster) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (birthPlaceType != other.birthPlaceType)
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (creatorID == null) {
			if (other.creatorID != null)
				return false;
		} else if (!creatorID.equals(other.creatorID))
			return false;
		if (deliveringInstitutions == null) {
			if (other.deliveringInstitutions != null)
				return false;
		} else if (!deliveringInstitutions.equals(other.deliveringInstitutions))
			return false;
		if (fatherEthnicGroup == null) {
			if (other.fatherEthnicGroup != null)
				return false;
		} else if (!fatherEthnicGroup.equals(other.fatherEthnicGroup))
			return false;
		if (fatherID == null) {
			if (other.fatherID != null)
				return false;
		} else if (!fatherID.equals(other.fatherID))
			return false;
		if (fatherIDType == null) {
			if (other.fatherIDType != null)
				return false;
		} else if (!fatherIDType.equals(other.fatherIDType))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (fatherNation == null) {
			if (other.fatherNation != null)
				return false;
		} else if (!fatherNation.equals(other.fatherNation))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (healthState == null) {
			if (other.healthState != null)
				return false;
		} else if (!healthState.equals(other.healthState))
			return false;
		if (height != other.height)
			return false;
		if (heightUnit == null) {
			if (other.heightUnit != null)
				return false;
		} else if (!heightUnit.equals(other.heightUnit))
			return false;
		if (lastModifiedDate == null) {
			if (other.lastModifiedDate != null)
				return false;
		} else if (!lastModifiedDate.equals(other.lastModifiedDate))
			return false;
		if (lastModifierCode == null) {
			if (other.lastModifierCode != null)
				return false;
		} else if (!lastModifierCode.equals(other.lastModifierCode))
			return false;
		if (lastModifierName == null) {
			if (other.lastModifierName != null)
				return false;
		} else if (!lastModifierName.equals(other.lastModifierName))
			return false;
		if (motherEthnicGroup == null) {
			if (other.motherEthnicGroup != null)
				return false;
		} else if (!motherEthnicGroup.equals(other.motherEthnicGroup))
			return false;
		if (motherID == null) {
			if (other.motherID != null)
				return false;
		} else if (!motherID.equals(other.motherID))
			return false;
		if (motherIDType == null) {
			if (other.motherIDType != null)
				return false;
		} else if (!motherIDType.equals(other.motherIDType))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (motherNation == null) {
			if (other.motherNation != null)
				return false;
		} else if (!motherNation.equals(other.motherNation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (newBornID == null) {
			if (other.newBornID != null)
				return false;
		} else if (!newBornID.equals(other.newBornID))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		if (weight != other.weight)
			return false;
		if (weightUnit == null) {
			if (other.weightUnit != null)
				return false;
		} else if (!weightUnit.equals(other.weightUnit))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NewBornMaster [newBornID=" + newBornID + ", patientID="
				+ patientID + ", visitID=" + visitID + ", birthDate="
				+ birthDate + ", gender=" + gender + ", name=" + name
				+ ", healthState=" + healthState + ", height=" + height
				+ ", heightUnit=" + heightUnit + ", weight=" + weight
				+ ", weightUnit=" + weightUnit + ", fatherName=" + fatherName
				+ ", fatherNation=" + fatherNation + ", fatherEthnicGroup="
				+ fatherEthnicGroup + ", fatherIDType=" + fatherIDType
				+ ", fatherID=" + fatherID + ", motherName=" + motherName
				+ ", motherNation=" + motherNation + ", motherEthnicGroup="
				+ motherEthnicGroup + ", motherIDType=" + motherIDType
				+ ", motherID=" + motherID + ", birthPlace=" + birthPlace
				+ ", birthPlaceType=" + birthPlaceType
				+ ", deliveringInstitutions=" + deliveringInstitutions
				+ ", createDate=" + createDate + ", creator=" + creator
				+ ", creatorID=" + creatorID + ", lastModifiedDate="
				+ lastModifiedDate + ", lastModifierName=" + lastModifierName
				+ ", lastModifierCode=" + lastModifierCode + ", status="
				+ status + "]";
	}

}
