package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBornOtherInformation")
public class NewBornOtherInformation {
	private String newBornID;// 新生儿ID
	private String feedMethod;// 喂养方式
	private String otherInformation;// 其他信息
	private Date createDate;// 录入日期
	private String creator;// 录入人姓名
	private String creatorID;// 录入人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID

	public NewBornOtherInformation() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
	}

	public String getFeedMethod() {
		return feedMethod;
	}

	public void setFeedMethod(String feedMethod) {
		this.feedMethod = feedMethod;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
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
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result
				+ ((creatorID == null) ? 0 : creatorID.hashCode());
		result = prime * result
				+ ((feedMethod == null) ? 0 : feedMethod.hashCode());
		result = prime
				* result
				+ ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime
				* result
				+ ((lastModifierCode == null) ? 0 : lastModifierCode.hashCode());
		result = prime
				* result
				+ ((lastModifierName == null) ? 0 : lastModifierName.hashCode());
		result = prime * result
				+ ((newBornID == null) ? 0 : newBornID.hashCode());
		result = prime
				* result
				+ ((otherInformation == null) ? 0 : otherInformation.hashCode());
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
		NewBornOtherInformation other = (NewBornOtherInformation) obj;
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
		if (feedMethod == null) {
			if (other.feedMethod != null)
				return false;
		} else if (!feedMethod.equals(other.feedMethod))
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
		if (newBornID == null) {
			if (other.newBornID != null)
				return false;
		} else if (!newBornID.equals(other.newBornID))
			return false;
		if (otherInformation == null) {
			if (other.otherInformation != null)
				return false;
		} else if (!otherInformation.equals(other.otherInformation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewBornOtherInformation [newBornID=").append(newBornID)
				.append(", feedMethod=").append(feedMethod)
				.append(", otherInformation=").append(otherInformation)
				.append(", createDate=").append(createDate)
				.append(", creator=").append(creator).append(", creatorID=")
				.append(creatorID).append(", lastModifiedDate=")
				.append(lastModifiedDate).append(", lastModifierName=")
				.append(lastModifierName).append(", lastModifierCode=")
				.append(lastModifierCode).append("]");
		return builder.toString();
	}

}
