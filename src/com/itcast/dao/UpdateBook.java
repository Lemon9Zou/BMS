package com.itcast.dao;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class UpdateBook {
	public void goUpdateBook(Book book){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		bookMapper.updateBook(book);
		sqlSession.commit();
		sqlSession.close();
		System.out.println("�޸ĳɹ�");
	}
}
