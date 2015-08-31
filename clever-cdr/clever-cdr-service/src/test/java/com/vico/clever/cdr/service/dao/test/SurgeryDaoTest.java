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
import com.vico.clever.cdr.service.model.SurgeryReqInfo;

/** 
* @author ding.yuanyuan
* @description Test the usability of SurgeryDao on part of table SurgeryReqInfo
* @date Aug 18, 2015 5:49:07 PM 
*/
public class SurgeryDaoTest {
	private SqlSessionFactory sqlSessionfactory = null;
	private SqlSession session = null;
	private SurgeryDao surgeryDao;
	private Random random = new Random();
	private Logger logger = Logger.getLogger(this.getClass());
	
	public SurgeryDaoTest(){
		super();
	}
	
	@Before
	public void before(){
		sqlSessionfactory = SQLSessionConfig.getSqlSessionFactory();
		session = sqlSessionfactory.openSession();
		surgeryDao = session.getMapper(SurgeryDao.class);
	}
	
	@Test
	public void testInsertSurgeryReqInfo(){	
		surgeryDao.insertSurgeryReqInfo(getRandomSurgeryReqInfo());
		session.commit();
	}
	
	@Test
	public void testGetSurgeryReqInfo(){
		String reqInfoByReqID = surgeryDao.getSurgeryReqInfoBySurgeryReqID("327985772").toString();
		String reqInfoByPatientID = surgeryDao.getSurgeryReqInfoByPatientID("71830469").toString();
		String reqInfoByVisitID = surgeryDao.getSurgeryReqInfoByVisitID("962238205345502041").toString();
		String reqInfoByOrderID = surgeryDao.getSurgeryReqInfoByOrderID("230643500").toString();
		logger.debug(reqInfoByReqID);
		logger.debug(reqInfoByPatientID);
		logger.debug(reqInfoByVisitID);
		logger.debug(reqInfoByOrderID);	
		session.commit();
	}
	
	@Test
	public void testUpdateSurgeryReqInfo(){
		SurgeryReqInfo surgeryReqInfo = surgeryDao.getSurgeryReqInfoBySurgeryReqID("327985772");
		logger.debug("OLDDATE=" + surgeryReqInfo.getScheduleDate().toString());
		surgeryReqInfo.setScheduleDate(getRandomDateTime());
		surgeryDao.updateSurgeryReqInfo(surgeryReqInfo);
		surgeryReqInfo = surgeryDao.getSurgeryReqInfoBySurgeryReqID("327985772");
		logger.debug("NEWDATE=" + surgeryReqInfo.getScheduleDate().toString());
		session.commit();
	}
	
	@Test
	public void testSelectAllSurgeryReqInfo(){
		List<SurgeryReqInfo> surgeryInfolist=surgeryDao.getAllSurgeryReqInfos();
		StringBuffer listOut = new StringBuffer();
		for (int i = 0;i < surgeryInfolist.size();i++){
			listOut.append(surgeryInfolist.get(i).toString());
		}
		logger.debug(listOut.toString());
		session.commit();
	}
	
	@Test
	public void testDeleteSurgeryReqInfo(){
		SurgeryReqInfo surgeryReqInfo = new SurgeryReqInfo();
		surgeryReqInfo.setSurgeryReqID("327985772");
		surgeryDao.deleteSurgeryReqInfo(surgeryReqInfo);
		session.commit();
	}
	
	@After
	public void after(){
		session.close();
	}
	
	/*
	 * @description get a surgeryReqInfo with random parameters
	 * @return SurgeryReqInfo
	 */
	public SurgeryReqInfo getRandomSurgeryReqInfo(){
		SurgeryReqInfo surgeryReqInfo = new SurgeryReqInfo();
		surgeryReqInfo.setSurgeryReqID(getRandomNumberID(30));
		surgeryReqInfo.setPatientID( getRandomNumberID(30));
		surgeryReqInfo.setVisitID(getRandomNumberID(30));
		surgeryReqInfo.setOrderID(getRandomNumberID(30));
		surgeryReqInfo.setDiagnosisBefore(getRandomString(100));
		surgeryReqInfo.setOperativeDoctorID(getRandomString(10));
		surgeryReqInfo.setOperativeDoctorName(getRandomString(30));
		surgeryReqInfo.setScheduleDate(getRandomDateTime());
		surgeryReqInfo.setUrgencyCode(getRandomString(10));
		surgeryReqInfo.setUrgencyName(getRandomString(30));
		surgeryReqInfo.setIsolationIndicatorCode(getRandomString(10));
		surgeryReqInfo.setIsolationIndicator(getRandomString(30));
		surgeryReqInfo.setRelevantLabTest(getRandomString(200));
		surgeryReqInfo.setOperativeDeptCode(getRandomString(10));
		surgeryReqInfo.setOperativeDeptName(getRandomString(30));
		surgeryReqInfo.setComments(getRandomString(500));
		surgeryReqInfo.setReqDeptCode(getRandomString(10));
		surgeryReqInfo.setReqDeptName(getRandomString(30));
		surgeryReqInfo.setReqDoctorID(getRandomString(10));
		surgeryReqInfo.setReqDoctorName(getRandomString(30));
		surgeryReqInfo.setReqDate(getRandomDateTime());
		surgeryReqInfo.setRequestStatus(getRandomString(4));
		surgeryReqInfo.setDosage(getRandomString(10));
		surgeryReqInfo.setDosageUnit(getRandomString(30));
		surgeryReqInfo.setAdministrationCode(getRandomString(10));
		surgeryReqInfo.setAdministrationName(getRandomString(30));
		surgeryReqInfo.setFrequency(getRandomNumber(10));
		surgeryReqInfo.setFrequencyUnit(getRandomString(4));
		surgeryReqInfo.setFrequencyInterval(getRandomNumber(10));
		surgeryReqInfo.setFrequencyIntervalUnit(getRandomString(10));
		return surgeryReqInfo;
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
