package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Therapy;
import com.vico.clever.cdr.service.model.TherapyAction;

/**
 * 
 * @author Yuan.Ziyang
 * 
 */
public interface TherapyInfoDao {
	/*
	 * selectTherapy deleteTherapy insertTherapy updateTherapy
	 * 
	 * selectTherapyAction deleteTherapyAction insertTherapyAction
	 * updateTherapyAction
	 */

	public Therapy selectTherapy(String therapyID);

	public int deleteTherapy(String therapyID);

	public int insertTherapy(Therapy therapy);

	public int updateTherapy(Therapy therapy);

	public int insertTherapyAction(TherapyAction therapyAction);

}
