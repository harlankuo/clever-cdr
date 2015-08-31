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
import com.vico.clever.cdr.service.model.SurgeryStatus;

/** 
* @author ding.yuanyuan
* @description test SQL operation on table SurgeryStatus
* @date Aug 21, 2015 4:29:42 PM 
*/
public class SurgeryStatusDaoTest {
	private SqlSessionFactory sqlSessionfactory = null;
	private SqlSession session = null;
	private SurgeryDao surgeryDao;
	private Random random = new Random();
	private Logger logger = Logger.getLogger(this.getClass());
	
	public SurgeryStatusDaoTest(){
		super();
	}
	
	@Before
	public void before(){
		sqlSessionfactory = SQLSessionConfig.getSqlSessionFactory();
		session = sqlSessionfactory.openSession();
		surgeryDao = session.getMapper(SurgeryDao.class);
	}
	
	@Test
	public void testInsertSurgeryStatus(){	
		try{
			surgeryDao.insertSurgeryStatus(getRandomSurgeryStatus());
			session.commit();
		} catch (Exception e){
			logger.debug(e.toString());
		}
	}
	
	@Test
	public void testGetSurgeryStatus(){
		String StatusByReqID = surgeryDao.getSurgeryStatusBySurgeryReqID("3750").toString();
		String StatusByPatientID = surgeryDao.getSurgeryStatusByPatientID("39008561300208618594").toString();
		String StatusByVisitID = surgeryDao.getSurgeryStatusByVisitID("06787510058474740").toString();
		logger.debug(StatusByReqID);
		logger.debug(StatusByPatientID);
		logger.debug(StatusByVisitID);
		session.commit();
	}
	
	@Test
	public void testUpdateSurgeryStatus(){
		logger.debug("OLDSURGERYSTATUS=" + surgeryDao.getSurgeryStatusBySurgeryReqID("3750").toString());
		SurgeryStatus surgeryStatus = getRandomSurgeryStatus();
		surgeryStatus.setSurgeryReqID("3750");
		surgeryDao.updateSurgeryStatus(surgeryStatus);
		logger.debug("NEWSURGERYSTATUS=" + surgeryDao.getSurgeryStatusBySurgeryReqID("3750").toString());
		session.commit();
	}
	
	@Test
	public void testSelectAllSurgeryStatus(){
		List<SurgeryStatus> surgeryStatuslist=surgeryDao.getAllSurgeryStatus();
		StringBuffer listOut = new StringBuffer();
		for (int i = 0;i < surgeryStatuslist.size();i++){
			listOut.append(surgeryStatuslist.get(i).toString());
		}
		logger.debug(listOut.toString());
		session.commit();
	}
	
	@Test
	public void testDeleteSurgeryStatus(){
		SurgeryStatus surgeryStatus = new SurgeryStatus();
		surgeryStatus.setSurgeryReqID("3750");
		surgeryDao.deleteSurgeryStatus(surgeryStatus);
		session.commit();
	}
	
	@After
	public void after(){
		session.close();
	}
	
	/*
	 * @description get a surgeryStatus with random parameters
	 * @return SurgeryStatus
	 */
	public SurgeryStatus getRandomSurgeryStatus(){
		SurgeryStatus surgeryStatus = new SurgeryStatus();
		surgeryStatus.setSurgeryReqID(getRandomNumberID(30));
		surgeryStatus.setPatientID(getRandomNumberID(30));
		surgeryStatus.setVisitID(getRandomNumberID(30));
		surgeryStatus.setOperationName(getRandomString(30));
		surgeryStatus.setCurStateCode(getRandomString(8));
		surgeryStatus.setCurStateName(getRandomString(30));
		surgeryStatus.setCareflowStepCode(getRandomString(8));
		surgeryStatus.setCareflowStepName(getRandomString(30));
		surgeryStatus.setComment(getRandomString(180));
		surgeryStatus.setPerformDateTime(getRandomDateTime());
		surgeryStatus.setPerformDoctorCode(getRandomString(10));
		surgeryStatus.setPerformDoctorName(getRandomString(30));
		return surgeryStatus;
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
