package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.model.NewBornMaster;
import com.vico.clever.cdr.service.service.NewBornInfoService;

/**
 * Root resource (exposed at "newBornResource" path)
 * @author Yuan.Ziyang
 */
@Path("newBornResource")
public class NewBornResource {
	
	private NewBornInfoService newBornService=new NewBornInfoService();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
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
	 * Method handling the data entry of newBorn Master information into
	 * CDR with HTTP POST requests.
	 * 
	 * @author Yuan.Ziyang
	 * @param newBornMaster
	 *            input json or xml object data that contains NewBornMaster info;
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 */
	@POST
	@Path("/newBornMaster")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult newBorn(NewBornMaster newBornMaster){
		IntegrationResult integrationResult = new IntegrationResult();
		integrationResult=newBornService.newBorn(newBornMaster);
		return integrationResult;
	}
}
