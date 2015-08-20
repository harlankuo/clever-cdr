package com.vico.clever.cdr.service.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.Management;
import com.vico.clever.cdr.service.model.ManagementAction;
@XmlRootElement(name="ManagementEntity")
public class ManagementEntity {
	private Management management;
	private ManagementAction managementAction;
	public ManagementEntity() {
		super();
	}
	public ManagementEntity(Management management,
			ManagementAction managementAction) {
		super();
		this.management = management;
		this.managementAction = managementAction;
	}
	public Management getManagement() {
		return management;
	}
	public void setManagement(Management management) {
		this.management = management;
	}
	public ManagementAction getManagementAction() {
		return managementAction;
	}
	public void setManagementAction(ManagementAction managementAction) {
		this.managementAction = managementAction;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((management == null) ? 0 : management.hashCode());
		result = prime
				* result
				+ ((managementAction == null) ? 0 : managementAction.hashCode());
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
		ManagementEntity other = (ManagementEntity) obj;
		if (management == null) {
			if (other.management != null)
				return false;
		} else if (!management.equals(other.management))
			return false;
		if (managementAction == null) {
			if (other.managementAction != null)
				return false;
		} else if (!managementAction.equals(other.managementAction))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ManagementEntity [management=" + management
				+ ", managementAction=" + managementAction + "]";
	}
}
