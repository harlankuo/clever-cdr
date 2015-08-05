package com.vico.clever.cdr.service.model;

import java.util.Date;

public class NewBornMaster {
	public String newBornID;//新生儿ID(*)
	public String patientID;//母亲病人号(*)
	public String visitID;//母亲就诊号(*)
	public Date birthDate;//出生时间
	public String gender;//性别
	public String name;//姓名
	public String healthState;//健康状况,0-良好；1-一般；2-差
	public int height;//身长数值
	public String heightUnit;//身长单位
	public int weight;//体重数值
	public String weightUnit;//体重单位
	public String fatherName;//父亲姓名
	public String fatherNation;//父亲国籍
	public String fatherEthnicGroup;//父亲民族
	public String fatherIDType;//父亲证件类型
	public String fatherID;//父亲证件号码
	public String matherName;//母亲姓名
	public String matherNation;//母亲国籍
	public String matherEthnicGroup;//母亲民族
	public String matherIDType;//母亲证件类型
	public String matherID;//母亲证件号码
	public String birthPlace;//出生地
	public int birthPlaceType;//出生地点类型
	public String deliveringInstitutions;//接生机构名称
	public Date createDate;//建档日期
	public String creator;//建档人姓名
	public String creatorID;//建档人ID
	public Date lastModifiedDate;//最后修改日期
	public String lastModifierName;//最后修改人姓名
	public String lastModifierCode;//最后修改人ID
	public String status;//状态,0-有效；1-已作废
 
}
