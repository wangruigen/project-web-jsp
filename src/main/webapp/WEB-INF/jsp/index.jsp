<%--
  Created by IntelliJ IDEA.
  User: hello
  Date: 2019/3/14
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>index</title>
    <link rel="icon" type="image/x-icon" href="favicon.ico">
    <link href="css/index.css" rel="stylesheet">
    <script src="js/jquery-3.3.1.js"></script>
    <script type="application/javascript">
    </script>
</head>
<body>
    <div class="indexDiv">
        <table style="margin: auto;border: coral solid 1px">
            <thead>
                <tr><th>id</th><th>username</th><th>password</th></tr>
            </thead>
            <tbody>
            <c:forEach items="${userList}" var="user">
                <tr><td>${user.id}</td><td>${user.username}</td><td>${user.password}</td></tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
