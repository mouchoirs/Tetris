package src.fr.ascadis.servlet.action;

import java.io.IOException;

import javax.ejb.EJB;
import javax.persistence.Table;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.fr.ascadis.Rendu;
import src.fr.ascadis.model.Utilisateur;
import src.fr.ascadis.servlet.DAO;
import src.fr.ascadis.servlet.UtilisateurDao;

/**
 * Servlet implementation class SubscribeServlet
 */
@WebServlet("/subscribe")
public class SubscribeServlet extends HttpServlet {

	
	private Utilisateur user = new Utilisateur();

	@EJB//(mappedName="UtilisateurDao")
	private DAO<Utilisateur> utilisateurDao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Rendu.pageSubscribe(this.getServletContext(), request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


			user.setNom(request.getParameter("nom"));
			user.setPrenom(request.getParameter("prenom"));
			user.setUsername(request.getParameter("nom_util"));
			user.setMdp(request.getParameter("mdp"));

			if (request.getParameter("mdp").equals(request.getParameter("verif_mdp"))) {
				utilisateurDao.save(user);
				response.sendRedirect("home");
				
			} else {
					
				Rendu.pageSubscribe(this.getServletContext(), request, response);
			}


	}

}
