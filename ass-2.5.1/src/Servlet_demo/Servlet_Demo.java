package Servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_Demo
 */
@WebServlet(name = "Servlet_Config_Demo", urlPatterns = { "/Servlet_Config_Demo" })
public class Servlet_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		ServletConfig con=getServletConfig();
		
		String S_name = con.getServletName();
		pw.println("Servlet Name :- " + S_name);
	}

}
