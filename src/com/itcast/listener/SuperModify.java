package com.itcast.listener;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itcast.dao.FindCustomerList;
import com.itcast.pojo.Customer;

public abstract class SuperModify {
	public Customer getModifyCustomer() {
		String customerName = JOptionPane.showInputDialog(null, "--�����������û���--");
		Customer customer = new Customer();
		ArrayList<Customer> customers = new FindCustomerList().findAllCustomer();

		boolean nameFlag = false;
		for (Customer c : customers) {
			if (customerName.equals(c.getName()))
				nameFlag = true;
		}
		if (nameFlag) {
			JOptionPane.showMessageDialog(null, "��������,�û���������");
			return null;
		}
		customer.setName(customerName);
		String customerPassword = JOptionPane.showInputDialog(null, "--��������������--");

		boolean passwordFlag = false;
		for (Customer c : customers) {
			if (customerPassword.equals(c.getPassword())) {
				passwordFlag = true;
				customer.setId(c.getId());
			}
		}
		if (passwordFlag) {
			JOptionPane.showMessageDialog(null, "��������,�û��������");
			return null;
		}
		customer.setPassword(customerPassword);
		/*
		 * //ͨ���Ի�������û������ж� Object[] options = { "��  ��", "ȡ ��" }; int i =
		 * JOptionPane.showOptionDialog(null, "ȷ��Ҫɾ��ͼ��IDΪ"+deleteID+"��ͼ����Ϣ��?", "����ȷ��",
		 * JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options,
		 * options[0]); switch(i) {
		 */
		return customer;
	}

}
