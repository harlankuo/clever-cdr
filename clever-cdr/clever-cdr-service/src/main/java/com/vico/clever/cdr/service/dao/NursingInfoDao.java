package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Nursing;
import com.vico.clever.cdr.service.model.NursingAction;
/**
 *@author Yuan.Ziyang 
 * 
 */
public interface NursingInfoDao {
	/**
	 * selectNursingInfo 
	 * deleteNursingInfo
	 * insertNursingInfo
	 * updateNursingInfo
	 * 
	 * selectNursingAction
	 * deleteNursingAction
	 * insertNursingAction
	 * 
	 */
	public Nursing selectNursingInfo(String nursingID);
	
	public int deleteNursingInfo(String nursingID);
	
	public int insertNursingInfo(Nursing nursing);
	
	public int updateNursingInfo(Nursing nursing);
	
	public int insertNursingAction(NursingAction nursingAction);
	
}
