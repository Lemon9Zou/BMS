package com.itcast.service;

import com.itcast.listener.ModifyCustomerName;
import com.itcast.listener.ModifyPassword;
import com.itcast.view.Page;

public abstract class SuperPageAddListener {
	public void initMenuListener(Page page) {
		//ʵ������ѯ�����ϵͳ���ò˵����޸��û������޸�����˵�
		ModifyCustomerName modifyCustomerName=new ModifyCustomerName();
		ModifyPassword modifyPassword=new ModifyPassword();
		
		//Ϊ��ѯ�����ϵͳ���ò˵�����¼�������
		page.setMenuItem[0].addActionListener(modifyCustomerName);
		page.setMenuItem[1].addActionListener(modifyPassword);
	}
}
