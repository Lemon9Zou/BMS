package com.itast.controller;

import com.itcast.service.LoginPageAddListener;
import com.itcast.view.LoginImpl;

public class BMSControllerImpl implements BMSController{

	@Override
	public void controller() {
		// TODO Auto-generated method stub
		//��ʼ����¼����
		LoginImpl login=new LoginPageAddListener().getLoginPageImpl();
		//��ʾ��½����
		login.setVisible(true);
	}
	public BMSControllerImpl() {
		controller();
	}
}
