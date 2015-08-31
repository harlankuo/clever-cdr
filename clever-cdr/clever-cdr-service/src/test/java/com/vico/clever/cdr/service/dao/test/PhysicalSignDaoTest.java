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

import com.vico.clever.cdr.service.dao.PhysicalSignDao;
import com.vico.clever.cdr.service.entity.SQLSessionConfig;
import com.vico.clever.cdr.service.model.PhysicalSign;

/** 
* @author ding.yuanyuan
* @description Test the usability of SurgeryDao on part of table SurgeryReqInfo
* @date Aug 24, 2015 10:28:48 AM 
*/
public class PhysicalSignDaoTest {
	private SqlSessionFactory sqlSessionfactory = null;
	private SqlSession session = null;
	private PhysicalSignDao physicalSignDao;
	private Random random = new Random();
	private Logger logger = Logger.getLogger(this.getClass());
	public PhysicalSignDaoTest() {
		super();
	}

	@Before
	public void before(){
		sqlSessionfactory = SQLSessionConfig.getSqlSessionFactory();
		session = sqlSessionfactory.openSession();
		physicalSignDao = session.getMapper(PhysicalSignDao.class);
	}
	
	@Test
	public void TestPhysicalSign(){
		PhysicalSign physicalSign = new PhysicalSign();
		//insertPhysicalSign
		for (int i = 0;i < 4;i++){
			physicalSign = getRandomPhysicalSign();
			try{
				physicalSignDao.insertPhysicalSign(physicalSign);
				session.commit();
			} catch (Exception e){
				logger.error(e.toString());
			}
		}
		try{
			List<PhysicalSign> physicalSignList = physicalSignDao.getAllPhysicalSigns();
			session.commit();
			//getAllPhysicalSign
			StringBuffer physicalSignStringBuffer = new StringBuffer();
			for (int i = 0;i < physicalSignList.size();i++){
				physicalSignStringBuffer.append(physicalSignList.get(i).toString());
			}
			logger.debug(physicalSignStringBuffer.toString());
			//getPhysicalSignByRecordID
			if (physicalSignList.size() > 0){
				physicalSign = physicalSignDao.getPhysicalSignByRecordID(physicalSignList.get(0).getRecordID());
				session.commit();
				logger.debug(physicalSign.toString());
			}
			//getPhysicalSignByPatientID
			if (physicalSignList.size() > 0){
				physicalSign = physicalSignDao.getPhysicalSignByPatientID(physicalSignList.get(0).getPatientID());
				session.commit();
				logger.debug(physicalSign.toString());
			}
			//getPhysicalSignByVisitID
			if (physicalSignList.size() > 0){
				physicalSign = physicalSignDao.getPhysicalSignByVisitID(physicalSignList.get(0).getVisitID());
				session.commit();
				logger.debug(physicalSign.toString());
			}
			//updatePhysicalSign
			if (physicalSignList.size() > 0){
				physicalSign = getRandomPhysicalSign();
				physicalSign.setRecordID(physicalSignList.get(0).getRecordID());
				physicalSignDao.updatePhysicalSign(physicalSign);
				session.commit();
			}
			//daleteAllPhysicalSign
			for (int i = 0;i < physicalSignList.size();i++){
				physicalSignDao.deletePhysicalSign(physicalSignList.get(i));
				session.commit();
			}
		} catch (Exception e){
			logger.error(e.toString());
		}		
	}
	
	@After
	public void after(){
		session.close();
	}
	
	/*
	 * @description get a physicalSign with random parameters
	 * @return PhysicalSign
	 */
	public PhysicalSign getRandomPhysicalSign(){
		PhysicalSign physicalSign = new PhysicalSign();
		physicalSign.setRecordID(getRandomNumberID(30));
		physicalSign.setPatientID( getRandomNumberID(30));
		physicalSign.setVisitID(getRandomNumberID(30));
		physicalSign.setTimePoint(getRandomDateTime());
		physicalSign.setVitalItem(getRandomString(10));
		physicalSign.setValue(getRandomString(30));
		physicalSign.setUnit(getRandomString(10));
		physicalSign.setRecorderCode(getRandomString(10));
		physicalSign.setRecorderName(getRandomString(30));
		physicalSign.setRecordDatetime(getRandomDateTime());
		physicalSign.setMeasuringMode(getRandomString(20));
		physicalSign.setMemo(getRandomString(200));
		return physicalSign;
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
