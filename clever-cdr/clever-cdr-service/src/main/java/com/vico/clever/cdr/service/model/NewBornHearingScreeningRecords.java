package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBornHearingScreeningRecords")
public class NewBornHearingScreeningRecords {
	private String newBornID;// 新生儿ID
	private Date examDateTime;// 检查时间
	private String examMethod;// 检查方法
	private String leftEarExamResult;// 左耳检查结果
	private String rightEarExamResult;// 右耳检查结果
	private String examinerName;// 检查者姓名
	private String examinerCode;// 检查者代码
	private String memo;// 备注
	private Date createDate;// 录入日期
	private String creator;// 录入人姓名
	private String creatorID;// 录入人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID

	public NewBornHearingScreeningRecords() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
	}

	public Date getExamDateTime() {
		return examDateTime;
	}

	public void setExamDateTime(Date examDateTime) {
		this.examDateTime = examDateTime;
	}

	public String getExamMethod() {
		return examMethod;
	}

	public void setExamMethod(String examMethod) {
		this.examMethod = examMethod;
	}

	public String getLeftEarExamResult() {
		return leftEarExamResult;
	}

	public void setLeftEarExamResult(String leftEarExamResult) {
		this.leftEarExamResult = leftEarExamResult;
	}

	public String getRightEarExamResult() {
		return rightEarExamResult;
	}

	public void setRightEarExamResult(String rightEarExamResult) {
		this.rightEarExamResult = rightEarExamResult;
	}

	public String getExaminerName() {
		return examinerName;
	}

	public void setExaminerName(String examinerName) {
		this.examinerName = examinerName;
	}

	public String getExaminerCode() {
		return examinerCode;
	}

	public void setExaminerCode(String examinerCode) {
		this.examinerCode = examinerCode;
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
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result
				+ ((creatorID == null) ? 0 : creatorID.hashCode());
		result = prime * result
				+ ((examDateTime == null) ? 0 : examDateTime.hashCode());
		result = prime * result
				+ ((examMethod == null) ? 0 : examMethod.hashCode());
		result = prime * result
				+ ((examinerCode == null) ? 0 : examinerCode.hashCode());
		result = prime * result
				+ ((examinerName == null) ? 0 : examinerName.hashCode());
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
				+ ((leftEarExamResult == null) ? 0 : leftEarExamResult
						.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result
				+ ((newBornID == null) ? 0 : newBornID.hashCode());
		result = prime
				* result
				+ ((rightEarExamResult == null) ? 0 : rightEarExamResult
						.hashCode());
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
		NewBornHearingScreeningRecords other = (NewBornHearingScreeningRecords) obj;
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
		if (examDateTime == null) {
			if (other.examDateTime != null)
				return false;
		} else if (!examDateTime.equals(other.examDateTime))
			return false;
		if (examMethod == null) {
			if (other.examMethod != null)
				return false;
		} else if (!examMethod.equals(other.examMethod))
			return false;
		if (examinerCode == null) {
			if (other.examinerCode != null)
				return false;
		} else if (!examinerCode.equals(other.examinerCode))
			return false;
		if (examinerName == null) {
			if (other.examinerName != null)
				return false;
		} else if (!examinerName.equals(other.examinerName))
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
		if (leftEarExamResult == null) {
			if (other.leftEarExamResult != null)
				return false;
		} else if (!leftEarExamResult.equals(other.leftEarExamResult))
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
		if (rightEarExamResult == null) {
			if (other.rightEarExamResult != null)
				return false;
		} else if (!rightEarExamResult.equals(other.rightEarExamResult))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewBornHearingScreeningRecords [newBornID=")
				.append(newBornID).append(", examDateTime=")
				.append(examDateTime).append(", examMethod=")
				.append(examMethod).append(", leftEarExamResult=")
				.append(leftEarExamResult).append(", rightEarExamResult=")
				.append(rightEarExamResult).append(", examinerName=")
				.append(examinerName).append(", examinerCode=")
				.append(examinerCode).append(", memo=").append(memo)
				.append(", createDate=").append(createDate)
				.append(", creator=").append(creator).append(", creatorID=")
				.append(creatorID).append(", lastModifiedDate=")
				.append(lastModifiedDate).append(", lastModifierName=")
				.append(lastModifierName).append(", lastModifierCode=")
				.append(lastModifierCode).append("]");
		return builder.toString();
	}

}
