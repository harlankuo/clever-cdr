package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.PhysicalExamination;

public interface PhysicalExaminationDao {
	public PhysicalExamination selectPhysicalExamination(String requestID);
	public int insertPhysicalExamination(PhysicalExamination  physicalExamination);
	public int updatePhysicalExamination(PhysicalExamination  physicalExamination);
	public int deletePhysicalExamination(String requestID);

}
