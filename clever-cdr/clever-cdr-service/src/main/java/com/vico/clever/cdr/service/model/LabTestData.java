package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="LabTestData")
public class LabTestData {
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String testReqID;//检验申请号(*)
	private String reportID;//检验报告号
	private String deviceID;//检验设备号
	private String itemNO;//项目序号
	private String itemCode;//项目代码
	private String itemName;//项目名称
	private Date executeDate;//检验日期时间
	private String result;//项目结果值
	private String resultUnit;//项目结果单位
	private String normallIndicator;//项目结果正常标志,N-正常 L-低 H-高
	private String referenceValue;//正常参考值
	private Date resultDate;//检验报告日期及时间
	private String overallInterpretation;//检验报告结果
	private String receiverDoctorID;//检验医师代码
	private String receiverDoctorName;//检验医师名称
	private String reporterID;//报告医师代码
	private String reporterName;//报告医师姓名
	private String auditingPhysicianID;//审核医师代码
	private String auditingPhysicianName;//审核医师姓名
	private String receiverDeptID;//报告科室代码
	private String receiverDeptName;//报告科室名称
	private String memo;//报告备注
	public LabTestData() {
		super();
	}
	public LabTestData(String patientID, String visitID, String testReqID,
			String reportID, String deviceID, String itemNO, String itemCode,
			String itemName, Date executeDate, String result,
			String resultUnit, String normallIndicator, String referenceValue,
			Date resultDate, String overallInterpretation,
			String receiverDoctorID, String receiverDoctorName,
			String reporterID, String reporterName, String auditingPhysicianID,
			String auditingPhysicianName, String receiverDeptID,
			String receiverDeptName, String memo) {
		super();
		this.patientID = patientID;
		this.visitID = visitID;
		this.testReqID = testReqID;
		this.reportID = reportID;
		this.deviceID = deviceID;
		this.itemNO = itemNO;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.executeDate = executeDate;
		this.result = result;
		this.resultUnit = resultUnit;
		this.normallIndicator = normallIndicator;
		this.referenceValue = referenceValue;
		this.resultDate = resultDate;
		this.overallInterpretation = overallInterpretation;
		this.receiverDoctorID = receiverDoctorID;
		this.receiverDoctorName = receiverDoctorName;
		this.reporterID = reporterID;
		this.reporterName = reporterName;
		this.auditingPhysicianID = auditingPhysicianID;
		this.auditingPhysicianName = auditingPhysicianName;
		this.receiverDeptID = receiverDeptID;
		this.receiverDeptName = receiverDeptName;
		this.memo = memo;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getVisitID() {
		return visitID;
	}
	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}
	public String getTestReqID() {
		return testReqID;
	}
	public void setTestReqID(String testReqID) {
		this.testReqID = testReqID;
	}
	public String getReportID() {
		return reportID;
	}
	public void setReportID(String reportID) {
		this.reportID = reportID;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getItemNO() {
		return itemNO;
	}
	public void setItemNO(String itemNO) {
		this.itemNO = itemNO;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getExecuteDate() {
		return executeDate;
	}
	public void setExecuteDate(Date executeDate) {
		this.executeDate = executeDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultUnit() {
		return resultUnit;
	}
	public void setResultUnit(String resultUnit) {
		this.resultUnit = resultUnit;
	}
	public String getNormallIndicator() {
		return normallIndicator;
	}
	public void setNormallIndicator(String normallIndicator) {
		this.normallIndicator = normallIndicator;
	}
	public String getReferenceValue() {
		return referenceValue;
	}
	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}
	public Date getResultDate() {
		return resultDate;
	}
	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}
	public String getOverallInterpretation() {
		return overallInterpretation;
	}
	public void setOverallInterpretation(String overallInterpretation) {
		this.overallInterpretation = overallInterpretation;
	}
	public String getReceiverDoctorID() {
		return receiverDoctorID;
	}
	public void setReceiverDoctorID(String receiverDoctorID) {
		this.receiverDoctorID = receiverDoctorID;
	}
	public String getReceiverDoctorName() {
		return receiverDoctorName;
	}
	public void setReceiverDoctorName(String receiverDoctorName) {
		this.receiverDoctorName = receiverDoctorName;
	}
	public String getReporterID() {
		return reporterID;
	}
	public void setReporterID(String reporterID) {
		this.reporterID = reporterID;
	}
	public String getReporterName() {
		return reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	public String getAuditingPhysicianID() {
		return auditingPhysicianID;
	}
	public void setAuditingPhysicianID(String auditingPhysicianID) {
		this.auditingPhysicianID = auditingPhysicianID;
	}
	public String getAuditingPhysicianName() {
		return auditingPhysicianName;
	}
	public void setAuditingPhysicianName(String auditingPhysicianName) {
		this.auditingPhysicianName = auditingPhysicianName;
	}
	public String getReceiverDeptID() {
		return receiverDeptID;
	}
	public void setReceiverDeptID(String receiverDeptID) {
		this.receiverDeptID = receiverDeptID;
	}
	public String getReceiverDeptName() {
		return receiverDeptName;
	}
	public void setReceiverDeptName(String receiverDeptName) {
		this.receiverDeptName = receiverDeptName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((auditingPhysicianID == null) ? 0 : auditingPhysicianID
						.hashCode());
		result = prime
				* result
				+ ((auditingPhysicianName == null) ? 0 : auditingPhysicianName
						.hashCode());
		result = prime * result
				+ ((deviceID == null) ? 0 : deviceID.hashCode());
		result = prime * result
				+ ((executeDate == null) ? 0 : executeDate.hashCode());
		result = prime * result
				+ ((itemCode == null) ? 0 : itemCode.hashCode());
		result = prime * result + ((itemNO == null) ? 0 : itemNO.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime
				* result
				+ ((normallIndicator == null) ? 0 : normallIndicator.hashCode());
		result = prime
				* result
				+ ((overallInterpretation == null) ? 0 : overallInterpretation
						.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((receiverDeptID == null) ? 0 : receiverDeptID.hashCode());
		result = prime
				* result
				+ ((receiverDeptName == null) ? 0 : receiverDeptName.hashCode());
		result = prime
				* result
				+ ((receiverDoctorID == null) ? 0 : receiverDoctorID.hashCode());
		result = prime
				* result
				+ ((receiverDoctorName == null) ? 0 : receiverDoctorName
						.hashCode());
		result = prime * result
				+ ((referenceValue == null) ? 0 : referenceValue.hashCode());
		result = prime * result
				+ ((reportID == null) ? 0 : reportID.hashCode());
		result = prime * result
				+ ((reporterID == null) ? 0 : reporterID.hashCode());
		result = prime * result
				+ ((reporterName == null) ? 0 : reporterName.hashCode());
		result = prime * result
				+ ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result
				+ ((resultDate == null) ? 0 : resultDate.hashCode());
		result = prime * result
				+ ((resultUnit == null) ? 0 : resultUnit.hashCode());
		result = prime * result
				+ ((testReqID == null) ? 0 : testReqID.hashCode());
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
		LabTestData other = (LabTestData) obj;
		if (auditingPhysicianID == null) {
			if (other.auditingPhysicianID != null)
				return false;
		} else if (!auditingPhysicianID.equals(other.auditingPhysicianID))
			return false;
		if (auditingPhysicianName == null) {
			if (other.auditingPhysicianName != null)
				return false;
		} else if (!auditingPhysicianName.equals(other.auditingPhysicianName))
			return false;
		if (deviceID == null) {
			if (other.deviceID != null)
				return false;
		} else if (!deviceID.equals(other.deviceID))
			return false;
		if (executeDate == null) {
			if (other.executeDate != null)
				return false;
		} else if (!executeDate.equals(other.executeDate))
			return false;
		if (itemCode == null) {
			if (other.itemCode != null)
				return false;
		} else if (!itemCode.equals(other.itemCode))
			return false;
		if (itemNO == null) {
			if (other.itemNO != null)
				return false;
		} else if (!itemNO.equals(other.itemNO))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (normallIndicator == null) {
			if (other.normallIndicator != null)
				return false;
		} else if (!normallIndicator.equals(other.normallIndicator))
			return false;
		if (overallInterpretation == null) {
			if (other.overallInterpretation != null)
				return false;
		} else if (!overallInterpretation.equals(other.overallInterpretation))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (receiverDeptID == null) {
			if (other.receiverDeptID != null)
				return false;
		} else if (!receiverDeptID.equals(other.receiverDeptID))
			return false;
		if (receiverDeptName == null) {
			if (other.receiverDeptName != null)
				return false;
		} else if (!receiverDeptName.equals(other.receiverDeptName))
			return false;
		if (receiverDoctorID == null) {
			if (other.receiverDoctorID != null)
				return false;
		} else if (!receiverDoctorID.equals(other.receiverDoctorID))
			return false;
		if (receiverDoctorName == null) {
			if (other.receiverDoctorName != null)
				return false;
		} else if (!receiverDoctorName.equals(other.receiverDoctorName))
			return false;
		if (referenceValue == null) {
			if (other.referenceValue != null)
				return false;
		} else if (!referenceValue.equals(other.referenceValue))
			return false;
		if (reportID == null) {
			if (other.reportID != null)
				return false;
		} else if (!reportID.equals(other.reportID))
			return false;
		if (reporterID == null) {
			if (other.reporterID != null)
				return false;
		} else if (!reporterID.equals(other.reporterID))
			return false;
		if (reporterName == null) {
			if (other.reporterName != null)
				return false;
		} else if (!reporterName.equals(other.reporterName))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (resultDate == null) {
			if (other.resultDate != null)
				return false;
		} else if (!resultDate.equals(other.resultDate))
			return false;
		if (resultUnit == null) {
			if (other.resultUnit != null)
				return false;
		} else if (!resultUnit.equals(other.resultUnit))
			return false;
		if (testReqID == null) {
			if (other.testReqID != null)
				return false;
		} else if (!testReqID.equals(other.testReqID))
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
		StringBuilder builder = new StringBuilder();
		builder.append("LabTestData [patientID=").append(patientID)
				.append(", visitID=").append(visitID).append(", testReqID=")
				.append(testReqID).append(", reportID=").append(reportID)
				.append(", deviceID=").append(deviceID).append(", itemNO=")
				.append(itemNO).append(", itemCode=").append(itemCode)
				.append(", itemName=").append(itemName)
				.append(", executeDate=").append(executeDate)
				.append(", result=").append(result).append(", resultUnit=")
				.append(resultUnit).append(", normallIndicator=")
				.append(normallIndicator).append(", referenceValue=")
				.append(referenceValue).append(", resultDate=")
				.append(resultDate).append(", overallInterpretation=")
				.append(overallInterpretation).append(", receiverDoctorID=")
				.append(receiverDoctorID).append(", receiverDoctorName=")
				.append(receiverDoctorName).append(", reporterID=")
				.append(reporterID).append(", reporterName=")
				.append(reporterName).append(", auditingPhysicianID=")
				.append(auditingPhysicianID).append(", auditingPhysicianName=")
				.append(auditingPhysicianName).append(", receiverDeptID=")
				.append(receiverDeptID).append(", receiverDeptName=")
				.append(receiverDeptName).append(", memo=").append(memo)
				.append("]");
		return builder.toString();
	}
    
}
