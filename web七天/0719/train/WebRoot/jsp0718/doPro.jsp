<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
   //���ñ��뼯
   request.setCharacterEncoding("gbk");
   //��ȡ���ύ��������request�����getParameter("��������")���ص�����ΪString
   //java.lang.String[] getParameterValues(java.lang.String name)������������������ȡ����ͬ����������Ӧ��ֵ
   //���ؽ��Ϊ�ַ�������
   String[]pros = request.getParameterValues("pro");
   for(String product:pros){
   
   out.print("<div style='margin-top:10px;width:120px;height:30px;border:1px solid green;color:#12ccaa;'>"+product+"</div>");
   }
   
%>