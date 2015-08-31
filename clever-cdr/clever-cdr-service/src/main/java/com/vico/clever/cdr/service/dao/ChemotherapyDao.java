package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.Chemotherapy;
import com.vico.clever.cdr.service.model.ChemotherapyMedicine;

public interface ChemotherapyDao {
	public Chemotherapy selectChemotherapy(String chemotherapyID);
	public int insertChemotherapy(Chemotherapy  chemotherapy);
	public int updateChemotherapy(Chemotherapy  chemotherapy);
	public int deleteChemotherapy(String chemotherapyID);
	
	
	public List<ChemotherapyMedicine> selectChemotherapyMedicine(String chemotherapyID);
	public int insertChemotherapyMedicine(List<ChemotherapyMedicine>  chemotherapyMedicineList);
	public int deleteChemotherapyMedicine(String chemotherapyID);

}
