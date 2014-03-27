<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<%@page import="java.util.ArrayList"%>
<%@page import="org.bitler.entity.Product" %>
<html>
<head>
	<title>Starting Page</title>
</head>
<body>
<table>
<tr>
	<td>Product name</td>
	<td>Product barcode</td>	
</tr>
<c:forEach items="${products}" var = "product">
<tr>
	<td align="center"><c:out value="${product.productName}"></c:out></td>
	<td align="center"><c:out value="${product.productBarcode}"></c:out></td>
</tr>
</c:forEach>
</table>
<p>
<form:form method="GET" action="redirect" >  
<table><tbody>  
<tr>    <td><input type="submit" value="Add new Product" /></td>   </tr>  
</tbody></table></form:form>  
</body>
</html>
