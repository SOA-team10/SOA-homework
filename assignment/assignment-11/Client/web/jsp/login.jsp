<%--
  Created by IntelliJ IDEA.
  User: duanzhengmou
  Date: 6/27/17
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <%--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">--%>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="panel panel-default" style="width: 300px">
    <div class="panel-heading">
        <h3 class="panel-title">Service Login</h3>
    </div>
    <div class="panel-body">
        <form action="/login" method="post">
            <div class="input-group">
                <span class="input-group-addon" id="username">@</span>
                <input type="text" class="form-control" placeholder="Username" name="username" aria-describedby="sizing-addon2">
            </div>
            <div class="input-group" style="margin-top: 5px">
                <span class="input-group-addon" id="password">@</span>
                <input type="text" class="form-control" placeholder="Password" name="password" aria-describedby="sizing-addon2">
            </div>
            <button class="btn btn-primary" style="width: 100%; margin-top: 5px">launch</button>
        </form>
    </div>
</div>
</body>
</html>
