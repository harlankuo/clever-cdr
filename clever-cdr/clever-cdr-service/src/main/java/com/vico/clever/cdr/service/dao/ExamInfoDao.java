package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.ExamDataInfo;
import com.vico.clever.cdr.service.model.ExamItem;
import com.vico.clever.cdr.service.model.ExamReportInfo;
import com.vico.clever.cdr.service.model.ExamReqInfo;
import com.vico.clever.cdr.service.model.ExamStatus;

public interface ExamInfoDao {
	/*
	 * selectExamReqInfo ,deleteExamReqInfo ,insertExamReqInfo,updateExamReqInfo
	 * 
	 * selectExamItem,deleteExamItem,insertExamItemList,updateExamItem
	 * 
	 * selectExamStatus,deleteExamStatus,insertExamStatus, updateExamStatus
	 * 
	 * selectExamData,deleteExamData,insertExamDataList
	 * 
	 * selectExamReportInfo,deleteExamReportInfo,insertExamReportList,
	 * insertExamReport,updateExamReport
	 */
	// ExamReqInfo
	public ExamReqInfo selectExamReqInfo(String examReqID);

	public int deleteExamReqInfo(String examReqID);

	public int insertExamReqInfo(ExamReqInfo examReqInfo);

	public int updateExamReqInfo(ExamReqInfo examReqInfo);

	// ExamItem
	public List<ExamItem> selectExamItem(String examReqID);

	public int deleteExamItem(String examReqID);

	public int insertExamItemList(List<ExamItem> examItemList);

	// public int updateExamItem(ExamItem examItem);

	// ExamStatus
	public List<ExamStatus> selectExamStatus(String examReqID);

	public int deleteExamStatus(String examReqID);

	public int insertExamStatus(ExamStatus examStatus);

	public int updateExamStatus(ExamStatus examStatus);

	// ExamDataInfo
	public ExamDataInfo selectExamData(String examID);

	public int deleteExamData(String examID);

	public int insertExamDataList(List<ExamDataInfo> examDataList);

	// ExamReportInfo
	public ExamReportInfo selectExamReportInfo(String examID);

	public int deleteExamReportInfo(String examID);

	public int insertExamReportList(List<ExamReportInfo> examReportList);

	public int insertExamReport(ExamReportInfo examReportInfo);

	public int updateExamReport(ExamReportInfo examReportInfo);

}
