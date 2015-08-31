package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.EpigeneticTyerapy;

public interface EpigeneticTyerapyDao {
	public EpigeneticTyerapy selectEpigeneticTyerapy(String epigeneticTherapyID);
	public int insertEpigeneticTyerapy(EpigeneticTyerapy epigeneticTyerapy);
	public int updateEpigeneticTyerapy(EpigeneticTyerapy epigeneticTyerapy);
	public int deleteEpigeneticTyerapy(String epigeneticTherapyID);

}
