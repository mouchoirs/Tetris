package src.fr.ascadis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;


@Entity
@Table(name="utilisateur")

public class Utilisateur {

	
	public Utilisateur(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="UTI_NOM")
	@NotNull
	private String nom;
	
	@Column(name="UTI_PRENOM")
	@NotNull
	private String prenom;
	
	@Column(name="UTI_USERNAME")
	@NotNull
	private String username;
	
	@Column(name="UTI_MDP")
	@NotNull
	private String mdp;

	@Column(name="UTI_TYPECOMPTE")
	@NotNull
	private String typeDeCompte;
	
	
	public String getTypeDeCompte() {
		return typeDeCompte;
	}

	public void setTypeDeCompte(String typeDeCompte) {
		this.typeDeCompte = typeDeCompte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
