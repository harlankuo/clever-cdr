package com.vico.clever.cdr.service.entity;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionConfig {
	//private static final SqlSession sqlSession;
	private static SqlSessionFactory sqlSessionFactory;
	static {

		try {
			String resource = "config/SQLMapperConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(reader);
			//sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			throw new RuntimeException(
					"Could not initialize DaoConfig.  Cause: " + e);
		}
	}

	//public static SqlSession getSqlSession() {
//		return sqlSession;
//	}
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
