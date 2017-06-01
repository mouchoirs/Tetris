package src.fr.ascadis.servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import src.fr.ascadis.dao.IUtilisateurDAO;
import src.fr.ascadis.model.Utilisateur;

@Repository
@Transactional
public class UtilisateurDao implements IUtilisateurDAO	 {

	@PersistenceContext
	private EntityManager em;
	
	private Utilisateur user;
	
	
	@Override
	public Utilisateur find(int id) {
		// TODO Auto-generated method stub
		return this.em.find(Utilisateur.class, id);
	}

	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return this.em.createQuery("from Utilisateur p", Utilisateur.class).getResultList();
	}

	@Override
	public Utilisateur save(Utilisateur object) {
		// TODO Auto-generated method stub
		return this.em.merge(object);	}

	@Override
	public boolean delete(Utilisateur object) {
		// TODO Auto-generated method stub
		try{
			this.em.remove(this.em.merge(object));
			return true;
		}
		catch(NullPointerException e){
			return false;
		}
		
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	
	public Utilisateur findByInfos(String utilisateur, String password){
		Query myQuery = em.createQuery("From Utilisateur u where u.username=:username and u.mdp=:password", Utilisateur.class);
		myQuery.setParameter("username", utilisateur); 
		myQuery.setParameter("password", password); 
		return (Utilisateur)myQuery.getSingleResult();
		
	}
	
	
	
	
}
