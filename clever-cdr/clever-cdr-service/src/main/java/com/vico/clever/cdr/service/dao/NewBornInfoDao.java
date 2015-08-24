package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.NewBornMaster;
/**
 * @author Yuan.Ziyang
 * 
 */
public interface NewBornInfoDao {

	public NewBornMaster selectNewBornMaster(String newBornID);
	
	public int deleteNewBornMaster(String newBornID);
	
	public int insertNewBornMaster(NewBornMaster newBornMaster);
	
	public int updateNewBornMaster(NewBornMaster newBornMaster);
	
}
