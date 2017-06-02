package src.fr.ascadis.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import src.fr.ascadis.dao.IUtilisateurDAO;
import src.fr.ascadis.model.Utilisateur;
import src.fr.ascadis.servlet.DataAccessServlet;

@WebServlet("/login")
public class LoginServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private IUtilisateurDAO userdao;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {			
		
		try {
			if (req.getParameter("username").equals("admin") && req.getParameter("password").equals("admin")) {
				req.getSession().setAttribute("username", req.getParameter("username"));
			} 
			else {
				Utilisateur myUser = userdao.findByInfos(req.getParameter("username"), req.getParameter("password"));
					req.getSession().setAttribute("username", req.getParameter("username"));
				}
			}
			
				catch (Exception e) {
			}
		resp.sendRedirect("home");

	}
}

