<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<%--jsp��ע�� ��ע�͵����ݲ�����ҳ������ʾ,����ͨ������Ҽ��鿴Դ�ļ�ʱ��Ӧ��ע�����ݲ����Կ���
�������ע�͵�����Ƕ�Ӧ�Ĵ���Ҳ���ᱻִ�е�,<%=3+5 %>�������������ڳ���Ա��̨�Ľ���--%>

<!--html��ע�� ��ע�͵����ݲ�����ҳ������ʾ,����ͨ������Ҽ��鿴Դ�ļ�ʱ��Ӧ��ע�������ǿ��Կ�����
�������ע�͵��Ƕ�Ӧ�Ĵ���,��ô���ע�͵Ĵ��뻹�ǻᱻִ�е�,<%=3+5 %>��������������ע�;�̬����-->

<%--
   jsp:java server pages������������Java������ҳ�������ԣ����jsp��̬��ҳ���
   jsp��ǰ����ʵ��һ��Servlet����(����һ��java���ࡪ���������Դ���ͻ��������Լ���Ӧ�ķ�������)
   jsp��ҳ�������¼����������:
      1.ָ��  
      2.jsp��С�ű�
      3.jsp������
      4.jsp�ı��ʽ
      5.jsp�Ķ���ָ��
      6.html(css,table,form,div....)
      7.js����jquery....
      8.ע��
    
    ��һ��ָ�� :   �﷨   <%@   %> 
       ָ��:jsp��������ָ��ֱ�����:
        1. pageָ��    			�﷨   <%@ page  %>  
        2. includeָ��		�﷨   <%@ include  file="" %>    
        3. taglibָ��  (�����ⲿ�ı�ǩ��)     �﷨   <%@ taglib  uri="" prefix="" %>   
        
  �ڶ���   jsp��С�ű���
       ����Ӧ�ľ�����jspҳ����ִ�ж�Ӧ��java����,��Ӧ���﷨����:
        <%   
        
        %>  
        ˵��:������jspС�ű� �еı���Ϊ�ֲ�����,��jspС�ű��п���ִ�ж�Ӧ�ĸ�����䣬���������ж��巽�� 
        
 ������   jsp��������
       ����Ӧ�ľ�����jspҳ����������Ӧ��java���Ի��߷���,��Ӧ���﷨����:
        <%!   
        
        %>  
        ˵��:������jsp�����еı���Ϊȫ�ֱ��������ԡ��򡢳�Ա������,��jsp�����в�����ִ�ж�Ӧ�ĸ�����䣬�������ж��巽��        
    
������:jsp�ı��ʽ
      �﷨:   <%=  %> ,�����õ�ͬ����jspС�ű��е�    out.print();���
      �������������Ӧ�����ݵ�JSPҳ���ϵ�
      ע��!!!
          <%=  %>jspС�ű���û�зֺŽ�������
           out.print();����һ���зֺŽ��������򱨴� 

������jsp�Ķ���ָ��
      �﷨:<jsp:XXX></jsp:XXX>
      XXX��Ҫ��  include �� forward��setProperty....                       
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
	

 