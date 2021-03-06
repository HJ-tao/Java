package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	public DemoServlet() {
		System.out.println("实例化DemoServlet");
	}
	
	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		System.out.println("调用DemoServlet");
	}

	@Override
	public void destroy() {
		System.out.println("销毁DemoServlet");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println(
			"初始化DemoServlet(无参)");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(
			"初始化DemoServlet(有参)");
		super.init(config);
	}

}









