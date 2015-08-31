package com.vico.clever.cdr;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.CellTherapyEntity;
import com.vico.clever.cdr.service.model.CellTherapy;
import com.vico.clever.cdr.service.model.CellTherapyInfusion;
import com.vico.clever.cdr.service.model.CellTherapyPreprocess;
import com.vico.clever.cdr.service.model.CellTherapyReaction;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.CellTherapyService;

@Path("CellTherapyResource")
public class CellTherapyResource {
	private CellTherapyService cellTherapyService = new CellTherapyService();
	
	@POST
    @Path("/Celltherapy")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult CelltherapyExtract(CellTherapyEntity cellTherapyentity)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		CellTherapy cellTherapy = cellTherapyentity.getCellTherapy();
		List<CellTherapyPreprocess> CellTherapyPreprocessList = cellTherapyentity.getCellTherapyPreprocessList();
		List<CellTherapyInfusion> cellTherapyInfusionList = cellTherapyentity.getCellTherapyInfusionList();
		List<CellTherapyReaction> cellTherapyReactionList = cellTherapyentity.getCellTherapyReactionList();
		integrationResult = cellTherapyService.cellTherapyExtract(cellTherapy, CellTherapyPreprocessList, cellTherapyInfusionList, cellTherapyReactionList);
		
		return integrationResult;
		
	}
	

}
