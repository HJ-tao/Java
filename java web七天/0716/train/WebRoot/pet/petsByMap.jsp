<%@page import="day0716.dao.impl.PetDAOImpl"%>
<%@page import="day0716.dao.PetDAO"%>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
   	PetDAO dao = new PetDAOImpl();
   Map<Integer,String> types = dao.getPType();
   


 %>


<html>
<head>

<title>pet����ϵͳ</title>



</head>

<body>
	<form action="pets.jsp" method="post">
		Ʒ��:<select name="pTytpe" onchange="">
			<option value="0">��ѡ����������</option>
			<%
            int i = 0;
               for(Integer key:types.keySet()){
               
             %>
			<option value="<%=key%>"><%=types.get(key)%></option>
			<%
               }
             %>
		</select> <input type="submit" value="��ѯ"><a href="addPet.html">��������</a>
	</form>
</body>
</html>
