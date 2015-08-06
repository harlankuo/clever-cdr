package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;


public interface PatientAdtDao {
	
	public int insertPatientInfo(PatientInfo patientInfo);
	
	public int insertPatientAdmission(PatientAdmission patientAdmission);
	
	public PatientInfo selectPatientInfo(String patientId);
	
	public PatientAdmission selectPatientVisit(String visitId);
	
	public int deletePatInfoByPatId(String patientId);
	
	public int deletePatVisitByVisitId(String visitId);
	
	public int updatePatInfoByPatId(PatientInfo patientInfo);
	
	public int updatePatVisitInfo(PatientAdmission patientAdmission);

}
