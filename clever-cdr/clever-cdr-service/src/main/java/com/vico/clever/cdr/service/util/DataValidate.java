package com.vico.clever.cdr.service.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据验证注解
 * 
 * @author Yuan.Ziyang
 * 
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
public @interface DataValidate {
	// 是否可以为空
	boolean nullable() default false;

	// 参数或者字段描述,这样能够显示友好的结果信息
	String description() default "";
}
