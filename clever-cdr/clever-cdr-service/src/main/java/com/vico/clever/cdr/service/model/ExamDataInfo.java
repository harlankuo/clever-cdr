package com.vico.clever.cdr.service.model;

import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ExamData")
public class ExamDataInfo {
	private String examID;//检查号(*)
	private String patientID;//病人号(*)
	private String visitID;//就诊号(*)
	private String orderID;//医嘱号码
	private String examReqID;//检查申请号
	private String imageView;//图像视图
	private String imagePosition;//位置
	private String dicomStudyID;//DICOM中study号
	private String dicomSeriesID;//图像序列号
	private Date imageDateTime;//检查日期及时间
	private int imageID;//影像号
	private int keyImage;//关键影像标识
	private String imageAbsolutePath;//图像存储绝对路径
	private String imageRelativePath;//图像存储相对路径
	private byte[] imageUri;//图像
	public ExamDataInfo() {
		super();
	}
	public ExamDataInfo(String examID, String patientID, String visitID,
			String orderID, String examReqID, String imageView,
			String imagePosition, String dicomStudyID, String dicomSeriesID,
			Date imageDateTime, int imageID, int keyImage,
			String imageAbsolutePath, String imageRelativePath, byte[] imageUri) {
		super();
		this.examID = examID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.examReqID = examReqID;
		this.imageView = imageView;
		this.imagePosition = imagePosition;
		this.dicomStudyID = dicomStudyID;
		this.dicomSeriesID = dicomSeriesID;
		this.imageDateTime = imageDateTime;
		this.imageID = imageID;
		this.keyImage = keyImage;
		this.imageAbsolutePath = imageAbsolutePath;
		this.imageRelativePath = imageRelativePath;
		this.imageUri = imageUri;
	}
	public String getExamID() {
		return examID;
	}
	public void setExamID(String examID) {
		this.examID = examID;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getVisitID() {
		return visitID;
	}
	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getExamReqID() {
		return examReqID;
	}
	public void setExamReqID(String examReqID) {
		this.examReqID = examReqID;
	}
	public String getImageView() {
		return imageView;
	}
	public void setImageView(String imageView) {
		this.imageView = imageView;
	}
	public String getImagePosition() {
		return imagePosition;
	}
	public void setImagePosition(String imagePosition) {
		this.imagePosition = imagePosition;
	}
	public String getDicomStudyID() {
		return dicomStudyID;
	}
	public void setDicomStudyID(String dicomStudyID) {
		this.dicomStudyID = dicomStudyID;
	}
	public String getDicomSeriesID() {
		return dicomSeriesID;
	}
	public void setDicomSeriesID(String dicomSeriesID) {
		this.dicomSeriesID = dicomSeriesID;
	}
	public Date getImageDateTime() {
		return imageDateTime;
	}
	public void setImageDateTime(Date imageDateTime) {
		this.imageDateTime = imageDateTime;
	}
	public int getImageID() {
		return imageID;
	}
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	public int getKeyImage() {
		return keyImage;
	}
	public void setKeyImage(int keyImage) {
		this.keyImage = keyImage;
	}
	public String getImageAbsolutePath() {
		return imageAbsolutePath;
	}
	public void setImageAbsolutePath(String imageAbsolutePath) {
		this.imageAbsolutePath = imageAbsolutePath;
	}
	public String getImageRelativePath() {
		return imageRelativePath;
	}
	public void setImageRelativePath(String imageRelativePath) {
		this.imageRelativePath = imageRelativePath;
	}
	public byte[] getImageUri() {
		return imageUri;
	}
	public void setImageUri(byte[] imageUri) {
		this.imageUri = imageUri;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dicomSeriesID == null) ? 0 : dicomSeriesID.hashCode());
		result = prime * result
				+ ((dicomStudyID == null) ? 0 : dicomStudyID.hashCode());
		result = prime * result + ((examID == null) ? 0 : examID.hashCode());
		result = prime * result
				+ ((examReqID == null) ? 0 : examReqID.hashCode());
		result = prime
				* result
				+ ((imageAbsolutePath == null) ? 0 : imageAbsolutePath
						.hashCode());
		result = prime * result
				+ ((imageDateTime == null) ? 0 : imageDateTime.hashCode());
		result = prime * result + imageID;
		result = prime * result
				+ ((imagePosition == null) ? 0 : imagePosition.hashCode());
		result = prime
				* result
				+ ((imageRelativePath == null) ? 0 : imageRelativePath
						.hashCode());
		result = prime * result + Arrays.hashCode(imageUri);
		result = prime * result
				+ ((imageView == null) ? 0 : imageView.hashCode());
		result = prime * result + keyImage;
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
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
		ExamDataInfo other = (ExamDataInfo) obj;
		if (dicomSeriesID == null) {
			if (other.dicomSeriesID != null)
				return false;
		} else if (!dicomSeriesID.equals(other.dicomSeriesID))
			return false;
		if (dicomStudyID == null) {
			if (other.dicomStudyID != null)
				return false;
		} else if (!dicomStudyID.equals(other.dicomStudyID))
			return false;
		if (examID == null) {
			if (other.examID != null)
				return false;
		} else if (!examID.equals(other.examID))
			return false;
		if (examReqID == null) {
			if (other.examReqID != null)
				return false;
		} else if (!examReqID.equals(other.examReqID))
			return false;
		if (imageAbsolutePath == null) {
			if (other.imageAbsolutePath != null)
				return false;
		} else if (!imageAbsolutePath.equals(other.imageAbsolutePath))
			return false;
		if (imageDateTime == null) {
			if (other.imageDateTime != null)
				return false;
		} else if (!imageDateTime.equals(other.imageDateTime))
			return false;
		if (imageID != other.imageID)
			return false;
		if (imagePosition == null) {
			if (other.imagePosition != null)
				return false;
		} else if (!imagePosition.equals(other.imagePosition))
			return false;
		if (imageRelativePath == null) {
			if (other.imageRelativePath != null)
				return false;
		} else if (!imageRelativePath.equals(other.imageRelativePath))
			return false;
		if (!Arrays.equals(imageUri, other.imageUri))
			return false;
		if (imageView == null) {
			if (other.imageView != null)
				return false;
		} else if (!imageView.equals(other.imageView))
			return false;
		if (keyImage != other.keyImage)
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ExamDataInfo [examID=" + examID + ", patientID=" + patientID
				+ ", visitID=" + visitID + ", orderID=" + orderID
				+ ", examReqID=" + examReqID + ", imageView=" + imageView
				+ ", imagePosition=" + imagePosition + ", dicomStudyID="
				+ dicomStudyID + ", dicomSeriesID=" + dicomSeriesID
				+ ", imageDateTime=" + imageDateTime + ", imageID=" + imageID
				+ ", keyImage=" + keyImage + ", imageAbsolutePath="
				+ imageAbsolutePath + ", imageRelativePath="
				+ imageRelativePath + ", imageUri=" + Arrays.toString(imageUri)
				+ "]";
	}

}
