<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
</head>
<body>

	<form method="post" action="home">
		<input type="hidden" name="action" value="subscribe" />

		<div class="input-field">
			<i class="material-icons prefix">account_circle</i> <input id="name"
				type="text" class="validate" name="nom" /> <label for="name">Nom</label>
		</div>


		<div class="input-field">
			<i class="material-icons prefix">account_circle</i> <input id="name"
				type="text" class="validate" name="prenom" /> <label for="name">Pr�nom</label>
		</div>


		<div class="input-field">
			<i class="material-icons prefix">account_circle</i> <input id="name"
				type="text" class="validate" name="nom_util" /> <label for="name">Nom
				d'utilisateur</label>
		</div>


		<div class="input-field">
			<i class="material-icons prefix">vpn_key</i> <input id="name"
				type="password" class="validate" name="mdp" /> <label for="name">Mot
				de passe</label>
		</div>

		<div class="input-field">
			<i class="material-icons prefix">vpn_key</i> <input id="name"
				type="password" class="validate" name="verif_mdp" /> <label for="name">V�rification
				du mot de passe</label>
		</div>


		<button class="btn waves-effect waves-light" type="submit">
			Connexion<i class="material-icons right">send</i>
		</button>

	</form>
</body>
</html>