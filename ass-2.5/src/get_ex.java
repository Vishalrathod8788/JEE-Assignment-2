

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class get_ex
 */
@WebServlet("/get_ex")
public class get_ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String sno=request.getParameter("txtno");
		String sname=request.getParameter("txtname");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("No : " + sno);
		pw.println("Name : " + sname);
	}

}
