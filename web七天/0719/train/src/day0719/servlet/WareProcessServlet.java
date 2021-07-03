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
		//���ж϶�Ӧ����Ʒ�Ƿ����,��������������Ʒ����,��������Ʒ�ĸ��²���
		Ware w = service.getWareByName(wName);
		Ware w1 = new Ware(wName, wareSort, wareAmount);
		int result = 0;
		if (null==w) 
		{
			//��������Ʒ����			
			result = service.addWre(w1);
		} else //��Ʒ�ĸ��²���
		{
            result = service.updateWare(w1); 
		}
		
		if (result>0) {
			/*out.print("<h1>�����Ʒ���ɹ�!</h1>");
			out.print("��Ʒ����:"+wName+"<br/>");
			out.print("�������:"+wareAmount+"<br/>");
			if(null==w)
			    out.print("�ֹ��п��:"+(wareAmount)+"<br/>");
			else
				out.print("�ֹ��п��:"+(wareAmount+w.getWareAmount())+"<br/>");
			out.print("<a href='javascript: history.go(-1)'>������һҳ</a>");
			*/
			if(null==w)
				//�����Ҫ��������ʱ���һ��,���Կ�����session����application����
			     request.getSession().setAttribute("ware", w1);
			else{
				w1.setWareAmount(wareAmount+w.getWareAmount());
				request.getSession().setAttribute("ware",w1);
			}
			//ת��
			//request.getRequestDispatcher("ware/result.jsp?wAmount="+wareAmount).forward(request, response);
			//�ض���ʱ��Ӧ����������һ��ҳ���ǻ�ȡ�����ģ����ұ����������request���󡪡�����ֻ�ܶԵ�ǰ��һ������������
			response.sendRedirect("ware/result.jsp?wAmount="+wareAmount);
		} else {
           response.sendRedirect("ware.html");
		}
	}

	
}
