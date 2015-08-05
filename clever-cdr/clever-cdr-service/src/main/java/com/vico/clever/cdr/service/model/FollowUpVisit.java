package com.vico.clever.cdr.service.model;

import java.util.Date;

public class FollowUpVisit {
	public String patientID;//病人号(*)
    public String visitID;//就诊号
    public String followUpID;//随访ID(*)
    public String followUpMode;//随访方式
    public Date followUpDatetime;//随访日期
    public String assessment;//评估
}
