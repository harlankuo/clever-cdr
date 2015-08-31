package com.vico.clever.cdr.service.entity;

import java.util.List;

import com.vico.clever.cdr.service.model.CellPhenotype;
import com.vico.clever.cdr.service.model.CellPhenotypeValue;

public class CellPhenotypeEntity {
   private CellPhenotype cellPhenotype;
   private List<CellPhenotypeValue> cellPhenotypeValueList;
public CellPhenotype getCellPhenotype() {
	return cellPhenotype;
}
public void setCellPhenotype(CellPhenotype cellPhenotype) {
	this.cellPhenotype = cellPhenotype;
}
public List<CellPhenotypeValue> getCellPhenotypeValueList() {
	return cellPhenotypeValueList;
}
public void setCellPhenotypeValueList(List<CellPhenotypeValue> cellPhenotypeValueList) {
	this.cellPhenotypeValueList = cellPhenotypeValueList;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cellPhenotype == null) ? 0 : cellPhenotype.hashCode());
	result = prime * result + ((cellPhenotypeValueList == null) ? 0 : cellPhenotypeValueList.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CellPhenotypeEntity other = (CellPhenotypeEntity) obj;
	if (cellPhenotype == null) {
		if (other.cellPhenotype != null)
			return false;
	} else if (!cellPhenotype.equals(other.cellPhenotype))
		return false;
	if (cellPhenotypeValueList == null) {
		if (other.cellPhenotypeValueList != null)
			return false;
	} else if (!cellPhenotypeValueList.equals(other.cellPhenotypeValueList))
		return false;
	return true;
}
@Override
public String toString() {
	return "CellPhenotypeEntity [cellPhenotype=" + cellPhenotype + ", cellPhenotypeValueList=" + cellPhenotypeValueList
			+ "]";
}
   
}

