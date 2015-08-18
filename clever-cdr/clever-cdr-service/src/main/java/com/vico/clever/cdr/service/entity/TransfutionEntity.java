package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Transfusion;
import com.vico.clever.cdr.service.model.TransfusionAction;
@XmlRootElement(name="TransfutionEntity")
public class TransfutionEntity {
	private Transfusion transfusion;
	private TransfusionAction transfusionAction;
	public TransfutionEntity() {
		super();
	}
	public TransfutionEntity(Transfusion transfusion,
			TransfusionAction transfusionAction) {
		super();
		this.transfusion = transfusion;
		this.transfusionAction = transfusionAction;
	}
	public Transfusion getTransfusion() {
		return transfusion;
	}
	public void setTransfusion(Transfusion transfusion) {
		this.transfusion = transfusion;
	}
	public TransfusionAction getTransfusionAction() {
		return transfusionAction;
	}
	public void setTransfusionAction(TransfusionAction transfusionAction) {
		this.transfusionAction = transfusionAction;
	}
}
