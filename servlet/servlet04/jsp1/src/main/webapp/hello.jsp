<%@page pageEncoding="utf-8"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>第1个jsp</title>
	</head>
	<body>
		<!-- jsp声明 -->
		<%!
			public double bai(double n) {
				return n*100;
			}
		%>
		<ol>
			<!-- jsp脚本 -->
			<%
				for(int i=0;i<10;i++) {
			%>
				<!-- jsp表达式 -->
				<li><%=bai(Math.random()) %></li>
			<%
				}
			%>
		</ol>
		<!-- 引入time.jsp,相当于将time.jsp
			内部的代码复制到此处. -->
		<%@include file="time.jsp" %>
	</body>
</html>












