package com.itcast.service;

import com.itcast.listener.DeleteListener;
import com.itcast.listener.InsertButton;
import com.itcast.listener.SelectListener;
import com.itcast.listener.UpdateListener;
import com.itcast.view.InsertPage;

/*
 * Ϊ��ӽ�������¼�����,������������¼��������ӽ���
 **/
public class InsertPageAddListener extends SuperPageAddListener{
	// ʵ����һ����ӽ���
	private InsertPage insertPage = new InsertPage();
	// ʵ����һ����ӽ������Ӱ�ť�ļ����¼�������
	private InsertButton insertButton = new InsertButton();
	//ʵ����һ����ӽ���Ĳ�ѯ�˵��ļ����¼�������
	private SelectListener selectListener=new SelectListener();
	//ʵ����һ����ӽ�����޸Ĳ˵��ļ����¼�������
	private UpdateListener updateListener=new UpdateListener();
	//ʵ����һ����ӽ����ɾ���˵��ļ����¼�������
	private DeleteListener deleteListener=new DeleteListener();
	public InsertPageAddListener() {
	};

	public InsertPage getInsertPageImpl() {
		super.initMenuListener(insertPage);
		// ��ʼ����ӽ������Ӱ�ť������¼����������
		insertButton.setInsertPage(insertPage);
		// Ϊ��ӽ������Ӱ�ť����¼�����
		insertPage.insertButton.addActionListener(insertButton);
		// ��ʼ����ӽ���Ĳ�ѯ�˵����¼����������
		selectListener.setPage(insertPage);
		// Ϊ��ӽ���Ĳ�ѯ�˵�����¼�������
		insertPage.operationMenuItem[0].addActionListener(selectListener);
		// ��ʼ����ӽ�����޸Ĳ˵����¼����������
		updateListener.setPage(insertPage);
		// Ϊ��ӽ�����޸Ĳ˵�����¼�������
		insertPage.operationMenuItem[1].addActionListener(updateListener);
		// ��ʼ����ӽ����ɾ���˵����¼����������
		deleteListener.setPage(insertPage);
		// Ϊ��ӽ����ɾ���˵�����¼�������
		insertPage.operationMenuItem[2].addActionListener(deleteListener);
		return insertPage;
	}
}
