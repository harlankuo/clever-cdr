package com.vico.clever.cdr.service.dao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vico.clever.cdr.service.dao.SurgeryDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.SurgeryRecord;

/** 
* @author ding.yuanyuan
* @description test SQL operation on table SurgeryRecord
*              Use OperationIdentifier in table Obsr_OperationRecord 
*              which contacts to surgeryReqID in entity SurgeryRecord
* @date Aug 21, 2015 3:27:20 PM 
*/
public class SurgeryRecordDaoTest {
	private SqlSessionFactory sqlSessionfactory = null;
	private SqlSession session = null;
	private SurgeryDao surgeryDao;
	private Random random = new Random();
	private Logger logger = Logger.getLogger(this.getClass());
	
	public SurgeryRecordDaoTest(){
		super();
	}
	
	@Before
	public void before(){
		sqlSessionfactory = SQLSessionConfig.getSqlSessionFactory();
		session = sqlSessionfactory.openSession();
		surgeryDao = session.getMapper(SurgeryDao.class);
	}
	
	@Test
	public void testInsertSurgeryRecord(){	
		try{
		surgeryDao.insertSurgeryRecord(getRandomSurgeryRecord());
		session.commit();
		}catch(Exception e){
			logger.debug(e.toString());
		}
	}
	
	@Test
	public void testGetSurgeryRecord(){
		String RecordByReqID = surgeryDao.getSurgeryRecordBySurgeryReqID("2134301369257299").toString();
		String RecordByPatientID = surgeryDao.getSurgeryRecordByPatientID("84833478832714839268").toString();
		String RecordByVisitID = surgeryDao.getSurgeryRecordByVisitID("22763578278937150").toString();
		String RecordByRecordID = surgeryDao.getSurgeryRecordByReportID("152348670135723155").toString();
		logger.debug(RecordByReqID);
		logger.debug(RecordByPatientID);
		logger.debug(RecordByVisitID);
		logger.debug(RecordByRecordID);
		session.commit();
	}
	
	@Test
	public void testUpdateSurgeryRecord(){
		logger.debug("OLDSURGERYRECORD=" + surgeryDao.getSurgeryRecordBySurgeryReqID("2134301369257299").toString());
		SurgeryRecord surgeryRecord = getRandomSurgeryRecord();
		surgeryRecord.setSurgeryReqID("2134301369257299");
		surgeryDao.updateSurgeryRecord(surgeryRecord);
		logger.debug("NEWSURGERYRECORD=" + surgeryDao.getSurgeryRecordBySurgeryReqID("2134301369257299").toString());
		session.commit();
	}
	
	@Test
	public void testSelectAllSurgeryRecord(){
		List<SurgeryRecord> surgeryRecordlist=surgeryDao.getAllSurgeryRecords();
		StringBuffer listOut = new StringBuffer();
		for (int i = 0;i < surgeryRecordlist.size();i++){
			listOut.append(surgeryRecordlist.get(i).toString());
		}
		logger.debug(listOut.toString());
		session.commit();
	}
	
	@Test
	public void testDeleteSurgeryRecord(){
		SurgeryRecord surgeryRecord = new SurgeryRecord();
		surgeryRecord.setSurgeryReqID("2134301369257299");
		surgeryDao.deleteSurgeryRecord(surgeryRecord);
		session.commit();
	}
	
	@After
	public void after(){
		session.close();
	}
	
	/*
	 * @description get a surgeryRecord with random parameters
	 * @return SurgeryRecord
	 */
	public SurgeryRecord getRandomSurgeryRecord(){
		SurgeryRecord surgeryRecord = new SurgeryRecord();
		surgeryRecord.setSurgeryReqID(getRandomNumberID(30));
		surgeryRecord.setPatientID(getRandomNumberID(30));
		surgeryRecord.setVisitID(getRandomNumberID(30));
		surgeryRecord.setReportID(getRandomNumberID(30));
		surgeryRecord.setBleeding(getRandomNumber(10));
		surgeryRecord.setBleedingUnit(getRandomString(30));
		surgeryRecord.setSurDescriptionCode(getRandomString(10));
		surgeryRecord.setSurDescription(getRandomString(30));
		surgeryRecord.setSkinDisinfection(getRandomString(200));
		surgeryRecord.setIncisionDescription(getRandomString(100));
		surgeryRecord.setClosureDrainsSign((byte)getRandomNumber(1));
		surgeryRecord.setClosureDrainsMaterial(getRandomString(20));
		surgeryRecord.setClosureDrainsMaterialAmount(getRandomNumber(10));
		surgeryRecord.setClosureDrainsLocation(getRandomString(10));
		surgeryRecord.setAnesthesiaIndication(getRandomString(150));
		surgeryRecord.setAnesthesiaRecovery(getRandomString(100));
		surgeryRecord.setAnesthesiaStartDate(getRandomDateTime());
		surgeryRecord.setAnesthesiaASACode(getRandomString(10));
		surgeryRecord.setAnesthesiaASA(getRandomString(30));
		surgeryRecord.setAnesthesiaMedicine(getRandomString(50));
		surgeryRecord.setAnesthesiaPosition(getRandomString(20));
		surgeryRecord.setAnesthesiaDescription(getRandomString(200));
		surgeryRecord.setAnesthesiaComplication(getRandomString(10));
		surgeryRecord.setAnesthesiaEffect(getRandomString(200));
		surgeryRecord.setAnesthesiaPremediaine(getRandomString(500));
		surgeryRecord.setTracheaCannulaType(getRandomString(10));
		surgeryRecord.setTracheaCannulaUnpin(getRandomString(10));
		surgeryRecord.setTransfusionVolume(getRandomNumber(10));
		surgeryRecord.setTransfusionVolumeUnit(getRandomString(30));
		surgeryRecord.setTransfusionItem(getRandomString(10));
		surgeryRecord.setIncsionLevelCode(getRandomString(10));
		surgeryRecord.setIncsionLevelName(getRandomString(30));
		surgeryRecord.setHealLevel(getRandomString(100));
		return surgeryRecord;
	}
	
	
	/*
	 * @description get a random number with assigned max-length 
	 * @parameters length
	 * @return int 
	 */
	public int getRandomNumber(int maxLength){
		if ((maxLength <= 0)||(maxLength > 10)) return 0;
		else{
			int seed = 1;
			for (int i = 0;i < maxLength;i++) seed = seed * 10;
			return Math.abs(random.nextInt(seed));
		}
	}
	
	/*
	 * @description get a random ID with assigned max-length 
	 * @parameters length
	 * @return String 
	 */
	public String getRandomNumberID(int maxLength){
		String num = "0123456789";
		if ((maxLength <= 0)||(maxLength > 30)) return null;
		else{
			StringBuffer randomID = new StringBuffer();
			int varCharLength = 1 + Math.abs(random.nextInt(maxLength));
			for (int i = 0;i < varCharLength;i++){
				randomID.append(num.charAt(Math.abs(random.nextInt(num.length()))));
			}
			return randomID.toString();
		}
	}
	
	/*
	 * @description get a random String with assigned length
	 * @parameters length
	 * @return String
	 */
	public String getRandomString(int length){
		//define chars which are allowed to appear in the String
		String base = "0123456789abcdefghijklmnopqrstuvwxyz ";
		
		if (length <= 0) return null;
		else{
			//define the length of varchar 
			int varlength = 1 + Math.abs(random.nextInt(length));
			StringBuffer randomString = new StringBuffer();
			for (int i = 0;i < varlength;i++){
				randomString.append(base.charAt(Math.abs(random.nextInt(base.length()))));
			}
			return randomString.toString();
		}
	}
	
	/*
	 * @description get a random DateTime between 1970.01.01 to 2100.12.31
	 * @return Date
	 */
	public Date getRandomDateTime(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
		// create startTime
		Date start = null;
		try {
			start = format.parse("1970-01-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// create endTime
        Date end = null;
		try {
			end = format.parse("2100-12-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return new Date((long)start.getTime() + (long)(Math.random()*(end.getTime() - start.getTime())));
	}
}
