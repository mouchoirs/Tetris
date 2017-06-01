package src.fr.ascadis.servlet.action;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.fr.ascadis.model.Utilisateur;
import src.fr.ascadis.servlet.DAO;
import src.fr.ascadis.servlet.DataAccessServlet;
import src.fr.ascadis.servlet.UtilisateurDao;

@WebServlet("/login")
public class LoginServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;

	@EJB//(mappedName="UtilisateurDao")
	private UtilisateurDao userdao;

	private Utilisateur user = new Utilisateur();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		user.setUsername(req.getParameter("username"));
		user.setMdp(req.getParameter("password"));
		//System.out.println(user.findByUsername(user.getUsername(), user.getMdp()));
		
		//user.setId(user.findByUsername(user.getUsername(), user.getMdp()));

		//if (user.getId() == null){
		//	resp.sendRedirect("home");
			
		//} else {
		//	req.getSession().setAttribute("username", req.getParameter("username"));
		//	resp.sendRedirect("home");
		//}
	}
}