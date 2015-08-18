package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Transfusion;
import com.vico.clever.cdr.service.model.TransfusionAction;

public interface TransfusionDao {
	/**
	 * selectTransfusion
	 * deleteTransfusion
	 * insertTransfusion
	 * updateTransfusion
	 * 
	 * 
	 * selectTransfusionAction
	 * deleteTransfusionAction
	 * insertTransfusionAction
	 * updateTransfusionAction
	 * 
	 */
	
	public Transfusion selectTransfusion(String transfusionID);
	
	public int deleteTransfusion(String transfusionID);
	
	public int insertTransfusion(Transfusion transfusion);
	
	public int updateTransfusion(Transfusion transfusion);
	
	public int  insertTransfusionAction(TransfusionAction transfusionAction);
	
	
}
