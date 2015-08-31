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
import com.vico.clever.cdr.service.model.SurgeryMaster;

/** 
* @author ding.yuanyuan
* @description test SQL operation on table SurgeryMaster
* @date Aug 21, 2015 2:50:48 PM 
*/
public class SurgeryMasterDaoTest {
	private SqlSessionFactory sqlSessionfactory = null;
	private SqlSession session = null;
	private SurgeryDao surgeryDao;
	private Random random = new Random();
	private Logger logger = Logger.getLogger(this.getClass());
	
	public SurgeryMasterDaoTest(){
		super();
	}
	
	@Before
	public void before(){
		sqlSessionfactory = SQLSessionConfig.getSqlSessionFactory();
		session = sqlSessionfactory.openSession();
		surgeryDao = session.getMapper(SurgeryDao.class);
	}
	
	@Test
	public void testInsertSurgeryMaster(){	
		surgeryDao.insertSurgeryMaster(getRandomSurgeryMaster());
		session.commit();
	}
	
	@Test
	public void testGetSurgeryMaster(){
		String masterByReqID = surgeryDao.getSurgeryMasterBySurgeryReqID("5").toString();
		String masterByPatientID = surgeryDao.getSurgeryMasterByPatientID("72").toString();
		String masterByVisitID = surgeryDao.getSurgeryMasterByVisitID("1093040967396066294768286648").toString();
		logger.debug(masterByReqID);
		logger.debug(masterByPatientID);
		logger.debug(masterByVisitID);
		session.commit();
	}
	
	@Test
	public void testUpdateSurgeryMaster(){
		logger.debug("OLDSURGERYMASTER=" + surgeryDao.getSurgeryMasterBySurgeryReqID("5").toString());
		SurgeryMaster surgeryMaster = getRandomSurgeryMaster();
		surgeryMaster.setSurgeryReqID("5");
		surgeryDao.updateSurgeryMaster(surgeryMaster);
		logger.debug("NEWSURGERYMASTER=" + surgeryDao.getSurgeryMasterBySurgeryReqID("5").toString());
		session.commit();
	}
	
	@Test
	public void testSelectAllSurgeryMaster(){
		List<SurgeryMaster> surgeryMasterlist=surgeryDao.getAllSurgeryMasters();
		StringBuffer listOut = new StringBuffer();
		for (int i = 0;i < surgeryMasterlist.size();i++){
			listOut.append(surgeryMasterlist.get(i).toString());
		}
		logger.debug(listOut.toString());
		session.commit();
	}
	
	@Test
	public void testDeleteSurgeryMaster(){
		SurgeryMaster surgeryMaster = new SurgeryMaster();
		surgeryMaster.setSurgeryReqID("5");
		surgeryDao.deleteSurgeryMaster(surgeryMaster);
		session.commit();
	}
	
	@After
	public void after(){
		session.close();
	}
	
	/*
	 * @description get a surgeryMaster with random parameters
	 * @return SurgeryMaster
	 */
	public SurgeryMaster getRandomSurgeryMaster(){
		SurgeryMaster surgeryMaster = new SurgeryMaster();
		surgeryMaster.setSurgeryReqID(getRandomNumberID(30));
		surgeryMaster.setPatientID(getRandomNumberID(30));
		surgeryMaster.setVisitID(getRandomNumberID(30));
		surgeryMaster.setIntervention(getRandomString(50));
		surgeryMaster.setOperateApproachCode(getRandomString(10));
		surgeryMaster.setOperateApproachName(getRandomString(30));
		surgeryMaster.setNumberOfOperation(getRandomNumber(10));
		surgeryMaster.setStartDateTime(getRandomDateTime());
		surgeryMaster.setStopDateTime(getRandomDateTime());
		surgeryMaster.setSurgicalDoctorOneCode(getRandomString(10));
		surgeryMaster.setSurgicalDoctorOneName(getRandomString(30));
		surgeryMaster.setSurgicalDoctorTwoCode(getRandomString(10));
		surgeryMaster.setSurgicalDoctorTwoName(getRandomString(30));
		surgeryMaster.setAssistantOperatorOneCode(getRandomString(10));
		surgeryMaster.setAssistantOperatorOneName(getRandomString(30));
		surgeryMaster.setAssistantOperatorTwoCode(getRandomString(10));
		surgeryMaster.setAssistantOperatorTwoName(getRandomString(30));
		surgeryMaster.setAssistantOperatorThreeCode(getRandomString(10));
		surgeryMaster.setAssistantOperatorThreeName(getRandomString(30));
		surgeryMaster.setAssistantOperatorFourCode(getRandomString(10));
		surgeryMaster.setAssistantOperatorFourName(getRandomString(30));
		surgeryMaster.setInstrumentNurseOneCode(getRandomString(10));
		surgeryMaster.setInstrumentNurseOneName(getRandomString(30));
		surgeryMaster.setInstrumentNurseTwoCode(getRandomString(10));
		surgeryMaster.setInstrumentNurseTwoName(getRandomString(30));
		surgeryMaster.setInspectionNurseOneCode(getRandomString(10));
		surgeryMaster.setInspectionNurseOneName(getRandomString(30));
		surgeryMaster.setInspectionNurseTwoCode(getRandomString(10));
		surgeryMaster.setInspectionNurseTwoName(getRandomString(30));
		surgeryMaster.setOperatingRoomNOCode(getRandomString(10));
		surgeryMaster.setOperatingRoomNO(getRandomString(30));
		surgeryMaster.setOperatingRoomCode(getRandomString(10));
		surgeryMaster.setOperatingRoom(getRandomString(30));
		surgeryMaster.setOperationTableCode(getRandomString(10));
		surgeryMaster.setOperationTable(getRandomString(30));
		surgeryMaster.setSequence(getRandomNumber(10));
		surgeryMaster.setOperationLevelCode(getRandomString(10));
		surgeryMaster.setOperationLevelName(getRandomString(30));
		surgeryMaster.setAnesthetistApproachCode(getRandomString(10));
		surgeryMaster.setAnesthetistApproachName(getRandomString(30));
		surgeryMaster.setAnestheistCode(getRandomString(10));
		surgeryMaster.setAnestheistName(getRandomString(30));
		surgeryMaster.setAssistantAnestheistOneCode(getRandomString(10));
		surgeryMaster.setAssistantAnestheistOneName(getRandomString(30));
		surgeryMaster.setAssistantAnestheistTwoCode(getRandomString(10));
		surgeryMaster.setAssistantAnestheistTwoName(getRandomString(30));
		surgeryMaster.setSurgicalPositionCode(getRandomString(10));
		surgeryMaster.setSurgicalPositionCName(getRandomString(30));
		surgeryMaster.setSurgicalModeCode(getRandomString(10));
		surgeryMaster.setSurgicalModeName(getRandomString(30));
		surgeryMaster.setOperationSerialNO(getRandomString(10));
		surgeryMaster.setOperationDateTime(getRandomDateTime());
		return surgeryMaster;
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
