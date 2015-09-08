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
${requestScope.tip}.您可以:<br/>
requestScope.user=${requestScope.user}<br/>
sessionScope.user=${sessionScope.user}<br/>

<form action="updateUserLinkAction" >
<input type="hidden" name="id" value="${sessionScope.user.id}" />
<input type="submit" value="修改资料" />
</form>
</body>
</html>