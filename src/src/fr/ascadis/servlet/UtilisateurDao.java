package src.fr.ascadis.servlet;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import src.fr.ascadis.model.Utilisateur;

@Stateless
public class UtilisateurDao implements DAO<Utilisateur> {

	@PersistenceContext
	private EntityManager em;
	
	
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

}
