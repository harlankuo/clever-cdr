package com.vico.clever.cdr.service.model;

import java.util.Date;

public class SurgeryRecord {
	private String surgeryReqID;//手术申请号(*)
	private String patientID;//病人ID(*)
	private String visitID;//就诊ID(*)
	private String reportID;//手术报告号(*)
    private int bleeding;//出血总量
    private String bleedingUnit;//出血总量单位
    private String surDescriptionCode;//手术所见
    private String surDescription;//手术所见
    private String skinDisinfection;//皮肤消毒描述
    private String incisionDescription;//手术切口描述
    private byte closureDrainsSign;//引流标志
    private String closureDrainsMaterial;//引流材料名称
    private int closureDrainsMaterialAmount;//引流材料数目
    private String closureDrainsLocation;//放置部位
    private String anesthesiaIndication;//麻醉适应证
    private String anesthesiaRecovery;//麻醉恢复情况
    private Date anesthesiaStartDate;//麻醉开始日期时间
    private String anesthesiaASACode;//美国麻醉医师协会ASA分级标准代码
    private String anesthesiaASA;//美国麻醉医师协会ASA分级标准内容
    private String anesthesiaMedicine;//麻醉药物名称
    private String anesthesiaPosition;//麻醉体位
    private String anesthesiaDescription;//麻醉描述
    private String anesthesiaComplication;//麻醉合并症标志代码
    private String anesthesiaEffect;//麻醉效果
    private String anesthesiaPremediaine;//麻醉前用药
    private String tracheaCannulaType;//气管插管分类
    private String tracheaCannulaUnpin;//拔除气管插管标志
    private int transfusionVolume;//输液量
    private String transfusionVolumeUnit;//输液量单位
    private String transfusionItem;//术中输液项目
    private String incsionLevelCode;//手术切口类别代码
    private String incsionLevelName;//手术切口类别类别
    private String healLevel;//手术切口愈合等级
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
	public String getReportID() {
		return reportID;
	}
	public void setReportID(String reportID) {
		this.reportID = reportID;
	}
	public int getBleeding() {
		return bleeding;
	}
	public void setBleeding(int bleeding) {
		this.bleeding = bleeding;
	}
	public String getBleedingUnit() {
		return bleedingUnit;
	}
	public void setBleedingUnit(String bleedingUnit) {
		this.bleedingUnit = bleedingUnit;
	}
	public String getSurDescriptionCode() {
		return surDescriptionCode;
	}
	public void setSurDescriptionCode(String surDescriptionCode) {
		this.surDescriptionCode = surDescriptionCode;
	}
	public String getSurDescription() {
		return surDescription;
	}
	public void setSurDescription(String surDescription) {
		this.surDescription = surDescription;
	}
	public String getSkinDisinfection() {
		return skinDisinfection;
	}
	public void setSkinDisinfection(String skinDisinfection) {
		this.skinDisinfection = skinDisinfection;
	}
	public String getIncisionDescription() {
		return incisionDescription;
	}
	public void setIncisionDescription(String incisionDescription) {
		this.incisionDescription = incisionDescription;
	}
	public byte getClosureDrainsSign() {
		return closureDrainsSign;
	}
	public void setClosureDrainsSign(byte closureDrainsSign) {
		this.closureDrainsSign = closureDrainsSign;
	}
	public String getClosureDrainsMaterial() {
		return closureDrainsMaterial;
	}
	public void setClosureDrainsMaterial(String closureDrainsMaterial) {
		this.closureDrainsMaterial = closureDrainsMaterial;
	}
	public int getClosureDrainsMaterialAmount() {
		return closureDrainsMaterialAmount;
	}
	public void setClosureDrainsMaterialAmount(int closureDrainsMaterialAmount) {
		this.closureDrainsMaterialAmount = closureDrainsMaterialAmount;
	}
	public String getClosureDrainsLocation() {
		return closureDrainsLocation;
	}
	public void setClosureDrainsLocation(String closureDrainsLocation) {
		this.closureDrainsLocation = closureDrainsLocation;
	}
	public String getAnesthesiaIndication() {
		return anesthesiaIndication;
	}
	public void setAnesthesiaIndication(String anesthesiaIndication) {
		this.anesthesiaIndication = anesthesiaIndication;
	}
	public String getAnesthesiaRecovery() {
		return anesthesiaRecovery;
	}
	public void setAnesthesiaRecovery(String anesthesiaRecovery) {
		this.anesthesiaRecovery = anesthesiaRecovery;
	}
	public Date getAnesthesiaStartDate() {
		return anesthesiaStartDate;
	}
	public void setAnesthesiaStartDate(Date anesthesiaStartDate) {
		this.anesthesiaStartDate = anesthesiaStartDate;
	}
	public String getAnesthesiaASACode() {
		return anesthesiaASACode;
	}
	public void setAnesthesiaASACode(String anesthesiaASACode) {
		this.anesthesiaASACode = anesthesiaASACode;
	}
	public String getAnesthesiaASA() {
		return anesthesiaASA;
	}
	public void setAnesthesiaASA(String anesthesiaASA) {
		this.anesthesiaASA = anesthesiaASA;
	}
	public String getAnesthesiaMedicine() {
		return anesthesiaMedicine;
	}
	public void setAnesthesiaMedicine(String anesthesiaMedicine) {
		this.anesthesiaMedicine = anesthesiaMedicine;
	}
	public String getAnesthesiaPosition() {
		return anesthesiaPosition;
	}
	public void setAnesthesiaPosition(String anesthesiaPosition) {
		this.anesthesiaPosition = anesthesiaPosition;
	}
	public String getAnesthesiaDescription() {
		return anesthesiaDescription;
	}
	public void setAnesthesiaDescription(String anesthesiaDescription) {
		this.anesthesiaDescription = anesthesiaDescription;
	}
	public String getAnesthesiaComplication() {
		return anesthesiaComplication;
	}
	public void setAnesthesiaComplication(String anesthesiaComplication) {
		this.anesthesiaComplication = anesthesiaComplication;
	}
	public String getAnesthesiaEffect() {
		return anesthesiaEffect;
	}
	public void setAnesthesiaEffect(String anesthesiaEffect) {
		this.anesthesiaEffect = anesthesiaEffect;
	}
	public String getAnesthesiaPremediaine() {
		return anesthesiaPremediaine;
	}
	public void setAnesthesiaPremediaine(String anesthesiaPremediaine) {
		this.anesthesiaPremediaine = anesthesiaPremediaine;
	}
	public String getTracheaCannulaType() {
		return tracheaCannulaType;
	}
	public void setTracheaCannulaType(String tracheaCannulaType) {
		this.tracheaCannulaType = tracheaCannulaType;
	}
	public String getTracheaCannulaUnpin() {
		return tracheaCannulaUnpin;
	}
	public void setTracheaCannulaUnpin(String tracheaCannulaUnpin) {
		this.tracheaCannulaUnpin = tracheaCannulaUnpin;
	}
	public int getTransfusionVolume() {
		return transfusionVolume;
	}
	public void setTransfusionVolume(int transfusionVolume) {
		this.transfusionVolume = transfusionVolume;
	}
	public String getTransfusionVolumeUnit() {
		return transfusionVolumeUnit;
	}
	public void setTransfusionVolumeUnit(String transfusionVolumeUnit) {
		this.transfusionVolumeUnit = transfusionVolumeUnit;
	}
	public String getTransfusionItem() {
		return transfusionItem;
	}
	public void setTransfusionItem(String transfusionItem) {
		this.transfusionItem = transfusionItem;
	}
	public String getIncsionLevelCode() {
		return incsionLevelCode;
	}
	public void setIncsionLevelCode(String incsionLevelCode) {
		this.incsionLevelCode = incsionLevelCode;
	}
	public String getIncsionLevelName() {
		return incsionLevelName;
	}
	public void setIncsionLevelName(String incsionLevelName) {
		this.incsionLevelName = incsionLevelName;
	}
	public String getHealLevel() {
		return healLevel;
	}
	public void setHealLevel(String healLevel) {
		this.healLevel = healLevel;
	}
	@Override
	public int hashCode() {
		int result = 1;
		result = result*31 + (surgeryReqID==null?0:surgeryReqID.hashCode());
		result = result*31 + (patientID==null?0:patientID.hashCode());
		result = result*31 + (visitID==null?0:visitID.hashCode());
		result = result*31 + (reportID==null?0:reportID.hashCode());
		result = result*31 + (bleeding==0?0:bleeding);
		result = result*31 + (bleedingUnit==null?0:bleedingUnit.hashCode());
		result = result*31 + (surDescriptionCode==null?0:surDescriptionCode.hashCode());
		result = result*31 + (surDescription==null?0:surDescription.hashCode());
		result = result*31 + (skinDisinfection==null?0:skinDisinfection.hashCode());
		result = result*31 + (incisionDescription==null?0:incisionDescription.hashCode());
		result = result*31 + (closureDrainsSign==0?0:closureDrainsSign);
		result = result*31 + (closureDrainsMaterial==null?0:closureDrainsMaterial.hashCode());
		result = result*31 + (closureDrainsMaterialAmount==0?0:closureDrainsMaterialAmount);
		result = result*31 + (closureDrainsLocation==null?0:closureDrainsLocation.hashCode());
		result = result*31 + (anesthesiaIndication==null?0:anesthesiaIndication.hashCode());
		result = result*31 + (anesthesiaRecovery==null?0:anesthesiaRecovery.hashCode());
		result = result*31 + (anesthesiaStartDate==null?0:anesthesiaStartDate.hashCode());
		result = result*31 + (anesthesiaASACode==null?0:anesthesiaASACode.hashCode());
		result = result*31 + (anesthesiaASA==null?0:anesthesiaASA.hashCode());
		result = result*31 + (anesthesiaMedicine==null?0:anesthesiaMedicine.hashCode());
		result = result*31 + (anesthesiaPosition==null?0:anesthesiaPosition.hashCode());
		result = result*31 + (anesthesiaDescription==null?0:anesthesiaDescription.hashCode());
		result = result*31 + (anesthesiaComplication==null?0:anesthesiaComplication.hashCode());
		result = result*31 + (anesthesiaEffect==null?0:anesthesiaEffect.hashCode());
		result = result*31 + (anesthesiaPremediaine==null?0:anesthesiaPremediaine.hashCode());
		result = result*31 + (tracheaCannulaType==null?0:tracheaCannulaType.hashCode());
		result = result*31 + (tracheaCannulaUnpin==null?0:tracheaCannulaUnpin.hashCode());
		result = result*31 + (transfusionVolume==0?0:transfusionVolume);
		result = result*31 + (transfusionVolumeUnit==null?0:transfusionVolumeUnit.hashCode());
		result = result*31 + (transfusionItem==null?0:transfusionItem.hashCode());
		result = result*31 + (incsionLevelCode==null?0:incsionLevelCode.hashCode());
		result = result*31 + (incsionLevelName==null?0:incsionLevelName.hashCode());
		result = result*31 + (healLevel==null?0:healLevel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode()) return false;
		if (this==null||obj==null) return false;
		if (this.getClass()!=obj.getClass()) return false;
		if (this==obj) return true;
		
		SurgeryRecord surgeryRecordObj = (SurgeryRecord) obj;
		if (surgeryReqID!=null) {
			if (!(surgeryReqID.equals(surgeryRecordObj.surgeryReqID))) return false;
		}
		else {
			if (surgeryRecordObj.surgeryReqID!=null) 
				return false;
		}
		if (patientID!=null) {
			if (!(patientID.equals(surgeryRecordObj.patientID))) return false;
		}
		else {
			if (surgeryRecordObj.patientID!=null) 
				return false;
		}
		if (visitID!=null) {
			if (!(visitID.equals(surgeryRecordObj.visitID))) return false;
		}
		else {
			if (surgeryRecordObj.visitID!=null) 
				return false;
		}
		if (reportID!=null) {
			if (!(reportID.equals(surgeryRecordObj.reportID))) return false;
		}
		else {
			if (surgeryRecordObj.reportID!=null) 
				return false;
		}
		if (bleeding!=0) {
			if (bleeding!=surgeryRecordObj.bleeding) return false;
		}
		else {
			if (surgeryRecordObj.bleeding!=0) 
				return false;
		}
		if (bleedingUnit!=null) {
			if (!(bleedingUnit.equals(surgeryRecordObj.bleedingUnit))) return false;
		}
		else {
			if (surgeryRecordObj.bleedingUnit!=null) 
				return false;
		}
		if (surDescriptionCode!=null) {
			if (!(surDescriptionCode.equals(surgeryRecordObj.surDescriptionCode))) return false;
		}
		else {
			if (surgeryRecordObj.surDescriptionCode!=null) 
				return false;
		}
		if (surDescription!=null) {
			if (!(surDescription.equals(surgeryRecordObj.surDescription))) return false;
		}
		else {
			if (surgeryRecordObj.surDescription!=null) 
				return false;
		}
		if (skinDisinfection!=null) {
			if (!(skinDisinfection.equals(surgeryRecordObj.skinDisinfection))) return false;
		}
		else {
			if (surgeryRecordObj.skinDisinfection!=null) 
				return false;
		}
		if (incisionDescription!=null) {
			if (!(incisionDescription.equals(surgeryRecordObj.incisionDescription))) return false;
		}
		else {
			if (surgeryRecordObj.incisionDescription!=null) 
				return false;
		}
		if (closureDrainsSign!=0) {
			if (closureDrainsSign!=surgeryRecordObj.closureDrainsSign) return false;
		}
		else {
			if (surgeryRecordObj.closureDrainsSign!=0) 
				return false;
		}
		if (closureDrainsMaterial!=null) {
			if (!(closureDrainsMaterial.equals(surgeryRecordObj.closureDrainsMaterial))) return false;
		}
		else {
			if (surgeryRecordObj.closureDrainsMaterial!=null) 
				return false;
		}
		if (closureDrainsMaterialAmount!=0) {
			if (closureDrainsMaterialAmount!=surgeryRecordObj.closureDrainsMaterialAmount) return false;
		}
		else {
			if (surgeryRecordObj.closureDrainsMaterialAmount!=0) 
				return false;
		}
		if (closureDrainsLocation!=null) {
			if (!(closureDrainsLocation.equals(surgeryRecordObj.closureDrainsLocation))) return false;
		}
		else {
			if (surgeryRecordObj.closureDrainsLocation!=null) 
				return false;
		}
		if (anesthesiaIndication!=null) {
			if (!(anesthesiaIndication.equals(surgeryRecordObj.anesthesiaIndication))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaIndication!=null) 
				return false;
		}
		if (anesthesiaRecovery!=null) {
			if (!(anesthesiaRecovery.equals(surgeryRecordObj.anesthesiaRecovery))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaRecovery!=null) 
				return false;
		}
		if (anesthesiaStartDate!=null) {
			if (!(anesthesiaStartDate.equals(surgeryRecordObj.anesthesiaStartDate))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaStartDate!=null) 
				return false;
		}
		if (anesthesiaASACode!=null) {
			if (!(anesthesiaASACode.equals(surgeryRecordObj.anesthesiaASACode))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaASACode!=null) 
				return false;
		}
		if (anesthesiaASA!=null) {
			if (!(anesthesiaASA.equals(surgeryRecordObj.anesthesiaASA))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaASA!=null) 
				return false;
		}
		if (anesthesiaMedicine!=null) {
			if (!(anesthesiaMedicine.equals(surgeryRecordObj.anesthesiaMedicine))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaMedicine!=null) 
				return false;
		}
		if (anesthesiaPosition!=null) {
			if (!(anesthesiaPosition.equals(surgeryRecordObj.anesthesiaPosition))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaPosition!=null) 
				return false;
		}
		if (anesthesiaDescription!=null) {
			if (!(anesthesiaDescription.equals(surgeryRecordObj.anesthesiaDescription))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaDescription!=null) 
				return false;
		}
		if (anesthesiaComplication!=null) {
			if (!(anesthesiaComplication.equals(surgeryRecordObj.anesthesiaComplication))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaComplication!=null) 
				return false;
		}
		if (anesthesiaEffect!=null) {
			if (!(anesthesiaEffect.equals(surgeryRecordObj.anesthesiaEffect))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaEffect!=null) 
				return false;
		}
		if (anesthesiaPremediaine!=null) {
			if (!(anesthesiaPremediaine.equals(surgeryRecordObj.anesthesiaPremediaine))) return false;
		}
		else {
			if (surgeryRecordObj.anesthesiaPremediaine!=null) 
				return false;
		}
		if (tracheaCannulaType!=null) {
			if (!(tracheaCannulaType.equals(surgeryRecordObj.tracheaCannulaType))) return false;
		}
		else {
			if (surgeryRecordObj.tracheaCannulaType!=null) 
				return false;
		}
		if (tracheaCannulaUnpin!=null) {
			if (!(tracheaCannulaUnpin.equals(surgeryRecordObj.tracheaCannulaUnpin))) return false;
		}
		else {
			if (surgeryRecordObj.tracheaCannulaUnpin!=null) 
				return false;
		}
		if (transfusionVolume!=0) {
			if (transfusionVolume!=surgeryRecordObj.transfusionVolume) return false;
		}
		else {
			if (surgeryRecordObj.transfusionVolume!=0) 
				return false;
		}
		if (transfusionVolumeUnit!=null) {
			if (!(transfusionVolumeUnit.equals(surgeryRecordObj.transfusionVolumeUnit))) return false;
		}
		else {
			if (surgeryRecordObj.transfusionVolumeUnit!=null) 
				return false;
		}
		if (transfusionItem!=null) {
			if (!(transfusionItem.equals(surgeryRecordObj.transfusionItem))) return false;
		}
		else {
			if (surgeryRecordObj.transfusionItem!=null) 
				return false;
		}
		if (incsionLevelCode!=null) {
			if (!(incsionLevelCode.equals(surgeryRecordObj.incsionLevelCode))) return false;
		}
		else {
			if (surgeryRecordObj.incsionLevelCode!=null) 
				return false;
		}
		if (incsionLevelName!=null) {
			if (!(incsionLevelName.equals(surgeryRecordObj.incsionLevelName))) return false;
		}
		else {
			if (surgeryRecordObj.incsionLevelName!=null) 
				return false;
		}
		if (healLevel!=null) {
			if (!(healLevel.equals(surgeryRecordObj.healLevel))) return false;
		}
		else {
			if (surgeryRecordObj.healLevel!=null) 
				return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuffer surgeryRecordBuffer = new StringBuffer();
		surgeryRecordBuffer.append("{\"surgeryReqID\":\"").append(surgeryReqID).append("\",")
			.append("\"patientID\":\"").append(patientID).append("\",")
			.append("\"visitID\":\"").append(visitID).append("\",")
			.append("\"reportID\":\"").append(reportID).append("\",")
			.append("\"bleeding\":\"").append(bleeding).append("\",")
			.append("\"bleedingUnit\":\"").append(bleedingUnit).append("\",")
			.append("\"surDescriptionCode\":\"").append(surDescriptionCode).append("\",")
			.append("\"surDescription\":\"").append(surDescription).append("\",")
			.append("\"skinDisinfection\":\"").append(skinDisinfection).append("\",")
			.append("\"incisionDescription\":\"").append(incisionDescription).append("\",")
			.append("\"closureDrainsSign\":\"").append(closureDrainsSign).append("\",")
			.append("\"closureDrainsMaterial\":\"").append(closureDrainsMaterial).append("\",")
			.append("{\"closureDrainsMaterialAmount\":\"").append(closureDrainsMaterialAmount).append("\",")
			.append("\"closureDrainsLocation\":\"").append(closureDrainsLocation).append("\",")
			.append("\"anesthesiaIndication\":\"").append(anesthesiaIndication).append("\",")
			.append("\"anesthesiaRecovery\":\"").append(anesthesiaRecovery).append("\",")
			.append("\"anesthesiaStartDate\":\"").append(anesthesiaStartDate).append("\",")
			.append("\"anesthesiaASACode\":\"").append(anesthesiaASACode).append("\",")
			.append("\"anesthesiaASA\":\"").append(anesthesiaASA).append("\",")
			.append("\"anesthesiaMedicine\":\"").append(anesthesiaMedicine).append("\",")
			.append("\"anesthesiaPosition\":\"").append(anesthesiaPosition).append("\",")
			.append("\"anesthesiaDescription\":\"").append(anesthesiaDescription).append("\",")
			.append("\"anesthesiaComplication\":\"").append(anesthesiaComplication).append("\",")
			.append("\"anesthesiaEffect\":\"").append(anesthesiaEffect).append("\",")
			.append("\"anesthesiaPremediaine\":\"").append(anesthesiaPremediaine).append("\",")
			.append("{\"tracheaCannulaType\":\"").append(tracheaCannulaType).append("\",")
			.append("\"tracheaCannulaUnpin\":\"").append(tracheaCannulaUnpin).append("\",")
			.append("{\"transfusionVolume\":\"").append(transfusionVolume).append("\",")
			.append("\"transfusionVolumeUnit\":\"").append(transfusionVolumeUnit).append("\",")
			.append("\"transfusionItem\":\"").append(transfusionItem).append("\",")
			.append("\"incsionLevelCode\":\"").append(incsionLevelCode).append("\",")
			.append("\"incsionLevelName\":\"").append(incsionLevelName).append("\",")
			.append("\"healLevel\":\"").append(healLevel).append("\"}");
		return surgeryRecordBuffer.toString();
	}
}
