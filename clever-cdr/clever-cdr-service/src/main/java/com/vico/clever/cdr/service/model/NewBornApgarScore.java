package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBornApgarScore")
public class NewBornApgarScore {
	private String newBornID;// 新生儿ID
	private int minutesAfterBirth;// 出生后分钟数数值
	private String minutesAfterBirthUnit;// 出生后分钟数单位
	private int hr;// 心率
	private String hrUnits;// 心率单位
	private int br;// 呼吸
	private String brUnits;// 呼吸单位
	private String reflection;// 刺激反射
	private String muscleTension;// 肌张力
	private String skinColor;// 肤色
	private int totalScore;// 总分
	private String ratersName;// 评分者姓名
	private String ratersCode;// 评分者ID
	private String memo;// 备注
	private Date createDate;// 录入日期
	private String creator;// 录入人姓名
	private String creatorID;// 录入人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID

	public NewBornApgarScore() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
	}

	public int getMinutesAfterBirth() {
		return minutesAfterBirth;
	}

	public void setMinutesAfterBirth(int minutesAfterBirth) {
		this.minutesAfterBirth = minutesAfterBirth;
	}

	public String getMinutesAfterBirthUnit() {
		return minutesAfterBirthUnit;
	}

	public void setMinutesAfterBirthUnit(String minutesAfterBirthUnit) {
		this.minutesAfterBirthUnit = minutesAfterBirthUnit;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public String getHrUnits() {
		return hrUnits;
	}

	public void setHrUnits(String hrUnits) {
		this.hrUnits = hrUnits;
	}

	public int getBr() {
		return br;
	}

	public void setBr(int br) {
		this.br = br;
	}

	public String getBrUnits() {
		return brUnits;
	}

	public void setBrUnits(String brUnits) {
		this.brUnits = brUnits;
	}

	public String getReflection() {
		return reflection;
	}

	public void setReflection(String reflection) {
		this.reflection = reflection;
	}

	public String getMuscleTension() {
		return muscleTension;
	}

	public void setMuscleTension(String muscleTension) {
		this.muscleTension = muscleTension;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getRatersName() {
		return ratersName;
	}

	public void setRatersName(String ratersName) {
		this.ratersName = ratersName;
	}

	public String getRatersCode() {
		return ratersCode;
	}

	public void setRatersCode(String ratersCode) {
		this.ratersCode = ratersCode;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
		result = prime * result + br;
		result = prime * result + ((brUnits == null) ? 0 : brUnits.hashCode());
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result
				+ ((creatorID == null) ? 0 : creatorID.hashCode());
		result = prime * result + hr;
		result = prime * result + ((hrUnits == null) ? 0 : hrUnits.hashCode());
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
		result = prime * result + minutesAfterBirth;
		result = prime
				* result
				+ ((minutesAfterBirthUnit == null) ? 0 : minutesAfterBirthUnit
						.hashCode());
		result = prime * result
				+ ((muscleTension == null) ? 0 : muscleTension.hashCode());
		result = prime * result
				+ ((newBornID == null) ? 0 : newBornID.hashCode());
		result = prime * result
				+ ((ratersCode == null) ? 0 : ratersCode.hashCode());
		result = prime * result
				+ ((ratersName == null) ? 0 : ratersName.hashCode());
		result = prime * result
				+ ((reflection == null) ? 0 : reflection.hashCode());
		result = prime * result
				+ ((skinColor == null) ? 0 : skinColor.hashCode());
		result = prime * result + totalScore;
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
		NewBornApgarScore other = (NewBornApgarScore) obj;
		if (br != other.br)
			return false;
		if (brUnits == null) {
			if (other.brUnits != null)
				return false;
		} else if (!brUnits.equals(other.brUnits))
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
		if (hr != other.hr)
			return false;
		if (hrUnits == null) {
			if (other.hrUnits != null)
				return false;
		} else if (!hrUnits.equals(other.hrUnits))
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
		if (minutesAfterBirth != other.minutesAfterBirth)
			return false;
		if (minutesAfterBirthUnit == null) {
			if (other.minutesAfterBirthUnit != null)
				return false;
		} else if (!minutesAfterBirthUnit.equals(other.minutesAfterBirthUnit))
			return false;
		if (muscleTension == null) {
			if (other.muscleTension != null)
				return false;
		} else if (!muscleTension.equals(other.muscleTension))
			return false;
		if (newBornID == null) {
			if (other.newBornID != null)
				return false;
		} else if (!newBornID.equals(other.newBornID))
			return false;
		if (ratersCode == null) {
			if (other.ratersCode != null)
				return false;
		} else if (!ratersCode.equals(other.ratersCode))
			return false;
		if (ratersName == null) {
			if (other.ratersName != null)
				return false;
		} else if (!ratersName.equals(other.ratersName))
			return false;
		if (reflection == null) {
			if (other.reflection != null)
				return false;
		} else if (!reflection.equals(other.reflection))
			return false;
		if (skinColor == null) {
			if (other.skinColor != null)
				return false;
		} else if (!skinColor.equals(other.skinColor))
			return false;
		if (totalScore != other.totalScore)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewBornApgarScore [newBornID=").append(newBornID)
				.append(", minutesAfterBirth=").append(minutesAfterBirth)
				.append(", minutesAfterBirthUnit=")
				.append(minutesAfterBirthUnit).append(", hr=").append(hr)
				.append(", hrUnits=").append(hrUnits).append(", br=")
				.append(br).append(", brUnits=").append(brUnits)
				.append(", reflection=").append(reflection)
				.append(", muscleTension=").append(muscleTension)
				.append(", skinColor=").append(skinColor)
				.append(", totalScore=").append(totalScore)
				.append(", ratersName=").append(ratersName)
				.append(", ratersCode=").append(ratersCode).append(", memo=")
				.append(memo).append(", createDate=").append(createDate)
				.append(", creator=").append(creator).append(", creatorID=")
				.append(creatorID).append(", lastModifiedDate=")
				.append(lastModifiedDate).append(", lastModifierName=")
				.append(lastModifierName).append(", lastModifierCode=")
				.append(lastModifierCode).append("]");
		return builder.toString();
	}

}
