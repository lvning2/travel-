<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/5
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js" type="text/javascript"></script>
<body>
hello word test
<form action="/login.action">
    用户名：<input type="text" name="username" ><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录"><br>
    <input id="regist" type="button" onclick="window.location.href='/zz.action'" value="注册"  >

</form>
</body>


</html>
