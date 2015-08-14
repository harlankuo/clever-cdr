package com.vico.clever.cdr.service.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.vico.clever.cdr.service.model.LabTestData;
import com.vico.clever.cdr.service.model.LabTestStatus;
@XmlRootElement(name="LabTestDataEntity")
public class LabTestDataEntity {
	private List<LabTestData> labTestDataList;
	private LabTestStatus labTestStatus;
	public LabTestDataEntity() {
		super();
	}
	public LabTestDataEntity(List<LabTestData> labTestDataList,
			LabTestStatus labTestStatus) {
		super();
		this.labTestDataList = labTestDataList;
		this.labTestStatus = labTestStatus;
	}
	public List<LabTestData> getLabTestDataList() {
		return labTestDataList;
	}
	public void setLabTestDataList(List<LabTestData> labTestDataList) {
		this.labTestDataList = labTestDataList;
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
				+ ((labTestDataList == null) ? 0 : labTestDataList.hashCode());
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
		LabTestDataEntity other = (LabTestDataEntity) obj;
		if (labTestDataList == null) {
			if (other.labTestDataList != null)
				return false;
		} else if (!labTestDataList.equals(other.labTestDataList))
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
		builder.append("LabTestDataEntity [labTestDataList=")
				.append(labTestDataList).append(", labTestStatus=")
				.append(labTestStatus).append("]");
		return builder.toString();
	}
}
