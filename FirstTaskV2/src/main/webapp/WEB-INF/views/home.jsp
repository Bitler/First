<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
 <h2>Spring Page1 Redirection</h2>Click below button to redirect the result to new page  
<form:form method="GET" action="redirect" >  
<table><tbody>  
<tr>    <td><input type="submit" value="Redirect to Page2" /></td>   </tr>  
</tbody></table></form:form>  
</body>
</html>
