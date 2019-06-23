package com.itcast.dao;

import org.apache.ibatis.session.SqlSession;

import com.itcast.mapper.CustomerMapper;
import com.itcast.pojo.Customer;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class UpdateCustomer {
	public void updateCustomer(Customer customer){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		customerMapper.updateCustomer(customer);
		sqlSession.commit();
		sqlSession.close();
	}
}
