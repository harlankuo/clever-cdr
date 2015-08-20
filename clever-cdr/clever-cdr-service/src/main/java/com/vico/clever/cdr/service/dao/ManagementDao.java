package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Management;
import com.vico.clever.cdr.service.model.ManagementAction;

public interface ManagementDao {
	/*
	 * selectManagement
	 * deleteManagement
	 * insertManagement
	 * updateManagement
	 * 
	 * selectManagementAction
	 * deleteManagementAction
	 * insertManagementAction
	 * 
	 * */
	
	public Management selectManagement(String managementID);
	
	public int deleteManagement(String managementID);
	
	public int insertManagement(Management management);
	
	public int updateManagement(Management management);
	
	public int insertManagementAction(ManagementAction managementAction);
	
	
}
