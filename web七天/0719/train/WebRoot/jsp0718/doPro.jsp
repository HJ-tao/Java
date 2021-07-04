<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
   //设置编码集
   request.setCharacterEncoding("gbk");
   //获取表单提交的数据用request对象的getParameter("表单对象名")返回的类型为String
   //java.lang.String[] getParameterValues(java.lang.String name)——————用来获取表单中同户对象所对应的值
   //返回结果为字符串数组
   String[]pros = request.getParameterValues("pro");
   for(String product:pros){
   
   out.print("<div style='margin-top:10px;width:120px;height:30px;border:1px solid green;color:#12ccaa;'>"+product+"</div>");
   }
   
%>