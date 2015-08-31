package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.EMRFirstPage;
import com.vico.clever.cdr.service.model.EMRFirstPageAction;

public interface EMRFirstPageDao {
	public EMRFirstPage selectEMRFirstPage(String  emrFirstPageID);
	public int updateEMRFirstPage(EMRFirstPage emrFirstPage);
	public int insertEMRFirstPage(EMRFirstPage emrFirstPage);
	public int deleteEMRFirstPage(String  emrFirstPageID);
	
	public List<EMRFirstPageAction> selectEMRFirstPageAction(String  emrFirstPageID);
	public int insertEMRFirstPageAction(EMRFirstPageAction emrFirstPageAction);
	public int deleteEMRFirstPageAction(String  emrFirstPageID);

}
