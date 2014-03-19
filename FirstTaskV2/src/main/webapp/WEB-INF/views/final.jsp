<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
 <h2>Spring Page2 Redirection</h2>Click below button to redirect the result to new page  
<form:form method="GET" action="redirect2" >  
<table><tbody>  
<tr>    <td><input type="submit" value="Redirect to Page1" /></td>   </tr>  
</tbody></table></form:form>  
</body>
</html>