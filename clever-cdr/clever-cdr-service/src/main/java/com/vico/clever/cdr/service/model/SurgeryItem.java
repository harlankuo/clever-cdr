package com.vico.clever.cdr.service.model;

public class SurgeryItem {
	private String surgeryReqID;//手术申请号(*)
	private String operationCode;//手术操作代码
	private String operationName;//手术操作名称,手术名称
	private String locationName;//手术及操作目标部位名称
	private String locationCode;//手术及操作目标部位代码
	private String levelOfIncisionName;//手术切口等级
	private String levelOfIncisionCode;//手术切口等级代码
	private String operationLevelName;//手术级别名称
	private String operationLevelCode;//手术级别代码
	private String operationNO;//手术序号
	private String operationSerialNumberCode;//手术序号代码
	private String operationSerialNumberName;//手术序号名称
	public String getSurgeryReqID() {
		return surgeryReqID;
	}
	public void setSurgeryReqID(String surgeryReqID) {
		this.surgeryReqID = surgeryReqID;
	}
	public String getOperationCode() {
		return operationCode;
	}
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLevelOfIncisionName() {
		return levelOfIncisionName;
	}
	public void setLevelOfIncisionName(String levelOfIncisionName) {
		this.levelOfIncisionName = levelOfIncisionName;
	}
	public String getLevelOfIncisionCode() {
		return levelOfIncisionCode;
	}
	public void setLevelOfIncisionCode(String levelOfIncisionCode) {
		this.levelOfIncisionCode = levelOfIncisionCode;
	}
	public String getOperationLevelName() {
		return operationLevelName;
	}
	public void setOperationLevelName(String operationLevelName) {
		this.operationLevelName = operationLevelName;
	}
	public String getOperationLevelCode() {
		return operationLevelCode;
	}
	public void setOperationLevelCode(String operationLevelCode) {
		this.operationLevelCode = operationLevelCode;
	}
	public String getOperationNO() {
		return operationNO;
	}
	public void setOperationNO(String operationNO) {
		this.operationNO = operationNO;
	}
	public String getOperationSerialNumberCode() {
		return operationSerialNumberCode;
	}
	public void setOperationSerialNumberCode(String operationSerialNumberCode) {
		this.operationSerialNumberCode = operationSerialNumberCode;
	}
	public String getOperationSerialNumberName() {
		return operationSerialNumberName;
	}
	public void setOperationSerialNumberName(String operationSerialNumberName) {
		this.operationSerialNumberName = operationSerialNumberName;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = result*31 + (surgeryReqID==null?0:surgeryReqID.hashCode());
		result = result*31 + (operationCode==null?0:operationCode.hashCode());
		result = result*31 + (operationName==null?0:operationName.hashCode());
		result = result*31 + (locationName==null?0:locationName.hashCode());
		result = result*31 + (locationCode==null?0:locationCode.hashCode());
		result = result*31 + (levelOfIncisionName==null?0:levelOfIncisionName.hashCode());
		result = result*31 + (levelOfIncisionCode==null?0:levelOfIncisionCode.hashCode());
		result = result*31 + (operationLevelName==null?0:operationLevelName.hashCode());
		result = result*31 + (operationLevelCode==null?0:operationLevelCode.hashCode());
		result = result*31 + (operationNO==null?0:operationNO.hashCode());
		result = result*31 + (operationSerialNumberCode==null?0:operationSerialNumberCode.hashCode());
		result = result*31 + (operationSerialNumberName==null?0:operationSerialNumberName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode()) return false;
		if (this==null||obj==null) return false;
		if (this.getClass()!=obj.getClass()) return false;
		if (this==obj) return true;
		
		SurgeryItem surgeryItemObj = (SurgeryItem) obj;
		if (surgeryReqID!=null) {
			if (!(surgeryReqID.equals(surgeryItemObj.surgeryReqID))) return false;
		}
		else {
			if (surgeryItemObj.surgeryReqID!=null) 
				return false;
		}
		if (operationCode!=null) {
			if (!(operationCode.equals(surgeryItemObj.operationCode))) return false;
		}
		else {
			if (surgeryItemObj.operationCode!=null) 
				return false;
		}
		if (operationName!=null) {
			if (!(operationName.equals(surgeryItemObj.operationName))) return false;
		}
		else {
			if (surgeryItemObj.operationName!=null) 
				return false;
		}
		if (locationName!=null) {
			if (!(locationName.equals(surgeryItemObj.locationName))) return false;
		}
		else {
			if (surgeryItemObj.locationName!=null) 
				return false;
		}
		if (locationCode!=null) {
			if (!(locationCode.equals(surgeryItemObj.locationCode))) return false;
		}
		else {
			if (surgeryItemObj.locationCode!=null) 
				return false;
		}
		if (levelOfIncisionName!=null) {
			if (!(levelOfIncisionName.equals(surgeryItemObj.levelOfIncisionName))) return false;
		}
		else {
			if (surgeryItemObj.levelOfIncisionName!=null) 
				return false;
		}
		if (levelOfIncisionCode!=null) {
			if (!(levelOfIncisionCode.equals(surgeryItemObj.levelOfIncisionCode))) return false;
		}
		else {
			if (surgeryItemObj.levelOfIncisionCode!=null) 
				return false;
		}
		if (operationLevelName!=null) {
			if (!(operationLevelName.equals(surgeryItemObj.operationLevelName))) return false;
		}
		else {
			if (surgeryItemObj.operationLevelName!=null) 
				return false;
		}
		if (operationLevelCode!=null) {
			if (!(operationLevelCode.equals(surgeryItemObj.operationLevelCode))) return false;
		}
		else {
			if (surgeryItemObj.operationLevelCode!=null) 
				return false;
		}
		if (operationNO!=null) {
			if (!(operationNO.equals(surgeryItemObj.operationNO))) return false;
		}
		else {
			if (surgeryItemObj.operationNO!=null) 
				return false;
		}
		if (operationSerialNumberCode!=null) {
			if (!(operationSerialNumberCode.equals(surgeryItemObj.operationSerialNumberCode))) return false;
		}
		else {
			if (surgeryItemObj.operationSerialNumberCode!=null) 
				return false;
		}
		if (operationSerialNumberName!=null) {
			if (!(operationSerialNumberName.equals(surgeryItemObj.operationSerialNumberName))) return false;
		}
		else {
			if (surgeryItemObj.operationSerialNumberName!=null) 
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuffer surgeryItemBuffer = new StringBuffer();
		surgeryItemBuffer.append("{\"surgeryReqID\":\"").append(surgeryReqID).append("\",")
			.append("\"operationCode\":\"").append(operationCode).append("\",")
			.append("\"operationName\":\"").append(operationName).append("\",")
			.append("\"locationName\":\"").append(locationName).append("\",")
			.append("\"locationCode\":\"").append(locationCode).append("\",")
			.append("\"levelOfIncisionName\":\"").append(levelOfIncisionName).append("\",")
			.append("\"levelOfIncisionCode\":\"").append(levelOfIncisionCode).append("\",")
			.append("\"operationLevelName\":\"").append(operationLevelName).append("\",")
			.append("\"operationLevelCode\":\"").append(operationLevelCode).append("\",")
			.append("\"operationNO\":\"").append(operationNO).append("\",")
			.append("\"operationSerialNumberCode\":\"").append(operationSerialNumberCode).append("\",")
			.append("\"operationSerialNumberName\":\"").append(operationSerialNumberName).append("\"}");
		return surgeryItemBuffer.toString();
	}
}
