package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Remain;
import com.vico.clever.cdr.service.model.RemainAction;

public interface RemainInfoDao {
	/*
	 * selectRemain deleteRemain insertRemain updateRemain
	 * 
	 * selectRemainAction deleteRemainAction insertRemainAction
	 */

	public Remain selectRemain(String requestID);

	public int deleteRemain(String requestID);

	public int insertRemain(Remain remain);

	public int updateRemain(Remain remain);

	public int insertRemainAction(RemainAction remainAction);
}
