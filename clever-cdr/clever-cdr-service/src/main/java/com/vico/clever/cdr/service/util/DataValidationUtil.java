package com.vico.clever.cdr.service.util;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import com.vico.clever.cdr.service.model.IntegrationResult;

/**
 * 注解解析工具类
 * 
 * @author Yuan.Ziyang
 * 
 */
public class DataValidationUtil {
	protected final Logger logger = Logger.getLogger(this.getClass());
	private static DataValidate dataValidate;

	public DataValidationUtil() {
		super();
	}

	/**
	 * 
	 * Returns the result object that validating object data through java annotations.
	 * <p>
	 * Examples:
	 * <blockquote>
	 * <pre>
	 * <code>public class User {
	 * 	<b>@DataValidate(description="用户ID",nullable=false)	</b>
	 * 	<b>private int id;</b>	
	 * 	<b>@DataValidate(description="用户名",nullable=false)</b>
	 * 	<b>private String username;</b>	
	 * 	<b>@DataValidate(description="用户密码",nullable=false)</b>
	 * 	<b>private String password;</b>
	 * 	<b>...</b>
	 * }</code>
	 * </pre>
	 * </blockquote>
	 * <blockquote>
	 * <pre>
	 * <code>
	 * User user = new User();
	 * user.setusername("admin");
	 * user.setPassword("admin");
	 * IntegrationResult integrationResult = DataValidationUtil.validate(user);
	 * <b>//integrationResult is the result object of validating user object's data integrity</b>
	 * </code>
	 * </pre>
	 * </blockquote>
	 * 
	 * @param object
	 *            the object needed to be validated if there exists null or ""
	 *            string value
	 * @return IntegrationResult return object data validating result.
	 */
	public static IntegrationResult validate(Object object) {
		IntegrationResult integrationResult = new IntegrationResult();
		// 获取object的类型
		Class<? extends Object> clazz = object.getClass();
		// 获取该类型声明的成员
		Field[] fields = clazz.getDeclaredFields();
		// 遍历属性
		String descpList = "";
		int code = 0;
		try {
			for (Field field : fields) {
				// 对于private私有化的成员变量，通过setAccessible来修改器访问权限
				field.setAccessible(true);
				// integrationResult = dataValidation(field, object);
				String description;
				Object value;
				dataValidate = field.getAnnotation(DataValidate.class);
				value = field.get(object);
				if (dataValidate != null) {
					description = dataValidate.description().equals("") ? field
							.getName() : dataValidate.description();
					System.out.println(description + " : " + value);
					if (value == null || isBlank(value.toString())) {
						descpList = descpList + description + ",";
						code = 1;
					}
				}
				// 重新设置会私有权限
				field.setAccessible(false);
			}
			if (code == 1) {
				integrationResult.setResultCode(code);
				integrationResult.setResultDesc(descpList + "不能为空");
			} else {
				integrationResult.setResultCode(code);
				integrationResult.setResultDesc("数据验证通过");
			}
		} catch (Exception e) {
			integrationResult.setResultCode(IntegrationResult.INTERNALERROR);
			integrationResult.setResultDesc(IntegrationResult.INTERNALDESC
					+ ":" + e.toString());
		}
		return integrationResult;
	}

	/**
	 * <p>
	 * 判断字符串是否是""," ",null
	 * </p>
	 * 
	 * <pre>
	 * isBlank(null)      = true
	 * isBlank("")        = true
	 * isBlank(" ")       = true
	 * isBlank("bob")     = false
	 * isBlank("  bob  ") = false
	 * </pre>
	 */
	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

}
