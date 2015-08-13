package com.vico.clever.cdr.service.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.ExamDataInfo;
import com.vico.clever.cdr.service.model.ExamStatus;
@XmlRootElement(name="ExamDataEntity")
public class ExamDataEntity {
	private List<ExamDataInfo> examDataList;
	private  ExamStatus examStatus;
	public ExamDataEntity() {
		super();
	}
	public ExamDataEntity(List<ExamDataInfo> examDataList, ExamStatus examStatus) {
		super();
		this.examDataList = examDataList;
		this.examStatus = examStatus;
	}
	public List<ExamDataInfo> getExamDataList() {
		return examDataList;
	}
	public void setExamDataList(List<ExamDataInfo> examDataList) {
		this.examDataList = examDataList;
	}
	public ExamStatus getExamStatus() {
		return examStatus;
	}
	public void setExamStatus(ExamStatus examStatus) {
		this.examStatus = examStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((examDataList == null) ? 0 : examDataList.hashCode());
		result = prime * result
				+ ((examStatus == null) ? 0 : examStatus.hashCode());
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
		ExamDataEntity other = (ExamDataEntity) obj;
		if (examDataList == null) {
			if (other.examDataList != null)
				return false;
		} else if (!examDataList.equals(other.examDataList))
			return false;
		if (examStatus == null) {
			if (other.examStatus != null)
				return false;
		} else if (!examStatus.equals(other.examStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ExamDataEntity [examDataList=" + examDataList + ", examStatus="
				+ examStatus + "]";
	}
}
