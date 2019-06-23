package com.itcast.dao;

import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import org.apache.ibatis.session.SqlSession;
import com.itcast.utils.MyBatisSqlSessionUtil;
public class InsertBook {
	public void insertBook(Book book) {
		//��ȡSqlSession���ݿ�������
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapper�־û����ӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ִ�����ݿ�������
		bookMapper.insertBook(book);
		//�ύ���ݿ�������SqlSession
		sqlSession.commit();
		//�ر����ݿ�������SqlSession
		sqlSession.close();
		System.out.println("--����ɹ�!--");
	}
}
