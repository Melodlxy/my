<%@page import="com.lxy.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<% 
User u = (User)request.getAttribute("user");
u = (User)session.getAttribute("user");
String s = (String)request.getAttribute("username");
System.out.println("uS======"+(User)session.getAttribute("username"));
System.out.println("sS======"+(User)request.getAttribute("username"));
%>
<html>
<head>
<title>注册页面</title>
</head>
<body>
${requestScope.user}
${requestScope.user.username}
${user.username}
${	username}
aaa
<s:debug></s:debug>
<div style="margin:20%">
<s:form action="registDealAction"  method="post" validate="true">
<s:textfield name="user.username" label="用户名"/>
<%-- <input id="user.username" value="${requestScope.user.username}"/> --%>
<s:password name="user.password" label="密码"/>
<s:password name="user.password1" label="确认密码"/>
<s:textfield name="user.name" label="姓名"/>
<s:radio name="user.sex" label="性别" list="#{1:'男',2:'女'}"/>
<s:radio name="user.marrage" label="婚姻状况" list="#{1:'已婚',2:'未婚',3:'离异'}"/>
<s:textfield name="user.age" label="年龄"/>
<s:textfield name="user.interest" label="兴趣爱好(选填)"/>
<s:submit value="注册"/>
</s:form>
</div>
</body>
</html>