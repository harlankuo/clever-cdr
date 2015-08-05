package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryRecord {
	public String surgeryReqID;//手术申请号(*)
	public String patientID;//病人ID(*)
	public String visitID;//就诊ID(*)
	public String reportID;//手术报告号(*)
    public int bleeding;//出血总量
    public String bleedingUnit;//出血总量单位
    public String surDescriptionCode;//手术所见
    public String surDescription;//手术所见
    public String skinDisinfection;//皮肤消毒描述
    public String incisionDescription;//手术切口描述
    public byte closureDrainsSign;//引流标志
    public String closureDrainsMaterial;//引流材料名称
    public int closureDrainsMaterialAmount;//引流材料数目
    public String closureDrainsLocation;//放置部位
    public String anesthesiaIndication;//麻醉适应证
    public String anesthesiaRecovery;//麻醉恢复情况
    public Date anesthesiaStartDate;//麻醉开始日期时间
    public String anesthesiaASACode;//美国麻醉医师协会ASA分级标准代码
    public String anesthesiaASA;//美国麻醉医师协会ASA分级标准内容
    public String anesthesiaMedicine;//麻醉药物名称
    public String anesthsaiaPosition;//麻醉体位
    public String anesthesiaDescription;//麻醉描述
    public String anesthesiaComplication;//麻醉合并症标志代码
    public String anesthesiaEffect;//麻醉效果
    public String anesthesiaPremediaine;//麻醉前用药
    public String tracheaCannulaType;//气管插管分类
    public String tracheaCannulaUnpin;//拔除气管插管标志
    public int transfusionVolume;//输液量
    public String transfusionVolumeUnit;//输液量单位
    public String transfusionItem;//术中输液项目
    public String incsionLevelCode;//手术切口类别代码
    public String incsionLevelName;//手术切口类别类别
    public String healLevel;//手术切口愈合等级
}
