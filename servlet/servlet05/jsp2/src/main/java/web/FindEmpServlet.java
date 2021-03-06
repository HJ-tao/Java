package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

public class FindEmpServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//查询所有员工
		EmpDao dao = new EmpDao();
		List<Emp> list = dao.findAll();
		//将数据存入request
		req.setAttribute("emps", list);
		//将请求转发给jsp,让jsp继续处理
		//当前:/jsp2/findEmp
		//目标:/jsp2/emps.jsp
		//RequestDispatcher内部的逻辑
		//private String jspPath;
		//void forward(req,res) {
		//	根据jspPath找到翻译好的Servlet
		//	EmpsServlet es = new EmpsServlet();
		//	es.service(req,res);
		//}
		req.getRequestDispatcher(
			"emps.jsp").forward(req, res);
	}

}










