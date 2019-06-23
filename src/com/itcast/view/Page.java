package com.itcast.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.itcast.utils.FrameCenterUtil;

@SuppressWarnings("serial")
public abstract class Page extends JFrame {
	int sizeX = 900;
	int sizeY = 600;
	int width = new FrameCenterUtil().getCenterX(sizeX);
	int height = new FrameCenterUtil().getCenterY(sizeY);

	void init() {
	};
	void init(String[][] tableBody) {};
	protected JMenuBar menuBar = new JMenuBar();
	protected JMenu quitMenu = new JMenu("��ݲ˵�");
	public JMenuItem[] quitMenuItem=new JMenuItem[2];
	protected JMenu operationMenu = new JMenu("ͼ�����");
	public JMenuItem[] operationMenuItem = new JMenuItem[3];
	protected JMenu setMenu = new JMenu("ϵͳ����");
	public JMenuItem[] setMenuItem=new JMenuItem[2];
	protected JMenu helpMenu = new JMenu("����");
	//��ʼ���Ӳ˵���
	public void menuItemInit(String[] menuItemString) {// ��ʼ����ݲ˵��Ӳ˵�
		String[] quitMenuString = { "����", "�˳�" };
		for (int i = 0; i < quitMenuItem.length; i++) {
			quitMenuItem[i] = new JMenuItem(quitMenuString[i]);
			quitMenu.add(quitMenuItem[i]);
		}
		// ��ʼ��ͼ������Ӳ˵�
		for (int i = 0; i < operationMenuItem.length; i++) {
			operationMenuItem[i] = new JMenuItem(menuItemString[i]);
			operationMenu.add(operationMenuItem[i]);
		}
		// ��ʼ��ϵͳ�����Ӳ˵�
		String[] setMenuString = { "�޸��û���", "�޸��û�����" };
		for (int i = 0; i < setMenuItem.length; i++) {
			setMenuItem[i] = new JMenuItem(setMenuString[i]);
			setMenu.add(setMenuItem[i]);
		}};
	// ��ʼ���˵���
	public void menuInit(String[] menuItemString) {
		// ��Ӳ˵����
		menuBar.add(quitMenu);
		menuBar.add(operationMenu);
		menuBar.add(setMenu);
		menuBar.add(helpMenu);
		menuItemInit(menuItemString);
		this.setJMenuBar(menuBar);
	}
}
