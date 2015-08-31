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
import com.vico.clever.cdr.service.model.SurgeryItem;

/** 
* @author ding.yuanyuan
* @description test SQL operations on table SurgeryItem
* @date Aug 21, 2015 2:18:59 PM 
*/
public class SurgeryItemDaoTest {
	private SqlSessionFactory sqlSessionfactory = null;
	private SqlSession session = null;
	private SurgeryDao surgeryDao;
	private Random random = new Random();
	private Logger logger = Logger.getLogger(this.getClass());
	
	public SurgeryItemDaoTest(){
		super();
	}
	
	@Before
	public void before(){
		sqlSessionfactory = SQLSessionConfig.getSqlSessionFactory();
		session = sqlSessionfactory.openSession();
		surgeryDao = session.getMapper(SurgeryDao.class);
	}
	
	@Test
	public void testInsertSurgeryItem(){	
		surgeryDao.insertSurgeryItem(getRandomSurgeryItem());
		session.commit();
	}
	
	@Test
	public void testGetSurgeryItem(){
		String itemByReqID = surgeryDao.getSurgeryItem("0636991161009165465").toString();
		logger.debug(itemByReqID);
		session.commit();
	}

	@Test
	public void testUpdateSurgeryItem(){
		logger.debug("OLDSURGERYITEM="+surgeryDao.getSurgeryItem("0636991161009165465").toString());
		SurgeryItem surgeryItem = getRandomSurgeryItem();
		surgeryItem.setSurgeryReqID("0636991161009165465");
		surgeryDao.updateSurgeryItem(surgeryItem);
		logger.debug("NEWSURGERYITEM="+surgeryDao.getSurgeryItem("0636991161009165465").toString());
		session.commit();
	}
	
	@Test
	public void testSelectAllSurgeryItem(){
		List<SurgeryItem> surgeryItemlist=surgeryDao.getAllSurgeryItems();
		StringBuffer listOut = new StringBuffer();
		for (int i = 0;i < surgeryItemlist.size();i++){
			listOut.append(surgeryItemlist.get(i).toString());
		}
		logger.debug(listOut);
		session.commit();
	}
	
	@Test
	public void testDeleteSurgeryItem(){
		SurgeryItem surgeryItem = new SurgeryItem();
		surgeryItem.setSurgeryReqID("0636991161009165465");
		surgeryDao.deleteSurgeryItem(surgeryItem);
		session.commit();
	}
	
	@After
	public void after(){
		session.close();
	}
	
	/*
	 * @description get a surgeryItem with random parameters
	 * @return SurgeryItem
	 */
	public SurgeryItem getRandomSurgeryItem(){
		SurgeryItem surgeryItem = new SurgeryItem();
		surgeryItem.setSurgeryReqID(getRandomNumberID(30));
		surgeryItem.setOperationCode(getRandomString(10));
		surgeryItem.setOperationName(getRandomString(30));
		surgeryItem.setLocationCode(getRandomString(10));
		surgeryItem.setLocationName(getRandomString(30));
		surgeryItem.setLevelOfIncisionCode(getRandomString(10));
		surgeryItem.setLevelOfIncisionName(getRandomString(30));
		surgeryItem.setOperationLevelCode(getRandomString(10));
		surgeryItem.setOperationLevelName(getRandomString(30));
		surgeryItem.setOperationNO(getRandomString(10));
		surgeryItem.setOperationSerialNumberCode(getRandomString(10));
		surgeryItem.setOperationSerialNumberName(getRandomString(30));
		return surgeryItem;
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
