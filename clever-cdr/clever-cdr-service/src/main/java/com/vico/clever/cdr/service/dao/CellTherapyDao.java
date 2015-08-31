package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.CellTherapy;
import com.vico.clever.cdr.service.model.CellTherapyInfusion;
import com.vico.clever.cdr.service.model.CellTherapyPreprocess;
import com.vico.clever.cdr.service.model.CellTherapyReaction;

public interface CellTherapyDao {
	public CellTherapy selectCellTherapy(String requestID);
	public int insertCellTherapy(CellTherapy cellTherapy);
	public int updateCellTherapy(CellTherapy cellTherapy);
	public int deleteCellTherapy(String requestID);
	
	//CellTherapyPreprocess
	
	public List<CellTherapyPreprocess> selectCellTherapyPreprocess (String requestID);
	public int insertCellTherapyPreprocess(List<CellTherapyPreprocess> CellTherapyPreprocessList );
	public int deleteCellTherapyPreprocess(String requestID);
	
	//CellTherapyInfusion
	public List<CellTherapyInfusion> selectCellTherapyInfusion(String requestID);
	public int insertCellTherapyInfusion(List<CellTherapyInfusion> cellTherapyInfusionList);
	public int deleteCellTherapyInfusion(String requestID);
	
	//CellTherapyReaction
	
	public List<CellTherapyReaction> selectCellTherapyReaction(String requestID);
	public int insertCellTherapyReaction(List<CellTherapyReaction> cellTherapyReactionList);
	public int deleteCellTherapyReaction(String requestID);
	
}
