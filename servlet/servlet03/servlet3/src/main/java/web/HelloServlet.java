package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//获取访问路径
		System.out.println(
			req.getContextPath());
		System.out.println(
			req.getServletPath());
		System.out.println(
			req.getRequestURI());
		System.out.println(
			req.getRequestURL());
		//若此处不写响应信息,则服务器
		//也会自动向浏览器做出响应,只是
		//响应的内容为空而已.
	}

}





