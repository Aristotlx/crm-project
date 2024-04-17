<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
  <base href=<%=basePath%>>
  <title>演示文件上传</title>
</head>
<body>
<form action="workbench/activity/fileUpload.do" method="post">
  <input type="file" name="myFile"><br>
  <input type="text" name="userName"><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
