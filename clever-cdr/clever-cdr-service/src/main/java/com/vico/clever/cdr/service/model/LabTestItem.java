package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="LabTestItem")
public class LabTestItem {
	private String tetReqID;//检验申请号(*)
	private String itemNO;//项目序号(*)
	private String itemClassCode;//检验类别代码
	private String itemClassName;//检验类别名称
	private String itemCode;//检验项目代码
	private String itemName;//检验项目名称
	private String specimenID;//检验标本号
	private String specimenTypeCode;//检验样本类别代码
	private String specimenTypeName;//检验样本类别名称
	private Date specimenCollectionDate;//样本采样日期时间
	private Date specimenReceiptDate;//样本收到日期时间
	private String specimenStatus;//标本状态
	private String transportMediumCode;//试管种类代码
	private String transportMediumName;//试管种类名称
	public LabTestItem() {
		super();
	}
	public LabTestItem(String tetReqID, String itemNO, String itemClassCode,
			String itemClassName, String itemCode, String itemName,
			String specimenID, String specimenTypeCode,
			String specimenTypeName, Date specimenCollectionDate,
			Date specimenReceiptDate, String specimenStatus,
			String transportMediumCode, String transportMediumName) {
		super();
		this.tetReqID = tetReqID;
		this.itemNO = itemNO;
		this.itemClassCode = itemClassCode;
		this.itemClassName = itemClassName;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.specimenID = specimenID;
		this.specimenTypeCode = specimenTypeCode;
		this.specimenTypeName = specimenTypeName;
		this.specimenCollectionDate = specimenCollectionDate;
		this.specimenReceiptDate = specimenReceiptDate;
		this.specimenStatus = specimenStatus;
		this.transportMediumCode = transportMediumCode;
		this.transportMediumName = transportMediumName;
	}
	public String getTetReqID() {
		return tetReqID;
	}
	public void setTetReqID(String tetReqID) {
		this.tetReqID = tetReqID;
	}
	public String getItemNO() {
		return itemNO;
	}
	public void setItemNO(String itemNO) {
		this.itemNO = itemNO;
	}
	public String getItemClassCode() {
		return itemClassCode;
	}
	public void setItemClassCode(String itemClassCode) {
		this.itemClassCode = itemClassCode;
	}
	public String getItemClassName() {
		return itemClassName;
	}
	public void setItemClassName(String itemClassName) {
		this.itemClassName = itemClassName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSpecimenID() {
		return specimenID;
	}
	public void setSpecimenID(String specimenID) {
		this.specimenID = specimenID;
	}
	public String getSpecimenTypeCode() {
		return specimenTypeCode;
	}
	public void setSpecimenTypeCode(String specimenTypeCode) {
		this.specimenTypeCode = specimenTypeCode;
	}
	public String getSpecimenTypeName() {
		return specimenTypeName;
	}
	public void setSpecimenTypeName(String specimenTypeName) {
		this.specimenTypeName = specimenTypeName;
	}
	public Date getSpecimenCollectionDate() {
		return specimenCollectionDate;
	}
	public void setSpecimenCollectionDate(Date specimenCollectionDate) {
		this.specimenCollectionDate = specimenCollectionDate;
	}
	public Date getSpecimenReceiptDate() {
		return specimenReceiptDate;
	}
	public void setSpecimenReceiptDate(Date specimenReceiptDate) {
		this.specimenReceiptDate = specimenReceiptDate;
	}
	public String getSpecimenStatus() {
		return specimenStatus;
	}
	public void setSpecimenStatus(String specimenStatus) {
		this.specimenStatus = specimenStatus;
	}
	public String getTransportMediumCode() {
		return transportMediumCode;
	}
	public void setTransportMediumCode(String transportMediumCode) {
		this.transportMediumCode = transportMediumCode;
	}
	public String getTransportMediumName() {
		return transportMediumName;
	}
	public void setTransportMediumName(String transportMediumName) {
		this.transportMediumName = transportMediumName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((itemClassCode == null) ? 0 : itemClassCode.hashCode());
		result = prime * result
				+ ((itemClassName == null) ? 0 : itemClassName.hashCode());
		result = prime * result
				+ ((itemCode == null) ? 0 : itemCode.hashCode());
		result = prime * result + ((itemNO == null) ? 0 : itemNO.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime
				* result
				+ ((specimenCollectionDate == null) ? 0
						: specimenCollectionDate.hashCode());
		result = prime * result
				+ ((specimenID == null) ? 0 : specimenID.hashCode());
		result = prime
				* result
				+ ((specimenReceiptDate == null) ? 0 : specimenReceiptDate
						.hashCode());
		result = prime * result
				+ ((specimenStatus == null) ? 0 : specimenStatus.hashCode());
		result = prime
				* result
				+ ((specimenTypeCode == null) ? 0 : specimenTypeCode.hashCode());
		result = prime
				* result
				+ ((specimenTypeName == null) ? 0 : specimenTypeName.hashCode());
		result = prime * result
				+ ((tetReqID == null) ? 0 : tetReqID.hashCode());
		result = prime
				* result
				+ ((transportMediumCode == null) ? 0 : transportMediumCode
						.hashCode());
		result = prime
				* result
				+ ((transportMediumName == null) ? 0 : transportMediumName
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
		LabTestItem other = (LabTestItem) obj;
		if (itemClassCode == null) {
			if (other.itemClassCode != null)
				return false;
		} else if (!itemClassCode.equals(other.itemClassCode))
			return false;
		if (itemClassName == null) {
			if (other.itemClassName != null)
				return false;
		} else if (!itemClassName.equals(other.itemClassName))
			return false;
		if (itemCode == null) {
			if (other.itemCode != null)
				return false;
		} else if (!itemCode.equals(other.itemCode))
			return false;
		if (itemNO == null) {
			if (other.itemNO != null)
				return false;
		} else if (!itemNO.equals(other.itemNO))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (specimenCollectionDate == null) {
			if (other.specimenCollectionDate != null)
				return false;
		} else if (!specimenCollectionDate.equals(other.specimenCollectionDate))
			return false;
		if (specimenID == null) {
			if (other.specimenID != null)
				return false;
		} else if (!specimenID.equals(other.specimenID))
			return false;
		if (specimenReceiptDate == null) {
			if (other.specimenReceiptDate != null)
				return false;
		} else if (!specimenReceiptDate.equals(other.specimenReceiptDate))
			return false;
		if (specimenStatus == null) {
			if (other.specimenStatus != null)
				return false;
		} else if (!specimenStatus.equals(other.specimenStatus))
			return false;
		if (specimenTypeCode == null) {
			if (other.specimenTypeCode != null)
				return false;
		} else if (!specimenTypeCode.equals(other.specimenTypeCode))
			return false;
		if (specimenTypeName == null) {
			if (other.specimenTypeName != null)
				return false;
		} else if (!specimenTypeName.equals(other.specimenTypeName))
			return false;
		if (tetReqID == null) {
			if (other.tetReqID != null)
				return false;
		} else if (!tetReqID.equals(other.tetReqID))
			return false;
		if (transportMediumCode == null) {
			if (other.transportMediumCode != null)
				return false;
		} else if (!transportMediumCode.equals(other.transportMediumCode))
			return false;
		if (transportMediumName == null) {
			if (other.transportMediumName != null)
				return false;
		} else if (!transportMediumName.equals(other.transportMediumName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LabTestItem [tetReqID=").append(tetReqID)
				.append(", itemNO=").append(itemNO).append(", itemClassCode=")
				.append(itemClassCode).append(", itemClassName=")
				.append(itemClassName).append(", itemCode=").append(itemCode)
				.append(", itemName=").append(itemName).append(", specimenID=")
				.append(specimenID).append(", specimenTypeCode=")
				.append(specimenTypeCode).append(", specimenTypeName=")
				.append(specimenTypeName).append(", specimenCollectionDate=")
				.append(specimenCollectionDate)
				.append(", specimenReceiptDate=").append(specimenReceiptDate)
				.append(", specimenStatus=").append(specimenStatus)
				.append(", transportMediumCode=").append(transportMediumCode)
				.append(", transportMediumName=").append(transportMediumName)
				.append("]");
		return builder.toString();
	}

}
