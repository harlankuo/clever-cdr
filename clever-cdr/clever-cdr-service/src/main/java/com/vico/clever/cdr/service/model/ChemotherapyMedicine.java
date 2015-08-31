package com.vico.clever.cdr.service.model;

public class ChemotherapyMedicine {
	private String chemotherapyID;//放疗ID(*)
	private String name;//化疗药物名称
	private String medicationOrderID;//关联药嘱号
	public String getChemotherapyID() {
		return chemotherapyID;
	}
	public void setChemotherapyID(String chemotherapyID) {
		this.chemotherapyID = chemotherapyID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMedicationOrderID() {
		return medicationOrderID;
	}
	public void setMedicationOrderID(String medicationOrderID) {
		this.medicationOrderID = medicationOrderID;
	}
	
}
