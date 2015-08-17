package com.vico.clever.cdr.service.entity;

import com.vico.clever.cdr.service.model.FareInfo;
import com.vico.clever.cdr.service.model.FareStatus;

public class FareInfoEntity {
	private FareInfo fareInfo;
	private FareStatus fareStatus;
	public FareInfoEntity() {
		super();
	}
	public FareInfo getFareInfo() {
		return fareInfo;
	}
	public void setFareInfo(FareInfo fareInfo) {
		this.fareInfo = fareInfo;
	}
	public FareStatus getFareStatus() {
		return fareStatus;
	}
	public void setFareStatus(FareStatus fareStatus) {
		this.fareStatus = fareStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fareInfo == null) ? 0 : fareInfo.hashCode());
		result = prime * result
				+ ((fareStatus == null) ? 0 : fareStatus.hashCode());
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
		FareInfoEntity other = (FareInfoEntity) obj;
		if (fareInfo == null) {
			if (other.fareInfo != null)
				return false;
		} else if (!fareInfo.equals(other.fareInfo))
			return false;
		if (fareStatus == null) {
			if (other.fareStatus != null)
				return false;
		} else if (!fareStatus.equals(other.fareStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FareInfoEntity [fareInfo=").append(fareInfo)
				.append(", fareStatus=").append(fareStatus).append("]");
		return builder.toString();
	}
}
