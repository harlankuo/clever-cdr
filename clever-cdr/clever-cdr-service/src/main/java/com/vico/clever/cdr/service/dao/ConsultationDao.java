package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Consultation;
import com.vico.clever.cdr.service.model.ConsultationAction;

/**
 * @author Yuan.Ziyang
 */
public interface ConsultationDao {
	/*
	 * selectConsultation deleteConsultation insertConsultation
	 * updateConsultation
	 * 
	 * selectConsultationAction deleteConsultationAction
	 * insertConsultationAction
	 */

	public Consultation selectConsultation(String consultRequestID);

	public int deleteConsultation(String consultRequestID);

	public int insertConsultation(Consultation consultation);

	public int updateConsultation(Consultation consultation);

	public int insertConsultationAction(ConsultationAction consultationAction);
	
	public int deleteConsultationAction(String consultRequestID);
}
