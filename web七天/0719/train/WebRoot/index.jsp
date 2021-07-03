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
     <style type="text/css">    
     </style>
     <link type="text/css" rel="stylesheet" href="css/my.css">
     <script>
        function changeBgColor(){
          var trs = document.getElementsByTagName("tr");
          for(var i=1;i<trs.length;i++){
             if (i%2==0)//ԭ��Ϊż�����ж�,���ڴ˴������±��0��ʼ,��ʾ����������
              {
				 trs[i].style.backgroundColor = "#12ab12";
			  }else{
			     trs[i].style.backgroundColor = "#ccccdf";
			  }
          }
        }   
     
        function del(no){
        	//alert("����,��Ҫ����:)");
        	if(no.length==0 || "" == no){
        	var trains = document.getElementsByName("trainNo");
        	var flag = false;
        	for(var i=0;i<trains.length;i++){
        	   if(trains[i].checked){
        	    flag = true;
        	    break;
        	   }
        	}
        	if(flag){
        	   //alert("�����ɾ����!"); ɾ��ǰ���û�һ�η��ڵĻ���,���Ի��õ�confirm()��������ȷ��ȡ����ʾ��
        	   if(confirm("��ȷ��Ҫɾ����?"))
        	   {
        	      // alert("ɾ����....."); ��ʼ������ȥ��Ҫɾ���������ύ����̨�������ȥ���ɾ������
        	      /*
        	               ɾ��ǰҪ����Ӧ�ĳ���ƴ�ӳ� "'D3053','G87','D5286'"�������ַ������ݴ�����̨������
        	      */
        	      var delTrainNo = getDelteTrainNo();
        	      //alert(delTrainNo);
        	      //����ȡ�������ݽ��ɺ�̨����,����ת�����
        	      /*
        	         1.ͨ���ֶ���������ύ���������ڴ˴��ɳ������ӵ��ö�Ӧ�ĺ�����,�ֶ����ں���������ȥ����
        	         �ֶ��ύ���ݵķ���submit();
        	         document.form1.submit();
        	         
        	         2.ͨ��window���������location�����href����ָ������ĳ�����"?"�����ӷ�
        	         ���ݶ�Ӧ������
        	         location.href = "doDelete.jsp?trainNo="+delTrainNo
        	         
        	      */
        	      location.href = "doDelete.jsp?trainNo="+delTrainNo
        	     }     	   
	        	}else{
	        	   alert("��ѡ�񳵴�!");
	        	}
        	}else{
        	 if(confirm("��ȷ��Ҫɾ����?"))
        	   {
        	   alert("doDelete.jsp?trainNo='"+no+"'");
        	   location.href = "doDelete.jsp?trainNo='"+no+"'";
        	   }
        	}
        }
     function getDelteTrainNo(){
         var trains = document.getElementsByName("trainNo");
         var nos = "";
         for(var i=0;i<trains.length;i++){
        	   if(trains[i].checked){
        	       nos+="'"+trains[i].value+"',";
        	   }
        	}
        	return nos.substring(0,nos.length-1);
     }
     </script>
  </head>
  
  <body onload="changeBgColor()">
     <form action="" name="form1">
        <table border="1px" width="70%" cellspacing="0px" cellpadding="0px" >
           <tr>
              <td colspan="7" align="right"><a href="addTrain.html">��ӻ𳵳���</a></td>
           </tr>
           <tr>
               <th><a href="javascript: del('')">ɾ��</a></th>
               <th>����</th>
               <th>����---����</th>
               <th>��ʱ---��ʱ</th>
               <th>����</th>
               <th>����ʱ��(Сʱ)</th>
               <th>����</th>
           </tr>
           <%
              for(Train t : list){
           
           %>
           <tr onmouseover="this.style.backgroundColor='#12ab12'" onmouseout="this.style.backgroundColor='#ccccdf'">
               <td><input type="checkbox" name="trainNo" value=<%=t.getTrainNo() %>></th>
               <td><%=t.getTrainNo() %></th>
               <td><%=t.getStartStation() %>---<%=t.getArrivalStation() %></td>
               <td>��ʱ---��ʱ</td>
               <td>����</td>
               <td>����ʱ��(Сʱ)</td>
                <td><input type="button" value="ɾ��" class="tom" onclick="del('<%=t.getTrainNo() %>')"><a href="doUpdate.jsp?trainNo=<%=t.getTrainNo()%>">�޸�</a></td>
           </tr>
         <%} %>  
        </table>
      
     </form>
  </body>
</html>
