package edu.cj.javase.day0713;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.cj.javase.day0713.entity.Book;

public class TestJDBC2 {

	/**
	 * jdbc:是用java的程序实现操作数据库的能力
	 * 在没有jdbc之前,是通过JDBC-ODBC桥连接的方式实现数据库的访问操作的
	 * JDBC-ODBC桥连接是由microsoft公司提供，执行效率比较低,如果对应的系统中没有安装对应的
	 * JDBC-ODBC驱动,那么是不能访问数据库的。适用于家庭或者学习用,
	 * 在生产开发中一定会用到纯java语言编写的JDBC操作数据库,执行效率高且跨平台。JDBC的驱动由数据库厂商
	 * 提供，所以在jdbc操作数据库之前首先要在服务器上获取对应的数据库的jdbc驱动
	 * 
	 * 准备工作:(导入对应的第三方数据库驱动jar包，通过两种方式完成导入)
	 *   1.外部导入————————首先右键选中工程名称-----Builder Path-----Configure Build Path
	 *   -----选中Libraries----点击右边Add External Jars(增加外部的jar文件)-----选中对应的jar文件所在的文件位置
	 *   ----点击打开----点击OK即可
	 *   2.内部导入————————首先在对应的工程中比如src目录下创建一个包或者文件夹 如 lib或者libs(名字自定义即可)
	 *   -----将对应的jar文件拷贝至该文件夹----打开该文件夹右键选中对应的jar文件-----Builder Path-----Add to Build Path
	 *   即可
	 * 
	 * JDBC操作数据库之增删改操作七步骤!!!
	 *    第一步 : 编写数据库的驱动类、连接字符串、登录名、密码。都是以String来表示
	 *    第二步: 通过Class类加载对应数据库的驱动 Class.forName(DB_DRIVER);
	 *    第三步: 通过驱动管理类DriverManager(class类 java.sql)来获取连接对象Connection(接口 java.sql包)
	 *    第四步: 通过连接对象Connection来获得声明对象Statment(接口 java.sql包)
	 *    第五步: 编写访问数据库操作表table时对应的sql语句
	 *    第六步: 通过声明对象Statment去执行数据库操作的方法————————
	 *           如果是做查询select操作，调用executeQuery()方法,该方法返回的是结果集对象ResultSet(接口 java.sql包)
	 *           如果是做增删改的操作,调用executeUpdate()方法,该方法返回的是对数据库表操作后所影响的行数,即整数类型
	 *           如果是做增删查改四种操,调用execute()方法,该方法返回的是boolean类型的数据,如果为true表示有结果集对象ResultSet
	 *           否则表示进行的是其他操作
	 *    
	 *    第七步: 不管操作数据库成功还是失败最后一定记得将操作数据库的那些对象关闭.关闭的顺序为 先关结果集对象
	 *    再关声明对象,最后断开连接对象        
	 *    
	 *    
	 *    注意!!
	 *     数据库连接字符串DB_URL中的服务器地址对应的表示方式有以下几种:
	 *     1. localhost————表示本机,适用于访问服务器自身 
	 *     2. 127.0.0.1————表示本机,适用于访问服务器自身 
	 *     3. 192.168.10.1——————局域网中的IP地址 适用于某个局域网内
	 *     4. 10.106.113.29——————internet万维网中的IP地址
	 *     5. 计算机名____既可以表示本机又可以表示网络中的计算机名 jkx29
	 */
	//第一步
	public static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String DB_URL = "jdbc:sqlserver://jkx29:1433;databasename=book";
	public static final String DB_USER = "sa";
    public static final String DB_PASS  = "sa";
	public static void main(String[] args) {
		
		try {
			//第二步
			Class.forName(DB_DRIVER);
			//第三步
			Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
			/*//测试是否连接成功
			if (null!=conn) {
				System.out.println("connect success");
			} else {
				System.out.println("connect failed");
			}*/
			//第四步 
			/*
			 * 普通的Statement对象只能通过SQL语句的拼接来完成对应的数据库操作
			 * 并且要注意数据库中的字符串数据在sql语句中需要用到单引号  ''，所以拼接起来非常麻烦
			 * 所以不推荐大家用普通的Statement
			 * 而推荐大家用Statement接口的一个子接口PreparedStatement来完成sql语句的拼写
			 * 它提供了"?"占位符,所以对应的字段只需要一个"?"既可以表示了，然后
			 * 再通过PreparedStatement对象提供的一组丰富的setXXX(int index,对应字段的值)
			 * XXX表示的就是对应字段的数据类型
			 * 
			 * 
			 */
			
			Statement st = conn.createStatement();
			Book book= new Book(4, "湖地税2017050312", 12, 26.00f, 1.30f, 24.70f, 50, 1235.00f);
			//第五步
			String sql = "insert into book values("+book.getBuyId()+",'"+book.getTaxNo()+"" +
					"',"+book.getBookId()+","+book.getBookPrice()+","
					+book.getBookDiscount()+","+book.getTruePrice()+","+book.getBookMount()+
					","+book.getBookMoney()+")";
			System.out.println("sql="+sql);
			//第六步
			/*int result = st.executeUpdate(sql);
			if (result>0) {
				System.out.println("插入数据成功");
			} else {
				System.out.println("插入数据失败");
			}*/
			//第七步
			st.close();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
        
	}

}
