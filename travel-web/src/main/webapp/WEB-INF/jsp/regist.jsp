<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/5
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js" type="text/javascript"></script>
<body>
<form id="registForm" action="/regist.action">

    用户名：<input type="text" name="username" /><br>
    密码：<input type="password" name="password" /><br>
    手机：<input type="text" name="telephone" /><br>
  <input type="submit" value="注册" /><br>
    <input id="re" type="button" value="$$注册" />

</form>
</body>
<script>
    $(function () {
       $("#re").click(function () {
           $.post("/regist.action",$("registForm").serialize(),function (data) {
               alert(data.msg);
           });
       });
    });

</script>
</html>
