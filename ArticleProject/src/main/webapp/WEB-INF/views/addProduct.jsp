<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Product</title>
</head>
<body>
<form:form method="GET" action="add" >  
<p> Product Name </p><input type="text" name="productName"/>
<p> Product Barcode </p><input type="text" name="productBarcode"/>
<table><tbody>  
<tr>    <td><input type="submit" value="New Product" /></td>   </tr>  
</tbody></table></form:form>  
</body>
</html>
