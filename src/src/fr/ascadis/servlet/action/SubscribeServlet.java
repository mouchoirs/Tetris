package src.fr.ascadis.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import src.fr.ascadis.Rendu;
import src.fr.ascadis.dao.IUtilisateurDAO;
import src.fr.ascadis.model.Utilisateur;
import src.fr.ascadis.servlet.DataAccessServlet;

/**
 * Servlet implementation class SubscribeServlet
 */
@WebServlet("/subscribe")
public class SubscribeServlet extends DataAccessServlet {


	private Utilisateur user = new Utilisateur();

	@Autowired
	private IUtilisateurDAO utilisateurDao;

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
		user.setTypeDeCompte(request.getParameter("type_compte"));

		if (request.getParameter("nom") != "" && request.getParameter("prenom") != ""
				&& request.getParameter("nom_util") != "" && request.getParameter("mdp") != ""
				&& request.getParameter("mdp").equals(request.getParameter("verif_mdp"))) {
			utilisateurDao.save(user);
			response.sendRedirect("home");

		} else {

			Rendu.pageSubscribe(this.getServletContext(), request, response);
		}

	}

}
