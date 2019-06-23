package com.itcast.dao;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import com.itcast.mapper.CustomerMapper;
import com.itcast.pojo.Customer;
import com.itcast.utils.MyBatisSqlSessionUtil;

public class FindCustomerList {
	public ArrayList<Customer> findAllCustomer(){
		SqlSession sqlSession=new MyBatisSqlSessionUtil().getSqlSession();
		//ͨ��SqlSession���ݿ������������BookMapperӳ����
		CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
		//ͨ��ӳ����������鼮��Ϣ
		ArrayList<Customer> customer=customerMapper.findAllCustomer();
		return customer;
	}
}
