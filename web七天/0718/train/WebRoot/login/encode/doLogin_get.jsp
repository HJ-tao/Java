<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
  //��ȡ�û����͵�����������request�����getParameter("��Ԫ�صĶ�������")
  //�Ϳ��Ի�ȡ����Ԫ�������ֵ
 String uName = request.getParameter("uName");
 String uPass = request.getParameter("uPass");
 out.print(uName+"\t"+uPass);
 
 /*
    ����get��ʽ��ȡ����ʱ����������������
    1.�������˵����á��ڶ�Ӧ��tomcat���������ҵ�confĿ¼��server.xml�ļ�,�򿪺��ҵ����ļ���
    �е�Connector��ǩ,�����м���һ�������Լ���Ӧ��ֵ�����ô�����������
    �����Ժ�ֵΪ   URIEncoding="GBK",�������������������
    ������������:
       <Connector port="8080" protocol="HTTP/1.1" 
               connectionTimeout="20000" 
               redirectPort="8443" URIEncoding="GBK"/>
 */
 
%>