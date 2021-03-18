package day0716.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cj.javaee.day0714.entity.Users;
import edu.cj.javaee.day0714.service.UserService;
import edu.cj.javaee.day0714.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;
	public LoginServlet() {
		this.service = new UserServiceImpl();
	}	
	/*public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		String uName = request.getParameter("uName");
		String uPass = request.getParameter("uPass");
		System.out.print(uName+"\t"+uPass);
		out.println(uName+"    "+uPass);
		out.printf("%s,%s\n",uName,uPass);
		out.print(uName+"　　"+uPass);
		Users u = service.queryUser(uName, uPass);
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		System.out.println("\n\n\n"+basePath);
		if (null!=u) {
			out.print("<script>alert('登陆成功!');location.href='index.jsp';</script>");
		} else {
			System.out.println("\n准备跳转到登陆界面.......");
			//System.out.println(basePath+"login/login1.html");
			response.sendRedirect(basePath+"login/login1.html");
		}
			}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}*/
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		String uName = request.getParameter("uName");
		String uPass = request.getParameter("uPass");
		System.out.print(uName+"\t"+uPass);
		out.println(uName+"    "+uPass);
		out.printf("%s,%s\n",uName,uPass);
		out.print(uName+"　　"+uPass);
		Users u = service.queryUser(uName, uPass);
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		System.out.println("\n\n\n"+basePath);
		if (null!=u) {
			out.print("<script>alert('登陆成功!');location.href='index.jsp';</script>");
		} else {
			System.out.println("\n准备跳转到登陆界面.......");
			//System.out.println(basePath+"login/login1.html");
			response.sendRedirect(basePath+"login/login1.html");
		}
	}
}
