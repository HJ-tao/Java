<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<%--jsp的注释 被注释的内容不会在页面上显示,但是通过点击右键查看源文件时对应的注释内容不可以看到
并且如果注释的如果是对应的代码也不会被执行的,<%=3+5 %>所以这种适用于程序员后台的交流--%>

<!--html的注释 被注释的内容不会在页面上显示,但是通过点击右键查看源文件时对应的注释内容是可以看到的
并且如果注释的是对应的代码,那么这个注释的代码还是会被执行的,<%=3+5 %>所以这种适用于注释静态内容-->

<%--
   jsp:java server pages——————Java服务器页面编程语言，简称jsp动态网页编程
   jsp的前生其实是一个Servlet程序(就是一个java的类————可以处理客户端请求以及响应的服务器类)
   jsp的页面由以下几个部分组成:
      1.指令  
      2.jsp的小脚本
      3.jsp的声明
      4.jsp的表达式
      5.jsp的动作指令
      6.html(css,table,form,div....)
      7.js或者jquery....
      8.注释
    
    第一种指令 :   语法   <%@   %> 
       指令:jsp中有三种指令，分别如下:
        1. page指令    			语法   <%@ page  %>  
        2. include指令		语法   <%@ include  file="" %>    
        3. taglib指令  (引用外部的标签库)     语法   <%@ taglib  uri="" prefix="" %>   
        
  第二种   jsp的小脚本：
       它对应的就是在jsp页面中执行对应的java代码,对应的语法如下:
        <%   
        
        %>  
        说明:定义在jsp小脚本 中的变量为局部变量,在jsp小脚本中可以执行对应的各种语句，不能在其中定义方法 
        
 第三种   jsp的声明：
       它对应的就是在jsp页面中声明对应的java属性或者方法,对应的语法如下:
        <%!   
        
        %>  
        说明:定义在jsp声明中的变量为全局变量（属性、域、成员变量）,在jsp声明中不可以执行对应的各种语句，能在其中定义方法        
    
第四种:jsp的表达式
      语法:   <%=  %> ,其作用等同于在jsp小脚本中的    out.print();语句
      都是用来输出对应的数据到JSP页面上的
      注意!!!
          <%=  %>jsp小脚本是没有分号结束符的
           out.print();后面一定有分号结束符否则报错 

第五种jsp的动作指令
      语法:<jsp:XXX></jsp:XXX>
      XXX主要有  include 、 forward、setProperty....                       
 --%>

<%
    int num1 = 5;
    int num2 = 4;
    int result = num1 + num2;
    System.out.printf("%d + %d = %d",num1,num2,result);
  
    out.print("<h1 style='color:red;'>"+num1+" + "+num2+" = "+result+"</h1>");
 %>
 <hr/>
 <%!
    int num1 = 5;
    int num2 = 4;
    int result = num1 + num2;
   
   public String sayHello(String name){
     return "hello "+name;
   }
 %>
 
 <%
    out.print(sayHello("tom!"));
  %>
<hr/>
<%=sayHello("lily!") %>
<jsp:forward page="doReg.jsp"></jsp:forward>
	

 