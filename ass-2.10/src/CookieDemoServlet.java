

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemoServlet
 */
@WebServlet("/CookieDemoServlet")
public class CookieDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CookieDemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = "Vishal";
        Cookie userNameCookie = new Cookie("user", userName);
        userNameCookie.setMaxAge(24 * 60 * 60); // Cookie expires in 24 hours
        response.addCookie(userNameCookie);

        // Retrieve the cookie and display its value
        Cookie[] cookies = request.getCookies();
        String message = "No cookie with the name 'user' found.";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    message = "Welcome back, " + cookie.getValue() + "!";
                    break;
                }
            }
        }

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Cookie Demo</h1>");
        response.getWriter().println("<p>" + message + "</p>");
        response.getWriter().println("</body></html>");
	}

}
