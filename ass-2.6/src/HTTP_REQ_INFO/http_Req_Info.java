package HTTP_REQ_INFO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class http_Req_Info
 */
@WebServlet("/http_Req_Info")
public class http_Req_Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		String title="USER INFORMATION";
				
		pw.println("<h1 align=center>" + "Title : - " +(title) + "</h1>");
		
		pw.println("Request Method :- " + request.getMethod() + "<br><br>"); 
		pw.println("Path Information :- " + request.getPathInfo() + "<br><br>");
		pw.println("Content Type :- " + request.getContentType() + "<br><br>");
		pw.println("Request URL :- " + request.getRequestURL() + "<br><br>");
		pw.println("Class :- " + request.getClass() + "<br><br>"); 
		
	}

}
