package tetris.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	  
	     
	  
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 String login = request.getParameter("login");
	     String pwd = request.getParameter("pwd");
	     request.getSession().setAttribute("login", login);
	     request.getSession().setAttribute("pwd", pwd);
	        RequestDispatcher dispatcher = null;
	         
	         
	        if(request.getParameter("login")!= null && request.getParameter("pwd")!= null){
	            dispatcher = request.getRequestDispatcher("/WEB-INF/accueil.jsp");
	        }else{
	            dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
	        }
	        dispatcher.forward(request, response);
	        }
	         
	    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
