<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <base href=<%=basePath%>>
    <!--  JQUERY -->
    <script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>

    <!--  BOOTSTRAP -->
    <link rel="stylesheet" type="text/css" href="jquery/bootstrap_3.3.0/css/bootstrap.min.css">
    <script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>

    <!--  typeahead插件 -->
    <script type="text/javascript" src="jquery/bs_typeahead/bootstrap3-typeahead.min.js"></script>
    <title>演示自动补全插件</title>
    <script type="text/javascript">
        $(function (){
            //当容器加载完成后，对容器调用工具函数
            $("#customerName").typeahead({
                source:['京东商城','阿里巴巴','百度网络科技公司','字节跳动','动力节点']
            })
        })
    </script>
</head>
<body>
<input type="text" id="customerName">
</body>
</html>
