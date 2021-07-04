<%@page import="day0719.entity.Ware"%>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
            Ware w = (Ware)session.getAttribute("ware");
            System.out.print("222222222222222 "+w+" 2222222222222"); 
            out.print("<h1>添加商品库存成功!</h1>");
			out.print("商品名称:"+w.getWareName() +"<br/>");
			out.print("新增库存:"+request.getParameter("wAmount")+"<br/>");
				out.print("现共有库存:"+w.getWareAmount()+"<br/>");
			out.print("<a href='javascript: history.go(-1)'>返回上一页</a>");
%>