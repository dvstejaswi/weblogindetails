<%@ page language = "java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>
Id is <c:out value="${user.id} "/>
Password is <c:out value="${user.password}"/>
</h2>
</body>
</html>
