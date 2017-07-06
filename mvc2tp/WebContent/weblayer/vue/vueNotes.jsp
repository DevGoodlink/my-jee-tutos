<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java"%>
<%@ page import="weblayer.bean.BeanNote" %>
<%@ page import="modele.persistencelayer.entity.*" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Notes matières</title>
</head>
<body>

<form method="post" action="/mvc2tp/ControleurServlet">
	<label>Numéro d'inscription de l'élève</label>
	<input type="text" name="numIns"/>
	<button type="submit">Envoyer</button>
	
</form>
	
	<%
		BeanNote bn = (BeanNote) session.getAttribute("beanNote");
	if(bn!=null){
		int somme=0;
		double moyenne=0;
		ArrayList<Note> notes = bn.getNotes();
	%>
	<p>Les notes de <%= bn.getNumIns() %></p>
	<table width="80%">
	<thead bgcolor="gray">
		<th>Nom Matière</th>
		<th>Note</th>
	</thead>
	<tbody>
	
	<%
	if(notes.size()!=0){
		for(Note n : notes)
		{
			somme+=n.getNoteMat();	
			out.print("<tr>");
			out.print("<td>"+ n.getNomMat() +"</td>");
			out.print("<td>"+ n.getNoteMat()+"</td>");
			out.print("</tr>");
		}
		moyenne=somme/notes.size();
		out.print("<tr bgcolor=blue><td>Moyenne</td><td>"+ moyenne +"</td></tr>");
		session.invalidate();
	}
	}
		
	%>
	
	</tbody>
	</table>
</body>
</html>