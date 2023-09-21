

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String message = (String) request.getAttribute("message");
	        
	        response.setContentType("text/html");
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<h1>SecondServlet</h1>");
	        response.getWriter().println("<p>Message from FirstServlet: " + message + "</p>");
	        response.getWriter().println("</body></html>");
	}

}
