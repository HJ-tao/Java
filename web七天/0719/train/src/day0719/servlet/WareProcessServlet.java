package day0719.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day0719.entity.Ware;
import day0719.service.WareService;
import day0719.service.impl.WareServiceImple;

public class WareProcessServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
    private WareService service;
	
	public WareProcessServlet() {
		this.service = new WareServiceImple();
	}

	
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gbk");
		request.setCharacterEncoding("gbk");
		PrintWriter out = response.getWriter();
		String wName = request.getParameter("wName");
		String wSort = request.getParameter("wSort");
		String wAmount = request.getParameter("wAmount");
		
		int wareSort = Integer.parseInt(wSort);
		int wareAmount = Integer.parseInt(wAmount);
		//先判断对应的商品是否存在,不存在做增加商品操作,否则做商品的更新操作
		Ware w = service.getWareByName(wName);
		Ware w1 = new Ware(wName, wareSort, wareAmount);
		int result = 0;
		if (null==w) 
		{
			//做增加商品操作			
			result = service.addWre(w1);
		} else //商品的更新操作
		{
            result = service.updateWare(w1); 
		}
		
		if (result>0) {
			/*out.print("<h1>添加商品库存成功!</h1>");
			out.print("商品名称:"+wName+"<br/>");
			out.print("新增库存:"+wareAmount+"<br/>");
			if(null==w)
			    out.print("现共有库存:"+(wareAmount)+"<br/>");
			else
				out.print("现共有库存:"+(wareAmount+w.getWareAmount())+"<br/>");
			out.print("<a href='javascript: history.go(-1)'>返回上一页</a>");
			*/
			if(null==w)
				//如果需要保存对象的时间久一点,可以考虑用session或者application对象
			     request.getSession().setAttribute("ware", w1);
			else{
				w1.setWareAmount(wareAmount+w.getWareAmount());
				request.getSession().setAttribute("ware",w1);
			}
			//转发
			//request.getRequestDispatcher("ware/result.jsp?wAmount="+wareAmount).forward(request, response);
			//重定向时对应的数据在下一个页面是获取不到的，并且保存的数据在request对象————只能对当前的一次请求起作用
			response.sendRedirect("ware/result.jsp?wAmount="+wareAmount);
		} else {
           response.sendRedirect("ware.html");
		}
	}

	
}
