package com.vico.clever.cdr.service.model;

import java.util.Date;

public class CellTherapyPreprocess {
	private String requestID;//细胞治疗ID
	private String preprocessSolution;//预处理方案名称
	private Date preprocessDatetime;//预处理时间
	private String unburdingSolution;//减负方案名称
	private Date unburdingDatetime;//减负时间
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getPreprocessSolution() {
		return preprocessSolution;
	}
	public void setPreprocessSolution(String preprocessSolution) {
		this.preprocessSolution = preprocessSolution;
	}
	public Date getPreprocessDatetime() {
		return preprocessDatetime;
	}
	public void setPreprocessDatetime(Date preprocessDatetime) {
		this.preprocessDatetime = preprocessDatetime;
	}
	public String getUnburdingSolution() {
		return unburdingSolution;
	}
	public void setUnburdingSolution(String unburdingSolution) {
		this.unburdingSolution = unburdingSolution;
	}
	public Date getUnburdingDatetime() {
		return unburdingDatetime;
	}
	public void setUnburdingDatetime(Date unburdingDatetime) {
		this.unburdingDatetime = unburdingDatetime;
	}
    
	
}
