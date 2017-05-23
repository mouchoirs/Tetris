package tetris.java;
import java.util.UUID;

public class Tetrimino {

	private String id;
	private String nom;
	private String couleur ;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Tetrimino(String nom, String couleur, String id) {
		super();
		this.nom = nom;
		this.couleur = couleur;
		this.id = UUID.randomUUID().toString();
		
		
	}
}
