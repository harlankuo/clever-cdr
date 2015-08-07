package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="patientTransferInfo")
public class PatientADTInfo {
	private String guid;
	public String patientID ;//病人号(*)
    public String visitID;//就诊号(*)
    public String orderID;//医嘱ID
    public String sourceDeptCode;//原科室代码
    public String sourceDeptName;//原科室名称
    public String sourceWardCode;//原病区代码
    public String sourceWardName;//原病区名称
    public String sourceBedCode;//原床位编号
    public String sourceBedName;//原床位标签
    public String actionType;//动作类型(*)
    public String destinationDeptCode;//新科室代码
    public String destinationDeptName;//新科室名称
    public String destinationWardCode;//新病区代码
    public String destinationWardName;//新病区名称
    public String destinationBedCode;//床位编号
    public String destinationBedName;//新床位标签
    public Date excuteDateTime;//操作日期及时间
    public String status;//之前状态,0-未入院；1-已入院未入科；2-已入科；3-科室间转出未转入；4-同科室不同病区间转出未转入；5-待出院；6-出院中；7-已出院；8-病历已提交；9-病历被退回；10-病历已归档； 
    public String preResidentDoctorCode;//原住院医师编码
    public String preResidentDoctorName;//原住院医师姓名
    public String preAttendingDoctorCode;//原主治医师编码
    public String preAttendingDoctorName;//原主治医师姓名
    public String preDirectorID;//原主任医师编码
    public String preDirectorName;//原主任医师姓名
    public String preDeputyDoctorID;//原副主任医师编码
    public String preDeputyDoctorName;//原副主任医师姓名
    public String curResidentDoctorCode;//新住院医师编码
    public String curResidentDoctorName;//新住院医师姓名
    public String curAttendingDoctorCode;//新主治医师编码
    public String curAttendingDoctorName;//新主治医师姓名
    public String curDirectorID;//新主任医师编码
    public String curDirectorName;//新主任医师姓名
    public String curDeputyDoctorID;//新副主任医师编码
    public String curDeputyDoctorName;//新副主任医师姓名
    public String memo;//转科备注
    public String performerName;//操作者姓名
    public String performerCode;//操作者工号
	public PatientADTInfo() {
		super();
	}
	public PatientADTInfo(String guid, String patientID, String visitID,
			String orderID, String sourceDeptCode, String sourceDeptName,
			String sourceWardCode, String sourceWardName, String sourceBedCode,
			String sourceBedName, String actionType,
			String destinationDeptCode, String destinationDeptName,
			String destinationWardCode, String destinationWardName,
			String destinationBedCode, String destinationBedName,
			Date excuteDateTime, String status, String preResidentDoctorCode,
			String preResidentDoctorName, String preAttendingDoctorCode,
			String preAttendingDoctorName, String preDirectorID,
			String preDirectorName, String preDeputyDoctorID,
			String preDeputyDoctorName, String curResidentDoctorCode,
			String curResidentDoctorName, String curAttendingDoctorCode,
			String curAttendingDoctorName, String curDirectorID,
			String curDirectorName, String curDeputyDoctorID,
			String curDeputyDoctorName, String memo, String performerName,
			String performerCode) {
		super();
		this.guid = guid;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.sourceDeptCode = sourceDeptCode;
		this.sourceDeptName = sourceDeptName;
		this.sourceWardCode = sourceWardCode;
		this.sourceWardName = sourceWardName;
		this.sourceBedCode = sourceBedCode;
		this.sourceBedName = sourceBedName;
		this.actionType = actionType;
		this.destinationDeptCode = destinationDeptCode;
		this.destinationDeptName = destinationDeptName;
		this.destinationWardCode = destinationWardCode;
		this.destinationWardName = destinationWardName;
		this.destinationBedCode = destinationBedCode;
		this.destinationBedName = destinationBedName;
		this.excuteDateTime = excuteDateTime;
		this.status = status;
		this.preResidentDoctorCode = preResidentDoctorCode;
		this.preResidentDoctorName = preResidentDoctorName;
		this.preAttendingDoctorCode = preAttendingDoctorCode;
		this.preAttendingDoctorName = preAttendingDoctorName;
		this.preDirectorID = preDirectorID;
		this.preDirectorName = preDirectorName;
		this.preDeputyDoctorID = preDeputyDoctorID;
		this.preDeputyDoctorName = preDeputyDoctorName;
		this.curResidentDoctorCode = curResidentDoctorCode;
		this.curResidentDoctorName = curResidentDoctorName;
		this.curAttendingDoctorCode = curAttendingDoctorCode;
		this.curAttendingDoctorName = curAttendingDoctorName;
		this.curDirectorID = curDirectorID;
		this.curDirectorName = curDirectorName;
		this.curDeputyDoctorID = curDeputyDoctorID;
		this.curDeputyDoctorName = curDeputyDoctorName;
		this.memo = memo;
		this.performerName = performerName;
		this.performerCode = performerCode;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
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
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getSourceDeptCode() {
		return sourceDeptCode;
	}
	public void setSourceDeptCode(String sourceDeptCode) {
		this.sourceDeptCode = sourceDeptCode;
	}
	public String getSourceDeptName() {
		return sourceDeptName;
	}
	public void setSourceDeptName(String sourceDeptName) {
		this.sourceDeptName = sourceDeptName;
	}
	public String getSourceWardCode() {
		return sourceWardCode;
	}
	public void setSourceWardCode(String sourceWardCode) {
		this.sourceWardCode = sourceWardCode;
	}
	public String getSourceWardName() {
		return sourceWardName;
	}
	public void setSourceWardName(String sourceWardName) {
		this.sourceWardName = sourceWardName;
	}
	public String getSourceBedCode() {
		return sourceBedCode;
	}
	public void setSourceBedCode(String sourceBedCode) {
		this.sourceBedCode = sourceBedCode;
	}
	public String getSourceBedName() {
		return sourceBedName;
	}
	public void setSourceBedName(String sourceBedName) {
		this.sourceBedName = sourceBedName;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getDestinationDeptCode() {
		return destinationDeptCode;
	}
	public void setDestinationDeptCode(String destinationDeptCode) {
		this.destinationDeptCode = destinationDeptCode;
	}
	public String getDestinationDeptName() {
		return destinationDeptName;
	}
	public void setDestinationDeptName(String destinationDeptName) {
		this.destinationDeptName = destinationDeptName;
	}
	public String getDestinationWardCode() {
		return destinationWardCode;
	}
	public void setDestinationWardCode(String destinationWardCode) {
		this.destinationWardCode = destinationWardCode;
	}
	public String getDestinationWardName() {
		return destinationWardName;
	}
	public void setDestinationWardName(String destinationWardName) {
		this.destinationWardName = destinationWardName;
	}
	public String getDestinationBedCode() {
		return destinationBedCode;
	}
	public void setDestinationBedCode(String destinationBedCode) {
		this.destinationBedCode = destinationBedCode;
	}
	public String getDestinationBedName() {
		return destinationBedName;
	}
	public void setDestinationBedName(String destinationBedName) {
		this.destinationBedName = destinationBedName;
	}
	public Date getExcuteDateTime() {
		return excuteDateTime;
	}
	public void setExcuteDateTime(Date excuteDateTime) {
		this.excuteDateTime = excuteDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPreResidentDoctorCode() {
		return preResidentDoctorCode;
	}
	public void setPreResidentDoctorCode(String preResidentDoctorCode) {
		this.preResidentDoctorCode = preResidentDoctorCode;
	}
	public String getPreResidentDoctorName() {
		return preResidentDoctorName;
	}
	public void setPreResidentDoctorName(String preResidentDoctorName) {
		this.preResidentDoctorName = preResidentDoctorName;
	}
	public String getPreAttendingDoctorCode() {
		return preAttendingDoctorCode;
	}
	public void setPreAttendingDoctorCode(String preAttendingDoctorCode) {
		this.preAttendingDoctorCode = preAttendingDoctorCode;
	}
	public String getPreAttendingDoctorName() {
		return preAttendingDoctorName;
	}
	public void setPreAttendingDoctorName(String preAttendingDoctorName) {
		this.preAttendingDoctorName = preAttendingDoctorName;
	}
	public String getPreDirectorID() {
		return preDirectorID;
	}
	public void setPreDirectorID(String preDirectorID) {
		this.preDirectorID = preDirectorID;
	}
	public String getPreDirectorName() {
		return preDirectorName;
	}
	public void setPreDirectorName(String preDirectorName) {
		this.preDirectorName = preDirectorName;
	}
	public String getPreDeputyDoctorID() {
		return preDeputyDoctorID;
	}
	public void setPreDeputyDoctorID(String preDeputyDoctorID) {
		this.preDeputyDoctorID = preDeputyDoctorID;
	}
	public String getPreDeputyDoctorName() {
		return preDeputyDoctorName;
	}
	public void setPreDeputyDoctorName(String preDeputyDoctorName) {
		this.preDeputyDoctorName = preDeputyDoctorName;
	}
	public String getCurResidentDoctorCode() {
		return curResidentDoctorCode;
	}
	public void setCurResidentDoctorCode(String curResidentDoctorCode) {
		this.curResidentDoctorCode = curResidentDoctorCode;
	}
	public String getCurResidentDoctorName() {
		return curResidentDoctorName;
	}
	public void setCurResidentDoctorName(String curResidentDoctorName) {
		this.curResidentDoctorName = curResidentDoctorName;
	}
	public String getCurAttendingDoctorCode() {
		return curAttendingDoctorCode;
	}
	public void setCurAttendingDoctorCode(String curAttendingDoctorCode) {
		this.curAttendingDoctorCode = curAttendingDoctorCode;
	}
	public String getCurAttendingDoctorName() {
		return curAttendingDoctorName;
	}
	public void setCurAttendingDoctorName(String curAttendingDoctorName) {
		this.curAttendingDoctorName = curAttendingDoctorName;
	}
	public String getCurDirectorID() {
		return curDirectorID;
	}
	public void setCurDirectorID(String curDirectorID) {
		this.curDirectorID = curDirectorID;
	}
	public String getCurDirectorName() {
		return curDirectorName;
	}
	public void setCurDirectorName(String curDirectorName) {
		this.curDirectorName = curDirectorName;
	}
	public String getCurDeputyDoctorID() {
		return curDeputyDoctorID;
	}
	public void setCurDeputyDoctorID(String curDeputyDoctorID) {
		this.curDeputyDoctorID = curDeputyDoctorID;
	}
	public String getCurDeputyDoctorName() {
		return curDeputyDoctorName;
	}
	public void setCurDeputyDoctorName(String curDeputyDoctorName) {
		this.curDeputyDoctorName = curDeputyDoctorName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getPerformerName() {
		return performerName;
	}
	public void setPerformerName(String performerName) {
		this.performerName = performerName;
	}
	public String getPerformerCode() {
		return performerCode;
	}
	public void setPerformerCode(String performerCode) {
		this.performerCode = performerCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actionType == null) ? 0 : actionType.hashCode());
		result = prime
				* result
				+ ((curAttendingDoctorCode == null) ? 0
						: curAttendingDoctorCode.hashCode());
		result = prime
				* result
				+ ((curAttendingDoctorName == null) ? 0
						: curAttendingDoctorName.hashCode());
		result = prime
				* result
				+ ((curDeputyDoctorID == null) ? 0 : curDeputyDoctorID
						.hashCode());
		result = prime
				* result
				+ ((curDeputyDoctorName == null) ? 0 : curDeputyDoctorName
						.hashCode());
		result = prime * result
				+ ((curDirectorID == null) ? 0 : curDirectorID.hashCode());
		result = prime * result
				+ ((curDirectorName == null) ? 0 : curDirectorName.hashCode());
		result = prime
				* result
				+ ((curResidentDoctorCode == null) ? 0 : curResidentDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((curResidentDoctorName == null) ? 0 : curResidentDoctorName
						.hashCode());
		result = prime
				* result
				+ ((destinationBedCode == null) ? 0 : destinationBedCode
						.hashCode());
		result = prime
				* result
				+ ((destinationBedName == null) ? 0 : destinationBedName
						.hashCode());
		result = prime
				* result
				+ ((destinationDeptCode == null) ? 0 : destinationDeptCode
						.hashCode());
		result = prime
				* result
				+ ((destinationDeptName == null) ? 0 : destinationDeptName
						.hashCode());
		result = prime
				* result
				+ ((destinationWardCode == null) ? 0 : destinationWardCode
						.hashCode());
		result = prime
				* result
				+ ((destinationWardName == null) ? 0 : destinationWardName
						.hashCode());
		result = prime * result
				+ ((excuteDateTime == null) ? 0 : excuteDateTime.hashCode());
		result = prime * result + ((guid == null) ? 0 : guid.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((performerCode == null) ? 0 : performerCode.hashCode());
		result = prime * result
				+ ((performerName == null) ? 0 : performerName.hashCode());
		result = prime
				* result
				+ ((preAttendingDoctorCode == null) ? 0
						: preAttendingDoctorCode.hashCode());
		result = prime
				* result
				+ ((preAttendingDoctorName == null) ? 0
						: preAttendingDoctorName.hashCode());
		result = prime
				* result
				+ ((preDeputyDoctorID == null) ? 0 : preDeputyDoctorID
						.hashCode());
		result = prime
				* result
				+ ((preDeputyDoctorName == null) ? 0 : preDeputyDoctorName
						.hashCode());
		result = prime * result
				+ ((preDirectorID == null) ? 0 : preDirectorID.hashCode());
		result = prime * result
				+ ((preDirectorName == null) ? 0 : preDirectorName.hashCode());
		result = prime
				* result
				+ ((preResidentDoctorCode == null) ? 0 : preResidentDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((preResidentDoctorName == null) ? 0 : preResidentDoctorName
						.hashCode());
		result = prime * result
				+ ((sourceBedCode == null) ? 0 : sourceBedCode.hashCode());
		result = prime * result
				+ ((sourceBedName == null) ? 0 : sourceBedName.hashCode());
		result = prime * result
				+ ((sourceDeptCode == null) ? 0 : sourceDeptCode.hashCode());
		result = prime * result
				+ ((sourceDeptName == null) ? 0 : sourceDeptName.hashCode());
		result = prime * result
				+ ((sourceWardCode == null) ? 0 : sourceWardCode.hashCode());
		result = prime * result
				+ ((sourceWardName == null) ? 0 : sourceWardName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		PatientADTInfo other = (PatientADTInfo) obj;
		if (actionType == null) {
			if (other.actionType != null)
				return false;
		} else if (!actionType.equals(other.actionType))
			return false;
		if (curAttendingDoctorCode == null) {
			if (other.curAttendingDoctorCode != null)
				return false;
		} else if (!curAttendingDoctorCode.equals(other.curAttendingDoctorCode))
			return false;
		if (curAttendingDoctorName == null) {
			if (other.curAttendingDoctorName != null)
				return false;
		} else if (!curAttendingDoctorName.equals(other.curAttendingDoctorName))
			return false;
		if (curDeputyDoctorID == null) {
			if (other.curDeputyDoctorID != null)
				return false;
		} else if (!curDeputyDoctorID.equals(other.curDeputyDoctorID))
			return false;
		if (curDeputyDoctorName == null) {
			if (other.curDeputyDoctorName != null)
				return false;
		} else if (!curDeputyDoctorName.equals(other.curDeputyDoctorName))
			return false;
		if (curDirectorID == null) {
			if (other.curDirectorID != null)
				return false;
		} else if (!curDirectorID.equals(other.curDirectorID))
			return false;
		if (curDirectorName == null) {
			if (other.curDirectorName != null)
				return false;
		} else if (!curDirectorName.equals(other.curDirectorName))
			return false;
		if (curResidentDoctorCode == null) {
			if (other.curResidentDoctorCode != null)
				return false;
		} else if (!curResidentDoctorCode.equals(other.curResidentDoctorCode))
			return false;
		if (curResidentDoctorName == null) {
			if (other.curResidentDoctorName != null)
				return false;
		} else if (!curResidentDoctorName.equals(other.curResidentDoctorName))
			return false;
		if (destinationBedCode == null) {
			if (other.destinationBedCode != null)
				return false;
		} else if (!destinationBedCode.equals(other.destinationBedCode))
			return false;
		if (destinationBedName == null) {
			if (other.destinationBedName != null)
				return false;
		} else if (!destinationBedName.equals(other.destinationBedName))
			return false;
		if (destinationDeptCode == null) {
			if (other.destinationDeptCode != null)
				return false;
		} else if (!destinationDeptCode.equals(other.destinationDeptCode))
			return false;
		if (destinationDeptName == null) {
			if (other.destinationDeptName != null)
				return false;
		} else if (!destinationDeptName.equals(other.destinationDeptName))
			return false;
		if (destinationWardCode == null) {
			if (other.destinationWardCode != null)
				return false;
		} else if (!destinationWardCode.equals(other.destinationWardCode))
			return false;
		if (destinationWardName == null) {
			if (other.destinationWardName != null)
				return false;
		} else if (!destinationWardName.equals(other.destinationWardName))
			return false;
		if (excuteDateTime == null) {
			if (other.excuteDateTime != null)
				return false;
		} else if (!excuteDateTime.equals(other.excuteDateTime))
			return false;
		if (guid == null) {
			if (other.guid != null)
				return false;
		} else if (!guid.equals(other.guid))
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
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (performerCode == null) {
			if (other.performerCode != null)
				return false;
		} else if (!performerCode.equals(other.performerCode))
			return false;
		if (performerName == null) {
			if (other.performerName != null)
				return false;
		} else if (!performerName.equals(other.performerName))
			return false;
		if (preAttendingDoctorCode == null) {
			if (other.preAttendingDoctorCode != null)
				return false;
		} else if (!preAttendingDoctorCode.equals(other.preAttendingDoctorCode))
			return false;
		if (preAttendingDoctorName == null) {
			if (other.preAttendingDoctorName != null)
				return false;
		} else if (!preAttendingDoctorName.equals(other.preAttendingDoctorName))
			return false;
		if (preDeputyDoctorID == null) {
			if (other.preDeputyDoctorID != null)
				return false;
		} else if (!preDeputyDoctorID.equals(other.preDeputyDoctorID))
			return false;
		if (preDeputyDoctorName == null) {
			if (other.preDeputyDoctorName != null)
				return false;
		} else if (!preDeputyDoctorName.equals(other.preDeputyDoctorName))
			return false;
		if (preDirectorID == null) {
			if (other.preDirectorID != null)
				return false;
		} else if (!preDirectorID.equals(other.preDirectorID))
			return false;
		if (preDirectorName == null) {
			if (other.preDirectorName != null)
				return false;
		} else if (!preDirectorName.equals(other.preDirectorName))
			return false;
		if (preResidentDoctorCode == null) {
			if (other.preResidentDoctorCode != null)
				return false;
		} else if (!preResidentDoctorCode.equals(other.preResidentDoctorCode))
			return false;
		if (preResidentDoctorName == null) {
			if (other.preResidentDoctorName != null)
				return false;
		} else if (!preResidentDoctorName.equals(other.preResidentDoctorName))
			return false;
		if (sourceBedCode == null) {
			if (other.sourceBedCode != null)
				return false;
		} else if (!sourceBedCode.equals(other.sourceBedCode))
			return false;
		if (sourceBedName == null) {
			if (other.sourceBedName != null)
				return false;
		} else if (!sourceBedName.equals(other.sourceBedName))
			return false;
		if (sourceDeptCode == null) {
			if (other.sourceDeptCode != null)
				return false;
		} else if (!sourceDeptCode.equals(other.sourceDeptCode))
			return false;
		if (sourceDeptName == null) {
			if (other.sourceDeptName != null)
				return false;
		} else if (!sourceDeptName.equals(other.sourceDeptName))
			return false;
		if (sourceWardCode == null) {
			if (other.sourceWardCode != null)
				return false;
		} else if (!sourceWardCode.equals(other.sourceWardCode))
			return false;
		if (sourceWardName == null) {
			if (other.sourceWardName != null)
				return false;
		} else if (!sourceWardName.equals(other.sourceWardName))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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
		return "PatientADTInfo [guid=" + guid + ", patientID=" + patientID
				+ ", visitID=" + visitID + ", orderID=" + orderID
				+ ", sourceDeptCode=" + sourceDeptCode + ", sourceDeptName="
				+ sourceDeptName + ", sourceWardCode=" + sourceWardCode
				+ ", sourceWardName=" + sourceWardName + ", sourceBedCode="
				+ sourceBedCode + ", sourceBedName=" + sourceBedName
				+ ", actionType=" + actionType + ", destinationDeptCode="
				+ destinationDeptCode + ", destinationDeptName="
				+ destinationDeptName + ", destinationWardCode="
				+ destinationWardCode + ", destinationWardName="
				+ destinationWardName + ", destinationBedCode="
				+ destinationBedCode + ", destinationBedName="
				+ destinationBedName + ", excuteDateTime=" + excuteDateTime
				+ ", status=" + status + ", preResidentDoctorCode="
				+ preResidentDoctorCode + ", preResidentDoctorName="
				+ preResidentDoctorName + ", preAttendingDoctorCode="
				+ preAttendingDoctorCode + ", preAttendingDoctorName="
				+ preAttendingDoctorName + ", preDirectorID=" + preDirectorID
				+ ", preDirectorName=" + preDirectorName
				+ ", preDeputyDoctorID=" + preDeputyDoctorID
				+ ", preDeputyDoctorName=" + preDeputyDoctorName
				+ ", curResidentDoctorCode=" + curResidentDoctorCode
				+ ", curResidentDoctorName=" + curResidentDoctorName
				+ ", curAttendingDoctorCode=" + curAttendingDoctorCode
				+ ", curAttendingDoctorName=" + curAttendingDoctorName
				+ ", curDirectorID=" + curDirectorID + ", curDirectorName="
				+ curDirectorName + ", curDeputyDoctorID=" + curDeputyDoctorID
				+ ", curDeputyDoctorName=" + curDeputyDoctorName + ", memo="
				+ memo + ", performerName=" + performerName
				+ ", performerCode=" + performerCode + "]";
	}
	
}
