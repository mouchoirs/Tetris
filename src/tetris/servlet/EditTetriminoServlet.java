package tetris.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tetris.java.Tetrimino;
import tetris.java.TetriminoApplicationDAO;

/**
 * Servlet implementation class EditTetriminoServlet
 */
@WebServlet("/editTetrimino")
public class EditTetriminoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// on récupère un id (tetriminoASupprimer) d'un paramètre (idTetriminos)
		// dans l'URL
		String tetrimiosAEditer = request.getParameter("idTetriminos");

		// on vient chercher avec la methode find, l'id du tetriminoASupprimer,
		// dans le Map
		// on met le nom de la classe qui contient la méthode car il s'agit
		// d'une méthode statique
		Tetrimino tetriEdit = TetriminoApplicationDAO.find(tetrimiosAEditer);

		if (tetriEdit == null) {

			Tetrimino NewTetri = new Tetrimino(request.getParameter("nomTetrimino"), request.getParameter("couleurTetrimino"), request.getParameter("idTetrimino"));
			TetriminoApplicationDAO.save(NewTetri);
			this.getServletContext().getRequestDispatcher("/WEB-INF/editTetrimino.jsp").forward(request, response);
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/editTetrimino.jsp").forward(request, response);
		}
		// on se redirige vers la page qui affiche la liste des tetriminos.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetriminos.jsp").forward(request, response);
	}

}
