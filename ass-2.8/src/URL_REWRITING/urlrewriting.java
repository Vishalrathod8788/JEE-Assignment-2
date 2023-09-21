package URL_REWRITING;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class urlrewriting
 */
@WebServlet("/serv")
public class urlrewriting extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public urlrewriting() 
	{
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		String suser=request.getParameter("txtuser");
		String spass=request.getParameter("txtpass");
		
		pw.println("<h3 align=center> Username : " + suser + "</h3><br><br>");
		pw.println("<h3 align=center> Password : " + spass + "</h3>");
	}

}
