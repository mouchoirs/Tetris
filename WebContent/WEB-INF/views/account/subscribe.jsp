<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<c:if test="${ failure != null}">
	<spring:message code="suscribe.tryagain"/>
</c:if>


<form:form method="post" modelAttribute="user">
	<div class="input-field">
		<p>
			<input name="type" type="radio" id="type_joueur" value="${user.type}" /> <label
				for="type_joueur"><spring:message code="account.subscribe.form.radio.player"/></label>
		</p>

		<p>
			<input name="type" type="radio" id="type_spectateur" value="2" /> <label
				for="type_spectateur"><spring:message code="account.subscribe.form.radio.spectator"/></label>
		</p>
	</div>

	<div class="input-field">
		<input id="nom" type="text" class="validate" name="nom" /> <label
			for="nom"><spring:message code="account.subscribe.form.label.nom "/></label>
	</div>

	<div class="input-field">
		<input id="prenom" type="text" class="validate" name="prenom" /> <label
			for="prenom"><spring:message code="account.subscribe.form.label.prenom"/></label>
	</div>

	<div class="input-field">
		<input id="username" type="text" class="validate" name="username" />
		<label for="username"><spring:message code="account.subscribe.form.label.username"/></label>
	</div>

	<div class="input-field">
		<input id="password" type="password" class="validate" name="password" />
		<label for="password"><spring:message code="account.subscribe.form.label.password"/></label>
	</div>

	<div class="input-field">
		<input id="password-validation" type="password" class="validate"
			name="password-validation" /> <label for="password-validation"><spring:message code="account.subscribe.form.label.passwordCheck"/></label>
	</div>


	<button class="btn waves-effect waves-light" type="submit">
		OK <i class="material-icons right">send</i>
	</button>
</form:form>