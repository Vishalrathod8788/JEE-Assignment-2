package URL_REWRITING;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class url_rew
 */
@WebServlet("/serv")
public class url_rew extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		String sname=request.getParameter("txtuser");
		String spass=request.getParameter("txtpass");
		PrintWriter pw = response.getWriter();
		
		if(sname.equals("system") && spass.equals("hjd"))
		{
			pw.println("Login Successfully<br><br>");
			pw.println("Click To Go Home Page<br><br>");
		
			pw.println("<a href='urlrewriting?Username " +sname+ " & password " +spass+"'>Click Here</a>");
		}
	}
}
