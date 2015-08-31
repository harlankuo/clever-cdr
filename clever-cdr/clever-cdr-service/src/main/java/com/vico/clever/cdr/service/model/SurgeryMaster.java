package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryMaster {
	private String surgeryReqID;//手术申请号(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String intervention;//介入物名称
	private String operateApproachCode;//手术及操作方法代码
	private String operateApproachName;//手术及操作方法
	private int numberOfOperation;//手术及操作次数
	private Date startDateTime;//手术开始日期时间
	private Date stopDateTime;//手术结束日期时间
	private String surgicalDoctorOneCode;//第一手术医生代码
	private String surgicalDoctorOneName;//第一手术医生姓名
	private String surgicalDoctorTwoCode;//第二手术医生代码
	private String surgicalDoctorTwoName;//第二手术医生姓名
	private String assistantOperatorOneCode;//手术第一助手代码
	private String assistantOperatorOneName;//手术第一助手姓名
	private String assistantOperatorTwoCode;//手术第二助手代码
	private String assistantOperatorTwoName;//手术第二助手姓名
	private String assistantOperatorThreeCode;//手术第三助手代码
	private String assistantOperatorThreeName;//手术第三助手姓名
	private String assistantOperatorFourCode;//手术第四助手代码
	private String assistantOperatorFourName;//手术第四助手姓名
	private String instrumentNurseOneCode;//器械护士1代码
	private String instrumentNurseOneName;//器械护士1
	private String instrumentNurseTwoCode;//器械护士2代码
	private String instrumentNurseTwoName;//器械护士2
	private String inspectionNurseOneCode;//巡台护士1代码
	private String inspectionNurseOneName;//巡台护士1
	private String inspectionNurseTwoCode;//巡台护士2代码
	private String inspectionNurseTwoName;//巡台护士2
	private String operatingRoomNOCode;//手术间代码
	private String operatingRoomNO;//手术间
	private String operatingRoomCode;//手术室代码
	private String operatingRoom;//手术室
	private String operationTableCode;//手术台代码
	private String operationTable;//手术台
	private int sequence;//台次
	private String operationLevelCode;//手术级别代码
	private String operationLevelName;//手术级别名称
	private String anesthetistApproachCode;//麻醉方法代码
	private String anesthetistApproachName;//麻醉方法名称
	private String anestheistCode;//麻醉医生ID
	private String anestheistName;//麻醉医生姓名
	private String assistantAnestheistOneCode;//麻醉助手ID
	private String assistantAnestheistOneName;//麻醉助手姓名
	private String assistantAnestheistTwoCode;//麻醉助手2ID
	private String assistantAnestheistTwoName;//麻醉助手2姓名
	private String surgicalPositionCode;//手术体位代码
	private String surgicalPositionName;//手术体位
	private String surgicalModeCode;//手术方式代码
	private String surgicalModeName;//手术方式名称
	private String operationSerialNO;//手术序号
	private Date operationDateTime;//手术日期及时间
	public String getSurgeryReqID() {
		return surgeryReqID;
	}
	public void setSurgeryReqID(String surgeryReqID) {
		this.surgeryReqID = surgeryReqID;
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
	public String getIntervention() {
		return intervention;
	}
	public void setIntervention(String intervention) {
		this.intervention = intervention;
	}
	public String getOperateApproachCode() {
		return operateApproachCode;
	}
	public void setOperateApproachCode(String operateApproachCode) {
		this.operateApproachCode = operateApproachCode;
	}
	public String getOperateApproachName() {
		return operateApproachName;
	}
	public void setOperateApproachName(String operateApproachName) {
		this.operateApproachName = operateApproachName;
	}
	public int getNumberOfOperation() {
		return numberOfOperation;
	}
	public void setNumberOfOperation(int numberOfOperation) {
		this.numberOfOperation = numberOfOperation;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getStopDateTime() {
		return stopDateTime;
	}
	public void setStopDateTime(Date stopDateTime) {
		this.stopDateTime = stopDateTime;
	}
	public String getSurgicalDoctorOneCode() {
		return surgicalDoctorOneCode;
	}
	public void setSurgicalDoctorOneCode(String surgicalDoctorOneCode) {
		this.surgicalDoctorOneCode = surgicalDoctorOneCode;
	}
	public String getSurgicalDoctorOneName() {
		return surgicalDoctorOneName;
	}
	public void setSurgicalDoctorOneName(String surgicalDoctorOneName) {
		this.surgicalDoctorOneName = surgicalDoctorOneName;
	}
	public String getSurgicalDoctorTwoCode() {
		return surgicalDoctorTwoCode;
	}
	public void setSurgicalDoctorTwoCode(String surgicalDoctorTwoCode) {
		this.surgicalDoctorTwoCode = surgicalDoctorTwoCode;
	}
	public String getSurgicalDoctorTwoName() {
		return surgicalDoctorTwoName;
	}
	public void setSurgicalDoctorTwoName(String surgicalDoctorTwoName) {
		this.surgicalDoctorTwoName = surgicalDoctorTwoName;
	}
	public String getAssistantOperatorOneCode() {
		return assistantOperatorOneCode;
	}
	public void setAssistantOperatorOneCode(String assistantOperatorOneCode) {
		this.assistantOperatorOneCode = assistantOperatorOneCode;
	}
	public String getAssistantOperatorOneName() {
		return assistantOperatorOneName;
	}
	public void setAssistantOperatorOneName(String assistantOperatorOneName) {
		this.assistantOperatorOneName = assistantOperatorOneName;
	}
	public String getAssistantOperatorTwoCode() {
		return assistantOperatorTwoCode;
	}
	public void setAssistantOperatorTwoCode(String assistantOperatorTwoCode) {
		this.assistantOperatorTwoCode = assistantOperatorTwoCode;
	}
	public String getAssistantOperatorTwoName() {
		return assistantOperatorTwoName;
	}
	public void setAssistantOperatorTwoName(String assistantOperatorTwoName) {
		this.assistantOperatorTwoName = assistantOperatorTwoName;
	}
	public String getAssistantOperatorThreeCode() {
		return assistantOperatorThreeCode;
	}
	public void setAssistantOperatorThreeCode(String assistantOperatorThreeCode) {
		this.assistantOperatorThreeCode = assistantOperatorThreeCode;
	}
	public String getAssistantOperatorThreeName() {
		return assistantOperatorThreeName;
	}
	public void setAssistantOperatorThreeName(String assistantOperatorThreeName) {
		this.assistantOperatorThreeName = assistantOperatorThreeName;
	}
	public String getAssistantOperatorFourCode() {
		return assistantOperatorFourCode;
	}
	public void setAssistantOperatorFourCode(String assistantOperatorFourCode) {
		this.assistantOperatorFourCode = assistantOperatorFourCode;
	}
	public String getAssistantOperatorFourName() {
		return assistantOperatorFourName;
	}
	public void setAssistantOperatorFourName(String assistantOperatorFourName) {
		this.assistantOperatorFourName = assistantOperatorFourName;
	}
	public String getInstrumentNurseOneCode() {
		return instrumentNurseOneCode;
	}
	public void setInstrumentNurseOneCode(String instrumentNurseOneCode) {
		this.instrumentNurseOneCode = instrumentNurseOneCode;
	}
	public String getInstrumentNurseOneName() {
		return instrumentNurseOneName;
	}
	public void setInstrumentNurseOneName(String instrumentNurseOneName) {
		this.instrumentNurseOneName = instrumentNurseOneName;
	}
	public String getInstrumentNurseTwoCode() {
		return instrumentNurseTwoCode;
	}
	public void setInstrumentNurseTwoCode(String instrumentNurseTwoCode) {
		this.instrumentNurseTwoCode = instrumentNurseTwoCode;
	}
	public String getInstrumentNurseTwoName() {
		return instrumentNurseTwoName;
	}
	public void setInstrumentNurseTwoName(String instrumentNurseTwoName) {
		this.instrumentNurseTwoName = instrumentNurseTwoName;
	}
	public String getInspectionNurseOneCode() {
		return inspectionNurseOneCode;
	}
	public void setInspectionNurseOneCode(String inspectionNurseOneCode) {
		this.inspectionNurseOneCode = inspectionNurseOneCode;
	}
	public String getInspectionNurseOneName() {
		return inspectionNurseOneName;
	}
	public void setInspectionNurseOneName(String inspectionNurseOneName) {
		this.inspectionNurseOneName = inspectionNurseOneName;
	}
	public String getInspectionNurseTwoCode() {
		return inspectionNurseTwoCode;
	}
	public void setInspectionNurseTwoCode(String inspectionNurseTwoCode) {
		this.inspectionNurseTwoCode = inspectionNurseTwoCode;
	}
	public String getInspectionNurseTwoName() {
		return inspectionNurseTwoName;
	}
	public void setInspectionNurseTwoName(String inspectionNurseTwoName) {
		this.inspectionNurseTwoName = inspectionNurseTwoName;
	}
	public String getOperatingRoomNOCode() {
		return operatingRoomNOCode;
	}
	public void setOperatingRoomNOCode(String operatingRoomNOCode) {
		this.operatingRoomNOCode = operatingRoomNOCode;
	}
	public String getOperatingRoomNO() {
		return operatingRoomNO;
	}
	public void setOperatingRoomNO(String operatingRoomNO) {
		this.operatingRoomNO = operatingRoomNO;
	}
	public String getOperatingRoomCode() {
		return operatingRoomCode;
	}
	public void setOperatingRoomCode(String operatingRoomCode) {
		this.operatingRoomCode = operatingRoomCode;
	}
	public String getOperatingRoom() {
		return operatingRoom;
	}
	public void setOperatingRoom(String operatingRoom) {
		this.operatingRoom = operatingRoom;
	}
	public String getOperationTableCode() {
		return operationTableCode;
	}
	public void setOperationTableCode(String operationTableCode) {
		this.operationTableCode = operationTableCode;
	}
	public String getOperationTable() {
		return operationTable;
	}
	public void setOperationTable(String operationTable) {
		this.operationTable = operationTable;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getOperationLevelCode() {
		return operationLevelCode;
	}
	public void setOperationLevelCode(String operationLevelCode) {
		this.operationLevelCode = operationLevelCode;
	}
	public String getOperationLevelName() {
		return operationLevelName;
	}
	public void setOperationLevelName(String operationLevelName) {
		this.operationLevelName = operationLevelName;
	}
	public String getAnesthetistApproachCode() {
		return anesthetistApproachCode;
	}
	public void setAnesthetistApproachCode(String anesthetistApproachCode) {
		this.anesthetistApproachCode = anesthetistApproachCode;
	}
	public String getAnesthetistApproachName() {
		return anesthetistApproachName;
	}
	public void setAnesthetistApproachName(String anesthetistApproachName) {
		this.anesthetistApproachName = anesthetistApproachName;
	}
	public String getAnestheistCode() {
		return anestheistCode;
	}
	public void setAnestheistCode(String anestheistCode) {
		this.anestheistCode = anestheistCode;
	}
	public String getAnestheistName() {
		return anestheistName;
	}
	public void setAnestheistName(String anestheistName) {
		this.anestheistName = anestheistName;
	}
	public String getAssistantAnestheistOneCode() {
		return assistantAnestheistOneCode;
	}
	public void setAssistantAnestheistOneCode(String assistantAnestheistOneCode) {
		this.assistantAnestheistOneCode = assistantAnestheistOneCode;
	}
	public String getAssistantAnestheistOneName() {
		return assistantAnestheistOneName;
	}
	public void setAssistantAnestheistOneName(String assistantAnestheistOneName) {
		this.assistantAnestheistOneName = assistantAnestheistOneName;
	}
	public String getAssistantAnestheistTwoCode() {
		return assistantAnestheistTwoCode;
	}
	public void setAssistantAnestheistTwoCode(String assistantAnestheistTwoCode) {
		this.assistantAnestheistTwoCode = assistantAnestheistTwoCode;
	}
	public String getAssistantAnestheistTwoName() {
		return assistantAnestheistTwoName;
	}
	public void setAssistantAnestheistTwoName(String assistantAnestheistTwoName) {
		this.assistantAnestheistTwoName = assistantAnestheistTwoName;
	}
	public String getSurgicalPositionCode() {
		return surgicalPositionCode;
	}
	public void setSurgicalPositionCode(String surgicalPositionCode) {
		this.surgicalPositionCode = surgicalPositionCode;
	}
	public String getSurgicalPositionName() {
		return surgicalPositionName;
	}
	public void setSurgicalPositionCName(String surgicalPositionName) {
		this.surgicalPositionName = surgicalPositionName;
	}
	public String getSurgicalModeCode() {
		return surgicalModeCode;
	}
	public void setSurgicalModeCode(String surgicalModeCode) {
		this.surgicalModeCode = surgicalModeCode;
	}
	public String getSurgicalModeName() {
		return surgicalModeName;
	}
	public void setSurgicalModeName(String surgicalModeName) {
		this.surgicalModeName = surgicalModeName;
	}
	public String getOperationSerialNO() {
		return operationSerialNO;
	}
	public void setOperationSerialNO(String operationSerialNO) {
		this.operationSerialNO = operationSerialNO;
	}
	public Date getOperationDateTime() {
		return operationDateTime;
	}
	public void setOperationDateTime(Date operationDateTime) {
		this.operationDateTime = operationDateTime;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = result*31 + (surgeryReqID==null?0:surgeryReqID.hashCode());
		result = result*31 + (patientID==null?0:patientID.hashCode());
		result = result*31 + (visitID==null?0:visitID.hashCode());
		result = result*31 + (intervention==null?0:intervention.hashCode());
		result = result*31 + (operateApproachCode==null?0:operateApproachCode.hashCode());
		result = result*31 + (operateApproachName==null?0:operateApproachName.hashCode());
		result = result*31 + (numberOfOperation==0?0:numberOfOperation);
		result = result*31 + (startDateTime==null?0:startDateTime.hashCode());
		result = result*31 + (stopDateTime==null?0:stopDateTime.hashCode());
		result = result*31 + (surgicalDoctorOneCode==null?0:surgicalDoctorOneCode.hashCode());
		result = result*31 + (surgicalDoctorOneName==null?0:surgicalDoctorOneName.hashCode());
		result = result*31 + (surgicalDoctorTwoCode==null?0:surgicalDoctorTwoCode.hashCode());
		result = result*31 + (surgicalDoctorTwoName==null?0:surgicalDoctorTwoName.hashCode());
		result = result*31 + (assistantOperatorOneCode==null?0:assistantOperatorOneCode.hashCode());
		result = result*31 + (assistantOperatorOneName==null?0:assistantOperatorOneName.hashCode());
		result = result*31 + (assistantOperatorTwoCode==null?0:assistantOperatorTwoCode.hashCode());
		result = result*31 + (assistantOperatorTwoName==null?0:assistantOperatorTwoName.hashCode());
		result = result*31 + (assistantOperatorThreeCode==null?0:assistantOperatorThreeCode.hashCode());
		result = result*31 + (assistantOperatorThreeName==null?0:assistantOperatorThreeName.hashCode());
		result = result*31 + (assistantOperatorFourCode==null?0:assistantOperatorFourCode.hashCode());
		result = result*31 + (assistantOperatorFourName==null?0:assistantOperatorFourName.hashCode());
		result = result*31 + (instrumentNurseOneCode==null?0:instrumentNurseOneCode.hashCode());
		result = result*31 + (instrumentNurseOneName==null?0:instrumentNurseOneName.hashCode());
		result = result*31 + (instrumentNurseTwoCode==null?0:instrumentNurseTwoCode.hashCode());
		result = result*31 + (instrumentNurseTwoName==null?0:instrumentNurseTwoName.hashCode());
		result = result*31 + (inspectionNurseOneCode==null?0:inspectionNurseOneCode.hashCode());
		result = result*31 + (inspectionNurseOneName==null?0:inspectionNurseOneName.hashCode());
		result = result*31 + (inspectionNurseTwoCode==null?0:inspectionNurseTwoCode.hashCode());
		result = result*31 + (inspectionNurseTwoName==null?0:inspectionNurseTwoName.hashCode());
		result = result*31 + (operatingRoomNOCode==null?0:operatingRoomNOCode.hashCode());
		result = result*31 + (operatingRoomNO==null?0:operatingRoomNO.hashCode());
		result = result*31 + (operatingRoomCode==null?0:operatingRoomCode.hashCode());
		result = result*31 + (operatingRoom==null?0:operatingRoom.hashCode());
		result = result*31 + (operationTableCode==null?0:operationTableCode.hashCode());
		result = result*31 + (operationTable==null?0:operationTable.hashCode());
		result = result*31 + (sequence==0?0:sequence);
		result = result*31 + (operationLevelCode==null?0:operationLevelCode.hashCode());
		result = result*31 + (operationLevelName==null?0:operationLevelName.hashCode());
		result = result*31 + (anesthetistApproachCode==null?0:anesthetistApproachCode.hashCode());
		result = result*31 + (anesthetistApproachName==null?0:anesthetistApproachName.hashCode());
		result = result*31 + (anestheistCode==null?0:anestheistCode.hashCode());
		result = result*31 + (anestheistName==null?0:anestheistName.hashCode());
		result = result*31 + (assistantAnestheistOneCode==null?0:assistantAnestheistOneCode.hashCode());
		result = result*31 + (assistantAnestheistOneName==null?0:assistantAnestheistOneName.hashCode());
		result = result*31 + (assistantAnestheistTwoCode==null?0:assistantAnestheistTwoCode.hashCode());
		result = result*31 + (assistantAnestheistTwoName==null?0:assistantAnestheistTwoName.hashCode());
		result = result*31 + (surgicalPositionCode==null?0:surgicalPositionCode.hashCode());
		result = result*31 + (surgicalPositionName==null?0:surgicalPositionName.hashCode());
		result = result*31 + (surgicalModeCode==null?0:surgicalModeCode.hashCode());
		result = result*31 + (surgicalModeName==null?0:surgicalModeName.hashCode());
		result = result*31 + (operationSerialNO==null?0:operationSerialNO.hashCode());
		result = result*31 + (operationDateTime==null?0:operationDateTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode()) return false;
		if (this==null||obj==null) return false;
		if (this.getClass()!=obj.getClass()) return false;
		if (this==obj) return true;
		
		SurgeryMaster surgeryMasterObj = (SurgeryMaster) obj;
		if (surgeryReqID!=null) {
			if (!(surgeryReqID.equals(surgeryMasterObj.surgeryReqID))) return false;
		}
		else {
			if (surgeryMasterObj.surgeryReqID!=null) 
				return false;
		}
		if (patientID!=null) {
			if (!(patientID.equals(surgeryMasterObj.patientID))) return false;
		}
		else {
			if (surgeryMasterObj.patientID!=null) 
				return false;
		}
		if (visitID!=null) {
			if (!(visitID.equals(surgeryMasterObj.visitID))) return false;
		}
		else {
			if (surgeryMasterObj.visitID!=null) 
				return false;
		}
		if (intervention!=null) {
			if (!(intervention.equals(surgeryMasterObj.intervention))) return false;
		}
		else {
			if (surgeryMasterObj.intervention!=null) 
				return false;
		}
		if (operateApproachCode!=null) {
			if (!(operateApproachCode.equals(surgeryMasterObj.operateApproachCode))) return false;
		}
		else {
			if (surgeryMasterObj.operateApproachCode!=null) 
				return false;
		}
		if (operateApproachName!=null) {
			if (!(operateApproachName.equals(surgeryMasterObj.operateApproachName))) return false;
		}
		else {
			if (surgeryMasterObj.operateApproachName!=null) 
				return false;
		}
		if (numberOfOperation!=0) {
			if (numberOfOperation!=surgeryMasterObj.numberOfOperation) return false;
		}
		else {
			if (surgeryMasterObj.numberOfOperation!=0) 
				return false;
		}
		if (startDateTime!=null) {
			if (!(startDateTime.equals(surgeryMasterObj.startDateTime))) return false;
		}
		else {
			if (surgeryMasterObj.startDateTime!=null) 
				return false;
		}
		if (stopDateTime!=null) {
			if (!(stopDateTime.equals(surgeryMasterObj.stopDateTime))) return false;
		}
		else {
			if (surgeryMasterObj.stopDateTime!=null) 
				return false;
		}
		if (surgicalDoctorOneCode!=null) {
			if (!(surgicalDoctorOneCode.equals(surgeryMasterObj.surgicalDoctorOneCode))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalDoctorOneCode!=null) 
				return false;
		}
		if (surgicalDoctorOneName!=null) {
			if (!(surgicalDoctorOneName.equals(surgeryMasterObj.surgicalDoctorOneName))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalDoctorOneName!=null) 
				return false;
		}
		if (surgicalDoctorTwoCode!=null) {
			if (!(surgicalDoctorTwoCode.equals(surgeryMasterObj.surgicalDoctorTwoCode))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalDoctorTwoCode!=null) 
				return false;
		}
		if (surgicalDoctorTwoName!=null) {
			if (!(surgicalDoctorTwoName.equals(surgeryMasterObj.surgicalDoctorTwoName))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalDoctorTwoName!=null) 
				return false;
		}
		if (assistantOperatorOneCode!=null) {
			if (!(assistantOperatorOneCode.equals(surgeryMasterObj.assistantOperatorOneCode))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorOneCode!=null) 
				return false;
		}
		if (assistantOperatorOneName!=null) {
			if (!(assistantOperatorOneName.equals(surgeryMasterObj.assistantOperatorOneName))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorOneName!=null) 
				return false;
		}
		if (assistantOperatorTwoCode!=null) {
			if (!(assistantOperatorTwoCode.equals(surgeryMasterObj.assistantOperatorTwoCode))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorTwoCode!=null) 
				return false;
		}
		if (assistantOperatorTwoName!=null) {
			if (!(assistantOperatorTwoName.equals(surgeryMasterObj.assistantOperatorTwoName))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorTwoName!=null) 
				return false;
		}
		if (assistantOperatorThreeCode!=null) {
			if (!(assistantOperatorThreeCode.equals(surgeryMasterObj.assistantOperatorThreeCode))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorThreeCode!=null) 
				return false;
		}
		if (assistantOperatorThreeName!=null) {
			if (!(assistantOperatorThreeName.equals(surgeryMasterObj.assistantOperatorThreeName))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorThreeName!=null) 
				return false;
		}
		if (assistantOperatorFourCode!=null) {
			if (!(assistantOperatorFourCode.equals(surgeryMasterObj.assistantOperatorFourCode))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorFourCode!=null) 
				return false;
		}
		if (assistantOperatorFourName!=null) {
			if (!(assistantOperatorFourName.equals(surgeryMasterObj.assistantOperatorFourName))) return false;
		}
		else {
			if (surgeryMasterObj.assistantOperatorFourName!=null) 
				return false;
		}
		if (instrumentNurseOneCode!=null) {
			if (!(instrumentNurseOneCode.equals(surgeryMasterObj.instrumentNurseOneCode))) return false;
		}
		else {
			if (surgeryMasterObj.instrumentNurseOneCode!=null) 
				return false;
		}
		if (instrumentNurseOneName!=null) {
			if (!(instrumentNurseOneName.equals(surgeryMasterObj.instrumentNurseOneName))) return false;
		}
		else {
			if (surgeryMasterObj.instrumentNurseOneName!=null) 
				return false;
		}
		if (instrumentNurseTwoCode!=null) {
			if (!(instrumentNurseTwoCode.equals(surgeryMasterObj.instrumentNurseTwoCode))) return false;
		}
		else {
			if (surgeryMasterObj.instrumentNurseTwoCode!=null) 
				return false;
		}
		if (instrumentNurseTwoName!=null) {
			if (!(instrumentNurseTwoName.equals(surgeryMasterObj.instrumentNurseTwoName))) return false;
		}
		else {
			if (surgeryMasterObj.instrumentNurseTwoName!=null) 
				return false;
		}
		if (inspectionNurseOneCode!=null) {
			if (!(inspectionNurseOneCode.equals(surgeryMasterObj.inspectionNurseOneCode))) return false;
		}
		else {
			if (surgeryMasterObj.inspectionNurseOneCode!=null) 
				return false;
		}
		if (inspectionNurseOneName!=null) {
			if (!(inspectionNurseOneName.equals(surgeryMasterObj.inspectionNurseOneName))) return false;
		}
		else {
			if (surgeryMasterObj.inspectionNurseOneName!=null) 
				return false;
		}
		if (inspectionNurseTwoCode!=null) {
			if (!(inspectionNurseTwoCode.equals(surgeryMasterObj.inspectionNurseTwoCode))) return false;
		}
		else {
			if (surgeryMasterObj.inspectionNurseTwoCode!=null) 
				return false;
		}
		if (inspectionNurseTwoName!=null) {
			if (!(inspectionNurseTwoName.equals(surgeryMasterObj.inspectionNurseTwoName))) return false;
		}
		else {
			if (surgeryMasterObj.inspectionNurseTwoName!=null) 
				return false;
		}
		if (operatingRoomNOCode!=null) {
			if (!(operatingRoomNOCode.equals(surgeryMasterObj.operatingRoomNOCode))) return false;
		}
		else {
			if (surgeryMasterObj.operatingRoomNOCode!=null) 
				return false;
		}
		if (operatingRoomNO!=null) {
			if (!(operatingRoomNO.equals(surgeryMasterObj.operatingRoomNO))) return false;
		}
		else {
			if (surgeryMasterObj.operatingRoomNO!=null) 
				return false;
		}
		if (operatingRoomCode!=null) {
			if (!(operatingRoomCode.equals(surgeryMasterObj.operatingRoomCode))) return false;
		}
		else {
			if (surgeryMasterObj.operatingRoomCode!=null) 
				return false;
		}
		if (operatingRoom!=null) {
			if (!(operatingRoom.equals(surgeryMasterObj.operatingRoom))) return false;
		}
		else {
			if (surgeryMasterObj.operatingRoom!=null) 
				return false;
		}
		if (operationTableCode!=null) {
			if (!(operationTableCode.equals(surgeryMasterObj.operationTableCode))) return false;
		}
		else {
			if (surgeryMasterObj.operationTableCode!=null) 
				return false;
		}
		if (operationTable!=null) {
			if (!(operationTable.equals(surgeryMasterObj.operationTable))) return false;
		}
		else {
			if (surgeryMasterObj.operationTable!=null) 
				return false;
		}
		if (sequence!=0) {
			if (sequence!=surgeryMasterObj.sequence) return false;
		}
		else {
			if (surgeryMasterObj.sequence!=0) 
				return false;
		}
		if (operationLevelCode!=null) {
			if (!(operationLevelCode.equals(surgeryMasterObj.operationLevelCode))) return false;
		}
		else {
			if (surgeryMasterObj.operationLevelCode!=null) 
				return false;
		}
		if (operationLevelName!=null) {
			if (!(operationLevelName.equals(surgeryMasterObj.operationLevelName))) return false;
		}
		else {
			if (surgeryMasterObj.operationLevelName!=null) 
				return false;
		}
		if (anesthetistApproachCode!=null) {
			if (!(anesthetistApproachCode.equals(surgeryMasterObj.anesthetistApproachCode))) return false;
		}
		else {
			if (surgeryMasterObj.anesthetistApproachCode!=null) 
				return false;
		}
		if (anesthetistApproachName!=null) {
			if (!(anesthetistApproachName.equals(surgeryMasterObj.anesthetistApproachName))) return false;
		}
		else {
			if (surgeryMasterObj.anesthetistApproachName!=null) 
				return false;
		}
		if (anestheistCode!=null) {
			if (!(anestheistCode.equals(surgeryMasterObj.anestheistCode))) return false;
		}
		else {
			if (surgeryMasterObj.anestheistCode!=null) 
				return false;
		}
		if (anestheistName!=null) {
			if (!(anestheistName.equals(surgeryMasterObj.anestheistName))) return false;
		}
		else {
			if (surgeryMasterObj.anestheistName!=null) 
				return false;
		}
		if (assistantAnestheistOneCode!=null) {
			if (!(assistantAnestheistOneCode.equals(surgeryMasterObj.assistantAnestheistOneCode))) return false;
		}
		else {
			if (surgeryMasterObj.assistantAnestheistOneCode!=null) 
				return false;
		}
		if (assistantAnestheistOneName!=null) {
			if (!(assistantAnestheistOneName.equals(surgeryMasterObj.assistantAnestheistOneName))) return false;
		}
		else {
			if (surgeryMasterObj.assistantAnestheistOneName!=null) 
				return false;
		}
		if (assistantAnestheistTwoCode!=null) {
			if (!(assistantAnestheistTwoCode.equals(surgeryMasterObj.assistantAnestheistTwoCode))) return false;
		}
		else {
			if (surgeryMasterObj.assistantAnestheistTwoCode!=null) 
				return false;
		}
		if (assistantAnestheistTwoName!=null) {
			if (!(assistantAnestheistTwoName.equals(surgeryMasterObj.assistantAnestheistTwoName))) return false;
		}
		else {
			if (surgeryMasterObj.assistantAnestheistTwoName!=null) 
				return false;
		}
		if (surgicalPositionCode!=null) {
			if (!(surgicalPositionCode.equals(surgeryMasterObj.surgicalPositionCode))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalPositionCode!=null) 
				return false;
		}
		if (surgicalPositionName!=null) {
			if (!(surgicalPositionName.equals(surgeryMasterObj.surgicalPositionName))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalPositionName!=null) 
				return false;
		}
		if (surgicalModeCode!=null) {
			if (!(surgicalModeCode.equals(surgeryMasterObj.surgicalModeCode))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalModeCode!=null) 
				return false;
		}
		if (surgicalModeName!=null) {
			if (!(surgicalModeName.equals(surgeryMasterObj.surgicalModeName))) return false;
		}
		else {
			if (surgeryMasterObj.surgicalModeName!=null) 
				return false;
		}
		if (operationSerialNO!=null) {
			if (!(operationSerialNO.equals(surgeryMasterObj.operationSerialNO))) return false;
		}
		else {
			if (surgeryMasterObj.operationSerialNO!=null) 
				return false;
		}
		if (operationDateTime!=null) {
			if (!(operationDateTime.equals(surgeryMasterObj.operationDateTime))) return false;
		}
		else {
			if (surgeryMasterObj.operationDateTime!=null) 
				return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuffer surgeryMasterBuffer = new StringBuffer();
		surgeryMasterBuffer.append("{\"surgeryReqID\":\"").append(surgeryReqID).append("\",")
			.append("\"patientID\":\"").append(patientID).append("\",")
			.append("\"visitID\":\"").append(visitID).append("\",")
			.append("\"intervention\":\"").append(intervention).append("\",")
			.append("\"operateApproachCode\":\"").append(operateApproachCode).append("\",")
			.append("\"operateApproachName\":\"").append(operateApproachName).append("\",")
			.append("\"numberOfOperation\":\"").append(numberOfOperation).append("\",")
			.append("\"startDateTime\":\"").append(startDateTime).append("\",")
			.append("\"stopDateTime\":\"").append(stopDateTime).append("\",")
			.append("\"surgicalDoctorOneCode\":\"").append(surgicalDoctorOneCode).append("\",")
			.append("\"surgicalDoctorOneName\":\"").append(surgicalDoctorOneName).append("\",")
			.append("\"surgicalDoctorTwoCode\":\"").append(surgicalDoctorTwoCode).append("\",")
			.append("{\"surgicalDoctorTwoName\":\"").append(surgicalDoctorTwoName).append("\",")
			.append("\"assistantOperatorOneCode\":\"").append(assistantOperatorOneCode).append("\",")
			.append("\"assistantOperatorOneName\":\"").append(assistantOperatorOneName).append("\",")
			.append("\"assistantOperatorTwoCode\":\"").append(assistantOperatorTwoCode).append("\",")
			.append("\"assistantOperatorTwoName\":\"").append(assistantOperatorTwoName).append("\",")
			.append("\"assistantOperatorThreeCode\":\"").append(assistantOperatorThreeCode).append("\",")
			.append("\"assistantOperatorThreeName\":\"").append(assistantOperatorThreeName).append("\",")
			.append("\"assistantOperatorFourCode\":\"").append(assistantOperatorFourCode).append("\",")
			.append("\"assistantOperatorFourName\":\"").append(assistantOperatorFourName).append("\",")
			.append("\"instrumentNurseOneCode\":\"").append(instrumentNurseOneCode).append("\",")
			.append("\"instrumentNurseOneName\":\"").append(instrumentNurseOneName).append("\",")
			.append("\"instrumentNurseTwoCode\":\"").append(instrumentNurseTwoCode).append("\",")
			.append("{\"instrumentNurseTwoName\":\"").append(instrumentNurseTwoName).append("\",")
			.append("\"inspectionNurseOneCode\":\"").append(inspectionNurseOneCode).append("\",")
			.append("\"inspectionNurseOneName\":\"").append(inspectionNurseOneName).append("\",")
			.append("\"inspectionNurseTwoCode\":\"").append(inspectionNurseTwoCode).append("\",")
			.append("\"inspectionNurseTwoName\":\"").append(inspectionNurseTwoName).append("\",")
			.append("\"operatingRoomNOCode\":\"").append(operatingRoomNOCode).append("\",")
			.append("\"operatingRoomNO\":\"").append(operatingRoomNO).append("\",")
			.append("\"operatingRoomCode\":\"").append(operatingRoomCode).append("\",")
			.append("\"operatingRoom\":\"").append(operatingRoom).append("\",")
			.append("\"operationTableCode\":\"").append(operationTableCode).append("\",")
			.append("\"operationTable\":\"").append(operationTable).append("\",")
			.append("\"sequence\":\"").append(sequence).append("\",")
			.append("{\"operationLevelCode\":\"").append(operationLevelCode).append("\",")
			.append("\"operationLevelName\":\"").append(operationLevelName).append("\",")
			.append("\"anesthetistApproachCode\":\"").append(anesthetistApproachCode).append("\",")
			.append("\"anesthetistApproachName\":\"").append(anesthetistApproachName).append("\",")
			.append("\"anestheistCode\":\"").append(anestheistCode).append("\",")
			.append("\"anestheistName\":\"").append(anestheistName).append("\",")
			.append("\"assistantAnestheistOneCode\":\"").append(assistantAnestheistOneCode).append("\",")
			.append("\"assistantAnestheistOneName\":\"").append(assistantAnestheistOneName).append("\",")
			.append("\"assistantAnestheistTwoCode\":\"").append(assistantAnestheistTwoCode).append("\",")
			.append("\"assistantAnestheistTwoName\":\"").append(assistantAnestheistTwoName).append("\",")
			.append("\"surgicalPositionCode\":\"").append(surgicalPositionCode).append("\",")
			.append("\"surgicalPositionName\":\"").append(surgicalPositionName).append("\",")
			.append("\"surgicalModeCode\":\"").append(surgicalModeCode).append("\",")
			.append("\"surgicalModeName\":\"").append(surgicalModeName).append("\",")
			.append("\"operationSerialNO\":\"").append(operationSerialNO).append("\",")
			.append("\"operationDateTime\":\"").append(operationDateTime).append("\"}");
		return surgeryMasterBuffer.toString();
	}
}
