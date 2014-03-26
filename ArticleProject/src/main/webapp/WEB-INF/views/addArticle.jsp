<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Article</title>
</head>
<body>
<form:form method="GET" action="add" >  
<p> Article Name </p><input type="text" name="articleName"/>
<p> Article Barcode </p><input type="text" name="articleBarcode"/>
<table><tbody>  
<tr>    <td><input type="submit" value="New Article" /></td>   </tr>  
</tbody></table></form:form>  
</body>
</html>
