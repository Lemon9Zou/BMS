package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.service.LoginPageAddListener;
import com.itcast.view.LoginImpl;

public class RegisterButton implements ActionListener {
	private LoginImpl login = new LoginImpl();

	public void setLogin(LoginImpl login) {
		this.login = login;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ȩ�޲���,����ϵ ϵͳ����Ա �����û�ע��");
		login.setVisible(false);
		login.dispose();
		// ��ʼ����¼����
		LoginImpl login = new LoginPageAddListener().getLoginPageImpl();
		// ��ʾ��½����
		login.setVisible(true);
	}

}
