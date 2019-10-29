<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2019/10/25
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>主页面</h1>
    你好, <shiro:principal/> <br>

    <shiro:hasRole name="管理员">
        <a href="admin.jsp">Administer the system</a>
    </shiro:hasRole>

    <shiro:hasAnyRoles name="用户,管理员">
        You are either a developer, manager, or administrator.
    </shiro:hasAnyRoles>

    <shiro:hasPermission name="修改">
        <a href="/user/del">delete User</a>
    </shiro:hasPermission>
</body>
</html>
