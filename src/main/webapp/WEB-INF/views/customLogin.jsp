<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Custom Login Page</h1>
  <h2>${error}</h2>
  <h2>${logout}</h2>
  
  <form action="/security/login" method="post">
    <div>
      <input type="text" name="username" value="admin"/>
    </div>
    <div>
      <input type="password" name="password" value="pw"/>
    </div>
    <div>
      <input type="submit"/>
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  </form>
</body>
</html>