package com.itcast.dao;

import org.apache.ibatis.session.SqlSession;
import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class SelectBook {
	public Book getBook(int id){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		Book book=bookMapper.findBook(id);
		return book;
	}
}
