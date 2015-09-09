<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>注册成功页面</title>
</head>
<body>
${requestScope.tip}.您可以:<br>
<form action="updateUserLinkAction">
<input type="submit" value="修改资料"/>
<!-- <input type="button" value="修改资料"> -->
</form>
</body>
</html>