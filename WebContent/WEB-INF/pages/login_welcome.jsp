<%@page import="com.lxy.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>欢迎页面</title>
</head>
<body>
<s:debug></s:debug>
${requestScope.tip}.您可以:<br>
${requestScope.user}

<a href="updateUserLinkAction?username=${requestScope.user.username}">sss	</a>
<form action="updateUserLinkAction" >
<input type="hidden" name="user.username" value="${requestScope.user.username}" />
<input type="submit" value="修改资料" />
<!-- <input type="button" value="修改资料"> --><br/>
</form>
</body>
</html>