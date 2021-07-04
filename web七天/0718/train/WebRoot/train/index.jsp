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
     <style type="text/css">
     
     
     </style>
     <link type="text/css" rel="stylesheet" href="css/my.css">
     <script>
        function changeBgColor(){
          var trs = document.getElementsByTagName("tr");
          for(var i=1;i<trs.length;i++){
             if (i%2==0)//原本为偶数的判断,但在此处数组下标从0开始,表示的是奇数行
              {
				 trs[i].style.backgroundColor = "#12ab12";
			  }else{
			     trs[i].style.backgroundColor = "#ccccdf";
			  }
          }
        }   
     
        function del(no){
        	//alert("哈哈,你要作甚:)");
        	if(no.length==0 || "" == no){
	        	var trains = document.getElementsByName("trainNo");
	        	var flag = false;
	        	for(var i=0;i<trains.length;i++){
	        	   if(trains[i].checked){
	        	    flag = true;
	        	    break;
	        	   }
	        	}
	        	if(flag)
	        	{
	        	   //alert("你可以删除了!"); 删除前给用户一次反悔的机会,所以会用到confirm()函数弹出确认取消提示框
	        	   if(confirm("您确定要删除吗?"))
	        	   {        	              	     
	        	       /*  1.通过手动完成数据提交————在此处由超级链接调用对应的函数后,手动的在函数体中再去调用
	        	         手动提交数据的方法submit();
	        	         document.form1.submit();      	         
	        	         2.通过window对象的属性location对象的href属性指定处理的程序用"?"号连接符
	        	         传递对应的数据
	        	         location.href = "doDelete.jsp?trainNo="+delTrainNo     	         
	        	      */
	        	      document.form1.submit();   
	        	   }     	   
		        }
		        else{
		        	   alert("请选择车次!");
		        	}
        	}
        	else{
        	 if(confirm("您确定要删除吗?"))
        	   {
        	      // document.form1.submit();  
        	      location.href="doDelete.jsp?train_no='"+no+"'"; 
        	   }
        	}
        }
    
     </script>
  </head>
  
  <body onload="changeBgColor()">
     <form action="doDelete.jsp" name="form1" method="post">
        <table border="1px" width="70%" cellspacing="0px" cellpadding="0px" >
           <tr>
              <td colspan="7" align="right"><a href="addTrain.html">添加火车车次</a></td>
           </tr>
           <tr>
               <th><a href="javascript: del('')">删除</a></th>
               <th>车次</th>
               <th>发车---到达</th>
               <th>发时---到时</th>
               <th>车型</th>
               <th>运行时间(小时)</th>
               <th>操作</th>
           </tr>
           <%
              for(Train t : list){
           
           %>
           <tr onmouseover="this.style.backgroundColor='#12ab12'" onmouseout="this.style.backgroundColor='#ccccdf'">
               <td><input type="checkbox" name="trainNo" value=<%=t.getTrainNo() %>></th>
               <td><%=t.getTrainNo() %></th>
               <td><%=t.getStartStation() %>---<%=t.getArrivalStation() %></td>
               <td>发时---到时</td>
               <td>车型</td>
               <td>运行时间(小时)</td>
                <td><input type="button" value="删除" class="tom" onclick="del('<%=t.getTrainNo()  %>')"><a href="doUpdate.jsp?trainNo=<%=t.getTrainNo()%>">修改</a></td>
           </tr>
         <%} %>  
        </table>
      
     </form>
  </body>
</html>
