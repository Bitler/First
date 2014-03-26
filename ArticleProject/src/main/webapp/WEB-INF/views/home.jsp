<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<%@page import="java.util.ArrayList"%>
<%@page import="org.bitler.entity.Article" %>
<html>
<head>
	<title>Starting Page</title>
</head>
<body>
<table>
<tr>
	<td>Article name</td>
	<td>Article barcode</td>	
</tr>
<c:forEach items="${articles}" var = "article">
<tr>
	<td align="center"><c:out value="${article.articleName}"></c:out></td>
	<td align="center"><c:out value="${article.articleBarcode}"></c:out></td>
</tr>
</c:forEach>
</table>
<p>
<form:form method="GET" action="redirect" >  
<table><tbody>  
<tr>    <td><input type="submit" value="Add new Article" /></td>   </tr>  
</tbody></table></form:form>  
</body>
</html>
