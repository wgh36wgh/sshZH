<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/1
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/account_save.action" method="post">
    用户名：<input type="text" name="name">
    密码：<input type="text" name="money">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
