package com.vico.clever.cdr.common.model;

import java.util.Date;

public class HL7EventQueue {
	private int eventId;
	private String messageType;
	private String eventType;
	private String controlCode;
	private Date queueTime;
	private String patientSource;
	private String patientId;
	private String visitId;
	private String eventDataIndex;
	private String eventDataSubIndex;
	private String orderType;
	private String eventHandleStatus;
	private String handleResultDesc;
	private String requestDoctorCode;
	private String requestDoctorName;
	private String requestDeptCode;
	private String requestDeptName;
	private String nurseWorkStationCode;
	private String nurseWorkStationName;
	private int retryTimes;
	private String contentXML;
	private String eventHandleType;
	public HL7EventQueue() {
		super();
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getControlCode() {
		return controlCode;
	}
	public void setControlCode(String controlCode) {
		this.controlCode = controlCode;
	}
	public Date getQueueTime() {
		return queueTime;
	}
	public void setQueueTime(Date queueTime) {
		this.queueTime = queueTime;
	}
	public String getPatientSource() {
		return patientSource;
	}
	public void setPatientSource(String patientSource) {
		this.patientSource = patientSource;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public String getEventDataIndex() {
		return eventDataIndex;
	}
	public void setEventDataIndex(String eventDataIndex) {
		this.eventDataIndex = eventDataIndex;
	}
	public String getEventDataSubIndex() {
		return eventDataSubIndex;
	}
	public void setEventDataSubIndex(String eventDataSubIndex) {
		this.eventDataSubIndex = eventDataSubIndex;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getEventHandleStatus() {
		return eventHandleStatus;
	}
	public void setEventHandleStatus(String eventHandleStatus) {
		this.eventHandleStatus = eventHandleStatus;
	}
	public String getHandleResultDesc() {
		return handleResultDesc;
	}
	public void setHandleResultDesc(String handleResultDesc) {
		this.handleResultDesc = handleResultDesc;
	}
	public String getRequestDoctorCode() {
		return requestDoctorCode;
	}
	public void setRequestDoctorCode(String requestDoctorCode) {
		this.requestDoctorCode = requestDoctorCode;
	}
	public String getRequestDoctorName() {
		return requestDoctorName;
	}
	public void setRequestDoctorName(String requestDoctorName) {
		this.requestDoctorName = requestDoctorName;
	}
	public String getRequestDeptCode() {
		return requestDeptCode;
	}
	public void setRequestDeptCode(String requestDeptCode) {
		this.requestDeptCode = requestDeptCode;
	}
	public String getRequestDeptName() {
		return requestDeptName;
	}
	public void setRequestDeptName(String requestDeptName) {
		this.requestDeptName = requestDeptName;
	}
	public String getNurseWorkStationCode() {
		return nurseWorkStationCode;
	}
	public void setNurseWorkStationCode(String nurseWorkStationCode) {
		this.nurseWorkStationCode = nurseWorkStationCode;
	}
	public String getNurseWorkStationName() {
		return nurseWorkStationName;
	}
	public void setNurseWorkStationName(String nurseWorkStationName) {
		this.nurseWorkStationName = nurseWorkStationName;
	}
	public int getRetryTimes() {
		return retryTimes;
	}
	public void setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
	}
	public String getContentXML() {
		return contentXML;
	}
	public void setContentXML(String contentXML) {
		this.contentXML = contentXML;
	}
	public String getEventHandleType() {
		return eventHandleType;
	}
	public void setEventHandleType(String eventHandleType) {
		this.eventHandleType = eventHandleType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contentXML == null) ? 0 : contentXML.hashCode());
		result = prime * result
				+ ((controlCode == null) ? 0 : controlCode.hashCode());
		result = prime * result
				+ ((eventDataIndex == null) ? 0 : eventDataIndex.hashCode());
		result = prime
				* result
				+ ((eventDataSubIndex == null) ? 0 : eventDataSubIndex
						.hashCode());
		result = prime
				* result
				+ ((eventHandleStatus == null) ? 0 : eventHandleStatus
						.hashCode());
		result = prime * result
				+ ((eventHandleType == null) ? 0 : eventHandleType.hashCode());
		result = prime * result + eventId;
		result = prime * result
				+ ((eventType == null) ? 0 : eventType.hashCode());
		result = prime
				* result
				+ ((handleResultDesc == null) ? 0 : handleResultDesc.hashCode());
		result = prime * result
				+ ((messageType == null) ? 0 : messageType.hashCode());
		result = prime
				* result
				+ ((nurseWorkStationCode == null) ? 0 : nurseWorkStationCode
						.hashCode());
		result = prime
				* result
				+ ((nurseWorkStationName == null) ? 0 : nurseWorkStationName
						.hashCode());
		result = prime * result
				+ ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result
				+ ((patientId == null) ? 0 : patientId.hashCode());
		result = prime * result
				+ ((patientSource == null) ? 0 : patientSource.hashCode());
		result = prime * result
				+ ((queueTime == null) ? 0 : queueTime.hashCode());
		result = prime * result
				+ ((requestDeptCode == null) ? 0 : requestDeptCode.hashCode());
		result = prime * result
				+ ((requestDeptName == null) ? 0 : requestDeptName.hashCode());
		result = prime
				* result
				+ ((requestDoctorCode == null) ? 0 : requestDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((requestDoctorName == null) ? 0 : requestDoctorName
						.hashCode());
		result = prime * result + retryTimes;
		result = prime * result + ((visitId == null) ? 0 : visitId.hashCode());
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
		HL7EventQueue other = (HL7EventQueue) obj;
		if (contentXML == null) {
			if (other.contentXML != null)
				return false;
		} else if (!contentXML.equals(other.contentXML))
			return false;
		if (controlCode == null) {
			if (other.controlCode != null)
				return false;
		} else if (!controlCode.equals(other.controlCode))
			return false;
		if (eventDataIndex == null) {
			if (other.eventDataIndex != null)
				return false;
		} else if (!eventDataIndex.equals(other.eventDataIndex))
			return false;
		if (eventDataSubIndex == null) {
			if (other.eventDataSubIndex != null)
				return false;
		} else if (!eventDataSubIndex.equals(other.eventDataSubIndex))
			return false;
		if (eventHandleStatus == null) {
			if (other.eventHandleStatus != null)
				return false;
		} else if (!eventHandleStatus.equals(other.eventHandleStatus))
			return false;
		if (eventHandleType == null) {
			if (other.eventHandleType != null)
				return false;
		} else if (!eventHandleType.equals(other.eventHandleType))
			return false;
		if (eventId != other.eventId)
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		if (handleResultDesc == null) {
			if (other.handleResultDesc != null)
				return false;
		} else if (!handleResultDesc.equals(other.handleResultDesc))
			return false;
		if (messageType == null) {
			if (other.messageType != null)
				return false;
		} else if (!messageType.equals(other.messageType))
			return false;
		if (nurseWorkStationCode == null) {
			if (other.nurseWorkStationCode != null)
				return false;
		} else if (!nurseWorkStationCode.equals(other.nurseWorkStationCode))
			return false;
		if (nurseWorkStationName == null) {
			if (other.nurseWorkStationName != null)
				return false;
		} else if (!nurseWorkStationName.equals(other.nurseWorkStationName))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		if (patientSource == null) {
			if (other.patientSource != null)
				return false;
		} else if (!patientSource.equals(other.patientSource))
			return false;
		if (queueTime == null) {
			if (other.queueTime != null)
				return false;
		} else if (!queueTime.equals(other.queueTime))
			return false;
		if (requestDeptCode == null) {
			if (other.requestDeptCode != null)
				return false;
		} else if (!requestDeptCode.equals(other.requestDeptCode))
			return false;
		if (requestDeptName == null) {
			if (other.requestDeptName != null)
				return false;
		} else if (!requestDeptName.equals(other.requestDeptName))
			return false;
		if (requestDoctorCode == null) {
			if (other.requestDoctorCode != null)
				return false;
		} else if (!requestDoctorCode.equals(other.requestDoctorCode))
			return false;
		if (requestDoctorName == null) {
			if (other.requestDoctorName != null)
				return false;
		} else if (!requestDoctorName.equals(other.requestDoctorName))
			return false;
		if (retryTimes != other.retryTimes)
			return false;
		if (visitId == null) {
			if (other.visitId != null)
				return false;
		} else if (!visitId.equals(other.visitId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HL7EventQueue [eventId=" + eventId + ", messageType="
				+ messageType + ", eventType=" + eventType + ", controlCode="
				+ controlCode + ", queueTime=" + queueTime + ", patientSource="
				+ patientSource + ", patientId=" + patientId + ", visitId="
				+ visitId + ", eventDataIndex=" + eventDataIndex
				+ ", eventDataSubIndex=" + eventDataSubIndex + ", orderType="
				+ orderType + ", eventHandleStatus=" + eventHandleStatus
				+ ", handleResultDesc=" + handleResultDesc
				+ ", requestDoctorCode=" + requestDoctorCode
				+ ", requestDoctorName=" + requestDoctorName
				+ ", requestDeptCode=" + requestDeptCode + ", requestDeptName="
				+ requestDeptName + ", nurseWorkStationCode="
				+ nurseWorkStationCode + ", nurseWorkStationName="
				+ nurseWorkStationName + ", retryTimes=" + retryTimes
				+ ", contentXML=" + contentXML + ", eventHandleType="
				+ eventHandleType + "]";
	}
}
