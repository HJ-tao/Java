package edu.cj.javaee.day0714.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cj.javaee.day0714.service.TrainService;
import edu.cj.javaee.day0714.service.impl.TrainServiceImpl;

public class LoginServlet extends HttpServlet
{
     private TrainService service;
     public LoginServlet(){
    	 this.service = new TrainServiceImpl();
    	 
     }
     //剩下的处理客户请求的方法暂略.....
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {

        PrintWriter out = response.getWriter();
    	 //第一步  获取用户通过界面传过来的数据.
    	   String nos = request.getParameter("trainNo");
    	   //out.print(nos);
    	   //第二步 实例化TrainService
    	   TrainService service = new TrainServiceImpl();
    	   //调用service对象中删除车次信息的方法即可
    	   
    	  boolean flag =  service.deleteTrainByNo(nos);
    	  //第三步 根据操作的结果进行也面的跳转
    	  /*
    	     1.使用response对象的sendRiderect()方法进行页面重定向操作
    	        response。sendRedirect("转向的页面或者程序地址");
    	     
    	     2.使用request对象的getRequestDispatcher("转向的页面或者程序地址").forward(request,response)方法进行页面转发操作
    	       request.getRequestDispatcher("转向的页面或者程序地址").forward(request,response);
    	    
    	          第一种称之为重定向；
    	          第二种称之为转发； 
    	          区别是:重定向在页面跳转后对应的地址栏上的信息会发生改变(即改变成转向的页面或者程序地址),重定向
    	          后对应的程序拿不到重定向前页面的数据；转发在页面跳转后对应的地址栏上的信息不会发生改变，并且
    	          转发后对应的程序可以拿到转发前的页面数据。
    	          
    	     3.用js脚本实现页面的跳转     
    	  */
    	  if(flag){
    	   //response.sendRedirect("3.jsp");
    	   request.getRequestDispatcher("index.jsp").forward(request,response);
    	  }else{
    	     //如果删除失败 则先弹出警告提示框 ,之后再回到index.jsp
    	     out.print("<script>alert('对不起!删除失败,请检查!');history.go(-1);</script>");
    	  }
    	  
    }
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.doPost(req, resp);
    }
}
