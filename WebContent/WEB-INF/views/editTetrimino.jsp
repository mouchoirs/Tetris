<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="flow-text" id="formulaire_tetri">
	<label for="tetrimino_nom">Formulaire Tetrimino</label>
</div>
<hr>
<br>
<form method="post" class="formulaire">
	<input type="hidden" name="tetrimino_id" value="${ tetrimino.id }" />


	<div class="input-field">
		<input id="tetrimino_nom" type="text" class="validate"
			name="tetrimino_nom" value="${ tetrimino.nom }" /> <label
			for="tetrimino_nom">Nom</label>
	</div>

	<div class="input-field">
		<input id="tetrimino_couleur" type="text" class="validate"
			name="tetrimino_couleur" value="${ tetrimino.couleur }" /> <label
			for="tetrimino_couleur">Couleur</label>
	</div>

	<div class="input-field">
		<input id="tetrimino_valeur" type="text" class="validate"
			name="tetrimino_valeur" value="${ tetrimino.valeur }" /> <label
			for="tetrimino_valeur">Valeur du tetrimino</label>
	</div>

	<button class="btn waves-effect waves-light" type="submit">
		Valider <i class="material-icons right">send</i>
	</button>
</form>

<br>
<br>

<table id="table1"><caption>Figure 1</caption>

	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>

</table>
<table id="table2" ><caption>Figure 2</caption> 
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>

</table>
<table id="table3" ><caption>Figure 3</caption>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>

</table>
<table id="table4" ><caption>Figure 4</caption>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>

</table>

