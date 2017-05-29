package src.fr.ascadis.servlet.view;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.fr.ascadis.Rendu;
import src.fr.ascadis.model.Tetrimino;
import src.fr.ascadis.model.Utilisateur;


@WebServlet("/home")
public class HomeServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

		Rendu.pageBienvenue(this.getServletContext(), req, resp);
	}
}