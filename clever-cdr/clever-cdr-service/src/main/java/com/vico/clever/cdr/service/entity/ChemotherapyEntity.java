package com.vico.clever.cdr.service.entity;

import java.util.List;

import com.vico.clever.cdr.service.model.Chemotherapy;
import com.vico.clever.cdr.service.model.ChemotherapyMedicine;

public class ChemotherapyEntity {
	private Chemotherapy chemotherapy;
	private List<ChemotherapyMedicine> chemotherapyMedicineList;
	public Chemotherapy getChemotherapy() {
		return chemotherapy;
	}
	public void setChemotherapy(Chemotherapy chemotherapy) {
		this.chemotherapy = chemotherapy;
	}
	public List<ChemotherapyMedicine> getChemotherapyMedicineList() {
		return chemotherapyMedicineList;
	}
	public void setChemotherapyMedicineList(List<ChemotherapyMedicine> chemotherapyMedicineList) {
		this.chemotherapyMedicineList = chemotherapyMedicineList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chemotherapy == null) ? 0 : chemotherapy.hashCode());
		result = prime * result + ((chemotherapyMedicineList == null) ? 0 : chemotherapyMedicineList.hashCode());
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
		ChemotherapyEntity other = (ChemotherapyEntity) obj;
		if (chemotherapy == null) {
			if (other.chemotherapy != null)
				return false;
		} else if (!chemotherapy.equals(other.chemotherapy))
			return false;
		if (chemotherapyMedicineList == null) {
			if (other.chemotherapyMedicineList != null)
				return false;
		} else if (!chemotherapyMedicineList.equals(other.chemotherapyMedicineList))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ChemotherapyEntity [chemotherapy=" + chemotherapy + ", chemotherapyMedicineList="
				+ chemotherapyMedicineList + "]";
	}
	

}
