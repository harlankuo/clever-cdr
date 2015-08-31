package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.FollowUpVisit;

public interface FollowUpVisitDao {
	public FollowUpVisit selectFollowUpVisit(String followUpID);
	public int insertFollowUpVisit(FollowUpVisit followUpVisit);
	public int updateFollowUpVisit(FollowUpVisit followUpVisit);
	public int deleteFollowUpVisit(String followUpID);

}
