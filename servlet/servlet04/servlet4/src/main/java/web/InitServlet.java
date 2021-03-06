package web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 *	此类不负责处理任何业务,
 *	只是用来给项目初始化参数的.
 *	很多项目中都有这样的类.
 */
public class InitServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		ServletContext ctx = getServletContext();
		ctx.setAttribute("count", 0);
	}

}




