package com.vico.clever.cdr.service.entity;

import java.util.List;

import com.vico.clever.cdr.service.model.CellTherapy;
import com.vico.clever.cdr.service.model.CellTherapyInfusion;
import com.vico.clever.cdr.service.model.CellTherapyPreprocess;
import com.vico.clever.cdr.service.model.CellTherapyReaction;

public class CellTherapyEntity {
	private CellTherapy cellTherapy;
	private List<CellTherapyPreprocess> cellTherapyPreprocessList;
	private List<CellTherapyInfusion> cellTherapyInfusionList;
	private List<CellTherapyReaction> cellTherapyReactionList;
	public CellTherapy getCellTherapy() {
		return cellTherapy;
	}
	public void setCellTherapy(CellTherapy cellTherapy) {
		this.cellTherapy = cellTherapy;
	}
	public List<CellTherapyPreprocess> getCellTherapyPreprocessList() {
		return cellTherapyPreprocessList;
	}
	public void setCellTherapyPreprocessList(List<CellTherapyPreprocess> cellTherapyPreprocessList) {
		this.cellTherapyPreprocessList = cellTherapyPreprocessList;
	}
	public List<CellTherapyInfusion> getCellTherapyInfusionList() {
		return cellTherapyInfusionList;
	}
	public void setCellTherapyInfusionList(List<CellTherapyInfusion> cellTherapyInfusionList) {
		this.cellTherapyInfusionList = cellTherapyInfusionList;
	}
	public List<CellTherapyReaction> getCellTherapyReactionList() {
		return cellTherapyReactionList;
	}
	public void setCellTherapyReactionList(List<CellTherapyReaction> cellTherapyReactionList) {
		this.cellTherapyReactionList = cellTherapyReactionList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cellTherapy == null) ? 0 : cellTherapy.hashCode());
		result = prime * result + ((cellTherapyInfusionList == null) ? 0 : cellTherapyInfusionList.hashCode());
		result = prime * result + ((cellTherapyPreprocessList == null) ? 0 : cellTherapyPreprocessList.hashCode());
		result = prime * result + ((cellTherapyReactionList == null) ? 0 : cellTherapyReactionList.hashCode());
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
		CellTherapyEntity other = (CellTherapyEntity) obj;
		if (cellTherapy == null) {
			if (other.cellTherapy != null)
				return false;
		} else if (!cellTherapy.equals(other.cellTherapy))
			return false;
		if (cellTherapyInfusionList == null) {
			if (other.cellTherapyInfusionList != null)
				return false;
		} else if (!cellTherapyInfusionList.equals(other.cellTherapyInfusionList))
			return false;
		if (cellTherapyPreprocessList == null) {
			if (other.cellTherapyPreprocessList != null)
				return false;
		} else if (!cellTherapyPreprocessList.equals(other.cellTherapyPreprocessList))
			return false;
		if (cellTherapyReactionList == null) {
			if (other.cellTherapyReactionList != null)
				return false;
		} else if (!cellTherapyReactionList.equals(other.cellTherapyReactionList))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CellTherapyEntity [cellTherapy=" + cellTherapy + ", cellTherapyPreprocessList="
				+ cellTherapyPreprocessList + ", cellTherapyInfusionList=" + cellTherapyInfusionList
				+ ", cellTherapyReactionList=" + cellTherapyReactionList + "]";
	}
	
	
}
