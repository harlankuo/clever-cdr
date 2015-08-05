package com.vico.clever.cdr.service.model;

import java.util.Date;

public class PatientADTInfo {
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
}
