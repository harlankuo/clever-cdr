package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Diet;
import com.vico.clever.cdr.service.model.DietAction;

public interface DietInfoDao {
	/*
	 * selectDiet
	 * deleteDiet
	 * insertDiet
	 * updateDiet
	 * 
	 * selectDietAction
	 * deleteDietAction
	 * insertDietAction
	 * 
	 * */
	
	public Diet selectDiet(String dietID);
	
	public int deleteDiet(String dietID);
	
	public int insertDiet(Diet diet);
	
	public int updateDiet(Diet diet);
	
	public int insertDietAction(DietAction dietAction);
	
}
