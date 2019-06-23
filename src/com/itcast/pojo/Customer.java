package com.itcast.pojo;

public class Customer {
	private int id; // �û�ID
	private String name; // �û�����
	private String password; // �û�����

	public Customer(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public Customer() {
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
