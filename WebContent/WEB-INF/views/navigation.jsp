<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<nav>
	<div class="nav-wrapper">
		<div class="container">
			<a href="#" class="brand-logo">Tetris - ${ pageTitle }</a>
			
			<c:if test="${ utilisateur != null }">
				<ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><a href="home"><spring:message code="home.logged.title"/></a></li>
					
			<!-- 	<li><a href="lien vers l'accueil français "><img src="logo français " alt="FRance"/></a></li> -->
				<!-- 	<li><a href="lien vers l'accueil anglais "><img src="logo anglais " alt="Angleterre"/></a></li> -->
					<c:if test="${ utilisateur.type == 0 }">
						<li><a href="tetriminos">Tetriminos</a></li>
					</c:if>
					
					<c:if test="${ utilisateur.type != 0 }">
						<li><a href="parties">Parties</a></li>
					</c:if>
				</ul>
			</c:if>
		</div>
	</div>
</nav>