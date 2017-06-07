package fr.ascadis.model.noentity;

import fr.ascadis.model.Utilisateur;

public class InscriptionUtilisateur extends Utilisateur{


	private String passwordCheck;
	
	public String getPasswordCheck() {
		return passwordCheck;
	}
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	
	
}
