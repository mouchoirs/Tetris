package src.fr.ascadis.dao;

import src.fr.ascadis.model.Utilisateur;
import src.fr.ascadis.servlet.DAO;

public interface IUtilisateurDAO extends DAO<Utilisateur>{
	public Utilisateur findByInfos(String utilisateur, String password);
}
