package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryMaster {
	public String surgeryReqID;//手术申请号(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String intervention;//介入物名称
	public String operateApproachCode;//手术及操作方法代码
	public String operateApproachName;//手术及操作方法
	public int numberOfOperation;//手术及操作次数
	public Date startDateTime;//手术开始日期时间
	public Date stopDateTime;//手术结束日期时间
	public String surgicalDoctorOneCode;//第一手术医生代码
	public String surgicalDoctorOnename;//第一手术医生姓名
	public String surgicalDoctorTwoCode;//第二手术医生代码
	public String surgicalDoctorTwoname;//第二手术医生姓名
	public String assistantOperatorOneCode;//手术第一助手代码
	public String assistantOperatorOneName;//手术第一助手姓名
	public String assistantOperatorTwoCode;//手术第二助手代码
	public String assistantOperatorTwoName;//手术第二助手姓名
	public String assistantOperatorThreeCode;//手术第三助手代码
	public String assistantOperatorThreeName;//手术第三助手姓名
	public String assistantOperatorFourCode;//手术第四助手代码
	public String assistantOperatorFourName;//手术第四助手姓名
	public String instrumentNurseOneCode;//器械护士1代码
	public String instrumentNurseOneName;//器械护士1
	public String instrumentNurseTwoCode;//器械护士2代码
	public String instrumentNurseTwoName;//器械护士2
	public String inspectionNurseOneCode;//巡台护士1代码
	public String inspectionNurseOneName;//巡台护士1
	public String inspectionNurseTwoCode;//巡台护士2代码
	public String inspectionNurseTwoName;//巡台护士2
	public String operatingRoomNOCode;//手术间代码
	public String operatingRoomNO;//手术间
	public String operatingRoomCode;//手术室代码
	public String operatingRoom;//手术室
	public String operationTableCode;//手术台代码
	public String operationTable;//手术台
	public int sequence;//台次
	public String operationLevelCode;//手术级别代码
	public String operationLevelName;//手术级别名称
	public String anesthetistApproachCode;//麻醉方法代码
	public String anesthetistApproachName;//麻醉方法名称
	public String anestheistCode;//麻醉医生ID
	public String anestheistName;//麻醉医生姓名
	public String assistantAnestheistOneCode;//麻醉助手ID
	public String assistantAnestheistOneName;//麻醉助手姓名
	public String assistantAnestheistTwoCode;//麻醉助手2ID
	public String assistantAnestheistTwoName;//麻醉助手2姓名
	public String surgicalPositionCode;//手术体位代码
	public String surgicalPositionCName;//手术体位
	public String surgicalModeCode;//手术方式代码
	public String surgicalModeName;//手术方式名称
	public String operationSerialNO;//手术序号
	public Date operationDateTime;//手术日期及时间	
}
