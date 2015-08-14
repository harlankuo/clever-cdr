package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.LabTestData;
import com.vico.clever.cdr.service.model.LabTestItem;
import com.vico.clever.cdr.service.model.LabTestReqInfo;
import com.vico.clever.cdr.service.model.LabTestStatus;

public interface LabTestInfoDao {
	/*
	 * selectLabTestReqInfo
	 * deleteLabTestReqInfo
	 * insertLabTestReqInfo
	 * updateLabTestReqInfo
	 * 
	 * selectLabTestItem
	 * deleteLabTestItem
	 * insertLabTestItemList
	 * 
	 * selectLabTestData
	 * deleteLabTestData
	 * insertLabTestDataList
	 * updateLabTestData
	 * 
	 * selectLabTestStatus
	 * deleteLabTestStatus
	 * insertLabTestStatus
	 * updateLabTestStatus
	 * 
	 * */
	
	public LabTestReqInfo selectLabTestReqInfo(String testReqID);
	
	public int deleteLabTestReqInfo(String testReqID);
	
	public int insertLabTestReqInfo(LabTestReqInfo labTestReqInfo);
	
	public int updateLabTestReqInfo(LabTestReqInfo labTestReqInfo);
	
	public List<LabTestItem> selectLabTestItem(String testReqID);
	
	public int deleteLabTestItem(String testReqID);
	
	public int insertLabTestItemList(List<LabTestItem> labTestItemList);
	
	public LabTestData selectLabTestData(String testReqID);
	
	public int deleteLabTestData(String testReqID);
	
	public int insertLabTestDataList(List<LabTestData> labTestDataList);
	
	public int updateLabTestData(LabTestData labTestData);
	
	public List<LabTestStatus> selectLabTestStatus(String testReqID);
	
	public int deleteLabTestStatus(String testReqID);
	
	public int insertLabTestStatus(LabTestStatus labTestStatus);
	
	public int updateLabTestStatus(LabTestStatus labTestStatus);
	
}
