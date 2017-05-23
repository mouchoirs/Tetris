package tetris.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//on donne l'attribut user qui n'a au lancement du prog aucune valeur, a la session.
		request.getSession().invalidate();
		String myUser = (String) request.getSession().getAttribute("user");
		
		//on vérifie si myUser est null. C'est à dire, si on a déjà inscrit un nom dans le formulaire 
		if (myUser == null)
		{//on lance la page login si il est null
			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		}
		else
		{//sinon on lance la page d'accueil
			this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}
}
