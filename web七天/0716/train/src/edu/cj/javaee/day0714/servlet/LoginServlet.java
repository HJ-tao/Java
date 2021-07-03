package edu.cj.javaee.day0714.servlet;

import javax.servlet.http.HttpServlet;

import edu.cj.javaee.day0714.service.TrainService;
import edu.cj.javaee.day0714.service.impl.TrainServiceImpl;

public class LoginServlet extends HttpServlet
{
     private TrainService service;
     public LoginServlet(){
    	 this.service = new TrainServiceImpl();
    	 
     }
     //剩下的处理客户请求的方法暂略.....
}
