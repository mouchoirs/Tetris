package src.fr.ascadis.servlet;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface DAO<T> {

	public abstract T find(int id);

	public abstract List<T> findAll();

	public abstract T save(T object);

	public abstract boolean delete(T object);

	//public EntityManagerFactory emf = Persistence.createEntityManagerFactory("PeristenceUnit");

}
