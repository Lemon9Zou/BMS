package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.dao.DeleteBook;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.Page;
/*
 * �����е�ɾ���˵��е��¼�����������
 * 
 * */
public class DeleteListener extends SuperMenu implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//ͨ���Ի����ȡ�û�Ҫɾ����ͼ����
		String deleteID=JOptionPane.showInputDialog(null, "������Ҫɾ����ͼ����");
		int id=Integer.parseInt(deleteID);
		 //ͨ���Ի�������û������ж�
		Object[] options = { "ɾ ��", "ȡ ��" };
		int i = JOptionPane.showOptionDialog(null, "ȷ��Ҫɾ��ͼ��IDΪ"+deleteID+"��ͼ����Ϣ��?", "����ȷ��", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		switch(i) {
		case 0:
			page.setVisible(false);
			page.dispose();
			//ͨ��dao�����ɾ������
			new DeleteBook().deleteBook(id);
			//��ʼ����ѯ����
			 Page updatePage=new SelectPageAddListener().getSelectPageImpl();
			 updatePage.setVisible(true);
			 break;
		case 1:break;
		}
	}

}
