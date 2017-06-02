package src.fr.ascadis.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="tetrimino")

public class Tetrimino implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id;
	
	@Column(name="TET_NOM")
	@NotNull
	private String nom;
	
	@Column(name="TET_COULEUR")
	@NotNull
	private String couleur;
	
	@Column(name="TET_VALEUR")
	@NotNull
	private String valeur;
	

	

	public void setNombreDeFigures(int nombreDeFigures) {
		this.nombreDeFigures = nombreDeFigures;
	}

	private int nombreDeFigures;
	
	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

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
	
	
	public Tetrimino() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Tetrimino(String nom, String couleur, String Valeur) {
		super();
		this.nom = nom;
		this.couleur = couleur;
		this.valeur = Valeur ;
	}

}