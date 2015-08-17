package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.FareInfo;
import com.vico.clever.cdr.service.model.FareStatus;

/**
 *@author Yuan.Ziyang
 * 
 */
public interface FareInfoDao {
	/*
	 * selectFareInfo
	 * deleteFareInfo
	 * insertFareInfo
	 * updateFareInfo
	 * 
	 * selectFareStatus
	 * deleteFareStatus
	 * insertFareStatus
	 * updateFareStatus
	 * 
	 * */
	
	public FareInfo selectFareInfo(String feeID);
	
	public int deleteFareInfo(String feeID);
	
	public int insertFareInfo(FareInfo fareInfo);
	
	public int updateFareInfo(FareInfo fareInfo);
	
	public int insertFareStatus(FareStatus fareStatus);
}
