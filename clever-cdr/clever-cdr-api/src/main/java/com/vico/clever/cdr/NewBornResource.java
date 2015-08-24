package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.NewBirthProcess;
import com.vico.clever.cdr.service.model.NewBornApgarScore;
import com.vico.clever.cdr.service.model.NewBornExamination;
import com.vico.clever.cdr.service.model.NewBornHearingScreeningRecords;
import com.vico.clever.cdr.service.model.NewBornMaster;
import com.vico.clever.cdr.service.model.NewBornOtherInformation;
import com.vico.clever.cdr.service.model.NewBornVaccinationRecords;
import com.vico.clever.cdr.service.service.NewBornInfoService;

/**
 * Root resource (exposed at "newBornResource" path)
 * 
 * @author Yuan.Ziyang
 */
@Path("newBornResource")
public class NewBornResource {

	private NewBornInfoService newBornService = new NewBornInfoService();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got NewBornResource!";
	}

	/**
	 * 
	 * Element sub resource (exposed at "newBornMaster" path);
	 * 
	 * Method handling the data entry of newBorn Master information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBornMaster
	 *            input json or xml object data that contains NewBornMaster
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBornMaster")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBorn(NewBornMaster newBornMaster) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService.newBorn(newBornMaster);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "newBirthProcess" path);
	 * 
	 * Method handling the data entry of new Born Process information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBirthProcess
	 *            input json or xml object data that contains NewBirthProcess
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBirthProcess")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBirthProcess(NewBirthProcess newBirthProcess) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService.newBirthProcess(newBirthProcess);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "newBornExamination" path);
	 * 
	 * Method handling the data entry of new Born Examination information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBornExamination
	 *            input json or xml object data that contains NewBornExamination
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBornExamination")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBornExamination(
			NewBornExamination newBornExamination) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService
				.newBornExamination(newBornExamination);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "newBornApgarScore" path);
	 * 
	 * Method handling the data entry of new Born ApgarScore information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBornApgarScore
	 *            input json or xml object data that contains NewBornApgarScore
	 *            info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBornApgarScore")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBornApgarScore(
			NewBornApgarScore newBornApgarScore) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService.newBornApgarScore(newBornApgarScore);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "newBornVaccinationRecords" path);
	 * 
	 * Method handling the data entry of new Born ApgarScore information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBornVaccinationRecords
	 *            input json or xml object data that contains
	 *            NewBornVaccinationRecords info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBornVaccinationRecords")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBornVaccinationRecords(
			NewBornVaccinationRecords newBornVaccinationRecords) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService
				.newBornVaccinationRecords(newBornVaccinationRecords);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "newHearingScreeningRecords" path);
	 * 
	 * Method handling the data entry of new Born Hearing Screening Records
	 * information into CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newHearingScreeningRecords
	 *            input json or xml object data that contains
	 *            NewBornHearingScreeningRecords info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newHearingScreeningRecords")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBornHearingScreeningRecords(
			NewBornHearingScreeningRecords newHearingScreeningRecords) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService
				.newBornHearingScreeningRecords(newHearingScreeningRecords);
		return integrationResult;
	}

	/**
	 * 
	 * Element sub resource (exposed at "newBornOtherInformation" path);
	 * 
	 * Method handling the data entry of new Born Other information into CDR
	 * with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBornOtherInformation
	 *            input json or xml object data that contains
	 *            NewBornOtherInformation info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBornOtherInformation")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBornOtherInformation(
			NewBornOtherInformation newBornOtherInformation) {
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult = newBornService
				.newBornOtherInformation(newBornOtherInformation);
		return integrationResult;
	}
}
