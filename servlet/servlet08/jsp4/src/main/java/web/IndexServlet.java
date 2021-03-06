package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

	//相当于MainServlet.toIndex()
	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) throws ServletException, IOException {
		//获取cookie
		Cookie[] cookies = req.getCookies();
		res.setContentType(
			"text/html;charset=utf-8");
		PrintWriter w = res.getWriter();
		if(cookies != null) {
			for(Cookie c : cookies) {
				String name = c.getName();
				String value = c.getValue();
				value = URLDecoder.decode(value, "utf-8");
				w.println(name + ":" + value);
			}
		}
		w.close();
	}

}








