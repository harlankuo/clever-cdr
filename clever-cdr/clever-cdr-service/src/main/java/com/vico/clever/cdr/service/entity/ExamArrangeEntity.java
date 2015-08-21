package com.vico.clever.cdr.service.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.ExamItem;
import com.vico.clever.cdr.service.model.ExamStatus;

@XmlRootElement(name = "ExamArrangeEntity")
public class ExamArrangeEntity {
	private List<ExamItem> examItemList;
	private ExamStatus examStatus;

	public ExamArrangeEntity() {
		super();
	}

	public List<ExamItem> getExamItemList() {
		return examItemList;
	}

	public void setExamItemList(List<ExamItem> examItemList) {
		this.examItemList = examItemList;
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
				+ ((examItemList == null) ? 0 : examItemList.hashCode());
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
		ExamArrangeEntity other = (ExamArrangeEntity) obj;
		if (examItemList == null) {
			if (other.examItemList != null)
				return false;
		} else if (!examItemList.equals(other.examItemList))
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
		return "ExamArrangeEntity [examItemList=" + examItemList
				+ ", examStatus=" + examStatus + "]";
	}
}
