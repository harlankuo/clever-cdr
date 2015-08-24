package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBirthProcess")
public class NewBirthProcess {
	private String newBornID;// 新生儿ID
	private int gestationalWeeks;// 孕周
	private int gestationalDay;// 天数,比整周多出的天，值范围为0到6
	private String deliveryClass;// 产别
	private String fetalLie;// 胎产式
	private String fetalPresentation;// 胎先露
	private String fetalPosition;// 胎方位
	private String deliveryType;// 分娩方式
	private String doctorOneName;// 接生医生1姓名
	private String doctorOneCode;// 接生医生1代码
	private String doctorTwoName;// 接生医生2姓名
	private String doctorTwoCode;// 接生医生2代码
	private String nurseOneName;// 接生护士1姓名
	private String nurseOneCode;// 接生护士1代码
	private String nurseTwoName;// 接生护士2姓名
	private String nurseTwoCode;// 接生护士2代码
	private Date createDate;// 录入日期
	private String creator;// 录入人姓名
	private String creatorID;// 录入人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID

	public NewBirthProcess() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
	}

	public int getGestationalWeeks() {
		return gestationalWeeks;
	}

	public void setGestationalWeeks(int gestationalWeeks) {
		this.gestationalWeeks = gestationalWeeks;
	}

	public int getGestationalDay() {
		return gestationalDay;
	}

	public void setGestationalDay(int gestationalDay) {
		this.gestationalDay = gestationalDay;
	}

	public String getDeliveryClass() {
		return deliveryClass;
	}

	public void setDeliveryClass(String deliveryClass) {
		this.deliveryClass = deliveryClass;
	}

	public String getFetalLie() {
		return fetalLie;
	}

	public void setFetalLie(String fetalLie) {
		this.fetalLie = fetalLie;
	}

	public String getFetalPresentation() {
		return fetalPresentation;
	}

	public void setFetalPresentation(String fetalPresentation) {
		this.fetalPresentation = fetalPresentation;
	}

	public String getFetalPosition() {
		return fetalPosition;
	}

	public void setFetalPosition(String fetalPosition) {
		this.fetalPosition = fetalPosition;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getDoctorOneName() {
		return doctorOneName;
	}

	public void setDoctorOneName(String doctorOneName) {
		this.doctorOneName = doctorOneName;
	}

	public String getDoctorOneCode() {
		return doctorOneCode;
	}

	public void setDoctorOneCode(String doctorOneCode) {
		this.doctorOneCode = doctorOneCode;
	}

	public String getDoctorTwoName() {
		return doctorTwoName;
	}

	public void setDoctorTwoName(String doctorTwoName) {
		this.doctorTwoName = doctorTwoName;
	}

	public String getDoctorTwoCode() {
		return doctorTwoCode;
	}

	public void setDoctorTwoCode(String doctorTwoCode) {
		this.doctorTwoCode = doctorTwoCode;
	}

	public String getNurseOneName() {
		return nurseOneName;
	}

	public void setNurseOneName(String nurseOneName) {
		this.nurseOneName = nurseOneName;
	}

	public String getNurseOneCode() {
		return nurseOneCode;
	}

	public void setNurseOneCode(String nurseOneCode) {
		this.nurseOneCode = nurseOneCode;
	}

	public String getNurseTwoName() {
		return nurseTwoName;
	}

	public void setNurseTwoName(String nurseTwoName) {
		this.nurseTwoName = nurseTwoName;
	}

	public String getNurseTwoCode() {
		return nurseTwoCode;
	}

	public void setNurseTwoCode(String nurseTwoCode) {
		this.nurseTwoCode = nurseTwoCode;
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
				+ ((deliveryClass == null) ? 0 : deliveryClass.hashCode());
		result = prime * result
				+ ((deliveryType == null) ? 0 : deliveryType.hashCode());
		result = prime * result
				+ ((doctorOneCode == null) ? 0 : doctorOneCode.hashCode());
		result = prime * result
				+ ((doctorOneName == null) ? 0 : doctorOneName.hashCode());
		result = prime * result
				+ ((doctorTwoCode == null) ? 0 : doctorTwoCode.hashCode());
		result = prime * result
				+ ((doctorTwoName == null) ? 0 : doctorTwoName.hashCode());
		result = prime * result
				+ ((fetalLie == null) ? 0 : fetalLie.hashCode());
		result = prime * result
				+ ((fetalPosition == null) ? 0 : fetalPosition.hashCode());
		result = prime
				* result
				+ ((fetalPresentation == null) ? 0 : fetalPresentation
						.hashCode());
		result = prime * result + gestationalDay;
		result = prime * result + gestationalWeeks;
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
		result = prime * result
				+ ((nurseOneCode == null) ? 0 : nurseOneCode.hashCode());
		result = prime * result
				+ ((nurseOneName == null) ? 0 : nurseOneName.hashCode());
		result = prime * result
				+ ((nurseTwoCode == null) ? 0 : nurseTwoCode.hashCode());
		result = prime * result
				+ ((nurseTwoName == null) ? 0 : nurseTwoName.hashCode());
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
		NewBirthProcess other = (NewBirthProcess) obj;
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
		if (deliveryClass == null) {
			if (other.deliveryClass != null)
				return false;
		} else if (!deliveryClass.equals(other.deliveryClass))
			return false;
		if (deliveryType == null) {
			if (other.deliveryType != null)
				return false;
		} else if (!deliveryType.equals(other.deliveryType))
			return false;
		if (doctorOneCode == null) {
			if (other.doctorOneCode != null)
				return false;
		} else if (!doctorOneCode.equals(other.doctorOneCode))
			return false;
		if (doctorOneName == null) {
			if (other.doctorOneName != null)
				return false;
		} else if (!doctorOneName.equals(other.doctorOneName))
			return false;
		if (doctorTwoCode == null) {
			if (other.doctorTwoCode != null)
				return false;
		} else if (!doctorTwoCode.equals(other.doctorTwoCode))
			return false;
		if (doctorTwoName == null) {
			if (other.doctorTwoName != null)
				return false;
		} else if (!doctorTwoName.equals(other.doctorTwoName))
			return false;
		if (fetalLie == null) {
			if (other.fetalLie != null)
				return false;
		} else if (!fetalLie.equals(other.fetalLie))
			return false;
		if (fetalPosition == null) {
			if (other.fetalPosition != null)
				return false;
		} else if (!fetalPosition.equals(other.fetalPosition))
			return false;
		if (fetalPresentation == null) {
			if (other.fetalPresentation != null)
				return false;
		} else if (!fetalPresentation.equals(other.fetalPresentation))
			return false;
		if (gestationalDay != other.gestationalDay)
			return false;
		if (gestationalWeeks != other.gestationalWeeks)
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
		if (nurseOneCode == null) {
			if (other.nurseOneCode != null)
				return false;
		} else if (!nurseOneCode.equals(other.nurseOneCode))
			return false;
		if (nurseOneName == null) {
			if (other.nurseOneName != null)
				return false;
		} else if (!nurseOneName.equals(other.nurseOneName))
			return false;
		if (nurseTwoCode == null) {
			if (other.nurseTwoCode != null)
				return false;
		} else if (!nurseTwoCode.equals(other.nurseTwoCode))
			return false;
		if (nurseTwoName == null) {
			if (other.nurseTwoName != null)
				return false;
		} else if (!nurseTwoName.equals(other.nurseTwoName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewBirthProcess [newBornID=").append(newBornID)
				.append(", gestationalWeeks=").append(gestationalWeeks)
				.append(", gestationalDay=").append(gestationalDay)
				.append(", deliveryClass=").append(deliveryClass)
				.append(", fetalLie=").append(fetalLie)
				.append(", fetalPresentation=").append(fetalPresentation)
				.append(", fetalPosition=").append(fetalPosition)
				.append(", deliveryType=").append(deliveryType)
				.append(", doctorOneName=").append(doctorOneName)
				.append(", doctorOneCode=").append(doctorOneCode)
				.append(", doctorTwoName=").append(doctorTwoName)
				.append(", doctorTwoCode=").append(doctorTwoCode)
				.append(", nurseOneName=").append(nurseOneName)
				.append(", nurseOneCode=").append(nurseOneCode)
				.append(", nurseTwoName=").append(nurseTwoName)
				.append(", nurseTwoCode=").append(nurseTwoCode)
				.append(", createDate=").append(createDate)
				.append(", creator=").append(creator).append(", creatorID=")
				.append(creatorID).append(", lastModifiedDate=")
				.append(lastModifiedDate).append(", lastModifierName=")
				.append(lastModifierName).append(", lastModifierCode=")
				.append(lastModifierCode).append("]");
		return builder.toString();
	}
}
