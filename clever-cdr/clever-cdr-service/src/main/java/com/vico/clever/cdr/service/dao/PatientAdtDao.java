package com.vico.clever.cdr.service.dao;

import org.apache.ibatis.annotations.Param;

import com.vico.clever.cdr.service.model.PatientADTInfo;
import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientDischargeInfo;
import com.vico.clever.cdr.service.model.PatientInfo;


public interface PatientAdtDao {
	
	public int insertPatientInfo(PatientInfo patientInfo);
	
	public int insertPatientAdmission(PatientAdmission patientAdmission);
	
	public PatientInfo selectPatientInfo(String patientID);
	
	public PatientAdmission selectPatientVisit(String visitId);
	
	public int deletePatInfoByPatId(String patientID);
	
	public int deletePatVisitByVisitId(String visitId);
	
	public int updatePatInfoByPatId(PatientInfo patientInfo);
	
	public int updatePatVisitInfo(PatientAdmission patientAdmission);
	
	public int insertPatTransferInfo(PatientADTInfo patientADTInfo);
	
	public PatientADTInfo selectPatTransferInfo(@Param("patientID") String patientID,@Param("visitId") String visitId);
	
	public int deletePatTransferInfo(@Param("patientID") String patientID,@Param("visitId") String visitId);
	
	public int updatePatTransferInfo(PatientADTInfo patientADTInfo);
	
	public int selectCountPatInfo(String patientID);
	
	public int selectCountPatVisit(String visitId);
	
	public int insertPatDisChargeInfo(PatientDischargeInfo patDischargeInfo);
	
	public int deletePatDisCharge(@Param("patientID") String patientID,@Param("visitId") String visitId);

}
