package springapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("we are in service method of servlet");
		String username = "user";
		String password = "root";
		String un= request.getParameter("username");
		String pw= request.getParameter("password");

		String msg = " ";

		//if(un.equals(username) && pw.equals(password))
		if (un == username && pw == password)
		{
			msg= "Hello!! Your login is successful";
		}
			else 
			{ 
					msg= "Hello!! Your login is unsuccessful";
			}

		response.setContentType("text/html"); 
		
		
		PrintWriter out = response.getWriter();
		out.println("<font size=Ô6Õ color=red>"+ msg + "</font>");

	}

	
	}


