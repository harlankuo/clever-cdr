package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBornVaccinationRecords")
public class NewBornVaccinationRecords {
	private String newBornID;// 新生儿ID
	private Date vaccinationDatetime;// 接种时间
	private String vaccineName;// 疫苗名称
	private String drugManufacturer;// 生产厂家
	private String batchNO;// 产品批号
	private String vaccinatorName;// 接种者姓名
	private String vaccinatorCode;// 接种者ID
	private String memo;// 备注
	private String vaccinationInstitutions;// 接种单位
	private Date createDate;// 录入日期
	private String creator;// 录入人姓名
	private String creatorID;// 录入人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID

	public NewBornVaccinationRecords() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
	}

	public Date getVaccinationDatetime() {
		return vaccinationDatetime;
	}

	public void setVaccinationDatetime(Date vaccinationDatetime) {
		this.vaccinationDatetime = vaccinationDatetime;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getDrugManufacturer() {
		return drugManufacturer;
	}

	public void setDrugManufacturer(String drugManufacturer) {
		this.drugManufacturer = drugManufacturer;
	}

	public String getBatchNO() {
		return batchNO;
	}

	public void setBatchNO(String batchNO) {
		this.batchNO = batchNO;
	}

	public String getVaccinatorName() {
		return vaccinatorName;
	}

	public void setVaccinatorName(String vaccinatorName) {
		this.vaccinatorName = vaccinatorName;
	}

	public String getVaccinatorCode() {
		return vaccinatorCode;
	}

	public void setVaccinatorCode(String vaccinatorCode) {
		this.vaccinatorCode = vaccinatorCode;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getVaccinationInstitutions() {
		return vaccinationInstitutions;
	}

	public void setVaccinationInstitutions(String vaccinationInstitutions) {
		this.vaccinationInstitutions = vaccinationInstitutions;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchNO == null) ? 0 : batchNO.hashCode());
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result
				+ ((creatorID == null) ? 0 : creatorID.hashCode());
		result = prime
				* result
				+ ((drugManufacturer == null) ? 0 : drugManufacturer.hashCode());
		result = prime
				* result
				+ ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime
				* result
				+ ((lastModifierCode == null) ? 0 : lastModifierCode.hashCode());
		result = prime
				* result
				+ ((lastModifierName == null) ? 0 : lastModifierName.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result
				+ ((newBornID == null) ? 0 : newBornID.hashCode());
		result = prime
				* result
				+ ((vaccinationDatetime == null) ? 0 : vaccinationDatetime
						.hashCode());
		result = prime
				* result
				+ ((vaccinationInstitutions == null) ? 0
						: vaccinationInstitutions.hashCode());
		result = prime * result
				+ ((vaccinatorCode == null) ? 0 : vaccinatorCode.hashCode());
		result = prime * result
				+ ((vaccinatorName == null) ? 0 : vaccinatorName.hashCode());
		result = prime * result
				+ ((vaccineName == null) ? 0 : vaccineName.hashCode());
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
		NewBornVaccinationRecords other = (NewBornVaccinationRecords) obj;
		if (batchNO == null) {
			if (other.batchNO != null)
				return false;
		} else if (!batchNO.equals(other.batchNO))
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
		if (drugManufacturer == null) {
			if (other.drugManufacturer != null)
				return false;
		} else if (!drugManufacturer.equals(other.drugManufacturer))
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
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (newBornID == null) {
			if (other.newBornID != null)
				return false;
		} else if (!newBornID.equals(other.newBornID))
			return false;
		if (vaccinationDatetime == null) {
			if (other.vaccinationDatetime != null)
				return false;
		} else if (!vaccinationDatetime.equals(other.vaccinationDatetime))
			return false;
		if (vaccinationInstitutions == null) {
			if (other.vaccinationInstitutions != null)
				return false;
		} else if (!vaccinationInstitutions
				.equals(other.vaccinationInstitutions))
			return false;
		if (vaccinatorCode == null) {
			if (other.vaccinatorCode != null)
				return false;
		} else if (!vaccinatorCode.equals(other.vaccinatorCode))
			return false;
		if (vaccinatorName == null) {
			if (other.vaccinatorName != null)
				return false;
		} else if (!vaccinatorName.equals(other.vaccinatorName))
			return false;
		if (vaccineName == null) {
			if (other.vaccineName != null)
				return false;
		} else if (!vaccineName.equals(other.vaccineName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewBornVaccinationRecords [newBornID=")
				.append(newBornID).append(", vaccinationDatetime=")
				.append(vaccinationDatetime).append(", vaccineName=")
				.append(vaccineName).append(", drugManufacturer=")
				.append(drugManufacturer).append(", batchNO=").append(batchNO)
				.append(", vaccinatorName=").append(vaccinatorName)
				.append(", vaccinatorCode=").append(vaccinatorCode)
				.append(", memo=").append(memo)
				.append(", vaccinationInstitutions=")
				.append(vaccinationInstitutions).append(", createDate=")
				.append(createDate).append(", creator=").append(creator)
				.append(", creatorID=").append(creatorID)
				.append(", lastModifiedDate=").append(lastModifiedDate)
				.append(", lastModifierName=").append(lastModifierName)
				.append(", lastModifierCode=").append(lastModifierCode)
				.append("]");
		return builder.toString();
	}

}
