<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Display JSP Page</h1>
<h1>Get Scope Var values using scriplet</h1>
<%

 int sid = 100;

  String uname = (String)	session.getAttribute("username");
	String pwd = (String)	session.getAttribute("password");

	
		out.print(uname +"  "+pwd);
	
%>

<h2>Get session scopes using JSP Exp</h2>
<%= session.getAttribute("username") %>
<%=  session.getAttribute("password")%>
<br>
EL expression:

${username} 
<br>
${password}

</body>
</html>