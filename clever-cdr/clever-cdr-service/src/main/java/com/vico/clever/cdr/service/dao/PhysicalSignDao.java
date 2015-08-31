package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.PhysicalSign;

/** 
* @author ding.yuanyuan
* @description Interfaces to access database
* @date Aug 24, 2015 9:15:02 AM 
*/
public interface PhysicalSignDao {
	/*
	 * Table Obsr_PhysicalSign
	 */
	public PhysicalSign getPhysicalSignByRecordID(String recordID);
	
	public PhysicalSign getPhysicalSignByPatientID(String patientID);
	
	public PhysicalSign getPhysicalSignByVisitID(String visitID);
	
	public List<PhysicalSign> getAllPhysicalSigns();
	
	public int insertPhysicalSign(PhysicalSign PhysicalSign); 
	
	public int updatePhysicalSign(PhysicalSign PhysicalSign); 
	
	public int deletePhysicalSign(PhysicalSign PhysicalSign); 
}
