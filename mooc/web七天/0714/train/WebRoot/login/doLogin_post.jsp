<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
  //��ȡ�û����͵�����������request�����getParameter("��Ԫ�صĶ�������")
  //�Ϳ��Ի�ȡ����Ԫ�������ֵ
 String uName = request.getParameter("uName");
 System.out.println("uName = "+uName);
 out.println("uName = "+uName);
 String uPass = request.getParameter("uPass");
 out.println("<br/>uPass = "+uPass);

%>