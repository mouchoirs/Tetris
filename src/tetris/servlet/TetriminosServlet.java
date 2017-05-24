package tetris.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tetris.java.Tetrimino;

@WebServlet("/tetriminos")
public class TetriminosServlet extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Tetrimino> mesTetriminos=(List<Tetrimino>)this.getServletContext().getAttribute("tetriminos");
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetriminos.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Tetrimino> mesTetriminos=(List<Tetrimino>)this.getServletContext().getAttribute("tetriminos");
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetriminos.jsp").forward(request, response);
	}

}
