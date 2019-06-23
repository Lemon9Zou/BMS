package com.itcast.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionUtil {
	
	public SqlSession getSqlSession() {
		String resource="mybatis-config.xml";
		SqlSession sqlSession=null;
		try {
			//1.��ȡ�����ļ�
			InputStream inputStream=Resources.getResourceAsStream(resource);
			//2.ͨ�������ļ���ȡSqlSessionFactory���ݿ����񹤳�
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			//3.ͨ��SqlSessionFactory���ݿ����񹤳���ȡSqlSession���ݿ�����
			sqlSession=sqlSessionFactory.openSession();
			System.out.println("���ݿ��������SqlSession���سɹ�...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqlSession;
	}
}
