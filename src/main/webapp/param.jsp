<%--
  Created by IntelliJ IDEA.
  User: xiaolong_wu
  Date: 2019/5/24
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数</title>
</head>
<body>
<%--<a href="param/testParam?username=hadoop&password=hadoop">请求参数绑定</a>--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username" /><br/>
    密码：<input type="text" name="password" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="button" value="提交" /><br/>


</form>


</body>
</html>
