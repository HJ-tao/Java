<%@page import="day0719.entity.Ware"%>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
            Ware w = (Ware)session.getAttribute("ware");
            System.out.print("222222222222222 "+w+" 2222222222222"); 
            out.print("<h1>�����Ʒ���ɹ�!</h1>");
			out.print("��Ʒ����:"+w.getWareName() +"<br/>");
			out.print("�������:"+request.getParameter("wAmount")+"<br/>");
				out.print("�ֹ��п��:"+w.getWareAmount()+"<br/>");
			out.print("<a href='javascript: history.go(-1)'>������һҳ</a>");
%>