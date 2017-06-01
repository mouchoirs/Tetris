package src.fr.ascadis.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import src.fr.ascadis.dao.IDAO;


public abstract class DataAccessServlet extends HttpServlet
{
	
	protected IDAO getTetriminoDAO() {
		return (IDAO)this.getServletContext().getAttribute("tetriminoDAO");
	}
	
	
	@Override
	public void init(ServletConfig config) {
		try {
			super.init(config);
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
}
