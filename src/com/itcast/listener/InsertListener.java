package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.itcast.service.InsertPageAddListener;
import com.itcast.view.InsertPage;
/*
 * �����е���Ӳ˵��е��¼�����������
 * 
 * */
public class InsertListener extends SuperMenu implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		page.setVisible(false);
		page.dispose();
		//��ʼ����ӽ���
		 InsertPage insertPage=new InsertPageAddListener().getInsertPageImpl();
		insertPage.setVisible(true);
	}

}
