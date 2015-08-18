package com.vico.clever.cdr.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IntegrationResult")
public class IntegrationResult {
	public static final int SUCCESSCODE = 0;
	public static final String SUCCESSDESC = "成功";
	public static final int INTERNALERROR = -500;
	public static final String INTERNALDESC = "服务内部错误";
	private int resultCode;
	private String resultDesc;

	public IntegrationResult() {
		super();
	}

	public IntegrationResult(int resultCode, String resultDesc) {
		super();
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		if (resultDesc == null) {
			resultDesc = "";
		}
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + resultCode;
		result = prime * result
				+ ((resultDesc == null) ? 0 : resultDesc.hashCode());
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
		IntegrationResult other = (IntegrationResult) obj;
		if (resultCode != other.resultCode)
			return false;
		if (resultDesc == null) {
			if (other.resultDesc != null)
				return false;
		} else if (!resultDesc.equals(other.resultDesc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IntegrationResult [resultCode=").append(resultCode)
				.append(", resultDesc=").append(resultDesc).append("]");
		return builder.toString();
	}
}
