<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>WELCOME TO JSP</h1>

HELLO FRIENDS!
<%

int x = 99;

String name = "Tom";

out.print("<H1>Welcome o JSP </H1> <br>");
out.print("x value "+x);

	session.setAttribute("name", "javeed");
	
	request.getParameter("uname");


%>

X Value is: <%= x %>

Your Name is : <%= name %>


<%!

static int salary;
String city;


public void m1(){
	
	
}

%>


<% 

	session.setAttribute("username", "javeed");
	session.setAttribute("password","tiger");


	
	

%>









</body>
</html>