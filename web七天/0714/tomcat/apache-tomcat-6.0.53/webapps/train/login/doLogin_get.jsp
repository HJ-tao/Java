<%@page import="edu.cj.javaee.day0714.entity.Users"%>
<%@page import="edu.cj.javaee.day0714.service.impl.UserServiceImpl"%>
<%@page import="edu.cj.javaee.day0714.service.UserService"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
  //��ȡ�û����͵�����������request�����getParameter("��Ԫ�صĶ�������")
  //�Ϳ��Ի�ȡ����Ԫ�������ֵ
 String uName = request.getParameter("uName");
 String uPass = request.getParameter("uPass");
  System.out.println(uName+"\t"+uPass);
  UserService  service = new UserServiceImpl();
  Users u = service.queryUser(uName,uPass);
  System.out.println(u);
   if(null!=u){
      out.print("<script>alert('��½�ɹ�');location.href='../index.jsp';</script>");
  }else{
  out.print("<script>alert('��½ʧ��');location.href='login.html';</script>");
  }
%>