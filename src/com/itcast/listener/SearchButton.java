package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.itcast.dao.SelectBookList;
import com.itcast.pojo.Book;
import com.itcast.service.SelectPageAddListener;
import com.itcast.view.SelectPage;

public class SearchButton implements ActionListener{
	private SelectPage oldSelectPage;
	public void setSelectPage(SelectPage oldSelectPage) {
		this.oldSelectPage=oldSelectPage;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String search=(String) oldSelectPage.comboBox.getSelectedItem();
		System.out.println(search);
		String searchText=oldSelectPage.searchField.getText();
		System.out.println(searchText);
		// ��ȡ���ݿ��ͼ����Ϣ
		ArrayList<Book> books = new SelectBookList().getBookList();
		//���µ��б����洢ɸѡ���ͼ����Ϣ
		ArrayList<Book> newBooks=new ArrayList<Book>();
		//��ͼ����Ϣ����ɸѡ
		switch(search) {
		case "ͼ����":
			for(int i=0;i<books.size();i++) {
				int j=books.get(i).getName().indexOf(searchText);
				System.out.println(j);
				if(j>=0)newBooks.add(books.get(i));
			}
			System.out.println(search+searchText);
			break;
		case "����":
			for(int i=0;i<books.size();i++) {
				int j=books.get(i).getAuthor().indexOf(searchText);
				if(j>=0)newBooks.add(books.get(i));
			}
			System.out.println(search+searchText);
			break;
		case "������":
			for(int i=0;i<books.size();i++) {
				int j=books.get(i).getPublish().indexOf(searchText);
				if(j>=0)newBooks.add(books.get(i));
			}
			System.out.println(search+searchText);
			break;
		case "ͼ��ISBN":
			for(int i=0;i<books.size();i++) {
				int j=books.get(i).getIsbn().indexOf(searchText);
				if(j>=0)newBooks.add(books.get(i));
			}
			System.out.println(search+searchText);
			break;
		}	// ��ʼ����ѯҳ��ı������
		String[][] tableBody = new String[newBooks.size()][9];
		for (int i = 0; i < newBooks.size(); i++) {
			tableBody[i][0] = String.valueOf(newBooks.get(i).getId());
			tableBody[i][1] = newBooks.get(i).getName();
			tableBody[i][2] = newBooks.get(i).getAuthor();
			tableBody[i][3] = newBooks.get(i).getPublish();
			tableBody[i][4] = newBooks.get(i).getBookclass();
			tableBody[i][5] = newBooks.get(i).getTime();
			tableBody[i][6] = newBooks.get(i).getIsbn();
			tableBody[i][7] = String.valueOf(newBooks.get(i).getPrice());
			tableBody[i][8] = newBooks.get(i).getContent();
		}
		//�رյ�ǰҳ��
		oldSelectPage.setVisible(false);
		oldSelectPage.dispose();
		// ʵ����һ����ѯ����
		SelectPage newSelectPage = new SelectPageAddListener().getSelectPageImpl(tableBody);
		newSelectPage.setVisible(true);
	}

}
