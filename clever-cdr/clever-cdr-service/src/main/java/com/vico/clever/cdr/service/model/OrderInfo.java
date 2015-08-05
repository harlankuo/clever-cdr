package com.vico.clever.cdr.service.model;



public class OrderInfo {
	public String orderID;//医嘱ID,(*)
	public String patientID;//病人ID,(*)
	public String visitID;//就诊ID,(*);
	public String orderNO;//医嘱序号,(*)
	public String  orderSubNO;//医嘱子序号(*)
	public byte emergency;//紧急医嘱属性,0-普通，1-紧急，默认为0
	public String motherOrBaby;//母婴属性,0-母亲，从1开始表示第几个婴儿
	public byte reservedOrder;//备用医嘱属性,0-正常医嘱，1-备用医嘱
	public byte subsequentOrder;//补录医嘱属性,0-正常医嘱，1-后来补录的医嘱
	public byte repeatOrder;//是否长期医嘱,1-长期，0-临时索引(*)
	public String orderClassCode;//医嘱类别代码
	public String orderClassName;//医嘱类别
	

}
