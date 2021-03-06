package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpServlet extends HttpServlet {

	//平均工资
	private double salary = 2000.0;
	
	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		synchronized(this) {
			salary += 100;
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			res.setContentType("text/html");
			PrintWriter w = res.getWriter();
			w.println("<h1>"+salary+"</h1>");
			w.close();
		}
	}

}





