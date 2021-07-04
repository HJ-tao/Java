package edu.cj.javaee.day0714.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cj.javaee.day0714.entity.Train;
import edu.cj.javaee.day0714.service.TrainService;
import edu.cj.javaee.day0714.service.impl.TrainServiceImpl;

public class QueryTrainServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrainService service;
	public QueryTrainServlet() {
		service = new TrainServiceImpl();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		List<Train> list = service.getAllTrains();
		//����Ӧ�ļ��ϱ��浽request������
		request.setAttribute("list", list);
		//ҳ����ת��index1.jsp����ʾ
		request.getRequestDispatcher("index1.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
		
	}


}
