package com.vico.clever.cdr.service.model;

import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExamReport")
public class ExamReportInfo {
	private String patentID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱号码
	private String examReqID;// 检查申请号
	private String examID;// 检查号
	private String reportID;// 报告序号(*)
	private Date reportDate;// 报告日期
	private String resultValue;// 检查定量结果
	private String findings;// 检查所见
	private String conclusion;// 检查结论
	private String memo;// 检查报告备注
	private String description;// 检查描述
	private String reportAbsolutePath;// 报告存储绝对路径
	private String reportRelatviePath;// 报告存储相对路径
	private String representationUri;// 报告内容

	public ExamReportInfo() {
		super();
	}

	public ExamReportInfo(String patentID, String visitID, String orderID,
			String examReqID, String examID, String reportID, Date reportDate,
			String resultValue, String findings, String conclusion,
			String memo, String description, String reportAbsolutePath,
			String reportRelatviePath, String representationUri) {
		super();
		this.patentID = patentID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.examReqID = examReqID;
		this.examID = examID;
		this.reportID = reportID;
		this.reportDate = reportDate;
		this.resultValue = resultValue;
		this.findings = findings;
		this.conclusion = conclusion;
		this.memo = memo;
		this.description = description;
		this.reportAbsolutePath = reportAbsolutePath;
		this.reportRelatviePath = reportRelatviePath;
		this.representationUri = representationUri;
	}

	public String getPatentID() {
		return patentID;
	}

	public void setPatentID(String patentID) {
		this.patentID = patentID;
	}

	public String getVisitID() {
		return visitID;
	}

	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getExamReqID() {
		return examReqID;
	}

	public void setExamReqID(String examReqID) {
		this.examReqID = examReqID;
	}

	public String getExamID() {
		return examID;
	}

	public void setExamID(String examID) {
		this.examID = examID;
	}

	public String getReportID() {
		return reportID;
	}

	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getResultValue() {
		return resultValue;
	}

	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReportAbsolutePath() {
		return reportAbsolutePath;
	}

	public void setReportAbsolutePath(String reportAbsolutePath) {
		this.reportAbsolutePath = reportAbsolutePath;
	}

	public String getReportRelatviePath() {
		return reportRelatviePath;
	}

	public void setReportRelatviePath(String reportRelatviePath) {
		this.reportRelatviePath = reportRelatviePath;
	}

	public String getRepresentationUri() {
		return representationUri;
	}

	public void setRepresentationUri(String representationUri) {
		this.representationUri = representationUri;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conclusion == null) ? 0 : conclusion.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((examID == null) ? 0 : examID.hashCode());
		result = prime * result + ((examReqID == null) ? 0 : examReqID.hashCode());
		result = prime * result + ((findings == null) ? 0 : findings.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((patentID == null) ? 0 : patentID.hashCode());
		result = prime * result + ((reportAbsolutePath == null) ? 0 : reportAbsolutePath.hashCode());
		result = prime * result + ((reportDate == null) ? 0 : reportDate.hashCode());
		result = prime * result + ((reportID == null) ? 0 : reportID.hashCode());
		result = prime * result + ((reportRelatviePath == null) ? 0 : reportRelatviePath.hashCode());
		result = prime * result + ((representationUri == null) ? 0 : representationUri.hashCode());
		result = prime * result + ((resultValue == null) ? 0 : resultValue.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
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
		ExamReportInfo other = (ExamReportInfo) obj;
		if (conclusion == null) {
			if (other.conclusion != null)
				return false;
		} else if (!conclusion.equals(other.conclusion))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (examID == null) {
			if (other.examID != null)
				return false;
		} else if (!examID.equals(other.examID))
			return false;
		if (examReqID == null) {
			if (other.examReqID != null)
				return false;
		} else if (!examReqID.equals(other.examReqID))
			return false;
		if (findings == null) {
			if (other.findings != null)
				return false;
		} else if (!findings.equals(other.findings))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (patentID == null) {
			if (other.patentID != null)
				return false;
		} else if (!patentID.equals(other.patentID))
			return false;
		if (reportAbsolutePath == null) {
			if (other.reportAbsolutePath != null)
				return false;
		} else if (!reportAbsolutePath.equals(other.reportAbsolutePath))
			return false;
		if (reportDate == null) {
			if (other.reportDate != null)
				return false;
		} else if (!reportDate.equals(other.reportDate))
			return false;
		if (reportID == null) {
			if (other.reportID != null)
				return false;
		} else if (!reportID.equals(other.reportID))
			return false;
		if (reportRelatviePath == null) {
			if (other.reportRelatviePath != null)
				return false;
		} else if (!reportRelatviePath.equals(other.reportRelatviePath))
			return false;
		if (representationUri == null) {
			if (other.representationUri != null)
				return false;
		} else if (!representationUri.equals(other.representationUri))
			return false;
		if (resultValue == null) {
			if (other.resultValue != null)
				return false;
		} else if (!resultValue.equals(other.resultValue))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExamReportInfo [patentID=" + patentID + ", visitID=" + visitID + ", orderID=" + orderID + ", examReqID="
				+ examReqID + ", examID=" + examID + ", reportID=" + reportID + ", reportDate=" + reportDate
				+ ", resultValue=" + resultValue + ", findings=" + findings + ", conclusion=" + conclusion + ", memo="
				+ memo + ", description=" + description + ", reportAbsolutePath=" + reportAbsolutePath
				+ ", reportRelatviePath=" + reportRelatviePath + ", representationUri=" + representationUri + "]";
	}
    

}
