package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.itcast.service.SelectPageAddListener;
import com.itcast.view.Page;
/*
 * �����еĲ�ѯ�˵��е��¼�����������
 * 
 * */
public class SelectListener extends SuperMenu implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		page.setVisible(false);
		page.dispose();
		//��ʼ����ѯ����
		 Page updatePage=new SelectPageAddListener().getSelectPageImpl();
		 updatePage.setVisible(true);
	}

}
