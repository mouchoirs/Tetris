package src.fr.ascadis.servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import src.fr.ascadis.model.Tetrimino;

@Repository
@Transactional
public class TetriminoDao implements DAO<Tetrimino>{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Tetrimino find(int id) {
		// TODO Auto-generated method stub
		return this.em.find(Tetrimino.class, id);
	}

	@Override
	public List<Tetrimino> findAll() {
		// TODO Auto-generated method stube
		return this.em.createQuery("from Tetrimino p", Tetrimino.class).getResultList();
	}

	@Override
	public Tetrimino save(Tetrimino object) {
		// TODO Auto-generated method stub
		return this.em.merge(object);	}

	@Override
	public boolean delete(Tetrimino object) {
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
