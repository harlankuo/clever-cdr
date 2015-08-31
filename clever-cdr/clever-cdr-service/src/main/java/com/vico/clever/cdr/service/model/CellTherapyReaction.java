package com.vico.clever.cdr.service.model;

public class CellTherapyReaction {
	private String requestID;//细胞治疗ID
	private String reactionLevel;//不良反应分级
	private String reactionDispose;//不良反应处置
	private String reactionResult;//不良反应效果
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getReactionLevel() {
		return reactionLevel;
	}
	public void setReactionLevel(String reactionLevel) {
		this.reactionLevel = reactionLevel;
	}
	public String getReactionDispose() {
		return reactionDispose;
	}
	public void setReactionDispose(String reactionDispose) {
		this.reactionDispose = reactionDispose;
	}
	public String getReactionResult() {
		return reactionResult;
	}
	public void setReactionResult(String reactionResult) {
		this.reactionResult = reactionResult;
	}
    
}
