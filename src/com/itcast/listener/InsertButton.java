package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.dao.InsertBook;
import com.itcast.pojo.Book;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.InsertPage;
import com.itcast.view.SelectPage;

public class InsertButton implements ActionListener {
	private Book book = new Book();
	// ��ʼ����ӽ���
	private InsertPage insertPage = new InsertPage();

	public void setInsertPage(InsertPage insertPage) {
		this.insertPage = insertPage;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// ͨ���������ȡbook�����ֵ
		book.setName(insertPage.insertPageField[0].getText());
		book.setAuthor(insertPage.insertPageField[1].getText());
		book.setTime(insertPage.insertPageField[2].getText());
		book.setPublish(insertPage.insertPageField[3].getText());
		String priceS = insertPage.insertPageField[4].getText();
		if (priceS != null)
			book.setPrice(Double.parseDouble(priceS));
		else
			book.setPrice(0.0);
		book.setIsbn(insertPage.insertPageField[5].getText());
		book.setBookclass((String) insertPage.bookclassComboBox.getSelectedItem());
		book.setContent(insertPage.contentArea.getText());
		book.setAuthors(insertPage.authorsArea.getText());
		System.out.println(book.getBookclass());
		// ����dao�����Ӷ������ӷ����������
		 new InsertBook().insertBook(book);
		 //ͨ���Ի�������û������ж�
		Object[] options = { "����", "ȡ��" };
		int i = JOptionPane.showOptionDialog(null, "��ӳɹ�����Ҫ�������ͼ����Ϣ��?", "����ȷ��", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		switch (i) {
		case -1:
			break;
		case 0:
			//��������ݽ����������
			for(int j=0;j<6;j++) {
				insertPage.insertPageField[j].setText(null);
			}
			insertPage.contentArea.setText(null);
			insertPage.authorsArea.setText(null);
			break;
		case 1:
			// ������ӽ���
			insertPage.setVisible(false);
			insertPage.dispose();

			// �򿪲��ҽ���
			SelectPage selectPage = new SelectPageAddListener().getSelectPageImpl();
			selectPage.setVisible(true);
			break;
		}
	}

}
