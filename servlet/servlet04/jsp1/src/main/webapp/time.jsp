<!-- 
pageEncoding:声明此文件的编码.
contentType:声明此jsp输出给浏览器的内容的格式.
 -->
<%@page pageEncoding="utf-8"
	contentType="text/html"
	import="java.util.*,java.text.*"%>
<%
	Date d = new Date();
	SimpleDateFormat sdf = 
		new SimpleDateFormat("HH:mm:ss");
	String now = sdf.format(d);
%>
<p><%=now %></p>





