package edu.cj.javaee.day0714.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessTrainServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ProcessTrainServlet() {
		super();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		String methodName = request.getParameter("method");
		System.out.println("methodName="+methodName);
		if ("add".equalsIgnoreCase(methodName)) {
			doAdd(request,response);
		} else if("delete".equalsIgnoreCase(methodName)){
			delete(request,response);
		}else if("query".equalsIgnoreCase(methodName)){
			query(request,response);
		}else if("update".equalsIgnoreCase(methodName)){
			update(request,response);
		}
		
	}


	private void update(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("开始update.....");
		
	}


	private void query(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("开始query.....");
		
	}


	private void delete(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("开始delete.....");
		
	}


	private void doAdd(HttpServletRequest request, HttpServletResponse response) {
		//获取对应的表单数据
		//。。。。。
		System.out.println("开始doAdd.....");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
