package com.itcast.service;

import com.itcast.listener.DeleteListener;
import com.itcast.listener.InsertListener;
import com.itcast.listener.SelectListener;
import com.itcast.listener.UpdateButton;
import com.itcast.pojo.Book;
import com.itcast.view.UpdatePage;

public class UpdatePageAddListener extends SuperPageAddListener{
	// ʵ����һ���޸Ľ���
	private UpdatePage updatePage;
	// ʵ����һ���޸Ľ�����޸İ�ť�ļ����¼�
	private UpdateButton updateButton = new UpdateButton();
	//����
	//ʵ����һ���޸Ľ���Ĳ�ѯ�˵��ļ����¼�������
	private SelectListener selectListener=new SelectListener();
	//ʵ����һ���޸Ľ������Ӳ˵��ļ����¼�������
	private InsertListener insertListener=new InsertListener();
	//ʵ����һ���޸Ľ����ɾ���˵��ļ����¼�������
	private DeleteListener deleteListener=new DeleteListener();
	public UpdatePageAddListener() {
	};

	public UpdatePage getUpdatePageImpl(Book  book) {
		//��ʼ���޸Ľ���
		updatePage=new UpdatePage(book);
		super.initMenuListener(updatePage);
		//��ʼ����ӽ������Ӱ�ť
		updateButton.setPage(updatePage);
		// Ϊ��ӽ������Ӱ�ť����¼�����
		updatePage.updateButton.addActionListener(updateButton);
		
		// ��ʼ���޸Ľ���Ĳ�ѯ�˵����¼����������
		selectListener.setPage(updatePage);
		// Ϊ�޸Ľ���Ĳ�ѯ�˵�����¼�������
		updatePage.operationMenuItem[0].addActionListener(selectListener);
		// ��ʼ���޸Ľ������Ӳ˵����¼����������
		insertListener.setPage(updatePage);
		// Ϊ�޸Ľ�����޸Ĳ˵�����¼�������
		updatePage.operationMenuItem[1].addActionListener(insertListener);
		// ��ʼ���޸Ľ����ɾ���˵����¼����������
		deleteListener.setPage(updatePage);
		// Ϊ�޸Ľ����ɾ���˵�����¼�������
		updatePage.operationMenuItem[2].addActionListener(deleteListener);
		return updatePage;
	}
}
