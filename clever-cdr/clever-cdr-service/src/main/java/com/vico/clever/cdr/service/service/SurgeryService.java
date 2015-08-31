package com.vico.clever.cdr.service.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.SurgeryDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.SurgeryItem;
import com.vico.clever.cdr.service.model.SurgeryMaster;
import com.vico.clever.cdr.service.model.SurgeryRecord;
import com.vico.clever.cdr.service.model.SurgeryReqInfo;
import com.vico.clever.cdr.service.model.SurgeryStatus;

/** 
* @author ding.yuanyuan
* @description Check parameters and insert them into database
* @return IntegrationResult
* @date Aug 18, 2015 3:11:36 PM 
*/
public class SurgeryService {
	private IntegrationResult integrationResult = new IntegrationResult();
	private Logger logger = Logger.getLogger(this.getClass());
	public SurgeryService(){	
		super();
	}

	/*
	 * @description Transaction processing at surgery request stage,include: 
	 *              check parameters of Objects;check confliction in database;store data into database
	 * @return IntegrationResult
	 */
	public IntegrationResult surgeryReqExtract(SurgeryReqInfo surgeryReqInfo, List<SurgeryItem> surgeryItemList,
			SurgeryStatus surgeryStatus) {
		String checkResult = ""; //store the result of check parameters
//		PropertyConfigurator.configure("log4j.properties");
		/*
		 * check parameters of surgeryReqInfo
		 */
		checkResult = checkSurgeryReqInfo(surgeryReqInfo);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		
		/*
		 * check parameters of surgeryItemList 
		 */
		for (int i = 0;i < surgeryItemList.size();i++){
			checkResult = checkSurgeryItem(surgeryItemList.get(i));
			if (checkResult != null){
				integrationResult.setResultCode(-500);
				integrationResult.setResultDesc(checkResult);
				logger.error(checkResult);
				return integrationResult;
			}
		}
		
		/*
		 * check parameters of surgeryStatus
		 */
		checkResult = checkSurgeryStatus(surgeryStatus);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		
		/*
		 * insert data into database
		 */
		try{
			//open session
			SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
			SqlSession session = sqlSessionFactory.openSession();
			SurgeryDao surgeryDao = session.getMapper(SurgeryDao.class);
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryReqInfoBySurgeryReqID(surgeryReqInfo.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryReqInfo(surgeryReqInfo);
				session.commit();
			}
			else {
				//update 
				surgeryDao.updateSurgeryReqInfo(surgeryReqInfo);
				session.commit();
			}
			
			for (int i = 0;i < surgeryItemList.size();i++){
				//check whether the data is already in the database
				if (surgeryDao.getSurgeryItem(surgeryItemList.get(i).getSurgeryReqID()) == null)
				{
					//insert
					surgeryDao.insertSurgeryItem(surgeryItemList.get(i));
					session.commit();
				}
				else {
					//update
					surgeryDao.updateSurgeryItem(surgeryItemList.get(i));
					session.commit();
				}
			}
			
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryStatusBySurgeryReqID(surgeryStatus.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryStatus(surgeryStatus);
				session.commit();
			}
			else {
				//update
				surgeryDao.updateSurgeryStatus(surgeryStatus);
				session.commit();
			}
			//close session
			session.close();
		} catch(Exception e){
			logger.error(e.toString());
		}
		integrationResult.setResultCode(0);
		integrationResult.setResultDesc("Write data into Database on request for surgery successfully!");
		logger.info("Write data into Database on request for surgery successfully!");
		return integrationResult;
	}
	
	/*
	 * @description Transaction processing at surgery arrange stage,include: 
	 *              check parameters of Objects;check confliction in database;store data into database
	 * @return IntegrationResult
	 */
	public IntegrationResult surgeryArrange(SurgeryMaster surgeryMaster, SurgeryStatus surgeryStatus) {
		String checkResult = ""; //store the result of check parameters
		/*
		 * check parameters of surgeryMaster
		 */
		checkResult = checkSurgeryMaster(surgeryMaster);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		/*
		 * check parameters of surgeryStatus
		 */
		checkResult = checkSurgeryStatus(surgeryStatus);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		/*
		 * insert data into database
		 */
		try{
			//open session
			SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
			SqlSession session = sqlSessionFactory.openSession();
			SurgeryDao surgeryDao = session.getMapper(SurgeryDao.class);
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryMasterBySurgeryReqID(surgeryMaster.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryMaster(surgeryMaster);
				session.commit();
			}
			else {
				//update 
				surgeryDao.updateSurgeryMaster(surgeryMaster);
				session.commit();
			}
			
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryStatusBySurgeryReqID(surgeryStatus.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryStatus(surgeryStatus);
				session.commit();
			}
			else {
				//update
				surgeryDao.updateSurgeryStatus(surgeryStatus);
				session.commit();
			}
			//close session
			session.close();
		} catch(Exception e){
			logger.error(e.toString());
		}
		integrationResult.setResultCode(0);
		integrationResult.setResultDesc("Write data into Database on arrange for surgery successfully!");
		logger.info("Write data into Database on arrange for surgery successfully!");
		return integrationResult;
	}
	
	/*
	 * @description Transaction processing at surgery record stage,include: 
	 *              check parameters of Objects;check confliction in database;store data into database
	 * @return IntegrationResult
	 */
	public IntegrationResult surgeryRecord(SurgeryRecord surgeryRecord, SurgeryStatus surgeryStatus) {
		String checkResult = ""; //store the result of check parameters
		/*
		 * check parameters of surgeryRecord
		 */
		checkResult = checkSurgeryRecord(surgeryRecord);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		/*
		 * check parameters of surgeryStatus
		 */
		checkResult = checkSurgeryStatus(surgeryStatus);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		/*
		 * insert data into database
		 */
		try{
			//open session
			SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
			SqlSession session = sqlSessionFactory.openSession();
			SurgeryDao surgeryDao = session.getMapper(SurgeryDao.class);
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryRecordBySurgeryReqID(surgeryRecord.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryRecord(surgeryRecord);
				session.commit();
			}
			else {
				//update 
				surgeryDao.updateSurgeryRecord(surgeryRecord);
				session.commit();
			}
			
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryStatusBySurgeryReqID(surgeryStatus.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryStatus(surgeryStatus);
				session.commit();
			}
			else {
				//update
				surgeryDao.updateSurgeryStatus(surgeryStatus);
				session.commit();
			}
			//close session
			session.close();
		} catch(Exception e){
			logger.error(e.toString());
		}
		integrationResult.setResultCode(0);
		integrationResult.setResultDesc("Write data into Database on record for surgery successfully!");
		logger.info("Write data into Database on record for surgery successfully!");
		return integrationResult;
	}
	
	/*
	 * @description Transaction processing at surgery cancel stage,include:
	 *              check parameters of Object;update data in database
	 * @return IntegrationResult
	 */
	public IntegrationResult surgeryCancel(SurgeryStatus surgeryStatus) {
		String checkResult = ""; //store the result of check parameters
		/*
		 * check parameters of surgeryStatus
		 */
		checkResult = checkSurgeryStatus(surgeryStatus);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		/*
		 * insert data into database
		 */
		try{
			//open session
			SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
			SqlSession session = sqlSessionFactory.openSession();
			SurgeryDao surgeryDao = session.getMapper(SurgeryDao.class);
			
			//check whether the data is already in the database
			if (surgeryDao.getSurgeryStatusBySurgeryReqID(surgeryStatus.getSurgeryReqID()) == null){
				//insert
				surgeryDao.insertSurgeryStatus(surgeryStatus);
				session.commit();
			}
			else {
				//update
				surgeryDao.updateSurgeryStatus(surgeryStatus);
				session.commit();
			}
			//close session
			session.close();
		} catch(Exception e){
			logger.error(e.toString());
		}
		integrationResult.setResultCode(0);
		integrationResult.setResultDesc("Write data into Database on cancel for surgery successfully!");
		logger.info("Write data into Database on cancel for surgery successfully!");
		return integrationResult;
	}
	
	/*
	 * @description check pivotal parameters of SurgeryReqInfo
	 * @return String
	 */
	public String checkSurgeryReqInfo(SurgeryReqInfo surgeryReqInfo){
		//check SurgeryReqID:not null;length;content is all numbers
		if (surgeryReqInfo.getSurgeryReqID() == null) return "RequestorIdentifier is empty!";
		else if (surgeryReqInfo.getSurgeryReqID().length() > 30) return "RequestorIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryReqInfo.getSurgeryReqID())) 
			return "RequestorIdentifier is not consisted by only numbers!";
		//check PatientID:not null;length;content is all numbers
		if (surgeryReqInfo.getPatientID() == null) return "PatientIdentifier is empty!";
		else if (surgeryReqInfo.getPatientID().length() > 30) return "PatientIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryReqInfo.getPatientID()))
			return "PatientIdentifier is not consisted by only numbers!";
		//check VisitID:not null;length;content is all numbers
		if (surgeryReqInfo.getVisitID() == null) return "EncounterIdentifier is empty!";
		else if (surgeryReqInfo.getVisitID().length() > 30) return "EncounterIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryReqInfo.getVisitID()))
			return "EncounterIdentifier is not consisted by only numbers!";
		//check orderID:length;content is all numbers
		if (surgeryReqInfo.getOrderID() != null){
			if (surgeryReqInfo.getOrderID().length() > 30) return "OrderIdentifier is too long!";
			if (checkStringIsAllNumber(surgeryReqInfo.getOrderID())) 
				return "OrderIdentifier is not consisted by only numbers!";
		}
		//check other parameters:length
		if (surgeryReqInfo.getDiagnosisBefore().length() > 100) return "diagnosisBefore is too long!";
		if (surgeryReqInfo.getOperativeDoctorID().length() > 10) return "OperativeDoctor_Code is too long!";
		if (surgeryReqInfo.getOperativeDoctorName().length() > 30) return "OperativeDoctor_Name is too long!";
		if (surgeryReqInfo.getUrgencyCode().length() > 10) return "Urgency_Code is too long!";
		if (surgeryReqInfo.getUrgencyName().length() > 30) return "Urgency_Name is too long!";
		if (surgeryReqInfo.getIsolationIndicatorCode().length() > 20) return "IsolationIndicator_Code is too long!";
		if (surgeryReqInfo.getIsolationIndicator().length() > 30) return "IsolationIndicator_Name is too long!";
		if (surgeryReqInfo.getRelevantLabTest().length() > 200) return "RelevantLabTest is too long!";
		if (surgeryReqInfo.getOperativeDeptCode().length() > 10) return "OperativeDepartment_Code is too long!";
		if (surgeryReqInfo.getOperativeDeptName().length() > 30) return "OperativeDepartment_Name is too long!";
		if (surgeryReqInfo.getComments().length() > 500) return "Comments is too long!";
		if (surgeryReqInfo.getReqDeptCode().length() > 10) return "RequestorDepartment_Code is too long!";
		if (surgeryReqInfo.getReqDeptName().length() > 30) return "RequestorDepartment_Name is too long!";
		if (surgeryReqInfo.getReqDoctorID().length() > 10) return "RequestDoctor_Code is too long!";
		if (surgeryReqInfo.getReqDoctorName().length() > 30) return "RequestDoctor_Name is too long!";
		if (surgeryReqInfo.getRequestStatus().length() > 4) return "RequestStatus is too long!";
		if (surgeryReqInfo.getDosage().length() > 10) return "Dosage is too long!";
		if (surgeryReqInfo.getDosageUnit().length() > 30) return "DosageUnit is too long!";
		if (surgeryReqInfo.getAdministrationCode().length() > 10) return "Administration_Code is too long!";
		if (surgeryReqInfo.getAdministrationName().length() > 30) return "Administration_Name is too long!";
		if (surgeryReqInfo.getFrequencyUnit().length() > 4) return "Frequency_Units is too long!";
		if (surgeryReqInfo.getFrequencyIntervalUnit().length() > 10) return "FrequecyInterval_Units is too long!";
		
		return null;
	}
	
	/*
	 * @description check pivotal parameters of SurgeryItem
	 * @return String
	 */
	public String checkSurgeryItem(SurgeryItem surgeryItem){
		//check SurgeryReqID:not null;length;content is all numbers
		if (surgeryItem.getSurgeryReqID() == null) return "SurgeryReqID is empty!";
		else if (surgeryItem.getSurgeryReqID().length() > 30) return "SurgeryReqID is too long!";
		else if (checkStringIsAllNumber(surgeryItem.getSurgeryReqID())) 
			return "SurgeryReqID is not consisted by only numbers!";
		//check other parameters:length
		if (surgeryItem.getOperationCode().length() > 10) return "OperationRequested is too long!";
		if (surgeryItem.getOperationName().length() > 30) return "DescriptionOfOperation is too long!";
		if (surgeryItem.getLocationName().length() > 30) return "Location_Name is too long!";
		if (surgeryItem.getLocationCode().length() > 10) return "Location_Code is too long!";
		if (surgeryItem.getLevelOfIncisionName().length() > 30) return "LevelOfIncision_Name is too long!";
		if (surgeryItem.getLevelOfIncisionCode().length() > 10) return "LevelOfIncision_Code is too long!";
		if (surgeryItem.getOperationLevelCode().length() > 10) return "OperationLevel_Code is too long!";
		if (surgeryItem.getOperationLevelName().length() > 30) return "OperationLevel_Name is too long!";
		if (surgeryItem.getOperationNO().length() > 10) return "OperationSerialNumber is too long!";
		if (surgeryItem.getOperationSerialNumberCode().length() > 10) return "OperationSerialNumber_Code is too long!";
		if (surgeryItem.getOperationSerialNumberName().length() > 30) return "OperationSerialNumber_Name is too long!";
		
		return null;
	}
	
	/*
	 * @description check pivotal parameters of SurgeryMaster
	 * @return String
	 */
	public String checkSurgeryMaster(SurgeryMaster surgeryMaster){
		//check SurgeryReqID:not null;length;content is all numbers
		if (surgeryMaster.getSurgeryReqID() == null) return "SurgeryReqID is empty!";
		else if (surgeryMaster.getSurgeryReqID().length() > 30) return "SurgeryReqID is too long!";
		else if (checkStringIsAllNumber(surgeryMaster.getSurgeryReqID()))
			return "SurgeryReqID is not consisted by only numbers";
		//check PatientID:not null;length;content is all numbers
		if (surgeryMaster.getPatientID() == null) return "PatientID is empty!";
		else if (surgeryMaster.getPatientID().length() > 30) return "PatientID is too long!";
		else if (checkStringIsAllNumber(surgeryMaster.getPatientID()))
			return "PatientID is not consisted by only numbers";
		//check VisitID:not null;length;content is all numbers
		if (surgeryMaster.getVisitID() == null) return "VisitID is empty!";
		else if (surgeryMaster.getVisitID().length() > 30) return "VisitID is too long!";
		else if (checkStringIsAllNumber(surgeryMaster.getVisitID()))
			return "VisitID is not consisted by only numbers";
		//check other parameters:length
		if (surgeryMaster.getIntervention().length() > 50) return "Intervention is too long!";
		if (surgeryMaster.getOperateApproachCode().length() > 10) return "OperateApproach_Code is too long!";
		if (surgeryMaster.getOperateApproachName().length() > 30) return "OperateApproach_Name is too long!";
		if (surgeryMaster.getSurgicalDoctorOneCode().length() > 10) return "SurgicalDoctorOne_Id is too long!";
		if (surgeryMaster.getSurgicalDoctorOneName().length() > 30) return "SurgicalDoctorOne_Name is too long!";
		if (surgeryMaster.getSurgicalDoctorTwoCode().length() > 10) return "SurgicalDoctorTwo_Id is too long!";
		if (surgeryMaster.getSurgicalDoctorTwoName().length() > 30) return "SurgicalDoctorTwo_Name is too long!";
		if (surgeryMaster.getAssistantOperatorOneCode().length() > 10) return "AssistantOperatorOne_Id is too long!";
		if (surgeryMaster.getAssistantOperatorOneName().length() > 30) return "AssistantOperatorOne_Name is too long!";
		if (surgeryMaster.getAssistantOperatorTwoCode().length() > 10) return "AssistantOperatorTwo_Id is too long!";
		if (surgeryMaster.getAssistantOperatorTwoName().length() > 30) return "AssistantOperatorTwo_Name is too long!";
		if (surgeryMaster.getAssistantOperatorThreeCode().length() > 10) return "AssistantOperatorThree_Id is too long!";
		if (surgeryMaster.getAssistantOperatorThreeName().length() > 30) return "AssistantOperatorThree_Name is too long!";
		if (surgeryMaster.getAssistantOperatorFourCode().length() > 10) return "AssistantOperatorFour_Id is too long!";
		if (surgeryMaster.getAssistantOperatorFourName().length() > 30) return "AssistantOperatorFour_Name is too long!";
		if (surgeryMaster.getInstrumentNurseOneCode().length() > 10) return "InstrumentNurseOne_Id is too long!";
		if (surgeryMaster.getInstrumentNurseOneName().length() > 30) return "InstrumentNurseOne_Name is too long!";
		if (surgeryMaster.getInstrumentNurseTwoCode().length() > 10) return "InstrumentNurseTwo_Id is too long!";
		if (surgeryMaster.getInstrumentNurseTwoName().length() > 30) return "InstrumentNurseTwo_Name is too long!";
		if (surgeryMaster.getInspectionNurseOneCode().length() > 10) return "InspectionNurseOne_Id is too long!";
		if (surgeryMaster.getInspectionNurseOneName().length() > 30) return "InspectionNurseOne_Name is too long!";
		if (surgeryMaster.getInspectionNurseTwoCode().length() > 10) return "InspectionNurseTwo_Id is too long!";
		if (surgeryMaster.getInspectionNurseTwoName().length() > 30) return "InspectionNurseTwo_Name is too long!";
		if (surgeryMaster.getOperatingRoomNOCode().length() > 10) 
			return "OperationOnSite_OperatingRoomNumber_Code is too long!";
		if (surgeryMaster.getOperatingRoomNO().length() > 30) 
			return "OperationOnSite_OperatingRoomNumber_Name is too long!";
		if (surgeryMaster.getOperatingRoomCode().length() > 10) return "OperationOnSite_OperatingRoom_Code is too long!";
		if (surgeryMaster.getOperatingRoom().length() > 30) return "OperationOnSite_OperatingRoom_Name is too long!";
		if (surgeryMaster.getOperationTableCode().length() > 10) return "OperationOnSite_OperationTable_Code is too long!";
		if (surgeryMaster.getOperationTable().length() > 30) return "OperationOnSite_OperationTable_Name is too long!";
		if (surgeryMaster.getOperationLevelCode().length() > 10) return "OperationLevel_Code is too long!";
		if (surgeryMaster.getOperationLevelName().length() > 30) return "OperationLevel_Name is too long!";
		if (surgeryMaster.getAnesthetistApproachCode().length() > 10) return "AnesthsiaApproach_Code is too long!";
		if (surgeryMaster.getAnesthetistApproachName().length() > 30) return "AnesthsiaApproach_Name is too long!";
		if (surgeryMaster.getAnestheistCode().length() > 10) return "Anesthetist_Id is too long!";
		if (surgeryMaster.getAnestheistName().length() > 30) return "Anesthetist_Name is too long!";
		if (surgeryMaster.getAssistantAnestheistOneCode().length() > 10) return "AssistantAnesthetistOne_Id is too long!";
		if (surgeryMaster.getAssistantAnestheistOneName().length() > 30) return "AssistantAnesthetistOne_Name is too long!";
		if (surgeryMaster.getAssistantAnestheistTwoCode().length() > 10) return "AssistantAnesthetistTwo_Id is too long!";
		if (surgeryMaster.getAssistantAnestheistTwoName().length() > 30) return "AssistantAnesthetistTwo_Name is too long!";
		if (surgeryMaster.getSurgicalPositionCode().length() > 10) return "SurgicalPosition_Code is too long!";
		if (surgeryMaster.getSurgicalPositionName().length() > 30) return "SurgicalPosition_Name is too long!";
		if (surgeryMaster.getSurgicalModeCode().length() > 10) return "SurgicalMode_Code is too long!";
		if (surgeryMaster.getSurgicalModeName().length() > 30) return "SurgicalMode_Name is too long!";
		if (surgeryMaster.getOperationSerialNO().length() > 10) return "OperationSerialNumber is too long!";
		
		return null;
	}
	
	/*
	 * @description check pivotal parameters of SurgeryRecord
	 * @return String
	 */
	public String checkSurgeryRecord(SurgeryRecord surgeryRecord){
		//check SurgeryReqID:not null;length;content is all numbers
		if (surgeryRecord.getSurgeryReqID() == null) return "RequestorIdentifier is empty!";
		else if (surgeryRecord.getSurgeryReqID().length() > 30) return "RequestorIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryRecord.getSurgeryReqID())) 
			return "RequestorIdentifier is not consisted by only numbers!";
		//check PatientID:not null;length;content is all numbers
		if (surgeryRecord.getPatientID() == null) return "PatientIdentifier is empty!";
		else if (surgeryRecord.getPatientID().length() > 30) return "PatientIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryRecord.getPatientID()))
			return "PatientIdentifier is not consisted by only numbers!";
		//check VisitID:not null;length;content is all numbers
		if (surgeryRecord.getVisitID() == null) return "EncounterIdentifier is empty!";
		else if (surgeryRecord.getVisitID().length() > 30) return "EncounterIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryRecord.getVisitID()))
			return "EncounterIdentifier is not consisted by only numbers!";
		//check ReportID:not null;length;content is all numbers
		if (surgeryRecord.getReportID() == null) return "ReportedIdentifier is empty!";
		else if (surgeryRecord.getReportID().length() > 30) return "ReportedIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryRecord.getReportID()))
			return "ReportedIdentifier is not consisted by only numbers";
		//check other parameters:length
		if (surgeryRecord.getBleedingUnit().length() > 30) return "OperativeDetails_Bleeding_Units is too long!";
		if (surgeryRecord.getSurDescriptionCode().length() > 10) 
			return "OperativeDetails_DetailsOfSurgeryPerformed_Description_Code is too long!";
		if (surgeryRecord.getSurDescription().length() > 30) 
			return "OperativeDetails_DetailsOfSurgeryPerformed_Description_Name is too long!";
		if (surgeryRecord.getSkinDisinfection().length() > 200) return "OperativeDetails_SkinDisinfection is too long!";
		if (surgeryRecord.getIncisionDescription().length() > 100) return "Incision_Description is too long!";
		if (surgeryRecord.getClosureDrainsMaterial().length() > 20) return "Closure_Drains_Material is too long!";
		if (surgeryRecord.getClosureDrainsLocation().length() > 10) return "Closure_Drains_Location is too long!";
		if (surgeryRecord.getAnesthesiaIndication().length() > 150) 
			return "OperativeDetails_Anesthesia_Indication is too long!";
		if (surgeryRecord.getAnesthesiaRecovery().length() > 100) return "OperativeDetails_Anesthesia_Recovery is too long!";
		if (surgeryRecord.getAnesthesiaASACode().length() > 10) return "OperativeDetails_Anesthesia_Asa_Code is too long!";
		if (surgeryRecord.getAnesthesiaASA().length() > 30) return "OperativeDetails_Anesthesia_Asa_Name is too long!";
		if (surgeryRecord.getAnesthesiaMedicine().length() > 50) return "OperativeDetails_Anesthesia_Medicine is too long!";
		if (surgeryRecord.getAnesthesiaPosition().length() > 20) return "OperativeDetails_Anesthesia_Position is too long!";
		if (surgeryRecord.getAnesthesiaDescription().length() > 200) 
			return "OperativeDetails_Anesthesia_Description is too long!";
		if (surgeryRecord.getAnesthesiaComplication().length() > 10) 
			return "OperativeDetails_Anesthesia_Complication is too long!";
		if (surgeryRecord.getAnesthesiaEffect().length() > 200) return "OperativeDetails_Anesthesia_Effect is too long!";
		if (surgeryRecord.getAnesthesiaPremediaine().length() > 500) 
			return "OperativeDetails_Anesthesia_Premedication is too long!";
		if (surgeryRecord.getTracheaCannulaType().length() > 10) return "Closure_TracheaCannula_Type is too long!";
		if (surgeryRecord.getTracheaCannulaUnpin().length() > 10) 
			return "Closure_TracheaCannula_UnpinCannula is too long!";
		if (surgeryRecord.getTransfusionVolumeUnit().length() > 30) return "Transfusion_Volume_Units is too long!";
		if (surgeryRecord.getTransfusionItem().length() > 10) return "Transfusion_Items is too long!";
		if (surgeryRecord.getIncsionLevelCode().length() > 10) return "Incision_LevelOfIncision_Code is too long!";
		if (surgeryRecord.getIncsionLevelName().length() > 30) return "Incision_LevelOfIncision_Name is too long!";
		if (surgeryRecord.getHealLevel().length() > 100) return "Incision_HealingLevel is too long!";
		
		return null;
	}
	
	/*
	 * @description check pivotal parameters of SurgeryStatus
	 * @return String
	 */
	public String checkSurgeryStatus(SurgeryStatus surgeryStatus){
		//check SurgeryReqID:not null;length;content is all numbers
		if (surgeryStatus.getSurgeryReqID() == null) return "RequestorIdentifier is empty!";
		else if (surgeryStatus.getSurgeryReqID().length() > 30) return "RequestorIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryStatus.getSurgeryReqID())) 
			return "RequestorIdentifier is not consisted by only numbers!";
		//check PatientID:not null;length;content is all numbers
		if (surgeryStatus.getPatientID() == null) return "PatientIdentifier is empty!";
		else if (surgeryStatus.getPatientID().length() > 30) return "PatientIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryStatus.getPatientID()))
			return "PatientIdentifier is not consisted by only numbers!";
		//check VisitID:not null;length;content is all numbers
		if (surgeryStatus.getVisitID() == null) return "EncounterIdentifier is empty!";
		else if (surgeryStatus.getVisitID().length() > 30) return "EncounterIdentifier is too long!";
		else if (checkStringIsAllNumber(surgeryStatus.getVisitID()))
			return "EncounterIdentifier is not consisted by only numbers!";
		//check other parameters:length
		if (surgeryStatus.getOperationName().length() > 30) return "OperationName is too long!";
		if (surgeryStatus.getCurStateCode().length() > 8) return "IsmTransition_CurrentState_Code is too long!";
		if (surgeryStatus.getCurStateName().length() > 30) return "IsmTransition_CurrentState_Name is too long!";
		if (surgeryStatus.getCareflowStepCode().length() > 8) return "IsmTransition_CareflowStep_Code is too long!";
		if (surgeryStatus.getCareflowStepName().length() > 30) return "IsmTransition_CareflowStep_Name is too long!";
		if (surgeryStatus.getComment().length() > 180) return "Comment is too long!";
		if (surgeryStatus.getPerformDoctorCode().length() > 30) return "Performer_Code is too long!";
		if (surgeryStatus.getPerformDoctorName().length() > 30) return "Performer_Name is too long!";
		
		return null;
	}
	
	/*
	 * @description check all String consists of numbers
	 * @return boolean(true:include other char;false:all numbers;) 
	 */
	private boolean checkStringIsAllNumber(String str){
		for (int i = 0;i < str.length();i++){
			if ((str.charAt(i)>'9')||(str.charAt(i)<'0'))
				return true;
		}
		return false;
	}
	

}
