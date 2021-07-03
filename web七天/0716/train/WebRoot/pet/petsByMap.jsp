<%@page import="day0716.dao.impl.PetDAOImpl"%>
<%@page import="day0716.dao.PetDAO"%>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
   	PetDAO dao = new PetDAOImpl();
   Map<Integer,String> types = dao.getPType();
   


 %>


<html>
<head>

<title>pet管理系统</title>



</head>

<body>
	<form action="pets.jsp" method="post">
		品种:<select name="pTytpe" onchange="">
			<option value="0">请选择宠物的种类</option>
			<%
            int i = 0;
               for(Integer key:types.keySet()){
               
             %>
			<option value="<%=key%>"><%=types.get(key)%></option>
			<%
               }
             %>
		</select> <input type="submit" value="查询"><a href="addPet.html">新增宠物</a>
	</form>
</body>
</html>
