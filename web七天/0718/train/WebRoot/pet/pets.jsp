<%@page import="day0716.dao.impl.PetDAOImpl"%>
<%@page import="day0716.dao.PetDAO"%>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
   	PetDAO dao = new PetDAOImpl();
    String types = dao.getAllPType();
   String[] typeArray = types.split(",");


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
               for(String type:typeArray){
               
             %>
             <option value="<%=++i%>"><%=type%></option>
             <%
               }
             %>
         </select>
         <input type="submit" value="��ѯ"><a href="addPet.html">��������</a>
     </form>
  </body>
</html>
