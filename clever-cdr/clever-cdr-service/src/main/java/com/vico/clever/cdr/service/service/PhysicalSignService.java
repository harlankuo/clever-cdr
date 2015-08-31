package com.vico.clever.cdr.service.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.dao.PhysicalSignDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.PhysicalSign;

/** 
* @author ding.yuanyuan
* @description Check parameters and insert them into database
* @date Aug 24, 2015 9:18:45 AM 
*/
public class PhysicalSignService {
	private Logger logger = Logger.getLogger(this.getClass());
	public PhysicalSignService() {
		super();
	}

	/*
	 * @description Transaction processing at inserting PhysicalSign stage,include: 
	 *              check parameters of Objects;check confliction in database;store data into database
	 * @return IntegrationResult
	 */
	public IntegrationResult insertPhysicalSign(PhysicalSign physicalSign) {
		IntegrationResult integrationResult = new IntegrationResult();
		String checkResult = ""; //store the result of check parameters
		/*
		 * check parameters of physicalSign
		 */
		checkResult = checkPhysicalSign(physicalSign);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		else{
			/*
			 * insert data into database
			 */
			try{
				//open session
				SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
				SqlSession session = sqlSessionFactory.openSession();
				PhysicalSignDao physicalSignDao = session.getMapper(PhysicalSignDao.class);
				//check whether the data is already in the database
				if (physicalSignDao.getPhysicalSignByRecordID(physicalSign.getRecordID()) == null){
					//insert
					physicalSignDao.insertPhysicalSign(physicalSign);
					session.commit();
				}
				else {
					//update 
					physicalSignDao.updatePhysicalSign(physicalSign);
					session.commit();
				}
				//close session
				session.close();
			} catch (Exception e){
				logger.error(e.toString());
			}
			//return
			integrationResult.setResultCode(0);
			integrationResult.setResultDesc("Write data into Database on inserting physicalSign successfully!");
			logger.info("Write data into Database on inserting physicalSign successfully!");
			return integrationResult;
		}
	}

	/*
	 * @description Transaction processing at updating PhysicalSign stage,include: 
	 *              check parameters of Objects;check confliction in database;store data into database
	 * @return IntegrationResult
	 */
	public IntegrationResult updatePhysicalSign(PhysicalSign physicalSign) {
		IntegrationResult integrationResult = new IntegrationResult();
		String checkResult = ""; //store the result of check parameters
		/*
		 * check parameters of physicalSign
		 */
		checkResult = checkPhysicalSign(physicalSign);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		else{
			/*
			 * update data into database
			 */
			try{
				//open session
				SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
				SqlSession session = sqlSessionFactory.openSession();
				PhysicalSignDao physicalSignDao = session.getMapper(PhysicalSignDao.class);
				//check whether the data is already in the database
				if (physicalSignDao.getPhysicalSignByRecordID(physicalSign.getRecordID()) == null){
					//insert
					physicalSignDao.insertPhysicalSign(physicalSign);
					session.commit();
				}
				else {
					//update 
					physicalSignDao.updatePhysicalSign(physicalSign);
					session.commit();
				}
				//close session
				session.close();
			} catch (Exception e){
				logger.error(e.toString());
			}
			//return
			integrationResult.setResultCode(0);
			integrationResult.setResultDesc("Write data into Database on updating physicalSign successfully!");
			logger.info("Write data into Database on updating physicalSign successfully!");
			return integrationResult;
		}
	}

	/*
	 * @description Transaction processing at deleting PhysicalSign stage,include: 
	 *              check parameters of Objects;check confliction in database;store data into database
	 * @return IntegrationResult
	 */
	public IntegrationResult deletePhysicalSign(PhysicalSign physicalSign) {
		IntegrationResult integrationResult = new IntegrationResult();
		String checkResult = ""; //store the result of check parameters
		/*
		 * check parameters of physicalSign
		 */
		checkResult = checkPhysicalSign(physicalSign);
		if (checkResult != null){
			integrationResult.setResultCode(-500);
			integrationResult.setResultDesc(checkResult);
			logger.error(checkResult);
			return integrationResult;
		}
		else{
			/*
			 * delete data into database
			 */
			try{
				//open session
				SqlSessionFactory sqlSessionFactory = SQLSessionConfig.getSqlSessionFactory();
				SqlSession session = sqlSessionFactory.openSession();
				PhysicalSignDao physicalSignDao = session.getMapper(PhysicalSignDao.class);
				//check whether the data is existed in the database
				if (physicalSignDao.getPhysicalSignByRecordID(physicalSign.getRecordID()) == null){}
				else {
					//delete 
					physicalSignDao.deletePhysicalSign(physicalSign);
					session.commit();
				}
				//close session
				session.close();
			} catch (Exception e){
				logger.error(e.toString());
			}
			//return
			integrationResult.setResultCode(0);
			integrationResult.setResultDesc("Write data into Database on deleting physicalSign successfully!");
			logger.info("Write data into Database on deleting physicalSign successfully!");
			return integrationResult;
		}
	}
	
	/*
	 * @description check parameters of PyhsicalSign
	 * @return String(null:the parameters are legal;other:the first illegal parameter)
	 */
	private String checkPhysicalSign(PhysicalSign physicalSign) {
		//check recordID:not null;length;content is all numbers
		if (physicalSign.getRecordID() == null) return "recordID is empty!";
			else if (physicalSign.getRecordID().length() > 30) return "recordID is too long!";
				 else if (checkStringIsAllNumber(physicalSign.getRecordID())) 
					  return "recordID is not consisted by only numbers!";
				      else{};
		//check patientID:not null;length;content is all numbers
		if (physicalSign.getPatientID() == null) return "patientID is empty!";
			else if (physicalSign.getPatientID().length() > 30) return "patientID is too long!";
				 else if (checkStringIsAllNumber(physicalSign.getPatientID())) 
					  return "patientID is not consisted by only numbers!";
					  else{};
		//check visitID:not null;length;content is all numbers
		if (physicalSign.getVisitID() == null) return "visitID is empty!";
			else if (physicalSign.getVisitID().length() > 30) return "visitID is too long!";
				 else if (checkStringIsAllNumber(physicalSign.getVisitID())) 
					  return "visitID is not consisted by only numbers!";
					  else{};
				
		//check other parameters:length
		if (physicalSign.getVitalItem().length() > 10) return "VitalItem is too long!";
		if (physicalSign.getValue().length() > 30) return "Value is too long!";
		if (physicalSign.getUnit().length() > 10) return "Unit is too long!";
		if (physicalSign.getRecorderCode().length() > 10) return "RecorderCode is too long!";
		if (physicalSign.getRecorderName().length() > 30) return "RecorderName is too long!";
		if (physicalSign.getMeasuringMode().length() > 20) return "MeasuringMode is too long!";
		if (physicalSign.getMemo().length() > 200) return "Memo is too long!";
		
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
