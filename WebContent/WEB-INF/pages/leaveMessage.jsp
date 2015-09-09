<%@page import="com.lxy.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
User u = (User)session.getAttribute("user");
int userId = u.getId();
System.out.println(userId);
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>给作者留言</title>
</head>
<body>
<s:fielderror/>
<div style="margin:20%">
<form action="leaveMessageDealAction" method="post" >
<input type="hidden" name="message.userid" value="${sessionScope.user.id}" /><br/>
是否匿名留言：
<label><input name="message.status" type="radio" value="1" />是 </label> 
<label><input name="message.status" type="radio" value="2" />否 </label> <br/>
你想说什么：<textarea  name="message.content" cols="30" rows="10" ></textarea>
<input type="submit" value="留言"  align="left"/>
</form>
</div>
</body>
</html>