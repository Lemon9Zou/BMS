package com.itcast.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.itcast.dao.UpdateCustomer;
import com.itcast.pojo.Customer;

public class ModifyPassword extends SuperModify  implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Customer customer=super.getModifyCustomer();
		if(customer==null)return ;
		String password=JOptionPane.showInputDialog(null, "请输入您修改的新密码");
		customer.setPassword(password);
		new UpdateCustomer().updateCustomer(customer);
		System.out.println("修改成功!");
		JOptionPane.showMessageDialog(null, "修改成功!");
	}


}
