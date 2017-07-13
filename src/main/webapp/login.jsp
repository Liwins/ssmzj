<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/7/11
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/zhuce/1.do" method="POST">
    姓名：<input type="text" name="name"/><br>
    年龄:<input type="text" name="age"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
