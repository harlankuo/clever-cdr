package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Transfution {
	public String patientID;//病人号(*)
    public String visitID;//就诊号(*)
    public String orderID;//医嘱ID
    public String transfusionID;//输血号码(*)
    public String requestID;//手术申请号
    public String bloodType;//输血品种代码
    public Date startDatetime;//输血日期时间
    public String indication;//输血指征
    public String decription;//输血过程记录
    public String reactionFlag;//输血反应标志
    public String reasonCode;//输血原因代码
    public String reason;//输血原因
    public int count;//输血次数
    public int amountAll;//记录输血总量
    public int amountVolume;//输血量
    public String amountVolumeUnit;//输血单位
    public String administrationCode;//输血途径代码
    public String administrationName;//输血途径
    public String frequencyDec;//频率描述
    public int frequencyCount;//频率次数
    public int frequencyInterval;//频率间隔
    public String frequencyIntervalUnit;//频率间隔单位
    public String memo;//备注
    public String reactionType;//反应类型
}
