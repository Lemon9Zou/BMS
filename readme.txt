
	������Ҫ:
		6��23�š�дϵͳ���ò˵���ĸ��û������û�����(�����)��д�õ�¼����ĵ�¼��ť�Ĺ���(�����),д�ò�ѯ�����������ť���¼�������(�����)


	��ʼ��¼�����˻�������:�˻�:steve ����:123

���ݿ����:
	1.�û���
		create table customer (
			id int(20) auto_increment,
			name varchar(50),
			password varchar(50),
			primary key(id)
			) DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
	2.�鼮��
		ͼ���š�ͼ���������ߡ������硢�������ࡢ����ʱ�䡢ͼ��ISBN���۸����ݼ�顢
		
		ͼ���������ߡ�����ʱ�䡢
		�����硢�۸�ͼ��ISBN��
		�������ࡢ
		���ݼ�顢
		���߼��
		ͼ���š�ͼ���������ߡ����߼�顢�����硢�������ࡢ����ʱ�䡢ͼ��ISBN���۸����ݼ�顢
		
		create table book(
			id int(20) auto_increment,
			name varchar(50),
			author varchar(50),
			authors varchar(50),
			publish varchar(50),
			bookclass varchar(50),
			time varchar(50),
			isbn varchar(50),
			price double(20,2),
			content varchar(500),
			primary key(id)
			) DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
			
			
	