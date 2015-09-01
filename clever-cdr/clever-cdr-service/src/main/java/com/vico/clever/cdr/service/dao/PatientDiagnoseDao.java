package com.vico.clever.cdr.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vico.clever.cdr.service.model.ProblemDiagnosis;

public interface PatientDiagnoseDao {
	
	public ProblemDiagnosis selectPatientDiagnose(@Param("patientID") String patientID,@Param("visitID") String visitID);
	
	public int deletePatientDiagnose(@Param("patientID") String patientID,@Param("visitID") String visitID);
	
	public int insertPatientDiagnose(ProblemDiagnosis problemDiagnosis);
	
	public int insertPatientDiagnoseList(List<ProblemDiagnosis> problemDiagnosisList);
	
	public int updatePatientDiagnose(ProblemDiagnosis problemDiagnosis);
	
	public int updatePatientDiagnoseList(List<ProblemDiagnosis> problemDiagnosisList);
	
	public int selectPatientDiagCount(@Param("patientID") String patientID,@Param("visitID") String visitID);

	public ProblemDiagnosis getProblemDiagnosisById(String problemDiagnosisId);
}
