package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.PrescriptionDetail;
import com.vico.clever.cdr.service.model.PrescriptionInfo;
import com.vico.clever.cdr.service.model.PrescriptionStatus;

public interface PrescriptionInfoDao {
	/*	PrescriptionInfoMapper
	 * 方法映射：
	 * 
	 * selectPrescriptionInfo
	 * deletePrescriptionInfo
	 * insertPrescriptionInfo
	 * updatePrescriptionInfo
	 * 
	 * selectPrescriptionDetail
	 * deletePrescriptionDetail
	 * insertPrescriptionDetailList
	 * updatePrescriptionDetail
	 * 
	 * selectPrescriptionStatus
	 * deletePrescriptionStatus
	 * insertPrescriptionStatus
	 * updatePrescriptionStatus
	 * 
	 * */
	public PrescriptionInfo selectPrescriptionInfo(String prescriptionID);
	
	public int deletePrescriptionInfo(String prescriptionID);
	
	public int insertPrescriptionInfo(PrescriptionInfo prescriptionInfo);
	
	public int updatePrescriptionInfo(PrescriptionInfo prescriptionInfo);
	
	
	public List<PrescriptionDetail> selectPrescriptionDetail(String prescriptionID);
	
	public int deletePrescriptionDetail(String prescriptionID);
	
	public int insertPrescriptionDetailList(List<PrescriptionDetail> prescriptionDetailList);
	
	public int updatePrescriptionDetail(String prescriptionID);
	
	
	public PrescriptionStatus selectPrescriptionStatus(String prescriptionID);
	
	public int deletePrescriptionStatus(String prescriptionID);
	
	public int insertPrescriptionStatus(PrescriptionStatus prescriptionStatus);
	
	public int updatePrescriptionStatus(PrescriptionStatus prescriptionStatus);
}
