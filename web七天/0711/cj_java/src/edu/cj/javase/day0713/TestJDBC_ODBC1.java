package edu.cj.javase.day0713;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC_ODBC1 {

	/**
	 * JDBC-ODBC������
	 * ���ǲ���Ҫ����������jar����,��Ϊ�ڰ�װ���ݿ��Ʒ��һ�㶼���Զ�װ��JDBC-ODBC����,��
	 * MS SQL SERVER �� Oracle�ڰ�װʱ�����Զ���װ,mysql���ݿ�����Ҫ�������ض�Ӧ��������װ�ļ�(�ڹ����ϼ�������)
	 * 
	 * ��JDBC-ODBC����������Ҫ��   �������----ϵͳ�Ͱ�ȫ----������----����Դ(ODBC)
	 * ˫������Դ(ODBC)�����ڴ򿪵Ľ������ҵ�ϵͳDSN----���----ѡ����Ҫ���ӵ����ݿ�(�� ����� SQL SERVER Native CLIENT
	 * )-----��������Դ����(��������ʵ�����ݿ�������ͬҲ���Բ�ͬ)-----ָ����Ӧ�ķ�������ַ(����������"."����local�Լ������е�IP��ַ)
	 * -----�����һ��-----�����һ��-----ѡ�и���Ĭ�ϵ����ݿ�Ϊ����Ҫ���ʵ����ݿ�������-------�����һ��------���
	 * -----�����������Դ-----���Գɹ�����ȷ������-----ȷ��----ȷ��----ȷ��
	 */
	//��һ��
	public static final String DB_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";  
	public static final String DB_URL = "jdbc:odbc:tom";

	public static void main(String[] args) {
		
		try {
			//�ڶ���
			Class.forName(DB_DRIVER);
			//������
			Connection conn = DriverManager.getConnection(DB_URL);
			/*//�����Ƿ����ӳɹ�
			if (null!=conn) {
				System.out.println("connect success");
			} else {
				System.out.println("connect failed");
			}*/
			//���Ĳ� 
			Statement st = conn.createStatement();
			//���岽
			String sql = "SELECT *FROM book order by bookId";
			//������
			ResultSet rs = st.executeQuery(sql);
			//���߲�
			while (rs.next()) {
				/*
				 * ��������ʱ,ͨ�����������ResultSet���ṩ��һ��ḻ��getXXX(int index) ����
				 * getXXX(String columeName)����
				 * XXX������Ƕ�Ӧ�ı��ֶε��������͡���getString()��ʾ��Ӧ���ֶ�Ϊ�ַ�������
				 * getInt()��ʾ��Ӧ���ֶ�Ϊ����
				 * 
				 * getXXX(int index)___��ʾ���Ǹ�����������ȡ��Ӧ�ֶε�ֵ,ע�����ݿ��е�������1��ʼ,�Դ�����,1,2,3,4,5,6....
				 * 
				 * getXXX(String columeName)����������ʾ���Ǹ��ݱ��ֶε���������ȡ��Ӧ�ֶε�ֵ
				 * ��  getString("taxNo")
				 */
				System.out.println(rs.getInt(1)+"\t"+rs.getString("taxNo")+"\t"+rs.getInt(3));
			}
			
			//�ڰ˲�
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
