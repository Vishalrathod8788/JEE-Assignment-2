package FETCH_ELEMENT;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fetch_ele
 */
@WebServlet("/serv")
public class fetch_ele extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("t2");
		String s3 = request.getParameter("t3");
		String s4 = request.getParameter("t4");
		String s5 = request.getParameter("t5");
		String[] s6 = request.getParameterValues("t6");
		
		PrintWriter pw = response.getWriter();
		String title="Fetch Data From HTML Page";
		
		pw.println("<h1 align=center>" + "Title : - " +(title) + "</h1><hr><hr>");
		
		pw.println("Name :- " +s1 + "<br><br>");
		pw.println("Password :- " + s2 + "<br><br>");
		pw.println("Gender :- " + s3 + "<br><br>");
		pw.println("Address :- " + s4 + "<br><br>");
		pw.println("City :- " + s5 + "<br><br>");
		
		if(s6 != null)
		{
			pw.println("Hobbies :- ");
			for(String s : s6)
			{
				pw.println("<li>" + s + "</li>");
			}
		}
	}

}