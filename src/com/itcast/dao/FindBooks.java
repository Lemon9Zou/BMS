package com.itcast.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import com.itcast.mapper.BookMapper;
import com.itcast.pojo.Book;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class FindBooks {
	public ArrayList<Book> findName(String name){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		ArrayList<Book> books=bookMapper.findAllBook();
		return books;
	}
	public ArrayList<Book> findAuthor(String author){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		ArrayList<Book> books=bookMapper.findAllBook();
		return books;
	}
	public ArrayList<Book> findPublish(String publish){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		ArrayList<Book> books=bookMapper.findAllBook();
		return books;
	}
	public ArrayList<Book> findIsbn(String isbn){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		ArrayList<Book> books=bookMapper.findAllBook();
		return books;
	}
}
