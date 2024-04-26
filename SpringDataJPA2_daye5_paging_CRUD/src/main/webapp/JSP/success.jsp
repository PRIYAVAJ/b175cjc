<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
table{background-color:grey;font}
body{font-size:20px;}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>ROLLNO</th>
<th>NAME</th>
<th>USERNAME</th>
<th>PASSWORD</th>
</tr>

<c:forEach items="${data}" var="s">
<tr>
<td>${s.rollno}</td>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td><a href="delete?name=${s.name}">DELETE</a>||<a href="edit?rollno=${s.rollno}">EDIT</a></td>
       </tr>


</c:forEach>




</table>
<a href="paging?pageNo=0">NEXT</a>||<a href="paging?pageNo=0">1</a>||<a href="paging?pageNo=1">2</a>||<a href="paging?pageNo=2">3</a>||<a href="2">previous</a>
</body>
</html>