package src.fr.ascadis.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import src.fr.ascadis.dao.IDAO;
import src.fr.ascadis.dao.application.TetriminoApplicationDAO;


@WebListener
public class ApplicationDataInitializationListener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent event) {
		IDAO tetriminoDAO = new TetriminoApplicationDAO();
		event.getServletContext().setAttribute("tetriminoDAO", tetriminoDAO);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
}
