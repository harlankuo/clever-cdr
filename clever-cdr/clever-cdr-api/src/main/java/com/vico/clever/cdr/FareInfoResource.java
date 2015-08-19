package com.vico.clever.cdr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.FareInfoEntity;
import com.vico.clever.cdr.service.model.FareInfo;
import com.vico.clever.cdr.service.model.FareStatus;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.FareInfoService;

/**
 * Root resource (exposed at "fareResource" path)
 * @author Yuan.Ziyang
 */
@Path("fareResource")
public class FareInfoResource {
	private FareInfoService fareInfoService=new FareInfoService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getFareResource() {
        return "Got FareResource!";
    }
    /**
	 * Element resource (exposed at "fareInfo" path);
	 * 
	 * Method handling HTTP POST requests to write fare information
	 * into CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examReqEntity
	 *            input json or xml object that contains
	 *            fareinfo and fare Status information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
    @POST
    @Path("/fareInfo")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult fareInfoExtract(FareInfoEntity fareInfoEntity){
    	IntegrationResult integrationResult = new IntegrationResult();
    	FareInfo fareInfo=fareInfoEntity.getFareInfo();
    	FareStatus fareStatus=fareInfoEntity.getFareStatus();
    	integrationResult=fareInfoService.fareInfoExtract(fareInfo, fareStatus);
    	return integrationResult;
    }
    /**
	 * Element resource (exposed at "fareStatus" path);
	 * 
	 * Method handling HTTP POST requests to write fare status information
	 * into CDR;
	 * 
	 * @author Yuan.Ziyang
	 * @param examReqEntity
	 *            input json or xml object that contains fare Status information.
	 * @return IntegrationResult that contains the handling result description
	 *         as an application/json response.
	 * 
	 */
    @POST
    @Path("/fareStatus")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult updateFareStatus(FareStatus fareStatus){
    	IntegrationResult integrationResult = new IntegrationResult();
    	integrationResult=fareInfoService.updateFareStatus(fareStatus);
    	return integrationResult;
    }
}
