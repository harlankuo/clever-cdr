package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.ExamReportInfo;
import com.vico.clever.cdr.service.model.ExamStatus;
@XmlRootElement(name="ExamReportEntity")
public class ExamReportEntity {
	private ExamReportInfo  examReportInfo;
	private ExamStatus examStatus;
	public ExamReportEntity() {
		super();
	}
	public ExamReportEntity(ExamReportInfo examReportInfo, ExamStatus examStatus) {
		super();
		this.examReportInfo = examReportInfo;
		this.examStatus = examStatus;
	}
	public ExamReportInfo getExamReportInfo() {
		return examReportInfo;
	}
	public void setExamReportInfo(ExamReportInfo examReportInfo) {
		this.examReportInfo = examReportInfo;
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
				+ ((examReportInfo == null) ? 0 : examReportInfo.hashCode());
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
		ExamReportEntity other = (ExamReportEntity) obj;
		if (examReportInfo == null) {
			if (other.examReportInfo != null)
				return false;
		} else if (!examReportInfo.equals(other.examReportInfo))
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
		StringBuilder builder = new StringBuilder();
		builder.append("ExamReportEntity [examReportInfo=")
				.append(examReportInfo).append(", examStatus=")
				.append(examStatus).append("]");
		return builder.toString();
	}
}
