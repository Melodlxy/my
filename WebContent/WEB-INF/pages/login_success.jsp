<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.lxy.model.Message"%>
<%@page import="java.util.List"%>
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
<%-- requestScope.user=${requestScope.user}<br/> --%>
<%-- sessionScope.user=${sessionScope.user}<br/> --%>

<form action="updateUserLinkAction" >
<input type="hidden" name="id" value="${sessionScope.user.id}" />
<input type="submit" value="修改资料" />
</form>
<form action="leaveMessageLinkAction" >
<input type="hidden" name="id" value="${sessionScope.user.id}" />
<input type="submit" value="给作者留言" />
</form>
您往次的留言：<br/>
<table border="1">
	<tr>
		<td>留言内容</td>
		<td>留言时间</td>
		<td>是否隐藏</td>
		<td></td>
	</tr>
	<%
		List messages = (List)session.getAttribute("messages");
		for(int i=0;i<messages.size();i++){
			Message m = (Message)messages.get(i);
	%>
	<tr>
		<td><%=m.getContent() %></td>
		<td><%=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(m.getInputdate()) %></td>
		<td><%=m.getStatus() %></td>
		<td><a href="deleteMessageDealAction?id=<%=m.getId() %>">删除</a></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>