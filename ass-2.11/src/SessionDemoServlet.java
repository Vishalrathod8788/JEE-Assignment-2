

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemoServlet
 */
@WebServlet("/SessionDemoServlet")
public class SessionDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SessionDemoServlet() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Session Demo</h1>");
        
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        
        if (username != null) {
            response.getWriter().println("<p>Username in Session: " + username + "</p>");
        } else {
            response.getWriter().println("<p>Username not found in Session</p>");
        }
        
        response.getWriter().println("<form method='post' action='SessionDemoServlet'>");
        response.getWriter().println("<label for='username'>Enter your username:</label>");
        response.getWriter().println("<input type='text' id='username' name='username'>");
        response.getWriter().println("<input type='submit' value='Submit'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
        
        HttpSession session = request.getSession();
        session.setAttribute("username", userName);
        
        response.sendRedirect(request.getContextPath() + "/SessionDemoServlet");
	}

}
