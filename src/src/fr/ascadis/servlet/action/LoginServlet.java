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

		
		try{
			
			Utilisateur myUser = userdao.findByInfos(req.getParameter("username"), req.getParameter("password"));
			if (myUser==null){
				resp.getWriter().print("cet utilisateur n'existe pas.");
			}
			else{
				req.getSession().setAttribute("username", req.getParameter("username"));
				resp.sendRedirect("home");
			}
		
		}
		catch (Exception e){
			resp.sendRedirect("home");
		}
				
		}
	}
