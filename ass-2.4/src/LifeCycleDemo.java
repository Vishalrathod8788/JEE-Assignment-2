import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/a1") 
public class LifeCycleDemo extends GenericServlet
{

	public void init() throws ServletException 
	{
			super.init();
			System.out.println("Init Method Call");
	}
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException
	{
			System.out.println("Service Method Call");
	}
	public void destroy()
	{
			super.destroy();
			System.out.println("Destroy Method Call");
	}
	
}
