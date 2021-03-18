package edu.cj.javase.day0713;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC_ODBC1 {

	/**
	 * JDBC-ODBC桥连接
	 * 它是不需要第三方驱动jar包的,因为在安装数据库产品是一般都会自动装上JDBC-ODBC驱动,如
	 * MS SQL SERVER 和 Oracle在安装时都会自动安装,mysql数据库则需要自行下载对应的驱动安装文件(在官网上即可下载)
	 * 
	 * 用JDBC-ODBC桥连接首先要在   控制面板----系统和安全----管理工具----数据源(ODBC)
	 * 双击数据源(ODBC)运行在打开的界面中找到系统DSN----添加----选择你要连接的数据库(如 这里的 SQL SERVER Native CLIENT
	 * )-----配置数据源名称(可以与真实的数据库名称相同也可以不同)-----指定对应的服务器地址(本机可以用"."或者local以及计算中的IP地址)
	 * -----点击下一步-----点击下一步-----选中更改默认的数据库为你想要访问的数据库名即可-------点击下一步------完成
	 * -----点击测试数据源-----测试成功后点击确定即可-----确定----确定----确定
	 */
	//第一步
	public static final String DB_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";  
	public static final String DB_URL = "jdbc:odbc:tom";

	public static void main(String[] args) {
		
		try {
			//第二步
			Class.forName(DB_DRIVER);
			//第三步
			Connection conn = DriverManager.getConnection(DB_URL);
			/*//测试是否连接成功
			if (null!=conn) {
				System.out.println("connect success");
			} else {
				System.out.println("connect failed");
			}*/
			//第四步 
			Statement st = conn.createStatement();
			//第五步
			String sql = "SELECT *FROM book order by bookId";
			//第六步
			ResultSet rs = st.executeQuery(sql);
			//第七步
			while (rs.next()) {
				/*
				 * 遍历数据时,通过结果集对象ResultSet中提供的一组丰富的getXXX(int index) 或者
				 * getXXX(String columeName)方法
				 * XXX代表的是对应的表字段的数据类型。如getString()表示对应的字段为字符串类型
				 * getInt()表示对应的字段为整形
				 * 
				 * getXXX(int index)___表示的是根据索引来获取对应字段的值,注意数据库中的索引从1开始,以此类推,1,2,3,4,5,6....
				 * 
				 * getXXX(String columeName)————表示的是根据表字段的名字来获取对应字段的值
				 * 如  getString("taxNo")
				 */
				System.out.println(rs.getInt(1)+"\t"+rs.getString("taxNo")+"\t"+rs.getInt(3));
			}
			
			//第八步
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
