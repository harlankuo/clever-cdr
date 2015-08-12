package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.DrugDispenseReqStatus;
import com.vico.clever.cdr.service.model.DrugDispensingReq;

public interface DrugsDispenseDao {
	/*
	 * selectDrugDispenseReq
	 * deleteDrugDispenseReq
	 * insertDrugDispenseReq
	 * updateDrugDispenseReq
	 * 
	 * selectDrugDispenseReqStatus
	 * deleteDrugDispenseReqStatus
	 * insertDrugDispenseReqStatus
	 * updateDrugDispenseReqStatus
	 * 
	 * */
	
	public DrugDispensingReq selectDrugDispenseReq(String drugDispensingReqID);
	
	public int deleteDrugDispenseReq(String drugDispensingReqID);
	
	public int insertDrugDispenseReq(DrugDispensingReq drugDispensingReq);
	
	public int updateDrugDispenseReq(DrugDispensingReq drugDispensingReq);
	
	public List<DrugDispenseReqStatus> selectDrugDispenseReqStatus(String drugDispensingReqID);
	
	public int deleteDrugDispenseReqStatus(String drugDispensingReqID);
	
	public int insertDrugDispenseReqStatus(DrugDispenseReqStatus drugDispenseReqStatus);
	
	public int updateDrugDispenseReqStatus(DrugDispenseReqStatus drugDispenseReqStatus);
	
	
	
	
}
