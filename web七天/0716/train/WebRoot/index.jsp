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
<title>�𳵳�����Ϣ������</title>
<stytle type="text/css"> </stytle>
<script>
        function del(){
        	alert("����,��Ҫ����:)");
        	
        }
     
     </script>
</head>

<body>
	<form action="">
		<table border="1px" width="70%" cellspacing="0px" cellpadding="0px">
			<tr>
				<th><a href="javascript :del()">ɾ��</a></th>
				<th>����</th>
				<th>����---����</th>
				<th>��ʱ---��ʱ</th>
				<th>����</th>
				<th>����ʱ��(Сʱ)</th>
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
				<td>��ʱ---��ʱ</td>
				<td>����</td>
				<td>����ʱ��(Сʱ)</td>
			</tr>
			<%} %>
		</table>

	</form>
</body>
</html>
