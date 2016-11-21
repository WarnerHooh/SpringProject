<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hjhu
  Date: 17/11/2016
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello ${name}, ${age}</h1>
    <img src="${ctx}/resources/icon.png">
</body>
</html>
