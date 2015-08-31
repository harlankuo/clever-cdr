package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Radiotherapy;

public interface RadiotherapyDao {
	public Radiotherapy selectRadiotherapy(String radiotherapyID);
	public int insertRadiotherapy(Radiotherapy radiotherapy);
	public int updateRadiotherapy(Radiotherapy  radiotherapy);
	public int deleteRadiotherapy(String radiotherapyID);

}
