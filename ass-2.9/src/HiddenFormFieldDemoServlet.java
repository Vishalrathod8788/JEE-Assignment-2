

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenFormFieldDemoServlet")
public class HiddenFormFieldDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HiddenFormFieldDemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hiddenValue = request.getParameter("hiddenField");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Hidden Form Field Demo - Submitted Data</h1>");
        response.getWriter().println("<p>Hidden Field Value: " + hiddenValue + "</p>");
        response.getWriter().println("</body></html>");
	}

}
