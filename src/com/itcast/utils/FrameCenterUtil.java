package com.itcast.utils;

import java.awt.Toolkit;

public class FrameCenterUtil {
	//��ȡ������Ļ�Ŀ��
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	//��ȡ������Ļ�ĸ߶�
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	//��ȡ������е�X
	public int getCenterX(int sizeX) {
		System.out.println("FrameCenterUtil������,�Զ���ȡ��Ļ���");
		return (width-sizeX)/2;
	}
	//��ȡ������е�Y
	public int getCenterY(int sizeY) {
		System.out.println("FrameCenterUtil������,�Զ���ȡ��Ļ�߶�");
		return (height-sizeY)/2;
	}
}
