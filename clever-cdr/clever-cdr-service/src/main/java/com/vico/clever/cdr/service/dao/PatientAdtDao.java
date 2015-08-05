package com.vico.clever.cdr.service.dao;

import org.springframework.stereotype.Repository;

import com.vico.clever.cdr.service.model.PatientAdmission;
import com.vico.clever.cdr.service.model.PatientInfo;

@Repository("patientAdtDao")
public interface PatientAdtDao {
	
	public long insertPatientInfo(PatientInfo patientInfo);
	
	public long insertPatientAdmission(PatientAdmission patientAdmission);

}
