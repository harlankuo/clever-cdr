package com.vico.clever.cdr;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vico.clever.cdr.service.entity.ChemotherapyEntity;
import com.vico.clever.cdr.service.model.Chemotherapy;
import com.vico.clever.cdr.service.model.ChemotherapyMedicine;
import com.vico.clever.cdr.service.model.IntegrationResult;
import com.vico.clever.cdr.service.service.ChemotherapyService;

@Path("ChemotherapyResource")
public class ChemotherapyResource {
	
	private ChemotherapyService chemotherapyService  = new ChemotherapyService();
	
	
	@POST
    @Path("/Chemotherapy")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public IntegrationResult ChemotherapyExtract(ChemotherapyEntity chemotherapyEntity)
	{
		IntegrationResult integrationResult = new IntegrationResult();
		Chemotherapy  chemotherapy = chemotherapyEntity.getChemotherapy();
		List<ChemotherapyMedicine>  chemotherapyMedicineList = chemotherapyEntity.getChemotherapyMedicineList();
		integrationResult = chemotherapyService.chemotherapyExtract(chemotherapy, chemotherapyMedicineList);
		return integrationResult;
	}

}
