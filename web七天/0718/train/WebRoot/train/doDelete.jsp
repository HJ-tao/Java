<%@page import="edu.cj.javaee.day0714.service.impl.TrainServiceImpl"%>
<%@page import="edu.cj.javaee.day0714.service.TrainService"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=gbk" pageEncoding="GBK"%>
<%
   //��һ��  ��ȡ�û�ͨ�����洫����������.
   String nos = request.getParameter("train_no");
   String[]trainNos = request.getParameterValues("trainNo");
   StringBuilder sb = new StringBuilder();
   if(null!=nos)
   {
       sb.append(nos);
   }else{
      for(String no:trainNos)
      {
         sb.append("'").append(no).append("',");
      }
     sb.deleteCharAt(sb.length()-1); 
   }
   
   out.print("<h1>"+sb+"</h1>");
   //�ڶ��� ʵ����TrainService
   TrainService service = new TrainServiceImpl();
   //����service������ɾ��������Ϣ�ķ�������
   
  boolean flag =  service.deleteTrainByNo(sb.toString());
  //������ ���ݲ����Ľ������Ҳ�����ת
  /*
     1.ʹ��response�����sendRiderect()��������ҳ���ض������
        response��sendRedirect("ת���ҳ����߳����ַ");
     
     2.ʹ��request�����getRequestDispatcher("ת���ҳ����߳����ַ").forward(request,response)��������ҳ��ת������
       request.getRequestDispatcher("ת���ҳ����߳����ַ").forward(request,response);
    
          ��һ�ֳ�֮Ϊ�ض���
          �ڶ��ֳ�֮Ϊת���� 
          ������:�ض�����ҳ����ת���Ӧ�ĵ�ַ���ϵ���Ϣ�ᷢ���ı�(���ı��ת���ҳ����߳����ַ),�ض���
          ���Ӧ�ĳ����ò����ض���ǰҳ������ݣ�ת����ҳ����ת���Ӧ�ĵ�ַ���ϵ���Ϣ���ᷢ���ı䣬����
          ת�����Ӧ�ĳ�������õ�ת��ǰ��ҳ�����ݡ�
          
     3.��js�ű�ʵ��ҳ�����ת     
  */
 if(flag){
   //response.sendRedirect("3.jsp");
   request.getRequestDispatcher("index.jsp").forward(request,response);
  }else{
     //���ɾ��ʧ�� ���ȵ���������ʾ�� ,֮���ٻص�index.jsp
     out.print("<script>alert('�Բ���!ɾ��ʧ��,����!');history.go(-1);</script>");
  }
  
  
%>