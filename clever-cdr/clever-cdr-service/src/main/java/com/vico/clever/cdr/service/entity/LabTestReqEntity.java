package com.vico.clever.cdr.service.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.LabTestItem;
import com.vico.clever.cdr.service.model.LabTestReqInfo;
import com.vico.clever.cdr.service.model.LabTestStatus;
@XmlRootElement(name="LabTestReqEntity")
public class LabTestReqEntity {
	private LabTestReqInfo labTestReqInfo;
	private List<LabTestItem> labTestItemList;
	private LabTestStatus labTestStatus;
	public LabTestReqEntity() {
		super();
	}
	public LabTestReqEntity(LabTestReqInfo labTestReqInfo,
			List<LabTestItem> labTestItemList, LabTestStatus labTestStatus) {
		super();
		this.labTestReqInfo = labTestReqInfo;
		this.labTestItemList = labTestItemList;
		this.labTestStatus = labTestStatus;
	}
	public LabTestReqInfo getLabTestReqInfo() {
		return labTestReqInfo;
	}
	public void setLabTestReqInfo(LabTestReqInfo labTestReqInfo) {
		this.labTestReqInfo = labTestReqInfo;
	}
	public List<LabTestItem> getLabTestItemList() {
		return labTestItemList;
	}
	public void setLabTestItemList(List<LabTestItem> labTestItemList) {
		this.labTestItemList = labTestItemList;
	}
	public LabTestStatus getLabTestStatus() {
		return labTestStatus;
	}
	public void setLabTestStatus(LabTestStatus labTestStatus) {
		this.labTestStatus = labTestStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((labTestItemList == null) ? 0 : labTestItemList.hashCode());
		result = prime * result
				+ ((labTestReqInfo == null) ? 0 : labTestReqInfo.hashCode());
		result = prime * result
				+ ((labTestStatus == null) ? 0 : labTestStatus.hashCode());
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
		LabTestReqEntity other = (LabTestReqEntity) obj;
		if (labTestItemList == null) {
			if (other.labTestItemList != null)
				return false;
		} else if (!labTestItemList.equals(other.labTestItemList))
			return false;
		if (labTestReqInfo == null) {
			if (other.labTestReqInfo != null)
				return false;
		} else if (!labTestReqInfo.equals(other.labTestReqInfo))
			return false;
		if (labTestStatus == null) {
			if (other.labTestStatus != null)
				return false;
		} else if (!labTestStatus.equals(other.labTestStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LabTestReqEntity [labTestReqInfo=")
				.append(labTestReqInfo).append(", labTestItemList=")
				.append(labTestItemList).append(", labTestStatus=")
				.append(labTestStatus).append("]");
		return builder.toString();
	}
}
