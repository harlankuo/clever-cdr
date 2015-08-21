package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.BloodMatching;
import com.vico.clever.cdr.service.model.BloodMatchingAction;

/**
 * @author Yuan.Ziyang
 * 
 */
public interface BloodMatchingDao {
	/*
	 * selectBloodMatching deleteBloodMatching insertBloodMatching
	 * updateBloodMatching
	 * 
	 * selectBloodMatchingAction deleteBloodMatchingAction
	 * insertBloodMatchingAction
	 */

	public BloodMatching selectBloodMatching(String bloodMatchingID);

	public int deleteBloodMatching(String bloodMatchingID);

	public int insertBloodMatching(BloodMatching bloodMatching);

	public int updateBloodMatching(BloodMatching bloodMatching);

	public int insertBloodMatchingAction(BloodMatchingAction bloodMatchingAction);

}
