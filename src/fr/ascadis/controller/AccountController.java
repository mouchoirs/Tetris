package fr.ascadis.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ascadis.model.Joueur;
import fr.ascadis.model.Spectateur;
import fr.ascadis.model.Utilisateur;
import fr.ascadis.model.noentity.InscriptionUtilisateur;
import fr.ascadis.validator.PasswordCheckValidator;

@Controller
@RequestMapping("/account")
public class AccountController {

	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	public String subscribe() {
		return "subscribe";
	}

	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	public String subscribe(@Valid @ModelAttribute("inscription") InscriptionUtilisateur inscriptionUtilisateur,
			BindingResult result, Model model) {
		new PasswordCheckValidator().validate(inscriptionUtilisateur, result);

		if (!result.hasErrors()) {
			Utilisateur myUtilisateur = null;

			switch (inscriptionUtilisateur.getType()) {
			case 2:
				myUtilisateur = new Spectateur();
				break;
			default:
				myUtilisateur = new Joueur();
				break;
			}

			// inscriptionUtilisateur.setProperties(myUtilisateur);
			// this.sqlUtilisateurApplicationData.add(myUtilisateur);

			return "redirect:/home";
		}

		return "subscribe";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("user") Utilisateur utilisateur, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/home";
		} else {
			return "redirect:/home" + utilisateur.getUsername();
		}
	}

	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public String logout() {
		return "redirect:/home";
	}
}
