package com.itcast.view;

import com.itcast.pojo.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdatePage t=new UpdatePage(new Book());
		t.setVisible(true);
/*		Object[] options = { "ȷ��", "ȡ��" };
		int i=JOptionPane.showOptionDialog(null, "ȷ��Ҫɾ��ͼ����Ϣ��?", "ɾ��ȷ��", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		null, options, options[0]);
		System.out.println(i);*/
	}

}
