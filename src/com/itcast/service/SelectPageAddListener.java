package com.itcast.service;

import java.util.ArrayList;

import com.itcast.dao.SelectBookList;
import com.itcast.listener.DeleteListener;
import com.itcast.listener.InsertListener;
import com.itcast.listener.SearchButton;
import com.itcast.listener.UpdateListener;
import com.itcast.pojo.Book;
import com.itcast.view.SelectPage;

/*
 *  *Ϊ��ѯ��������¼�����,������������¼�����Ĳ�ѯ����
 * 
*/public class SelectPageAddListener extends SuperPageAddListener{
	// ʵ����һ����ѯ�����������ť�ļ�����
	SearchButton searchButton = new SearchButton();
	// ʵ����һ������Ӱ�ť����Ӳ˵��ļ����¼�
	InsertListener insertListener = new InsertListener();
	// ʵ����һ���޸İ�ť���޸Ĳ˵��ļ����¼�
	UpdateListener updateListener = new UpdateListener();
	// ʵ����һ����ѯ�����ɾ���˵��ļ����¼�������
	private DeleteListener deleteListener = new DeleteListener();
	public SelectPageAddListener() {

	}
	public SelectPage getSelectPageImpl() {
		// ��ʼ����ѯҳ��ı������
		ArrayList<Book> books = new SelectBookList().getBookList();
		String[][] tableBody = new String[books.size()][9];
		for (int i = 0; i < books.size(); i++) {
			tableBody[i][0] = String.valueOf(books.get(i).getId());
			tableBody[i][1] = books.get(i).getName();
			tableBody[i][2] = books.get(i).getAuthor();
			tableBody[i][3] = books.get(i).getPublish();
			tableBody[i][4] = books.get(i).getBookclass();
			tableBody[i][5] = books.get(i).getTime();
			tableBody[i][6] = books.get(i).getIsbn();
			tableBody[i][7] = String.valueOf(books.get(i).getPrice());
			tableBody[i][8] = books.get(i).getContent();
		}
		// ʵ����һ����ѯ����
		SelectPage selectPage = new SelectPage(tableBody);
		super.initMenuListener(selectPage);
		// ��ʼ����ѯ�����������ť���¼�������
		searchButton.setSelectPage(selectPage);
		// ����ѯ�����������ť����¼�������
		selectPage.search.addActionListener(searchButton);

		// ��ʼ����ѯ�������Ӱ�ť
		insertListener.setPage(selectPage);
		// Ϊ��ѯ�������Ӱ�ť����¼�����
		selectPage.insertButton.addActionListener(insertListener);
		// Ϊ��ѯ�������Ӳ˵�����¼�����
		selectPage.operationMenuItem[0].addActionListener(insertListener);
		// ��ʼ����ѯ������޸Ĳ˵�
		updateListener.setPage(selectPage);
		// Ϊ��ѯ�������Ӱ�ť����¼�����
		selectPage.updateButton.addActionListener(updateListener);
		// Ϊ��ѯ������޸Ĳ˵�����¼�����
		selectPage.operationMenuItem[1].addActionListener(updateListener);
		// ��ʼ����ѯ�����ɾ���˵����¼����������
		deleteListener.setPage(selectPage);
		// Ϊ��ѯ�����ɾ���˵�����¼�������
		selectPage.operationMenuItem[2].addActionListener(deleteListener);
		// Ϊ��ѯ�����ɾ����ť����¼�������
		selectPage.deleteButton.addActionListener(deleteListener);
		return selectPage;
	}
	public SelectPage getSelectPageImpl(String[][] tableBody) {
		// ʵ����һ����ѯ����
		SelectPage selectPage = new SelectPage(tableBody);
		// ��ʼ����ѯ�����������ť���¼�������
		searchButton.setSelectPage(selectPage);
		// ����ѯ�����������ť����¼�������
		selectPage.search.addActionListener(searchButton);

		// ��ʼ����ѯ�������Ӱ�ť
		insertListener.setPage(selectPage);
		// Ϊ��ѯ�������Ӱ�ť����¼�����
		selectPage.insertButton.addActionListener(insertListener);
		// Ϊ��ѯ�������Ӳ˵�����¼�����
		selectPage.operationMenuItem[0].addActionListener(insertListener);
		// ��ʼ����ѯ������޸Ĳ˵�
		updateListener.setPage(selectPage);
		// Ϊ��ѯ�������Ӱ�ť����¼�����
		selectPage.updateButton.addActionListener(updateListener);
		// Ϊ��ѯ������޸Ĳ˵�����¼�����
		selectPage.operationMenuItem[1].addActionListener(updateListener);
		// ��ʼ����ѯ�����ɾ���˵����¼����������
		deleteListener.setPage(selectPage);
		// Ϊ��ѯ�����ɾ���˵�����¼�������
		selectPage.operationMenuItem[2].addActionListener(deleteListener);
		// Ϊ��ѯ�����ɾ����ť����¼�������
		selectPage.deleteButton.addActionListener(deleteListener);
		return selectPage;
	}
}
