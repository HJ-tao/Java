<%@page import="edu.cj.javaee.day0714.entity.Users"%>
<%@page import="edu.cj.javaee.day0714.service.impl.UserServiceImpl"%>
<%@page import="edu.cj.javaee.day0714.service.UserService"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
  //获取用户发送的请求数据用request对象的getParameter("表单元素的对象名称")
  //就可以获取到该元素输入的值
 String uName = request.getParameter("uName");
 String uPass = request.getParameter("uPass");
  System.out.println(uName+"\t"+uPass);
  UserService  service = new UserServiceImpl();
  Users u = service.queryUser(uName,uPass);
  System.out.println(u);
   if(null!=u){
      out.print("<script>alert('登陆成功');location.href='../index.jsp';</script>");
  }else{
  out.print("<script>alert('登陆失败');location.href='login.html';</script>");
  }
%>