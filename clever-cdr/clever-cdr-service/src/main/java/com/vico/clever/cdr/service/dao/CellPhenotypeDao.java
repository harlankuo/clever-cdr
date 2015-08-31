package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.CellPhenotype;
import com.vico.clever.cdr.service.model.CellPhenotypeValue;

public interface CellPhenotypeDao {
	public CellPhenotype selectCellPhenotype(String cellPhenotypeID);
    public int insertCellPhenotype(CellPhenotype cellPhenotype);
    public int updateCellPhenotype(CellPhenotype cellPhenotype);
    public int deleteCellPhenotype(String cellPhenotypeID);
    
    public List<CellPhenotypeValue> selectCellPhenotypeValue(String cellPhenotypeID);
    public int insertCellPhenotypeValue(List<CellPhenotypeValue> cellPhenotypeValueList);
    public int deleteCellPhenotypeValue(String cellPhenotypeID);
}
