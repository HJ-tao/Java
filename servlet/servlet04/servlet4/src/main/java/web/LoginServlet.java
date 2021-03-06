package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	//通信组件对Servlet的处理:
	//LoginServlet s = new LoginServlet();
	//调用config时它会自动加载web.xml内的数据
	//ServletConfig c = new ServletConfig();
	//s.init(c);
	//s.init();
	//s.service();
	//s.destroy();
	//GenericServlet对config的处理:
	//ServletConfig config;
	//public ServletConfig getServletConfig() {
	//	return config;
	//}
	//protected void init(ServletConfig c) {
	//	config = c;
	//}
	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//从config对象内读取参数
		ServletConfig cfg = getServletConfig();
		String maxOnline = 
			cfg.getInitParameter("maxOnline");
		System.out.println(maxOnline);
	}

}




