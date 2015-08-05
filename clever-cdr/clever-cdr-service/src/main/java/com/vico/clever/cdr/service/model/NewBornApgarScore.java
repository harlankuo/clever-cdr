package com.vico.clever.cdr.service.model;

import java.util.Date;

public class NewBornApgarScore {
	public String newBornID;//新生儿ID
	public int minutesAfterBirth;//出生后分钟数数值
	public String minutesAfterBirthUnit;//出生后分钟数单位
	public int Hr;//心率
	public String HrUnits;//心率单位
	public int Br;//呼吸
	public String BrUnit;//呼吸单位
	public String reflection;//刺激反射
	public String muscleTension;//肌张力
	public String skinColor;//肤色
	public int totalScore;//总分
	public String ratersName;//评分者姓名
	public String ratersCode;//评分者ID
	public String memo;//备注
	public Date createDate;//录入日期
	public String creator;//录入人姓名
	public String creatorID;//录入人ID
	public Date lastModifiedDate;//最后修改日期
	public String lastModifierName;//最后修改人姓名
	public String lastModifierCode;//最后修改人ID

}
