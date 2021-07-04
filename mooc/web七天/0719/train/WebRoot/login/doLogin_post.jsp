<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
  //获取用户发送的请求数据用request对象的getParameter("表单元素的对象名称")
  //就可以获取到该元素输入的值
 String uName = request.getParameter("uName");
 System.out.println("uName = "+uName);
 out.println("uName = "+uName);
 String uPass = request.getParameter("uPass");
 out.println("<br/>uPass = "+uPass);

%>