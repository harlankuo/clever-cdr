package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.MedcationOrder;
import com.vico.clever.cdr.service.model.MedcationOrderStatus;

public interface MedcationOrderInfoDao {
	/*
	 * selectMedcationOrder
	 * deleteMedcationOrder
	 * insertMedcationOrder
	 * updateMedcationOrder
	 * 
	 * selectMedcationOrderStatus
	 * deleteMedcationOrderStatus
	 * insertMedcationOrderStatus
	 * updateMedcationOrderStatus
	 * 
	 * */
	
	public MedcationOrder selectMedcationOrder(String medcationOrderID);
	
	public int deleteMedcationOrder(String medcationOrderID);
	
	public int insertMedcationOrder(MedcationOrder medcationOrder);
	
	public int updateMedcationOrder(MedcationOrder medcationOrder);
	
	/*
	 * selectMedcationOrderStatus method
	 * 
	 * select MedcationOrderStatus by medcationOrderID ,may get more than one record
	 * 
	 * */
	
	public List<MedcationOrderStatus> selectMedcationOrderStatus(String medcationOrderID);
	
	public int insertMedcationOrderStatus(MedcationOrderStatus medcationOrderStatus);
	
	public int deleteMedcationOrderStatus(String medcationOrderID);
	
	
}
