package com.itcast.dao;

import com.itcast.pojo.Book;

public class InsertBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id,name,author,authors,publish,bookclass,time,isbn,price,content

		Book book = new Book();
		book.setId(1);
		book.setName("Java EE��ҵ��Ӧ�ÿ���ʵ���̳�");
		book.setAuthor("�������Ա");
		book.setAuthors("�������Ա12��IT��������,ÿ10��ѧԱ����7��������ѧԱ�ڱ��Ƽ�");
		book.setPublish("�����ʵ������");
		book.setBookclass("JAVA");
		book.setTime("");
		book.setIsbn("9787302227854");
		book.setPrice(35.0);
		book.setContent(
				"����������Ҫ����Java EE��ܺͼ��ɿ������ߡ���Ҫ���ݰ���Java EE��ܺ��Ľṹ��Ӧ�÷����������ɿ������ߡ�"
				+ "Servlet�����̡��������̡���Ӧ�����̡��Ự���ٱ�̡�ServletContext�����Ӧ�á�"
				+ "��������̡���������̡�JSP��EL��JSTL��JNDI��������ͱ�̡�JDBC�����̡�JavaMail��̺�Java EEMVCģʽ�ܹ�Ӧ��");
		InsertBook insertBook=new InsertBook();
		insertBook.insertBook(book);
	}

}
