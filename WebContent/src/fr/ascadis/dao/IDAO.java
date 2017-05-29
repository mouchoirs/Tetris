package fr.ascadis.dao;

import java.util.List;

import fr.ascadis.model.Tetrimino;


public interface IDAO
{
	public List<Tetrimino> findAll();
	public Tetrimino find(String id);
	public Tetrimino save(Tetrimino tetrimino);
	public void delete(Tetrimino tetrimino);
}