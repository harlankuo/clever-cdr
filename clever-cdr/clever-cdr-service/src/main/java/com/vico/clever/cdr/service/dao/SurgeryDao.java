package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.SurgeryItem;
import com.vico.clever.cdr.service.model.SurgeryMaster;
import com.vico.clever.cdr.service.model.SurgeryRecord;
import com.vico.clever.cdr.service.model.SurgeryReqInfo;
import com.vico.clever.cdr.service.model.SurgeryStatus;

/** 
* @author ding.yuanyuan
* @description Interface to access database
* @date Aug 18, 2015 3:12:27 PM 
*/
public interface SurgeryDao {
	/*
	 * Table Inst_OperationRequest
	 */
	public SurgeryReqInfo getSurgeryReqInfoBySurgeryReqID(String surgeryReqID);
	
	public SurgeryReqInfo getSurgeryReqInfoByPatientID(String patientID);
	
	public SurgeryReqInfo getSurgeryReqInfoByVisitID(String visitID);
	
	public SurgeryReqInfo getSurgeryReqInfoByOrderID(String orderID);
	
	public List<SurgeryReqInfo> getAllSurgeryReqInfos();
	
	public int insertSurgeryReqInfo(SurgeryReqInfo surgeryReqInfo); 
	
	public int updateSurgeryReqInfo(SurgeryReqInfo surgeryReqInfo); 
	
	public int deleteSurgeryReqInfo(SurgeryReqInfo surgeryReqInfo); 
	
	/*
	 * Table Inst_OperationRequest_OperationItems
	 */
	public SurgeryItem getSurgeryItem(String surgeryReqID);
	
	public List<SurgeryItem> getAllSurgeryItems();
	
	public int insertSurgeryItem(SurgeryItem surgeryItem); 
	
	public int updateSurgeryItem(SurgeryItem surgeryItem); 
	
	public int deleteSurgeryItem(SurgeryItem surgeryItem); 
	
	/*
	 * Table Inst_OperationArrangement
	 */
	public SurgeryMaster getSurgeryMasterByPatientID(String patientID);
	
	public SurgeryMaster getSurgeryMasterByVisitID(String visitID);
	
	public SurgeryMaster getSurgeryMasterBySurgeryReqID(String surgeryReqID);
	
	public List<SurgeryMaster> getAllSurgeryMasters();
	
	public int insertSurgeryMaster(SurgeryMaster surgeryMaster); 
	
	public int updateSurgeryMaster(SurgeryMaster surgeryMaster); 
	
	public int deleteSurgeryMaster(SurgeryMaster surgeryMaster); 
	
	/*
	 * Table Obsr_OperationRecord
	 */
	public SurgeryRecord getSurgeryRecordBySurgeryReqID(String surgeryReqID);
	
	public SurgeryRecord getSurgeryRecordByPatientID(String patientID);
	
	public SurgeryRecord getSurgeryRecordByVisitID(String visitID);
	
	public SurgeryRecord getSurgeryRecordByReportID(String reportID);
	
	public List<SurgeryRecord> getAllSurgeryRecords();
	
	public int insertSurgeryRecord(SurgeryRecord surgeryRecord);
	
	public int updateSurgeryRecord(SurgeryRecord surgeryRecord);
	
	public int deleteSurgeryRecord(SurgeryRecord surgeryRecord);
	
	/*
	 * Table Action_Operation
	 */
	public SurgeryStatus getSurgeryStatusBySurgeryReqID(String surgeryReqID);
	
	public SurgeryStatus getSurgeryStatusByPatientID(String patientID);
	
	public SurgeryStatus getSurgeryStatusByVisitID(String visitID);
	
	public List<SurgeryStatus> getAllSurgeryStatus();
	
	public int insertSurgeryStatus(SurgeryStatus surgeryStatus);
	
	public int updateSurgeryStatus(SurgeryStatus surgeryStatus);
	
	public int deleteSurgeryStatus(SurgeryStatus surgeryStatus);
}
