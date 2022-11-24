<%@ page language="java"  import="com.hcl.beans.*"   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>ADD PRODUCT PAGE , setting product data</H1>


<jsp:useBean id="p1"   class="com.hcl.beans.Product"  scope="session">
</jsp:useBean>


<jsp:setProperty name="p1" property="pid"   param="pid" />
<jsp:setProperty name="p1" property="pname"  param="pname" />
<jsp:setProperty name="p1" property="price"  param="price" />

<!--  <jsp:setProperty name="p1" property="*"/>  -->


<jsp:include page="success.jsp" />

</body>
</html>