<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/28
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <form action="/common-web/UploadServlet" enctype="multipart/form-data" method="post">
        姓名: <input type="text" name="name"><br>
        头像: <input type="file" name="head"><br>
      <input type="submit" value="提交">
  </form>

  </body>
</html>
