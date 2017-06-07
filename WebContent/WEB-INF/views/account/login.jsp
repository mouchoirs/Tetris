<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<form method="post" action="login">
	<input type="hidden" name="action" value="login" />
	
	<div class="input-field">
		<i class="material-icons prefix">account_circle</i>
		<input id="name" type="text" class="validate" name="username" />
		<label for="name"><spring:message code="account.subscribe.form.label.nom"/></label>
	</div>
	
	<div class="input-field">
		<i class="material-icons prefix">vpn_key</i>
		<input id="password" type="password" class="validate" name="password" />
		<label for="password"><spring:message code="NotEmpty.password"/></label>
	</div>
	
	<button class="btn waves-effect waves-light" type="submit">
		OK <i class="material-icons right">send</i>
	</button>
	
	<a href="subscribe" class="btn waves-effect waves-light" type="submit">
		<spring:message code="account.home.form.suscribe"/>
	</a>
</form>