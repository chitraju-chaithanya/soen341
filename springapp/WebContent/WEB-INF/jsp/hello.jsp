<%@ include file="/WEB-INF/jsp/include.jsp" %>


<html>
  <head><title>Concordia University</title></head>
  <body>
    <h1>Concordia University</h1>
   <p>Greetings, it is now <c:out value="${now}"/></p>
   
<div th:if="${param.error}">
            Invalid username and password.
        </div>
        <div th:if="${param.logout}">
            You have been logged out.
        </div>
        <form th:action="@{/login}" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>

  </body>
</html>