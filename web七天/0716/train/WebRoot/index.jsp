<%@page import="edu.cj.javaee.day0714.entity.Train"%>
<%@page import="edu.cj.javaee.day0714.service.impl.TrainServiceImpl"%>
<%@page import="edu.cj.javaee.day0714.service.TrainService"%>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
TrainService service = new TrainServiceImpl();
List<Train> list = service.getAllTrains();


%>

<html>
<head>
<title>火车车次信息主界面</title>
<stytle type="text/css"> </stytle>
<script>
        function del(){
        	alert("哈哈,你要作甚:)");
        	
        }
     
     </script>
</head>

<body>
	<form action="">
		<table border="1px" width="70%" cellspacing="0px" cellpadding="0px">
			<tr>
				<th><a href="javascript :del()">删除</a></th>
				<th>车次</th>
				<th>发车---到达</th>
				<th>发时---到时</th>
				<th>车型</th>
				<th>运行时间(小时)</th>
			</tr>
			<%
              for(Train t : list){
           
           %>
			<tr>
				<td><input type="checkbox" name="trainNo"
					value=<%=t.getTrainNo() %>>
				</th>
				<td><%=t.getTrainNo() %>
				</th>
				<td><%=t.getStartStation() %>---<%=t.getArrivalStation() %></td>
				<td>发时---到时</td>
				<td>车型</td>
				<td>运行时间(小时)</td>
			</tr>
			<%} %>
		</table>

	</form>
</body>
</html>
