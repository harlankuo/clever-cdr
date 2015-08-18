package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExamItem")
public class ExamItem {
	private String examReqID;// 检查申请号(*)
	private int itemNO;// 项目序号
	private String examClass;// 检查类别
	private String examClassCode;// 检查类别代码
	private String examSubClass;// 检查子类
	private String examSubClassCode;// 检查子类代码
	private String itemName;// 检查项目名称
	private String itemCode;// 检查项目代码
	private Date scheduleDate;// 预约时间
	private String scheduleDeptCode;// 预约科室代码
	private String scheduleDeptName;// 预约科室名称
	private String scheduleDoctorCode;// 预约医生代码
	private String scheduleDoctorName;// 预约医生名称

	public ExamItem() {
		super();
	}

	public ExamItem(String examReqID, int itemNO, String examClass,
			String examClassCode, String examSubClass, String examSubClassCode,
			String itemName, String itemCode, Date scheduleDate,
			String scheduleDeptCode, String scheduleDeptName,
			String scheduleDoctorCode, String scheduleDoctorName) {
		super();
		this.examReqID = examReqID;
		this.itemNO = itemNO;
		this.examClass = examClass;
		this.examClassCode = examClassCode;
		this.examSubClass = examSubClass;
		this.examSubClassCode = examSubClassCode;
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.scheduleDate = scheduleDate;
		this.scheduleDeptCode = scheduleDeptCode;
		this.scheduleDeptName = scheduleDeptName;
		this.scheduleDoctorCode = scheduleDoctorCode;
		this.scheduleDoctorName = scheduleDoctorName;
	}

	public String getExamReqID() {
		return examReqID;
	}

	public void setExamReqID(String examReqID) {
		this.examReqID = examReqID;
	}

	public int getItemNO() {
		return itemNO;
	}

	public void setItemNO(int itemNO) {
		this.itemNO = itemNO;
	}

	public String getExamClass() {
		return examClass;
	}

	public void setExamClass(String examClass) {
		this.examClass = examClass;
	}

	public String getExamClassCode() {
		return examClassCode;
	}

	public void setExamClassCode(String examClassCode) {
		this.examClassCode = examClassCode;
	}

	public String getExamSubClass() {
		return examSubClass;
	}

	public void setExamSubClass(String examSubClass) {
		this.examSubClass = examSubClass;
	}

	public String getExamSubClassCode() {
		return examSubClassCode;
	}

	public void setExamSubClassCode(String examSubClassCode) {
		this.examSubClassCode = examSubClassCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleDeptCode() {
		return scheduleDeptCode;
	}

	public void setScheduleDeptCode(String scheduleDeptCode) {
		this.scheduleDeptCode = scheduleDeptCode;
	}

	public String getScheduleDeptName() {
		return scheduleDeptName;
	}

	public void setScheduleDeptName(String scheduleDeptName) {
		this.scheduleDeptName = scheduleDeptName;
	}

	public String getScheduleDoctorCode() {
		return scheduleDoctorCode;
	}

	public void setScheduleDoctorCode(String scheduleDoctorCode) {
		this.scheduleDoctorCode = scheduleDoctorCode;
	}

	public String getScheduleDoctorName() {
		return scheduleDoctorName;
	}

	public void setScheduleDoctorName(String scheduleDoctorName) {
		this.scheduleDoctorName = scheduleDoctorName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((examClass == null) ? 0 : examClass.hashCode());
		result = prime * result
				+ ((examClassCode == null) ? 0 : examClassCode.hashCode());
		result = prime * result
				+ ((examReqID == null) ? 0 : examReqID.hashCode());
		result = prime * result
				+ ((examSubClass == null) ? 0 : examSubClass.hashCode());
		result = prime
				* result
				+ ((examSubClassCode == null) ? 0 : examSubClassCode.hashCode());
		result = prime * result
				+ ((itemCode == null) ? 0 : itemCode.hashCode());
		result = prime * result + itemNO;
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result
				+ ((scheduleDate == null) ? 0 : scheduleDate.hashCode());
		result = prime
				* result
				+ ((scheduleDeptCode == null) ? 0 : scheduleDeptCode.hashCode());
		result = prime
				* result
				+ ((scheduleDeptName == null) ? 0 : scheduleDeptName.hashCode());
		result = prime
				* result
				+ ((scheduleDoctorCode == null) ? 0 : scheduleDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((scheduleDoctorName == null) ? 0 : scheduleDoctorName
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
		ExamItem other = (ExamItem) obj;
		if (examClass == null) {
			if (other.examClass != null)
				return false;
		} else if (!examClass.equals(other.examClass))
			return false;
		if (examClassCode == null) {
			if (other.examClassCode != null)
				return false;
		} else if (!examClassCode.equals(other.examClassCode))
			return false;
		if (examReqID == null) {
			if (other.examReqID != null)
				return false;
		} else if (!examReqID.equals(other.examReqID))
			return false;
		if (examSubClass == null) {
			if (other.examSubClass != null)
				return false;
		} else if (!examSubClass.equals(other.examSubClass))
			return false;
		if (examSubClassCode == null) {
			if (other.examSubClassCode != null)
				return false;
		} else if (!examSubClassCode.equals(other.examSubClassCode))
			return false;
		if (itemCode == null) {
			if (other.itemCode != null)
				return false;
		} else if (!itemCode.equals(other.itemCode))
			return false;
		if (itemNO != other.itemNO)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (scheduleDate == null) {
			if (other.scheduleDate != null)
				return false;
		} else if (!scheduleDate.equals(other.scheduleDate))
			return false;
		if (scheduleDeptCode == null) {
			if (other.scheduleDeptCode != null)
				return false;
		} else if (!scheduleDeptCode.equals(other.scheduleDeptCode))
			return false;
		if (scheduleDeptName == null) {
			if (other.scheduleDeptName != null)
				return false;
		} else if (!scheduleDeptName.equals(other.scheduleDeptName))
			return false;
		if (scheduleDoctorCode == null) {
			if (other.scheduleDoctorCode != null)
				return false;
		} else if (!scheduleDoctorCode.equals(other.scheduleDoctorCode))
			return false;
		if (scheduleDoctorName == null) {
			if (other.scheduleDoctorName != null)
				return false;
		} else if (!scheduleDoctorName.equals(other.scheduleDoctorName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExamItem [examReqID=" + examReqID + ", itemNO=" + itemNO
				+ ", examClass=" + examClass + ", examClassCode="
				+ examClassCode + ", examSubClass=" + examSubClass
				+ ", examSubClassCode=" + examSubClassCode + ", itemName="
				+ itemName + ", itemCode=" + itemCode + ", scheduleDate="
				+ scheduleDate + ", scheduleDeptCode=" + scheduleDeptCode
				+ ", scheduleDeptName=" + scheduleDeptName
				+ ", scheduleDoctorCode=" + scheduleDoctorCode
				+ ", scheduleDoctorName=" + scheduleDoctorName + "]";
	}

}
