package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.itcast.dao.SelectBook;
import com.itcast.service.UpdatePageAddListener;
import com.itcast.view.Page;

public class UpdateListener extends SuperMenu implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int id = 0;
		String updateID = JOptionPane.showInputDialog(null, "�� �� �� �� Ҫ �� �� �� ͼ �� �� Ϣ I D");
		id = Integer.valueOf(updateID);
		page.setVisible(false);
		page.dispose();
		// ��ʼ���޸Ľ���,ͨ��dao���selectBook���ѯ��ȡ����ͼ����Ϣ������
		Page updatePage = new UpdatePageAddListener().getUpdatePageImpl(new SelectBook().getBook(id));
		updatePage.setVisible(true);

	}

}
