package com.vico.clever.cdr.service.model;

import java.util.Date;

public class PhysicalSign {
	private String recordID;//体征记录表主键(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private Date timePoint;//体征数值对应时间点
	private String vitalItem;//体征项
	private String value;//体征值
	private String unit;//体征值的单位
	private String recorderCode;//记录者代码
	private String recorderName;//记录者姓名
	private Date recordDatetime;//记录的日期时间
	private String measuringMode;//测量方式
	private String memo;//备注
	
	public PhysicalSign() {
		super();
	}
	
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
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
	public Date getTimePoint() {
		return timePoint;
	}
	public void setTimePoint(Date timePoint) {
		this.timePoint = timePoint;
	}
	public String getVitalItem() {
		return vitalItem;
	}
	public void setVitalItem(String vitalItem) {
		this.vitalItem = vitalItem;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getRecorderCode() {
		return recorderCode;
	}
	public void setRecorderCode(String recorderCode) {
		this.recorderCode = recorderCode;
	}
	public String getRecorderName() {
		return recorderName;
	}
	public void setRecorderName(String recorderName) {
		this.recorderName = recorderName;
	}
	public Date getRecordDatetime() {
		return recordDatetime;
	}
	public void setRecordDatetime(Date recordDatetime) {
		this.recordDatetime = recordDatetime;
	}
	public String getMeasuringMode() {
		return measuringMode;
	}
	public void setMeasuringMode(String measuringMode) {
		this.measuringMode = measuringMode;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = result*31 + (recordID==null?0:recordID.hashCode());
		result = result*31 + (patientID==null?0:patientID.hashCode());
		result = result*31 + (visitID==null?0:visitID.hashCode());
		result = result*31 + (timePoint==null?0:timePoint.hashCode());
		result = result*31 + (vitalItem==null?0:vitalItem.hashCode());
		result = result*31 + (value==null?0:value.hashCode());
		result = result*31 + (unit==null?0:unit.hashCode());
		result = result*31 + (recorderCode==null?0:recorderCode.hashCode());
		result = result*31 + (recorderName==null?0:recorderName.hashCode());
		result = result*31 + (recordDatetime==null?0:recordDatetime.hashCode());
		result = result*31 + (measuringMode==null?0:measuringMode.hashCode());
		result = result*31 + (memo==null?0:memo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode()) return false;
		if (this==null||obj==null) return false;
		if (this.getClass()!=obj.getClass()) return false;
		if (this==obj) return true;
		
		PhysicalSign physicalSign = (PhysicalSign) obj;
		if (recordID!=null) {
			if (!(recordID.equals(physicalSign.recordID))) return false;
		}
		else {
			if (physicalSign.recordID!=null) 
				return false;
		}
		if (patientID!=null) {
			if (!(patientID.equals(physicalSign.patientID))) return false;
		}
		else {
			if (physicalSign.patientID!=null) 
				return false;
		}
		if (visitID!=null) {
			if (!(visitID.equals(physicalSign.visitID))) return false;
		}
		else {
			if (physicalSign.visitID!=null) 
				return false;
		}
		if (timePoint!=null) {
			if (!(timePoint.equals(physicalSign.timePoint))) return false;
		}
		else {
			if (physicalSign.timePoint!=null) 
				return false;
		}
		if (vitalItem!=null) {
			if (!(vitalItem.equals(physicalSign.vitalItem))) return false;
		}
		else {
			if (physicalSign.vitalItem!=null) 
				return false;
		}
		if (value!=null) {
			if (!(value.equals(physicalSign.value))) return false;
		}
		else {
			if (physicalSign.value!=null) 
				return false;
		}
		if (unit!=null) {
			if (!(unit.equals(physicalSign.unit))) return false;
		}
		else {
			if (physicalSign.unit!=null) 
				return false;
		}
		if (recorderCode!=null) {
			if (!(recorderCode.equals(physicalSign.recorderCode))) return false;
		}
		else {
			if (physicalSign.recorderCode!=null) 
				return false;
		}
		if (recorderName!=null) {
			if (!(recorderName.equals(physicalSign.recorderName))) return false;
		}
		else {
			if (physicalSign.recorderName!=null) 
				return false;
		}
		if (recordDatetime!=null) {
			if (!(recordDatetime.equals(physicalSign.recordDatetime))) return false;
		}
		else {
			if (physicalSign.recordDatetime!=null) 
				return false;
		}
		if (measuringMode!=null) {
			if (!(measuringMode.equals(physicalSign.measuringMode))) return false;
		}
		else {
			if (physicalSign.measuringMode!=null) 
				return false;
		}
		if (memo!=null) {
			if (!(memo.equals(physicalSign.memo))) return false;
		}
		else {
			if (physicalSign.memo!=null) 
				return false;
		}
		
		return true;
	}
	@Override
	public String toString() {
		StringBuffer physicalSignBuffer = new StringBuffer();
		physicalSignBuffer.append("{\"recordID\":\"").append(recordID).append("\",")
			.append("\"patientID\":\"").append(patientID).append("\",")
			.append("\"visitID\":\"").append(visitID).append("\",")
			.append("\"timePoint\":\"").append(timePoint).append("\",")
			.append("\"vitalItem\":\"").append(vitalItem).append("\",")
			.append("\"value\":\"").append(value).append("\",")
			.append("\"unit\":\"").append(unit).append("\",")
			.append("\"recorderCode\":\"").append(recorderCode).append("\",")
			.append("\"recorderName\":\"").append(recorderName).append("\",")
			.append("\"recordDatetime\":\"").append(recordDatetime).append("\",")
			.append("\"measuringMode\":\"").append(measuringMode).append("\",")
			.append("\"memo\":\"").append(memo).append("\"}");
		return physicalSignBuffer.toString();
	}
}
