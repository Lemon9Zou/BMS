package com.itcast.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * ͼ�����ϵͳ��ѯ����
 * 
 * */
@SuppressWarnings("serial")
public class SelectPage extends Page {
	private JScrollPane scrollPane;
	private JTable bookTable;
	private JLabel searchLabel = new JLabel("ͼ�����:");
	@SuppressWarnings("rawtypes")
	public JComboBox comboBox = new JComboBox();
	public JTextField searchField = new JTextField();
	public JButton search = new JButton("��  ��");
	private JLabel bookOperation = new JLabel("ͼ�����:");
	public JButton insertButton = new JButton("��  ��");
	public JButton updateButton = new JButton("��  ��");
	public JButton deleteButton = new JButton("ɾ  ��");
	// ��ʼ��ͼ������Ӳ˵�������
	private String[] menuItemString = { "��  ��", "��  ��", "ɾ  ��" };

	// ��ʼ������������
	public void tableInit(String[][] tableBody) {
		// ��ͷ
		String[] tableHeader = { "ͼ����", "ͼ����", "����", "������", "��������", "����ʱ��", "ͼ��ISBN", "�۸�", "���ݼ��" };

		bookTable = new JTable(tableBody, tableHeader);
		bookTable.setEnabled(false);
		scrollPane = new JScrollPane(bookTable);
		scrollPane.setBounds(1, 1, 893, 500);
		this.add(scrollPane);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void init(String[][] tableBody) {
		// TODO Auto-generated method stub
		// ���ø����ʼ���˵�
		super.menuInit(menuItemString);
		// ��ʼ�����������������
		tableInit(tableBody);
		int searchY = 510;
		int searchX = 20;
		searchLabel.setBounds(searchX + 10, searchY, 60, 25);
		this.add(searchLabel);
		// ��ʼ�������б�
		comboBox.addItem("ͼ����");
		comboBox.addItem("����");
		comboBox.addItem("������");
		comboBox.addItem("ͼ��ISBN");
		comboBox.setBounds(searchX + 75, searchY, 90, 25);
		this.add(comboBox);
		searchField.setBounds(searchX + 170, searchY, 140, 25);
		this.add(searchField);
		search.setBounds(searchX + 330, searchY, 80, 25);
		this.add(search);
		bookOperation.setBounds(searchX + 500, searchY, 60, 25);
		this.add(bookOperation);
		insertButton.setBounds(searchX + 565, searchY, 80, 25);
		this.add(insertButton);
		updateButton.setBounds(searchX + 655, searchY, 80, 25);
		this.add(updateButton);
		deleteButton.setBounds(searchX + 745, searchY, 80, 25);
		this.add(deleteButton);
	}

	public SelectPage(String[][] tableBody) {
		this.setLayout(null);
		this.setTitle("ͼ�����ϵͳ-ͼ����Ϣ����");
		init(tableBody);
		this.setResizable(false);
		this.setBounds(width, height, sizeX, sizeY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
