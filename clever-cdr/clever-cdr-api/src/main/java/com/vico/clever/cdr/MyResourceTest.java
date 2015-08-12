package com.vico.clever.cdr;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.model.PatientInfo;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresourceTest")
public class MyResourceTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    //@Consumes(MediaType.APPLICATION_JSON)
    public List<PatientInfo> getPatientInfo() {
    	Random random = new Random();
		int num=random.nextInt();
		PatientInfo patientInfo=new PatientInfo();
		String guid=UUID.randomUUID().toString();
		patientInfo.setGuid(guid);
		patientInfo.setBirthPlace("浙江杭州");
		patientInfo.setBirthPlaceCity("杭州");
		patientInfo.setBirthPlaceCityCode("3310");
		patientInfo.setBirthPlaceCountry("中国");
		patientInfo.setBirthPlaceCountryCode("1");
		patientInfo.setBirthPlaceProvince("浙江省");
		patientInfo.setBirthPlaceProvinceCode("3");
		patientInfo.setBloodTypeABO("AB");
		patientInfo.setBloodTypeRH("RH-");
		patientInfo.setDateOfBirth(new Date());
		patientInfo.setDateOfDeath(new Date());
		patientInfo.setEducationBackground("大学");
		patientInfo.setEthnic("汉族");
		patientInfo.setEthnicCode("01");
		patientInfo.setHealthNO("98786465");
		patientInfo.setMaritalStatus("未婚");
		patientInfo.setMaritalStatusCode("01");
		patientInfo.setNationality("中国");
		patientInfo.setPatientID("M0000"+num);
		patientInfo.setPatientIdNO("42058231657321354");
		patientInfo.setPatientName("程序员"+num+"号");
		patientInfo.setPatientSexCode("01");
		patientInfo.setPatientSexName("男");
		patientInfo.setProfession("程序员");
		logger.debug("*********  patientInfo Created  ***********");
		logger.debug(patientInfo.toString());
		List<PatientInfo> patientInfolist=new ArrayList<PatientInfo>();
		patientInfolist.add(patientInfo);
        return patientInfolist;
    }
}
