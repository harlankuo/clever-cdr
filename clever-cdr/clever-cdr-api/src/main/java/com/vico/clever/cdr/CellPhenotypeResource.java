package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.CellPhenotypeEntity;
import com.vico.clever.cdr.service.model.CellPhenotype;
import com.vico.clever.cdr.service.model.CellPhenotypeValue;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.CellPhenotypeService;

@Path("CellPhenotypeResource")
public class CellPhenotypeResource {
	private CellPhenotypeService cellPhenotypeService = new CellPhenotypeService();
	@POST
    @Path("/CellPhenotype")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public IntegrationResult CellPhenotyExtract(CellPhenotypeEntity cellPhenotypeEntity)
    {
		IntegrationResult integrationResult = new IntegrationResult();
		
		CellPhenotype cellPhenotype = cellPhenotypeEntity.getCellPhenotype();
		List<CellPhenotypeValue> cellPhenotypeValueList = cellPhenotypeEntity.getCellPhenotypeValueList();
		integrationResult = cellPhenotypeService.cellPhenotypeExtract(cellPhenotype, cellPhenotypeValueList);
		return integrationResult;
    }
}
