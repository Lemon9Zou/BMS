package com.itcast.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import com.itcast.utils.MyBatisSqlSessionUtil;
public class SelectBookList {
	public ArrayList<Book> getBookList(){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		ArrayList<Book> books=bookMapper.findAllBook();
		return books;
	}
}
