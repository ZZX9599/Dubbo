<%--
  Created by IntelliJ IDEA.
  User: ZZX
  Date: 2022/4/23
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>user</title>
</head>
<body>
<h1>用户信息</h1>
<div>
    id:${user.id}
    <br/>
    name:${user.username}
</div>
</body>
</html>
