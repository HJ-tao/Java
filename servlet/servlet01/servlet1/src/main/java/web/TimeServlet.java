package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) throws ServletException, IOException {
		//获取服务器时间
		Date date = new Date();
		SimpleDateFormat sdf = 
			new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		
		//1.接收请求数据
		//请求行
		System.out.println(
			"协议类型:" + req.getProtocol());
		System.out.println(
			"请求方式:" + req.getMethod());
		System.out.println(
			"访问路径:" + req.getServletPath());
		//消息头
		//Enumeration是比Iterator更老的迭代器
		Enumeration<String> e = 
				req.getHeaderNames();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			String value = req.getHeader(key);
			System.out.println(
				key + ":" + value);
		}
		//实体内容
		//本案例没有业务数据,所以实体内容为空
		//2.发送响应数据
		
		//向浏览器声明所发送的内容的类型
		//该类型必须严格满足规范,否则浏览器
		//无法识别该类型,则不会显示出内容,
		//而是会要求用户保存该文件.
		res.setContentType("text/html");
		//获取输出流
		PrintWriter w = res.getWriter();
		//这里偷懒了,省略了很多标签,
		//如:<html>,<head>,<body>
		w.println("<p>" + now + "</p>");
		//关闭输出流
		w.close();
	}

}















