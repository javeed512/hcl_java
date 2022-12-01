<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  action="http://localhost:8585/products/add"  method="post">
	 PID : <input type="text" name="pid"> <br>
 	 PNAME : <input type="text" name="pname"> <br>
  	 PRICE : <input type="text" name="price"> <br>
  	 		<button type="submit">Add Product</button>

	</form>


</body>
</html>