package tetris.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tetris.java.Tetrimino;

@WebServlet("/deleteTetrimino")
public class DeleteTetriminoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tetrimiosASupprimer = req.getParameter("idTetriminos");
		req.getSession().setAttribute("idTetriminos", tetrimiosASupprimer);
		
		Tetrimino tetrimino=(Tetrimino)this.getServletContext().getAttribute("tetriminos");
		tetriminos.delete(tetrimino);		
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetriminos.jsp").forward(req, resp);
		
		
	}


}
