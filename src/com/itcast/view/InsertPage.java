package com.itcast.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * ͼ�����ϵͳ��ӽ���
 * 
 * */
@SuppressWarnings("serial")
public class InsertPage extends Page {
	private JLabel[] insertPageLabel = new JLabel[9];
	private String[] labelText = { "ͼ����:", "��  ��:", "����ʱ��:", "������:", "��  ��:", "I S B N:", "��  ��:", "��������:", "���߼��:" };
	private int[][] labelLocation = { { 30, 30, 50, 25 }, { 300, 30, 50, 25 }, { 570, 30, 60, 25 }, { 30, 75, 50, 25 },
			{ 300, 75, 50, 25 }, { 580, 75, 40, 25 }, { 30, 130, 50, 25 }, { 140, 230, 60, 25 }, { 140, 350, 60, 25 } };
	// ����һ��������Ķ�����,�ֱ���ͼ����,����,����ʱ��,������,����,ISBN,���ݼ��,���߼��
	public JTextField[] insertPageField = new JTextField[6];
	private int[][] fieldLocation = { { 80, 31, 170, 24 }, { 350, 31, 170, 24 }, { 630, 31, 170, 24 },
			{ 80, 76, 170, 24 }, { 350, 76, 170, 24 }, { 630, 76, 170, 24 } };
	@SuppressWarnings("rawtypes")
	public JComboBox bookclassComboBox = new JComboBox();
	// ʵ����һ�����ݼ����ı�������
	public JTextArea contentArea = new JTextArea();
	// ʵ����һ�����߼����ı�������
	public JTextArea authorsArea = new JTextArea();
	// ʵ����һ����Ӱ�ť
	public JButton insertButton = new JButton("��  ��");
	// ��ʼ��ͼ������Ӳ˵�������
	private String[] menuItemString = { "��  ѯ", "��  ��", "ɾ  ��" };

	@SuppressWarnings("unchecked")
	@Override
	public void init() {
		// TODO Auto-generated method stub
		// ���ø����ʼ���˵�
		super.menuInit(menuItemString);
		// ���������
		// ��ʼ����ǩ
		for (int i = 0; i < insertPageLabel.length; i++) {
			insertPageLabel[i] = new JLabel(labelText[i]);
			insertPageLabel[i].setBounds(labelLocation[i][0], labelLocation[i][1], labelLocation[i][2],
					labelLocation[i][3]);
			this.add(insertPageLabel[i]);
		}
		// ��ʼ���ı�������
		for (int i = 0; i < insertPageField.length; i++) {
			insertPageField[i] = new JTextField();
			insertPageField[i].setBounds(fieldLocation[i][0], fieldLocation[i][1], fieldLocation[i][2],
					labelLocation[i][3]);
			this.add(insertPageField[i]);
		}
		// ��ʼ��"���������ǩ"
		// ��ʼ�������б�
		String[] comboBoxItem = { "A�� ���˼���塢�������塢ë��˼�롢��Сƽ����", "B�� ��ѧ���ڽ�", "C�� ����ѧ����", "D�� ���Ρ�����", "E�� ����", "F�� ����",
				"G�� �Ļ�����ѧ������������", "H�� ���ԡ�����", "I�� ��ѧ", "J�� ����", "K�� ��ʷ������", "N�� ��Ȼ��ѧ����", "O�� �����ѧ�ͻ�ѧ", "P�� ����ѧ�������ѧ",
				"Q�� �����ѧ", "R�� ҽҩ������", "S�� ũҵ��ѧ", "T�� ��ҵ����", "U�� ��ͨ����", "V�� ���ա�����", "X�� ������ѧ����ȫ��ѧ", "Z�� �ۺ���ͼ��" };
		for (String s : comboBoxItem) {
			bookclassComboBox.addItem(s);
		}
		bookclassComboBox.setBounds(80, 130, 400, 25);
		this.add(bookclassComboBox);
		// ��ʼ�����ݼ��������
		contentArea.setBounds(200, 200, 500, 100);
		this.add(contentArea);
		// ��ʼ�����߼��������
		authorsArea.setBounds(200, 320, 500, 100);
		this.add(authorsArea);
		// ��ʼ����Ӱ�ť
		insertButton.setBounds(400, 460, 80, 30);
		this.add(insertButton);
	}

	public InsertPage() {
		this.setLayout(null);
		this.setTitle("ͼ�����ϵͳ-ͼ����ӽ���");
		init();
		this.setResizable(false);
		this.setBounds(width, height, sizeX, sizeY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
