<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
//如果是Post中文乱码处理 只需要通过request对象去设置字符编码集即可
request.setCharacterEncoding("GBK");
  //获取用户发送的请求数据用request对象的getParameter("表单元素的对象名称")
  //就可以获取到该元素输入的值
 String uName = request.getParameter("uName");
 System.out.println("uName = "+uName);
 out.println("uName = "+uName);
 String uPass = request.getParameter("uPass");
 out.println("<br/>uPass = "+uPass);

%>