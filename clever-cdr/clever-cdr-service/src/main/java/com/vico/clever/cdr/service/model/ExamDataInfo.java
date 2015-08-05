package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ExamDataInfo {
	public String examID;//检查号(*)
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱号码
	public String examReqID;//检查申请号
	public String imageView;//图像视图
	public String imagePosition;//位置
	public String dicomStudyID;//DICOM中study号
	public String dicomSeriesID;//图像序列号
	public Date imageDateTime;//检查日期及时间
	public int imageID;//影像号
	public int keyImage;//关键影像标识
	public String imageAbsolutePath;//图像存储绝对路径
	public String imageRelativePath;//图像存储相对路径
	public String imageUri;//图像

}
