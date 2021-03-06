package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//接收数据
		String user = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] interests = 
			req.getParameterValues("interest");
		
//		byte[] bs = user.getBytes("iso8859-1");
//		user = new String(bs,"utf-8");
		
		//处理业务
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		if(interests != null) {
			for(String interest: interests) {
				System.out.println(interest);
			}
		}
		//发送响应
		res.setContentType(
			"text/html;charset=utf-8");
		PrintWriter w = res.getWriter();
		w.println("<p>注册成功</p>");
		w.close();
	}

}










