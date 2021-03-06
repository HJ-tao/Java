package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import dao.CostDao;
import entity.Admin;
import entity.Cost;

public class MainServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//获取当前的访问路径
		String path = req.getServletPath();
		//根据规范处理路径
		if("/findcost.do".equals(path)) {
			findCost(req,res);
		} else if("/toaddcost.do".equals(path)) {
			toAddCost(req,res);
		} else if("/addcost.do".equals(path)) {
			addCost(req,res);
		} else if("/toUpdateCost.do".equals(path)) {
			toUpdateCost(req, res);
		} else if("/tologin.do".equals(path)) {
			//打开登录页
			toLogin(req, res);
		} else if("/toindex.do".equals(path)) {
			//打开主页
			toIndex(req, res);
		} else if("/login.do".equals(path)) {
			//登录校验
			login(req, res);
		} else {
			throw new RuntimeException(
				"没有这个页面");
		}
	}
	
	protected void login(
		HttpServletRequest req,
		HttpServletResponse res) 
		throws ServletException, IOException {
		//接收请求参数
		String adminCode = 
			req.getParameter("adminCode");
		String pwd = 
			req.getParameter("password");
		//登录验证
		AdminDao dao = new AdminDao();
		Admin a = dao.findByCode(adminCode);
		if(a == null) {
			//账号不存在，转发回登录页
			//目标:/netctoss/WEB-INF/main/login.jsp
			req.setAttribute(
				"error", "账号不存在");
			req.getRequestDispatcher(
				"WEB-INF/main/login.jsp")
				.forward(req, res);
		} else if(!a.getPassword().equals(pwd)) {
			//密码错误，转发回登录页
			//目标:/netctoss/WEB-INF/main/login.jsp
			req.setAttribute(
				"error", "密码错误");
			req.getRequestDispatcher(
				"WEB-INF/main/login.jsp")
				.forward(req, res);
		} else {
			//成功，重定向到主页
			//当前:/netctoss/login.do
			//目标:/netctoss/toindex.do
			res.sendRedirect("toindex.do");
		}
	}
	
	protected void toIndex(
		HttpServletRequest req,
		HttpServletResponse res) 
		throws ServletException, IOException {
		//当前:/netctoss/toindex.do
		//目标:/netctoss/WEB-INF/main/index.jsp
		req.getRequestDispatcher(
			"WEB-INF/main/index.jsp")
			.forward(req, res);
	}
	
	protected void toLogin(
		HttpServletRequest req,
		HttpServletResponse res) 
		throws ServletException, IOException {
		//当前:/netctoss/tologin.do
		//目标:/netctoss/WEB-INF/main/login.jsp
		req.getRequestDispatcher(
			"WEB-INF/main/login.jsp")
			.forward(req, res);
	}	
	
	protected void toUpdateCost(
		HttpServletRequest req,
		HttpServletResponse res) 
		throws ServletException, IOException {
		//接收请求参数
		String id = req.getParameter("id");
		//查询该资费数据
		CostDao dao = new CostDao();
		Cost cost = 
			dao.findById(new Integer(id));
		//转发到修改页面
		req.setAttribute("cost", cost);
		req.getRequestDispatcher(
			"WEB-INF/cost/update.jsp")
			.forward(req, res);
	}	
	
	//增加一条资费数据
	protected void addCost(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//接收表单传入的数据
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String costType = 
			req.getParameter("costType");
		String baseDuration = 
			req.getParameter("baseDuration");
		String baseCost = 
			req.getParameter("baseCost");
		String unitCost = 
			req.getParameter("unitCost");
		String descr = req.getParameter("descr");
		//保存这些数据
		Cost c = new Cost();
		c.setName(name);
		c.setCostType(costType);
		if(baseDuration != null
			&& !baseDuration.equals("")) {
			c.setBaseDuration(
				new Integer(baseDuration));
		}
		if(baseCost != null
			&& !baseCost.equals("")) {
			c.setBaseCost(
				new Double(baseCost));
		}
		if(unitCost != null
			&& !unitCost.equals("")) {
			c.setUnitCost(
				new Double(unitCost));
		}
		c.setDescr(descr);
		new CostDao().save(c);
		//当前:/netctoss/addcost.do
		//目标:/netctoss/findcost.do
		res.sendRedirect("findcost.do");
	}
	
	//打开增加资费页面
	protected void toAddCost(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		req.getRequestDispatcher(
			"WEB-INF/cost/add.jsp")
			.forward(req, res);
	}
	
	protected void findCost(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//查询所有的资费
		CostDao dao = new CostDao();
		List<Cost> list = dao.findAll();
		//转发到find.jsp
		req.setAttribute("costs", list);
		//当前:/netctoss/findcost.do
		//目标:/netctoss/WEB-INF/cost/find.jsp
		req.getRequestDispatcher(
			"WEB-INF/cost/find.jsp")
			.forward(req, res);
	}

}









