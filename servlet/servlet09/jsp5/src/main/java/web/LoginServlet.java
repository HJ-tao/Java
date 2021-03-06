package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) throws ServletException, IOException {
		//接收账号
		String code = req.getParameter("code");
		//存入session
		HttpSession session = req.getSession();
		//session中可以存任意类型的数据,
		//session中可以存任意多个数据.
		session.setAttribute("user", code);
		//服务器在响应时会自动做如下操作:
		//Cookie c = new Cookie(
		//	"JSESSIONID",session.getId());
		//c.setPath(req.getContextPath());
		//res.addCookie(c);
	}

}




