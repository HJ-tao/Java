<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
  //获取用户发送的请求数据用request对象的getParameter("表单元素的对象名称")
  //就可以获取到该元素输入的值
 String uName = request.getParameter("uName");
 String uPass = request.getParameter("uPass");
 out.print(uName+"\t"+uPass);
 
 /*
    对于get方式获取数据时的中文乱码解决方案
    1.服务器端的配置。在对应的tomcat服务器中找到conf目录中server.xml文件,打开后找到该文件的
    中的Connector标签,在其中加上一个属性以及对应的值来配置处理中文乱码
    该属性和值为   URIEncoding="GBK",保存后重启服务器即可
    具体配置如下:
       <Connector port="8080" protocol="HTTP/1.1" 
               connectionTimeout="20000" 
               redirectPort="8443" URIEncoding="GBK"/>
 */
 
%>