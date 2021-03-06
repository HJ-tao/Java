package web;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	//相当于MainServlet.login()
	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) throws ServletException, IOException {
		//接收登录时表单传入的账号
		String code = req.getParameter("code");
		//将账号存入cookie,后面请求要用
		//每个cookie只能存一份数据,
		//这份数据必须是字符串.
		Cookie c1 = new Cookie("user",code);
		//将cookie存入response,在响应时,
		//服务器会自动将此cookie发送给浏览器.
		res.addCookie(c1);
		//再创建一个cookie,并将它存到
		//浏览器的硬盘上.
		Cookie c2 = new Cookie("name","tom");
		c2.setMaxAge(60*60*24*7);
		res.addCookie(c2);
		//再创建一个cookie,并存储中文
		Cookie c3 = new Cookie("city",
			URLEncoder.encode("北京", "utf-8"));
		res.addCookie(c3);
		//再创建cookie,并设置其有效路径
		Cookie c4 = new Cookie("sex","M");
		c4.setPath("/jsp4");
		res.addCookie(c4);
	}

}











