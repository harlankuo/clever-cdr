package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Consultation;
import com.vico.clever.cdr.service.model.ConsultationAction;

@XmlRootElement(name = "ConsultationEntity")
public class ConsultationEntity {
	private Consultation consultation;
	private ConsultationAction consultationAction;

	public ConsultationEntity() {
		super();
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public ConsultationAction getConsultationAction() {
		return consultationAction;
	}

	public void setConsultationAction(ConsultationAction consultationAction) {
		this.consultationAction = consultationAction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((consultation == null) ? 0 : consultation.hashCode());
		result = prime
				* result
				+ ((consultationAction == null) ? 0 : consultationAction
						.hashCode());
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
		ConsultationEntity other = (ConsultationEntity) obj;
		if (consultation == null) {
			if (other.consultation != null)
				return false;
		} else if (!consultation.equals(other.consultation))
			return false;
		if (consultationAction == null) {
			if (other.consultationAction != null)
				return false;
		} else if (!consultationAction.equals(other.consultationAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConsultationEntity [consultation=" + consultation
				+ ", consultationAction=" + consultationAction + "]";
	}
}
