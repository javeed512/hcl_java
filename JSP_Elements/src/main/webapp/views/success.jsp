<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     isELIgnored="false" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Success JSP getting Product Data</h1>


<jsp:useBean id="p1"   class="com.hcl.beans.Product"  scope="session">
</jsp:useBean>


<jsp:getProperty name="p1"  property="pid" />
<jsp:getProperty name="p1"  property="pname" />
<jsp:getProperty name="p1"  property="price" />

<!-- jdbc code  dao.addProduct(p1) -->


<!--   jdbc code   List<Product> list = dao.getAllProduct(); -->>

Product Details: <br>
${p1}


</body>
</html>