package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.cj.javaee.day0714.entity.Train;
import edu.cj.javaee.day0714.service.impl.TrainServiceImpl;
import edu.cj.javaee.day0714.service.TrainService;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

TrainService service = new TrainServiceImpl();
List<Train> list = service.getAllTrains();



      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("     <title>火车车次信息主界面</title>\r\n");
      out.write("     <stytle type=\"text/css\">\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     </stytle>\r\n");
      out.write("     <script>\r\n");
      out.write("        function del(){\r\n");
      out.write("        \talert(\"哈哈,你要作甚:)\");\r\n");
      out.write("        \t\r\n");
      out.write("        }\r\n");
      out.write("     \r\n");
      out.write("     </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("     <form action=\"\">\r\n");
      out.write("        <table border=\"1px\" width=\"70%\" cellspacing=\"0px\" cellpadding=\"0px\" >\r\n");
      out.write("           <tr>\r\n");
      out.write("               <th><a href=\"javascript :del()\">删除</a></th>\r\n");
      out.write("               <th>车次</th>\r\n");
      out.write("               <th>发车---到达</th>\r\n");
      out.write("               <th>发时---到时</th>\r\n");
      out.write("               <th>车型</th>\r\n");
      out.write("               <th>运行时间(小时)</th>\r\n");
      out.write("           </tr>\r\n");
      out.write("           ");

              for(Train t : list){
           
           
      out.write("\r\n");
      out.write("           <tr>\r\n");
      out.write("               <td><input type=\"checkbox\" name=\"trainNo\" value=");
      out.print(t.getTrainNo() );
      out.write("></th>\r\n");
      out.write("               <td>");
      out.print(t.getTrainNo() );
      out.write("</th>\r\n");
      out.write("               <td>");
      out.print(t.getStartStation() );
      out.write('-');
      out.write('-');
      out.write('-');
      out.print(t.getArrivalStation() );
      out.write("</td>\r\n");
      out.write("               <td>发时---到时</td>\r\n");
      out.write("               <td>车型</td>\r\n");
      out.write("               <td>运行时间(小时)</td>\r\n");
      out.write("           </tr>\r\n");
      out.write("         ");
} 
      out.write("  \r\n");
      out.write("        </table>\r\n");
      out.write("      \r\n");
      out.write("     </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
