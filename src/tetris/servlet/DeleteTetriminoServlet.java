package tetris.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tetris.java.Tetrimino;
import tetris.java.TetriminoApplicationDAO;

@WebServlet("/deleteTetrimino")
public class DeleteTetriminoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//on récupère un id (tetriminoASupprimer) d'un paramètre (idTetriminos) dans l'URL
		String tetrimiosASupprimer = req.getParameter("idTetriminos");
		
		//on vient chercher avec la methode find, l'id du tetriminoASupprimer, dans le Map
		//on met le nom de la classe qui contient la méthode car il s'agit d'une méthode statique
		Tetrimino tetriSuppr = TetriminoApplicationDAO.find(tetrimiosASupprimer); 
		
		//on supprime le tetrimino voulu.
		TetriminoApplicationDAO.delete(tetriSuppr);
		
		//on se redirige vers la page qui affiche la liste des tetriminos.
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetriminos.jsp").forward(req, resp);		
	}


}
