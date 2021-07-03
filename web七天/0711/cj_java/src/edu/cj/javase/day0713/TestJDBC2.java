package edu.cj.javase.day0713;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.cj.javase.day0713.entity.Book;

public class TestJDBC2 {

	/**
	 * jdbc:����java�ĳ���ʵ�ֲ������ݿ������
	 * ��û��jdbc֮ǰ,��ͨ��JDBC-ODBC�����ӵķ�ʽʵ�����ݿ�ķ��ʲ�����
	 * JDBC-ODBC����������microsoft��˾�ṩ��ִ��Ч�ʱȽϵ�,�����Ӧ��ϵͳ��û�а�װ��Ӧ��
	 * JDBC-ODBC����,��ô�ǲ��ܷ������ݿ�ġ������ڼ�ͥ����ѧϰ��,
	 * ������������һ�����õ���java���Ա�д��JDBC�������ݿ�,ִ��Ч�ʸ��ҿ�ƽ̨��JDBC�����������ݿ⳧��
	 * �ṩ��������jdbc�������ݿ�֮ǰ����Ҫ�ڷ������ϻ�ȡ��Ӧ�����ݿ��jdbc����
	 * 
	 * ׼������:(�����Ӧ�ĵ��������ݿ�����jar����ͨ�����ַ�ʽ��ɵ���)
	 *   1.�ⲿ���롪�������������������Ҽ�ѡ�й�������-----Builder Path-----Configure Build Path
	 *   -----ѡ��Libraries----����ұ�Add External Jars(�����ⲿ��jar�ļ�)-----ѡ�ж�Ӧ��jar�ļ����ڵ��ļ�λ��
	 *   ----�����----���OK����
	 *   2.�ڲ����롪�������������������ڶ�Ӧ�Ĺ����б���srcĿ¼�´���һ���������ļ��� �� lib����libs(�����Զ��弴��)
	 *   -----����Ӧ��jar�ļ����������ļ���----�򿪸��ļ����Ҽ�ѡ�ж�Ӧ��jar�ļ�-----Builder Path-----Add to Build Path
	 *   ����
	 * 
	 * JDBC�������ݿ�֮��ɾ�Ĳ����߲���!!!
	 *    ��һ�� : ��д���ݿ�������ࡢ�����ַ�������¼�������롣������String����ʾ
	 *    �ڶ���: ͨ��Class����ض�Ӧ���ݿ������ Class.forName(DB_DRIVER);
	 *    ������: ͨ������������DriverManager(class�� java.sql)����ȡ���Ӷ���Connection(�ӿ� java.sql��)
	 *    ���Ĳ�: ͨ�����Ӷ���Connection�������������Statment(�ӿ� java.sql��)
	 *    ���岽: ��д�������ݿ������tableʱ��Ӧ��sql���
	 *    ������: ͨ����������Statmentȥִ�����ݿ�����ķ�������������������
	 *           ���������ѯselect����������executeQuery()����,�÷������ص��ǽ��������ResultSet(�ӿ� java.sql��)
	 *           ���������ɾ�ĵĲ���,����executeUpdate()����,�÷������ص��Ƕ����ݿ���������Ӱ�������,����������
	 *           ���������ɾ������ֲ�,����execute()����,�÷������ص���boolean���͵�����,���Ϊtrue��ʾ�н��������ResultSet
	 *           �����ʾ���е�����������
	 *    
	 *    ���߲�: ���ܲ������ݿ�ɹ�����ʧ�����һ���ǵý��������ݿ����Щ����ر�.�رյ�˳��Ϊ �ȹؽ��������
	 *    �ٹ���������,���Ͽ����Ӷ���        
	 *    
	 *    
	 *    ע��!!
	 *     ���ݿ������ַ���DB_URL�еķ�������ַ��Ӧ�ı�ʾ��ʽ�����¼���:
	 *     1. localhost����������ʾ����,�����ڷ��ʷ��������� 
	 *     2. 127.0.0.1����������ʾ����,�����ڷ��ʷ��������� 
	 *     3. 192.168.10.1�������������������е�IP��ַ ������ĳ����������
	 *     4. 10.106.113.29������������internet��ά���е�IP��ַ
	 *     5. �������____�ȿ��Ա�ʾ�����ֿ��Ա�ʾ�����еļ������ jkx29
	 */
	//��һ��
	public static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String DB_URL = "jdbc:sqlserver://jkx29:1433;databasename=book";
	public static final String DB_USER = "sa";
    public static final String DB_PASS  = "sa";
	public static void main(String[] args) {
		
		try {
			//�ڶ���
			Class.forName(DB_DRIVER);
			//������
			Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
			/*//�����Ƿ����ӳɹ�
			if (null!=conn) {
				System.out.println("connect success");
			} else {
				System.out.println("connect failed");
			}*/
			//���Ĳ� 
			/*
			 * ��ͨ��Statement����ֻ��ͨ��SQL����ƴ������ɶ�Ӧ�����ݿ����
			 * ����Ҫע�����ݿ��е��ַ���������sql�������Ҫ�õ�������  ''������ƴ�������ǳ��鷳
			 * ���Բ��Ƽ��������ͨ��Statement
			 * ���Ƽ������Statement�ӿڵ�һ���ӽӿ�PreparedStatement�����sql����ƴд
			 * ���ṩ��"?"ռλ��,���Զ�Ӧ���ֶ�ֻ��Ҫһ��"?"�ȿ��Ա�ʾ�ˣ�Ȼ��
			 * ��ͨ��PreparedStatement�����ṩ��һ��ḻ��setXXX(int index,��Ӧ�ֶε�ֵ)
			 * XXX��ʾ�ľ��Ƕ�Ӧ�ֶε���������
			 * 
			 * 
			 */
			
			Statement st = conn.createStatement();
			Book book= new Book(4, "����˰2017050312", 12, 26.00f, 1.30f, 24.70f, 50, 1235.00f);
			//���岽
			String sql = "insert into book values("+book.getBuyId()+",'"+book.getTaxNo()+"" +
					"',"+book.getBookId()+","+book.getBookPrice()+","
					+book.getBookDiscount()+","+book.getTruePrice()+","+book.getBookMount()+
					","+book.getBookMoney()+")";
			System.out.println("sql="+sql);
			//������
			/*int result = st.executeUpdate(sql);
			if (result>0) {
				System.out.println("�������ݳɹ�");
			} else {
				System.out.println("��������ʧ��");
			}*/
			//���߲�
			st.close();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
        
	}

}
