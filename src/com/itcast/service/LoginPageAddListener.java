package com.itcast.service;

import com.itcast.listener.LoginButton;
import com.itcast.listener.RegisterButton;
import com.itcast.view.LoginImpl;

//Ϊ��¼��������¼�����,������������¼�����ĵ�¼����
public class LoginPageAddListener {
	// ʵ����һ����½����
	LoginImpl login = new LoginImpl();
	// ʵ����һ����½��ť�ļ�����
	LoginButton loginListener = new LoginButton();
	RegisterButton registerListener=new RegisterButton();
	public LoginPageAddListener() {
	};

	public LoginImpl getLoginPageImpl() {
		// ��ʼ����¼�¼�������
		loginListener.setLogin(login);
		// Ϊ��¼������ӵ�¼��ť�����¼�
		login.login.addActionListener(loginListener);
		// ��ʼ��ע���¼�������
		loginListener.setLogin(login);
		// Ϊ��¼�������ע�ᰴť�����¼�
		login.register.addActionListener(registerListener);
		return login;
	}
}
